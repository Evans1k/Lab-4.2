package it13.kuspismarian.resource;

import it13.kuspismarian.dto.OrderDTO;
import it13.kuspismarian.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class OrderResource {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{id}")
    public OrderDTO getOrderById(final @PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @GetMapping("/orders")
    public List<OrderDTO> getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/orders")
    public OrderDTO createOrder(final @Valid @RequestBody OrderDTO orderDTO){
        return orderService.createOrder(orderDTO);
    }

    @PutMapping("/orders")
    public OrderDTO getOrderById(final @RequestBody OrderDTO orderDTO){
        return orderService.updateOrder(orderDTO);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrderById(final @PathVariable Long id){
        orderService.deleteOrderById(id);
    }
}
