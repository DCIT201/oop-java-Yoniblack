public class Customer {
    private String name;
    private String contactInfo;
//CONSTRUCTOR//
    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() { return name; }
    public String getContactInfo() { return contactInfo; }
}

