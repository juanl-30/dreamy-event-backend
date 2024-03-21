package project.dreamyevent.domain;

public class ServiceDomain {

    private int id;
    private String name;
    private String description;
    private double price;
    private String location;
    private String city;
    private String country;
    private int amountPeople;
    private String characteristics;
    private SupplierDomain supplierDomain;
    private  TypeServiceDomain typeServiceDomain;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public SupplierDomain getSupplierDomain() {
        return supplierDomain;
    }

    public void setSupplierDomain(SupplierDomain supplierDomain) {
        this.supplierDomain = supplierDomain;
    }

    public TypeServiceDomain getTypeServiceDomain() {
        return typeServiceDomain;
    }

    public void setTypeServiceDomain(TypeServiceDomain typeServiceDomain) {
        this.typeServiceDomain = typeServiceDomain;
    }
}
