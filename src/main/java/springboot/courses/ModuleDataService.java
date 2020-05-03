package springboot.courses;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModuleDataService extends CrudRepository<Module, String> {
    public List<Module> findBySubjectId(String subjectId);
}
