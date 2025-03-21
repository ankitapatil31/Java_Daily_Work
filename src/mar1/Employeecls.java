package mar1;

public class Employeecls {
  String name;
  static int id = 0;
  String email;
  static String companyName = "TCS";

    public Employeecls(String name, String email) {
        this.id = this.id +1;
        this.name = name;
        this.email = email;
    }

  public void PrintValue(){
      System.out.println(name);
      System.out.println(id);
      System.out.println(email);
      System.out.println(companyName);
      System.out.println("\n");
  }
}
