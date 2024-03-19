package project.dreamyevent.domain.repository;

import project.dreamyevent.domain.DomainService;

import java.util.List;
import java.util.Optional;

public interface RepositorioServicio {
    List<DomainService> listar();

    DomainService guardar(DomainService servicio);

    Optional<List<DomainService>> traerId(int productoId);

    void actualizar(DomainService servicio);

    void eliminar(int productoId);
}
