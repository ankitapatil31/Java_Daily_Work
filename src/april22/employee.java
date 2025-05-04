package april22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final public class employee {
    private final int employeeId;
    private final String Name;
    private final List<String> PhoneNum;

    public employee(int employeeId, String name, List<String> phoneNum) {
        this.employeeId = employeeId;
        Name = name;
        PhoneNum = phoneNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return Name;
    }

    public List<String> getPhoneNum() {
        return new ArrayList<>(PhoneNum);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return employeeId == employee.employeeId && Objects.equals(Name, employee.Name) && Objects.equals(PhoneNum, employee.PhoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, Name, PhoneNum);
    }

    @Override
    public String toString() {
        return "employee{" +
                "employeeId=" + employeeId +
                ", Name='" + Name + '\'' +
                ", PhoneNum=" + PhoneNum +
                '}';
    }
}
