package banking.entities;
import javax.persistence.*;
import java.util.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany
    private List<CreditCard> creditCards;

    @ManyToMany
    @JoinTable(
            name = "address_person",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private List<Address> addresses;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddress(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }







}
