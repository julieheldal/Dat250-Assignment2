package banking.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class PinCode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String pinCode;
    private int count;

    @OneToMany
    private List<CreditCard> creditCards;


    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPinCode(){
        return pinCode;

    }
    public void setCount(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }
}
