package project.dreamyevent.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.dreamyevent.domain.ServiceDomain;
import project.dreamyevent.domain.repository.ServicioRepositorio;
import project.dreamyevent.persistence.crud.ServiceCrudRepository;
import project.dreamyevent.persistence.entity.Service;
import project.dreamyevent.persistence.mapper.ServiceMapper;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceRepository implements ServicioRepositorio {

    @Autowired
    private ServiceCrudRepository serviceCrudRepository;

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public List<ServiceDomain> getAll() {
        List<Service> services = (List<Service>) serviceCrudRepository.findAll();
        return serviceMapper.toServicesDomain(services);
    }

    @Override
    public ServiceDomain save(ServiceDomain serviceDomain) {
        Service service = serviceMapper.toService(serviceDomain);
        return serviceMapper.toServiceDomain(serviceCrudRepository.save(service));
    }

    @Override
    public Optional<ServiceDomain> getService(Integer id) {
        return serviceCrudRepository.findById(id).map(service -> serviceMapper.toServiceDomain(service));
    }

    @Override
    public ServiceDomain update(ServiceDomain serviceDomain) {
        Service service = serviceMapper.toService(serviceDomain);
        return serviceMapper.toServiceDomain(serviceCrudRepository.save(service));
    }

    @Override
    public void delete(Integer id) {
        serviceCrudRepository.deleteById(id);
    }

}
