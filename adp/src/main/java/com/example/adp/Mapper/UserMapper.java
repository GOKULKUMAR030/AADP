package com.example.adp.Mapper;

import com.example.adp.Dto.UserDto;
import com.example.adp.Model.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getContactNo(),
                user.getEmail(),
                user.getCorporateName(),
                user.getPassword(),
                user.getRole() // Include role mapping
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getContactNo(),
                userDto.getEmail(),
                userDto.getCorporateName(),
                userDto.getPassword(),
                userDto.getRole()
        );
    }

}
