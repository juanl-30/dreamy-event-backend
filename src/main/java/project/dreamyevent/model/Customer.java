package project.dreamyevent.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer id;
    private String name;
    private String lastname;
    private int phone;
    private String city;
    private String country;
    private String img;


    @ManyToOne
    @JoinColumn(name = "idUser", insertable = false, updatable = false)
    private User user;

    @OneToMany(mappedBy = "customer")
    private List<Event> events;

    @OneToMany(mappedBy = "customer")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "customer")
    private List<Comment> coments;


    public Customer(Integer id, String name, String lastname, int phone, String city, String country, String img, User user, List<Event> events, List<Favorite> favorites, List<Comment> coments) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.img = img;
        this.user = user;
        this.events = events;
        this.favorites = favorites;
        this.coments = coments;
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

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
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

}
