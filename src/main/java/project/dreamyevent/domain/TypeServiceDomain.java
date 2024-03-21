package project.dreamyevent.domain;

import jakarta.persistence.*;
import project.dreamyevent.persistence.entity.Service;

import java.util.List;

public class TypeServiceDomain {

        private Integer id;
        private String type;
        private String imageType;

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
}
