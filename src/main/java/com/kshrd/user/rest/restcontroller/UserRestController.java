package com.kshrd.user.rest.restcontroller;
import com.kshrd.user.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private UserServiceImp userService;

    @Autowired
    public void setUserService(UserServiceImp userService) {
        this.userService = userService;
    }


}
