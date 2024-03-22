package project.dreamyevent.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "typeEvent")
public class TypeEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_event")
    private Integer id;
    private String type;
    private String imageType;


    @OneToMany(mappedBy = "typeEvent")
    private List<Event> events;

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

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
