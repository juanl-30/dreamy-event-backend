package project.dreamyevent.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dreamyevent.domain.ServiceDomain;
import project.dreamyevent.domain.repository.ServicioRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceService {

    @Autowired
    private ServicioRepositorio servicioRepositorio;


    public List<ServiceDomain> getAll() {
        return servicioRepositorio.getAll();
    }

    public Optional<ServiceDomain> getService(Integer id) {
        return servicioRepositorio.getService(id);
    }

    public ServiceDomain save(ServiceDomain serviceDomain) {
        return servicioRepositorio.save(serviceDomain);
    }

    public ServiceDomain update(ServiceDomain serviceDomain) {
        return servicioRepositorio.update(serviceDomain);
    }

    public boolean delete(Integer id) {
        return getService(id).map(serviceDomain -> {
            servicioRepositorio.delete(id);
            return true;
        }).orElse( false);
    }

}
