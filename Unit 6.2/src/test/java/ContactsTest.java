import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ContactsTest {
    Contacts contacts;

    @BeforeEach
    public void start() {
        contacts = new Contacts("Pite", 123);
    }

    @Test
    public void getTel() {
        assertThat(contacts.getTel(), equalTo(123));
    }

    @Test
    public void testHashCode() {
        int result = Objects.hash("Pite", 123);
        assertThat(contacts.hashCode(), equalTo(result));
    }

    @Test
    public void contactsContainer() {
        assertThat(contacts, notNullValue());
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testTel(String a) {
        assertThat(contacts.getName(), equalToIgnoringCase(a));

    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of("PITE"));
    }

}