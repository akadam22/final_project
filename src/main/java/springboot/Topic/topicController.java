package springboot.Topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController  //create a restful web service
public class topicController {

    @Autowired //inkect object implicitly
    private serviceTopic service;

    @RequestMapping("/subject")
    public List<Subject> getSubjects(){
        return service.getSubjects();
    }

    @RequestMapping("/subject/{id}")
    public Subject getSubject(@PathVariable String id){
        return service.getSubject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/subject")
    public void addSubject(@RequestBody Subject subject){
        service.addSubject(subject);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/subject/{id}")
    public void updateSubject(@RequestBody Subject subject, @PathVariable String id){
        service.updateSubject(id, subject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/subject/{id}")
    public void deleteSubject(@PathVariable String id){
         service.deleteSubject(id);
    }

}
