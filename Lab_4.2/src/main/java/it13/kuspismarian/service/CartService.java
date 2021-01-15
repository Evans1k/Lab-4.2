package it13.kuspismarian.service;

import it13.kuspismarian.dto.OrderDTO;

public interface CartService {

    OrderDTO getCartByUserId(Long userId);
    OrderDTO addShoesToCart(Long userId, Long bookId);
    OrderDTO removeShoesFromCart(Long userId, Long shoesId);

}
