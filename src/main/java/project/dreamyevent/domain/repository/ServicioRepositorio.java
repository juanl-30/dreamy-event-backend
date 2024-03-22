package project.dreamyevent.domain.repository;

import project.dreamyevent.domain.ServiceDomain;

import java.util.List;
import java.util.Optional;

public interface ServicioRepositorio {

    List<ServiceDomain> getAll();

    Optional<ServiceDomain> getService(Integer id);

    ServiceDomain save(ServiceDomain serviceDomain);

    ServiceDomain update(ServiceDomain serviceDomain);

    void delete(Integer id);
}
