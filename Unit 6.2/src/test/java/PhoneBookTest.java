import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void start() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void addGroup() {
        assertThat(phoneBook.addGroup("Дом"), equalTo(true));
    }

    @Test
    public void addContacts() {
        phoneBook.addGroup("Дом");
        assertThat(phoneBook.addContacts("Jon", 123, "Дом"), equalTo(true));

    }

}