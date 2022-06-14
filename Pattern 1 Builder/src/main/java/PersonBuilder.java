class PersonBuilder {

    private String name;
    private String surname;
    private int age = 0;
    private String address;


    public PersonBuilder setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalStateException("Не введено имя");
        } else {
            this.name = name;
        }

        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname.isEmpty()) {
            throw new IllegalStateException("Не введена фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age <= 0) {
            throw new IllegalStateException("Некорректный возраст");
        } else {
            this.age = age;
        }

        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        }

        if (age <= 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }

        return person;
    }
}