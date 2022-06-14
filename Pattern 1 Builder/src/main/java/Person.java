import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public boolean hasAge() {
        return this.age >= 0;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            age++;
        }
    }

    public String getAddress() {
        return city;
    }

    public boolean hasAddress() {
        return this.city != null;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        personBuilder.setAddress(this.city);
        return personBuilder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
