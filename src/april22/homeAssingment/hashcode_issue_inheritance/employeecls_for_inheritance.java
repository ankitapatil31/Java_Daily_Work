package april22.homeAssingment.hashcode_issue_inheritance;
import java.util.*;

public class employeecls_for_inheritance {

        private final int Id;
        private  final String Name;
        private final List<String> PhoneNum;

        public employeecls_for_inheritance(int id, String name, List<String> phoneNum) {
            Id = id;
            Name = name;
            PhoneNum = phoneNum;
        }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof employeecls_for_inheritance that)) return false;
        return Id == that.Id && Objects.equals(Name, that.Name) && Objects.equals(PhoneNum, that.PhoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, PhoneNum);
    }
}

// lambok,,,,containeraisation ,,, load balancer,,, docker,, kubernate,,, letancy  fault tolarance