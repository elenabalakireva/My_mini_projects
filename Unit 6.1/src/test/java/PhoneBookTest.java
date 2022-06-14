import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook;
    @BeforeEach
    public void start(){
        phoneBook = new PhoneBook();
    }
    @Test
    void addGroup() {
        Assertions.assertTrue(phoneBook.addGroup("Дом"));
    }

    @Test
    void addContacts() {
        phoneBook.addGroup("Дом");
       Assertions.assertTrue(phoneBook.addContacts("Jon", 123, "Дом"));

    }
}