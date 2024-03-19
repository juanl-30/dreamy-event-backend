package project.dreamyevent.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import project.dreamyevent.domain.DomainService;
import project.dreamyevent.persistence.entity.Service;

@Mapper(componentModel = "spring", uses = {ProveedorMapper.class, TypeServiceMapper.class})
public interface ServiceMapper {
    @Mappings({
            @Mapping(source = "id", target = "productoId"),
            @Mapping(source = "name", target = "nombre"),
            @Mapping(source = "description", target = "descripcion"),
            @Mapping(source = "price", target = "precio"),
            @Mapping(source = "location", target = "ubicacion"),
            @Mapping(source = "city", target = "ciudad"),
            @Mapping(source = "country", target = "pais"),
            @Mapping(source = "amountPeople", target = "cantidadPersonas"),
            @Mapping(source = "characteristics", target = "caracteristicas"),
            @Mapping(source = "supplier", target = "proveedor"),
            @Mapping(source = "typeService", target = "tipoServicio"),
    })
    DomainService toDomainService(Service service);
}
