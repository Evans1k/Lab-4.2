package it13.kuspismarian.mapper;

import it13.kuspismarian.dto.OrderDTO;
import it13.kuspismarian.entity.Order;
import it13.kuspismarian.entity.User;
import org.springframework.stereotype.Component;

@Component
public class OrderToOrderDTOMapper {

    public Order toEntity(final OrderDTO orderDTO, final User user){

        final Order order = new Order();

        order.setId(orderDTO.getId());
        order.setOrderDate(orderDTO.getOrderDate());
        order.setOrderDetails(order.getOrderDetails());
        order.setUser(user);

        return order;
    }

    public OrderDTO toDTO(final Order order){
        final OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId(order.getId());
        orderDTO.setOrderDate(order.getOrderDate());
//        orderDTO.setOrderDetails(order.getOrderDetails());
        if(order.getUser() != null){
//            orderDTO.setUserFirstname(order.getUser().getFirstname());
//            orderDTO.setUserLastname(order.getUser().getLastname());
        }

        return orderDTO;
    }
}
