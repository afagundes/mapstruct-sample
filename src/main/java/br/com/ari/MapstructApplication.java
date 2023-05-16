package br.com.ari;

import br.com.ari.dto.UserDTO;
import br.com.ari.dto.UserWithAddressDTO;
import br.com.ari.service.UserService;

public class MapstructApplication {

    public static void main(String[] args) {
        UserService userService = new UserService();

        System.out.println("getBasicUserWithoutMapstruct(): ");
        UserDTO userDTO = userService.getBasicUserWithoutMapstruct();
        System.out.println(userDTO);

        System.out.println("\ngetBasicUserUsingSimpleConverter(): ");
        userDTO = userService.getBasicUserUsingSimpleConverter();
        System.out.println(userDTO);

        System.out.println("\ngetBasicUserUsingMapstruct(): ");
        userDTO = userService.getBasicUserUsingMapstruct();
        System.out.println(userDTO);

        System.out.println("\ngetUserWithAddressUsingMapstruct(): ");
        UserWithAddressDTO userWithAddressDTO = userService.getUserWithAddressUsingMapstruct();
        System.out.println(userWithAddressDTO);
    }

}
