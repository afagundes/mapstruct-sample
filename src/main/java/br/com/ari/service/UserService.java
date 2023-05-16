package br.com.ari.service;

import br.com.ari.converter.UserConverter;
import br.com.ari.dto.UserDTO;
import br.com.ari.dto.UserWithAddressDTO;
import br.com.ari.mapper.UserMapper;
import br.com.ari.model.Address;
import br.com.ari.model.User;

public class UserService {

    private User findUser() {
        User user = new User();
        user.setId(1);
        user.setName("Archimedes Fagundes Junior");
        user.setUsername("afagundes");
        user.setEmail("afagundesdev@dev.com");
        user.setPhone("+551199999999");
        user.setWebsite("www.afagundesdev.com");

        Address address = new Address();
        address.setStreet("Mapstruct street");
        address.setSuite("200");
        address.setCity("Test city");
        address.setZipcode("00000000");

        user.setAddress(address);

        return user;
    }

    public UserDTO getBasicUserWithoutMapstruct() {
        User user = findUser();
        return new UserDTO(user.getName(), user.getUsername(), user.getEmail(), user.getPhone(), user.getWebsite());
    }

    public UserDTO getBasicUserUsingSimpleConverter() {
        User user = findUser();
        return UserConverter.toBasicUser(user);
    }

    public UserDTO getBasicUserUsingMapstruct() {
        User user = findUser();
        return UserMapper.INSTANCE.userToUserDTO(user);
    }

    public UserWithAddressDTO getUserWithAddressUsingMapstruct() {
        User user = findUser();
        return UserMapper.INSTANCE.userToUserWithAddressDTO(user);
    }

}
