package project.dreamyevent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventHasService")
public class EventHasService {

    @ManyToOne
    @JoinColumn(name = "idEvent",insertable = false, updatable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "idService",insertable = false, updatable = false)
    private Service service;

    public EventHasService(Event event, Service service) {
        this.event = event;
        this.service = service;
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
