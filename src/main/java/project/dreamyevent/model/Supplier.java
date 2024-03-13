package project.dreamyevent.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_supplier")
    private Integer id;
    private String name;
    private String email;
    private int phone;
    private double rut;
    private String city;
    private String image;

    @ManyToOne
    @JoinColumn(name = "idUser", insertable = false, updatable = false)
    private User user;

    @OneToMany(mappedBy = "supplier")
    private List<Service> services;

    public Supplier(Integer id, String name, String email, int phone, double rut, String city, String image, User user, List<Service> services) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rut = rut;
        this.city = city;
        this.image = image;
        this.user = user;
        this.services = services;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getRut() {
        return rut;
    }

    public void setRut(double rut) {
        this.rut = rut;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

}
