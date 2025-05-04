package april22.homeAssingment.methods_ovrride;

import java.util.List;
import java.util.Objects;

public class employeeCls {
    public int Id;
    public  String Name;
    public List<String> PhoneNum;

    public employeeCls(int id, String name, List<String> phoneNum) {
        Id = id;
        Name = name;
        PhoneNum = phoneNum;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public List<String> getPhoneNum() {
        return PhoneNum;
    }

    @Override
    public String toString() {
        return "employeeCls{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", PhoneNum=" + PhoneNum +
                '}';
    }

        @Override
    public boolean equals(Object o) {
        if (!(o instanceof employeeCls that)) return false;
        return Id == that.Id && Objects.equals(Name, that.Name) && Objects.equals(PhoneNum, that.PhoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, PhoneNum);
    }
}

