package project.dreamyevent.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imagesService")
public class ImageService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_image")
    private Integer id;
    @Column(name = "url_image")
    private String urlImage;

    @ManyToOne
    @JoinColumn(name = "idService", insertable = false, updatable = false)
    private Service service;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

}
