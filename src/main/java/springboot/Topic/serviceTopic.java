package springboot.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;



@Service
public class serviceTopic {

    @Autowired   // this will inject the instance of dataservice
    private DataService dataService;


    public List<Subject> getSubjects(){
        List<Subject> subject = new ArrayList<>();
        dataService.findAll()
                .forEach(subject :: add);     //iterable
        return subject;
    }

    public Subject getSubject(String id){
      // return subjects.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return dataService.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id));
    }

    public void addSubject(Subject subject) {
        dataService.save(subject);
    }

    public void updateSubject(String id, Subject subject) {
        dataService.save(subject);   //it checks if there is id already there if yes it updates if no its adds
    }


    public void deleteSubject(String id) {
        dataService.deleteById(id);
    }
}
