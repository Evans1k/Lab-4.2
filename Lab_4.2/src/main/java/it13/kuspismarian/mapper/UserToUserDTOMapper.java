package it13.kuspismarian.mapper;

import it13.kuspismarian.dto.UserDTO;
import it13.kuspismarian.entity.Order;
import it13.kuspismarian.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserToUserDTOMapper {
    public User toEntity(final UserDTO userDTO, final List<Order> orderList){
        final User user = new User();

        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setBirthDay(userDTO.getBirthDay());
        user.setOrders(orderList);
        user.setUserCountry(userDTO.getUserCountry());
        user.setUserCity(userDTO.getUserCity());
        user.setUserIndex(userDTO.getUserIndex());
        user.setPostOfficeNumber(userDTO.getPostOfficeNumber());

        return user;
    }

    public UserDTO toDto(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setBirthDay(user.getBirthDay());
        userDTO.setUserCountry(user.getUserCountry());
        userDTO.setUserCity(user.getUserCity());
        userDTO.setUserIndex(user.getUserIndex());
        userDTO.setPostOfficeNumber(user.getPostOfficeNumber());
        return userDTO;
    }
}
