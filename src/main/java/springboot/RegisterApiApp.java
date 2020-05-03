package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //tells that this is a springboot application
public class RegisterApiApp {
    public static void main(String[] args) { //main method

        SpringApplication.run(RegisterApiApp.class, args);  //calling the static method where the first argument is the source that is class and the second arg is the no of arguments passed
     //this static method sets default configuration , sets class path and starts tomcat server internally
    }
}
