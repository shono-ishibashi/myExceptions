package ecwa.com.controller;

import ecwa.com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/top";
    }

    @RequestMapping("/sign_up")
    public String signUp(){
        return "sign_up";
    }

    @RequestMapping("/sign_up/info")
    public String signUpGetInfo(String username, String password,String mailAddress){
        accountService.registerUser(username, password,mailAddress );
        return login();
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost() {
        return "redirect:/login-error";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @RequestMapping("/top")
    public String top() {
        return "/top";
    }

}