abstract class Contact{
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract void contact();
}

class EmailContact extends Contact{
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    void contact() {
        System.out.println("Emailing " + this.getEmail());
    }
}

class PhoneContact extends Contact{
    private String phone;

    public PhoneContact(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    void contact() {
        System.out.println("Calling " + this.getPhone());
    }
}

public class Main {
    public static void main(String[] args) {
        PhoneContact phone1 = new PhoneContact("Sakura", "123-456-7890");
        EmailContact email1 = new EmailContact("Astra", "astraMakesThings@gmail.com");
        phone1.contact();
        email1.contact();
    }
}