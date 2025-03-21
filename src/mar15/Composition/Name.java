package mar15.Composition;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    Name(String first, String middleName, String lastName){
        this.firstName = first;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
