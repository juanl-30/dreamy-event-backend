package project.dreamyevent.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Integer id;
    private String name;
    private String description;
    private String price;
    private String location;
    private String city;
    private String country;

    @Column(name = "amount_people")
    private int amountPeople;
    private String characteristics;

    @ManyToOne
    @JoinColumn(name = "idSupplier", insertable = false, updatable = false)
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "idTypeService", insertable = false, updatable = false)
    private TypeService typeService;

    @OneToMany(mappedBy = "service")
    private List<ImageService> imageServices;

    @OneToMany(mappedBy = "service")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "service")
    private List<Comment> coments;

    @OneToMany(mappedBy = "service")
    private List<EventHasService> eventHasServices;


    public Service(Integer id, String name, String description, String price, String location, String city, String country, int amountPeople, String characteristics, Supplier supplier, TypeService typeService, List<ImageService> imageServices, List<Favorite> favorites, List<Comment> coments, List<EventHasService> eventHasServices) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.location = location;
        this.city = city;
        this.country = country;
        this.amountPeople = amountPeople;
        this.characteristics = characteristics;
        this.supplier = supplier;
        this.typeService = typeService;
        this.imageServices = imageServices;
        this.favorites = favorites;
        this.coments = coments;
        this.eventHasServices = eventHasServices;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public List<ImageService> getImageServices() {
        return imageServices;
    }

    public void setImageServices(List<ImageService> imageServices) {
        this.imageServices = imageServices;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public List<Comment> getComents() {
        return coments;
    }

    public void setComents(List<Comment> coments) {
        this.coments = coments;
    }

    public List<EventHasService> getEventHasServices() {
        return eventHasServices;
    }

    public void setEventHasServices(List<EventHasService> eventHasServices) {
        this.eventHasServices = eventHasServices;
    }

}
