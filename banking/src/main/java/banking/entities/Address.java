package banking.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String street;
    private int number;

    @ManyToMany(mappedBy ="addresses")
    private List<Person> people;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private List<Person> getPeople() {
        return people;
    }

    private void getPeople(List<Person> people) {
        this.people = people;
    }

}
