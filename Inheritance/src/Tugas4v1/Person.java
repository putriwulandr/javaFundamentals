package Tugas4v1;

public interface Person 
{
    public String firstName;
    public String lastName;
    public String domisili;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDomisili() { return domisili; }

    public void setDomisili(String domisili) { this.domisili = domisili; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public Person() { }
    public Person(String firstName, String lastName, String domisili) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domisili = domisili;
    }

    public void fullName() { System.out.println(firstName + " " + lastName); }
}
