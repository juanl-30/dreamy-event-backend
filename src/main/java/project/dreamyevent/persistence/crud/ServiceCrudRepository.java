package project.dreamyevent.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import project.dreamyevent.persistence.entity.Service;

import java.util.List;

public interface ServiceCrudRepository extends CrudRepository<Service, Integer> {


}
