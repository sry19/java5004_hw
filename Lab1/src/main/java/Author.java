/**
 * Represents an Author with their details--name, email and physical address *
 * @author therapon
 */
public class Author {
    private Person person;
    private Email email;
    private Address address;
    /**
     * Creates a new author given the author's name, email and address as strings. *
     * @param person the author's name
     * @param email the author's email address
     * @param address the authors physical address */
    public Author(Person person, Email email, Address address) {
        this.person = person;
        this.email = email;
        this.address = address;
    }

    /**
     * @return the person, which contains first name and last name */
    public Person getPerson() {
        return this.person;
    }

    /**
     * @return the email */
    public Email getEmail() {
        return this.email;
    }
    /**
     * @return the address */
    public Address getAddress() {
        return this.address;
    }
}
