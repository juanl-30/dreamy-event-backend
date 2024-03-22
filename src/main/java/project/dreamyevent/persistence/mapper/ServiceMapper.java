package project.dreamyevent.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import project.dreamyevent.domain.ServiceDomain;
import project.dreamyevent.persistence.entity.Service;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SupplierMapper.class, TypeServiceMapper.class})
public interface ServiceMapper {
    @Mappings({
            //source mapea la entity original
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "location", target = "location"),
            @Mapping(source = "city", target = "city"),
            @Mapping(source = "country", target = "country"),
            @Mapping(source = "amountPeople", target = "amountPeople"),
            @Mapping(source = "characteristics", target = "characteristics"),
            @Mapping(source = "supplier", target = "supplier"),
            @Mapping(source = "typeService", target = "typeService")
    })
    ServiceDomain toServiceDomain(Service service);

    List<ServiceDomain> toServicesDomain(List<Service> services);

    @InheritInverseConfiguration
    Service toService(ServiceDomain serviceDomain);
}
