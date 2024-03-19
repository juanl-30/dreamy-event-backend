package project.dreamyevent.persistence;

import org.springframework.stereotype.Repository;
import project.dreamyevent.persistence.crud.ServiceCrudRepository;
import project.dreamyevent.persistence.entity.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceRepository {
    private ServiceCrudRepository serviceCrudRepository;

    public List<Service> getAll() {
        return (List<Service>) serviceCrudRepository.findAll();
    }

    public Service save(Service service) {
        return serviceCrudRepository.save(service);
    }

    public Optional<Service> get(Integer id){
        return serviceCrudRepository.findById(id);
    }

    public void update(Service service) {
        serviceCrudRepository.save(service);
    }

    public void delete(Integer id) {
        serviceCrudRepository.deleteById(id);
    }


}
