package banking;
import javax.persistence.*;
import banking.entities.*;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "creditcard";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.clear();

        em.getTransaction().begin();

    Person person = createPerson("Max Mustermann");
    Address address = createAddress("Inndalsveien",28);
    CreditCard creditCard = createCreditCard(123245,-5000,-1000);
    PinCode pinCode = createPinCode("123",1);
    Bank bank = createBank("Pengebank");


        em.persist(person);
        em.persist(creditCard);
        em.persist(pinCode);
        em.persist(address);
        em.persist(bank);

        em.getTransaction().commit();
        em.close();
    }

    public static Person createPerson(String name) {
        Person person = new Person();
        person.setName(name);
        return person;
    }

    public static Address createAddress(String street, int number) {
        Address address = new Address();
        address.setStreet(street);
        address.setNumber(number);
        return address;
    }
    public static CreditCard createCreditCard(int number, int limit, int balance) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(number);
        creditCard.setLimit(limit);
        creditCard.setBalance(balance);
        return creditCard;
    }

    public static PinCode createPinCode(String code, int count) {
        PinCode pinCode = new PinCode();
        pinCode.setPinCode("code");
        pinCode.setCount(count);
        return pinCode;
    }

    public static Bank createBank(String name) {
        Bank bank = new Bank();
        bank.setName(name);
        return bank;
    }




}
