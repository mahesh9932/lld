package fooddelsys.data;

public class User {
    private final int id;
    private final String userName;
    private final Address address;
    private final String phoneNumber;

    public User(int id, String userName, Address address, String phoneNumber){
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

}
