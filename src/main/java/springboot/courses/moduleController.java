package springboot.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.Topic.Subject;

import java.util.List;

@RestController

/*
    This class contains all the CRUD Methods required
 */
public class moduleController {

    @Autowired
    private serviceModule serviceModule;

    @RequestMapping("/subject/{id}/modules")
    public List<Module> getModules(@PathVariable String id){
        return serviceModule.getAllModules(id);
    }

    @RequestMapping("/subject/{subjectId}/modules/{id}")
    public Module getModule(@PathVariable String id){
        return serviceModule.getModule(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/subject/{subjectId}/modules")
    public void addModule(@RequestBody Module module, @PathVariable String subjectId){  // we can get the subject id through path param
        module.setSub(new Subject(subjectId, "",""));
        serviceModule.addModule(module);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/subject/{subjectId}/modules/{id}")
    public void updateModule(@RequestBody Module module, @PathVariable String subjectId, @PathVariable String id){
        module.setSub(new Subject(subjectId, "",""));
        serviceModule.updateModule(module);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/subject/{subjectId}/modules/{id}")
    public void deleteModule(@PathVariable String id){
         serviceModule.deleteModule(id);
    }

}
