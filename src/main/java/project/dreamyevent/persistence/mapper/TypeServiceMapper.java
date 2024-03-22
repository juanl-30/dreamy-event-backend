package project.dreamyevent.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import project.dreamyevent.domain.TypeServiceDomain;
import project.dreamyevent.persistence.entity.TypeService;

@Mapper(componentModel = "spring")
public interface TypeServiceMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "type", target = "type"),
            @Mapping(source = "imageType", target = "imageType")

    })
    TypeServiceDomain toTypeServiceDomain(TypeService typeService);

    @InheritInverseConfiguration
    TypeService toTypeService(TypeServiceDomain typeServiceDomain);
}
