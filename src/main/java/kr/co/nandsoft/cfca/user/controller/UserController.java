package kr.co.nandsoft.cfca.user.controller;

import kr.co.nandsoft.cfca.user.domain.User;
import kr.co.nandsoft.cfca.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * Company: NANDSOFT
 * User: clean_brain
 * Date: 2022-04-07
 * Time: 오후 12:01
 */
@Controller
public class UserController {

//    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user/create")
    public String create(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        userService.create(user);
        return "success";
    }

}
