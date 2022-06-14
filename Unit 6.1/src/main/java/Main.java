public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");
        phoneBook.addGroup("Семья");
        phoneBook.addContacts("Петр", 456_789, "Друзья");
        phoneBook.addContacts("Ivan", 369_951, "Друзья");
        phoneBook.addContacts("Ольга", 123_789, "Работа");
        phoneBook.addContacts("Мария", 45_963, "Семья");
        phoneBook.printByGroup("Работа");
        phoneBook.printByGroup("Друзья");
        phoneBook.printByTel(456_789);
    }
}
