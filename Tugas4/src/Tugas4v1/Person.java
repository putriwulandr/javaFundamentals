package Tugas4v1;

public class Person
{
    public String firstName;
    public String lastName;
    public String domisili;
    // public String fullName;

    public String getFullName() { return firstName + " " + lastName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getDomisili() { return domisili; }

    // public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDomisili(String domisili) { this.domisili = domisili; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public Person() { }
    public Person(String firstName, String lastName, String domisili, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.domisili = domisili;
        // this.fullName = fullName;
    }

    public String domisili() {
        System.out.println("Domisili : " + this.getDomisili());
        return domisili;
    }

    public void fullName() { 
        System.out.println("Nama Lengkap : " + this.getFirstName() + " " + this.getLastName()); 
        return;
    }
}
