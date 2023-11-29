package info;
public class Customer implements java.io.Serializable{
    private int id;
    private String name;
    private String address;
    private String phone;

    static final long serialVersionUID = 45L;

    public Customer(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}