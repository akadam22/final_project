package springboot.Topic;

import org.springframework.data.repository.CrudRepository;

public interface DataService extends CrudRepository<Subject, String> {
}
