package com.kshrd.user.rest.restcontroller;
import com.kshrd.user.repository.dto.UserDto;
import com.kshrd.user.rest.request.UserRequestModel;
import com.kshrd.user.service.imp.UserServiceImp;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private UserServiceImp userService;

    @Autowired
    public void setUserService(UserServiceImp userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<UserRequestModel> insert(@RequestBody UserRequestModel user) {

    // Validate ->

        ModelMapper modelMapper = new ModelMapper();
        UserDto userDto = modelMapper.map(user, UserDto.class);

//        UserDto result = userService.insert();

        return null;
    }
}
