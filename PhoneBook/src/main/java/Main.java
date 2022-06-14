import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");
        phoneBook.addGroup("Семья");
        phoneBook.addContacts("Петр", 456_789, "Друзья");
        phoneBook.addContacts("Иван", 369_951, "Друзья");
        phoneBook.addContacts("Ольга", 123_789, "Работа");
        phoneBook.addContacts("Мария", 45_963, "Семья");
        LocalDateTime localDateTime = LocalDateTime.of(2022, 01, 12, 15, 15);
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 02, 12, 18, 12);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 02, 12, 15, 15);
        MissedCalls missedCalls = new MissedCalls();
        missedCalls.addMissedCalls(localDateTime, 123_789);
        missedCalls.addMissedCalls(localDateTime1, 456_789);
        missedCalls.addMissedCalls(localDateTime2, 45_9063);
        missedCalls.printAllMissedCalls(phoneBook);


    }
}