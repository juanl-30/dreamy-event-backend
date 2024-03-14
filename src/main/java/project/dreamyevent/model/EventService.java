package project.dreamyevent.model;

import jakarta.persistence.*;

@Entity
@Table(name = "eventHasService")
public class EventService {

    @EmbeddedId
    private EventServicePK id;

    @ManyToOne
    @JoinColumn(name = "id_event", insertable = false, updatable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "id_service", insertable = false, updatable = false)
    private Service service;

    public EventServicePK getId() {
        return id;
    }

    public void setId(EventServicePK id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
