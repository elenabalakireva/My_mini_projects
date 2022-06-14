import java.util.Objects;

public class Contacts {
    private String name;
    public int tel;

    public Contacts(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public int getTel() {
        return tel;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Contacts.class)) return false;
        Contacts o = (Contacts) obj;
        return name.equals(o.name) && tel == o.tel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tel);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Тел: " + tel;
    }
}
