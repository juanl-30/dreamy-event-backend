package project.dreamyevent.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;
    private String email;
    private String password;
    @Column(name = "recovery_Code")
    private String recoveryCode;


    @OneToMany(mappedBy = "user")
    private List<Supplier> suppliers;

    @OneToMany(mappedBy = "user")
    private List<Customer> customers;

    public User(Integer id, String email, String password, String recoveryCode, List<Supplier> suppliers, List<Customer> customers) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.recoveryCode = recoveryCode;
        this.suppliers = suppliers;
        this.customers = customers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }

    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
