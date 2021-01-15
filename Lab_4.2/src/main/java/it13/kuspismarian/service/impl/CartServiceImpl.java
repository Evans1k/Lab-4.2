package it13.kuspismarian.service.impl;

import it13.kuspismarian.dto.OrderDTO;
import it13.kuspismarian.entity.FootWear;
import it13.kuspismarian.entity.Order;
import it13.kuspismarian.mapper.OrderToOrderDTOMapper;
import it13.kuspismarian.repository.FootWearRepository;
import it13.kuspismarian.repository.OrderRepository;
import it13.kuspismarian.repository.UserRepository;
import it13.kuspismarian.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FootWearRepository footWearRepository;
    @Autowired
    private OrderToOrderDTOMapper orderMapper;

    @Override
    public OrderDTO getCartByUserId(final Long userId) {
        return null;
    }

    @Override
    public OrderDTO addShoesToCart(final Long userId, final Long foodWearId) {
        final List<Order> orders = orderRepository.getOrdersByUserId(userId);

        Order order = orders.stream()
                .filter(e -> !e.wasPaid())
                .findFirst()
                .orElse(null);

        if(order == null){

            order = new Order(); // створення нового замовлення

            order.setOrderDate(LocalDate.now());
            order.setUser(userRepository.getUserById(userId));

        }

        final FootWear footWear = footWearRepository.getFootWearId(foodWearId);

        if(order.getOrderDetails().containsKey(footWear)){
            int value = order.getOrderDetails().get(footWear);
            order.getOrderDetails().put(footWear, ++value);
        } else {
            order.getOrderDetails().put(footWear, 1);
        }

        orderRepository.createOrder(order);


        return orderMapper.toDTO(order);
    }

    @Override
    public OrderDTO removeShoesFromCart(final Long userId, final Long shoesId) {
        return null;
    }
}
