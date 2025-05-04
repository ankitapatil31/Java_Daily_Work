package april22.homeAssingment.hashcode_issue_inheritance;

import java.util.List;

public class ChildCls extends employeecls_for_inheritance {
    int rollnum;

    public ChildCls(int id, String name, List<String> phoneNum, int rollnum) {
        super(id, name, phoneNum);
        this.rollnum = rollnum;
    }

    public int getRollnum() {
        return rollnum;
    }

}
