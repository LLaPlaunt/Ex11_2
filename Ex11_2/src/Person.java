

public class Person{

	String input = new String();

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
    	name = input.toString();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
    	address = input.toString();
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
    	phoneNumber = input.toString();
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
    	email = input.toString();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}