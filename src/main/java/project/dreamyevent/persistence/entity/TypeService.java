package project.dreamyevent.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "typeService")
public class TypeService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_service")
    private Integer id;
    private String nameType;
    private String imageType;


    @OneToMany(mappedBy = "typeService")
    private List<Service> services;


    public TypeService(Integer id, String nameType, String imageType, List<Service> services) {
        this.id = id;
        this.nameType = nameType;
        this.imageType = imageType;
        this.services = services;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
