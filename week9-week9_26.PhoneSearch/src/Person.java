import java.util.Set;

public class Person {
    private String name;
    private String address;

    private Set<String> numbers;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Set<String> getNumbers() {
        return numbers;
    }
}
