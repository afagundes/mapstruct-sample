package br.com.ari.mapper;

import br.com.ari.dto.UserDTO;
import br.com.ari.dto.UserWithAddressDTO;
import br.com.ari.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "site", source = "website")
    UserDTO userToBasicUser(User user);

    @Mapping(target = "address.number", source = "address.suite")
    UserWithAddressDTO userToUserWithAddress(User user);

}
