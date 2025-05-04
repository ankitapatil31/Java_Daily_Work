package april22;

import java.util.Objects;

public class student {
    String name;
    int Id;

    public student(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        student student = (student) o;
//        return Id == student.Id && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, Id);
//    }

    public int getId() {
        return Id;
    }
}
