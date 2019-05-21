package raky.train.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import raky.train.entity.Users;
import raky.train.service.UsersService;

import java.util.List;

@RestController
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UsersService usersService;

    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

}
