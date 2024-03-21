package project.dreamyevent.domain.repository;

import project.dreamyevent.domain.ServiceDomain;

import java.util.List;
import java.util.Optional;

public interface ServicioRepositorio {
    List<ServiceDomain> listar();

    ServiceDomain guardar(ServiceDomain servicio);

    Optional<List<ServiceDomain>> traerId(int productoId);

    void actualizar(ServiceDomain servicio);

    void eliminar(int productoId);
}
