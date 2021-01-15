package it13.kuspismarian.resource;

import it13.kuspismarian.dto.OrderDTO;
import it13.kuspismarian.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartResource {

    @Autowired
    public CartService cartService;

    @GetMapping("/cart/{id}")
    public OrderDTO getCartByUserId(final @PathVariable Long userId){
        return cartService.getCartByUserId(userId);
    }

    @PostMapping("/cart/{id}/{shoesId}")
    public OrderDTO addShoesToCart(final @PathVariable Long id,
                                    final @PathVariable Long shoesId){
        return cartService.addShoesToCart(id, shoesId);
    }


    @DeleteMapping("/cart/{id}/{shoesId}")
    public OrderDTO removeShoesFromCart(final @PathVariable Long userId,
                                  final @PathVariable Long shoesId){
        return cartService.removeShoesFromCart(userId, shoesId);
    }
}
