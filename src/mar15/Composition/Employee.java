package mar15.Composition;

public class Employee {
    private int id;
    private Name name;
    private String email;

    public Employee(int id, Name name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", email='" + email + '\'' +
                '}';
    }
}
