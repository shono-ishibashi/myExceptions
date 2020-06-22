package ecwa.com.controller;

import ecwa.com.PostForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @ModelAttribute
    public PostForm postFormsetUp(){
        return new PostForm();
    }

    @RequestMapping("list")
    public String index(){

        return "list";
    }

}
