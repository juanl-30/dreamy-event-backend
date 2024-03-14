package project.dreamyevent.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EventServicePK implements Serializable {

    @Column(name = "id_event")
    private Integer idEvent;

    @Column(name = "id_service")
    private Integer idService;


    public EventServicePK(Integer idEvent, Integer idService) {
        this.idEvent = idEvent;
        this.idService = idService;
    }

    public Integer getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Integer idEvent) {
        this.idEvent = idEvent;
    }

    public Integer getIdService() {
        return idService;
    }

    public void setIdService(Integer idService) {
        this.idService = idService;
    }
}
