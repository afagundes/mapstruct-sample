package br.com.ari.converter;

import br.com.ari.dto.UserDTO;
import br.com.ari.model.User;

public class UserConverter {

    private UserConverter() {}

    public static UserDTO toBasicUser(User user) {
        return new UserDTO(user.getName(), user.getUsername(), user.getEmail(), user.getPhone(), user.getWebsite());
    }

}
