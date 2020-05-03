package springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  annotates the class to be REST controller which gives access to mapping of the rest methods

/*
   This is a basic test class
 */
public class WelcomeController {

    @RequestMapping("/welcome") //this annotation gets  any request to /welcome url and excutes this method
    public String welcome(){
        return "Welcome";
    }
}
