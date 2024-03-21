package project.dreamyevent.domain;

import jakarta.persistence.Column;

public class ImageServiceDomain {
    private Integer id;
    private String urlImage;

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
}
