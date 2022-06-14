import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ContactsTest {
    Contacts contacts;

    @BeforeEach
    public void start(){
        contacts = new Contacts("Pite", 123);
    }

    @Test
    void getTel() {
        Assertions.assertEquals(contacts.getTel(), 123);
    }

    @Test
    void testHashCode() {
        int result = Objects.hash("Pite", 123);
        Assertions.assertEquals(contacts.hashCode(), result);
    }
}