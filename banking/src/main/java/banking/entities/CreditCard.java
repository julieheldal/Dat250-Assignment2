package banking.entities;
import javax.persistence.*;
import java.util.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private int number;
    private int limit;
    private int balance;

    @ManyToOne
    private Bank bank;

    @OneToOne
    private PinCode pinCode;

    @ManyToOne
    private Person person;


    public void setBank(Bank bank) {

        this.bank = bank;
    }

    public Bank getBank() {

        return bank;
    }

    public int getNumber() {

        return number;
    }
    public void setNumber(int number) {

        this.number = number;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public void setPinCode(PinCode pinCode) {

        this.pinCode = pinCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLimit(int limit) {

        this.limit = limit;
    }


    public int getLimit() {

        return limit;
    }

    public PinCode getPinCode() {

        return pinCode;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



}
