package it13.kuspismarian.repository;

import it13.kuspismarian.entity.Order;
import it13.kuspismarian.entity.User;
import it13.kuspismarian.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class OrderRepository {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        savedOrders = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Order> savedOrders;

    public List<Order> getOrdersByUserId(final Long id){

        final User user = userRepository.getUserById(id);

        return user.getOrders();
    }

    public Order getOrderById(final Long id){
        return savedOrders.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Order with id: " + id + " not found ", null));
    }

    public List<Order> getAllOrders(){
        return savedOrders;
    }

    public Order createOrder(final Order order){
        if(order.getId() != null){
            throw new ServiceException(400, "Order shouldn't have an id ", null);
        }

        ++lastId;
        order.setId(lastId);

        savedOrders.add(order);


        order.getUser().getOrders().add(order);


        return order;
    }

    public Order updateOrder(final Order order){
        if(order.getId() == null){
            throw new ServiceException(400, "Order shouldn't have an id ", null);
        }

        final Order savedOrder = getOrderById(order.getId());

        savedOrder.setUser(order.getUser());
        savedOrder.setOrderDetails(order.getOrderDetails());
        savedOrder.setOrderDate(order.getOrderDate());

        return savedOrder;
    }

    public void deleteOrderById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedOrders.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Order with id: " + id + " not found ", null));

        savedOrders = savedOrders.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }

}
