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
    @Column(name = "name_type")
    private String type;
    @Column(name = "image_type")
    private String imageType;

    @OneToMany(mappedBy = "typeService")
    private List<Service> services;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
