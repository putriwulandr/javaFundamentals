package Tugas4v1;

public class Service implements Student
{
    // studentRegistration implement Person, learningPlan implement Student
    // course sks room jadiin array
    public String courseName;
    public String sks;
    public String room;
    
    public void studentRegistration(String fullName, String cardIdentitas, String domisili) {};

    void learningPlan(String courseName, String sks, String room) {
        this.courseName = courseName;
        this.sks = sks;
        this.room = room;
    };
}
