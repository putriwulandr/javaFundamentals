
import java.util.Scanner;

public class Person 
{
    private static String firstName;
    private static String lastName;
    private static String domisili;
    private static int tahunLahir;
    private static Scanner input;

    public static String getfirstName() {
        return firstName;
    }

    public static void setfirstName(String firstName) {
        Person.firstName = firstName;
    }

    public static String getlastName() {
        return lastName;
    }

    public static void setlastName(String lastName) {
        Person.lastName = lastName;
    }

    public static String getdomisili() {
        return domisili;
    }

    public static void setdomisili(String domisili) {
        Person.domisili = domisili;
    }

    public static int gettahunLahir() {
        return tahunLahir;
    }

    public static void settahunLahir(int tahunLahir) {
        Person.tahunLahir = tahunLahir;
    }


    public static void getDetailPerson() 
    {
        input = new Scanner(System.in);

        System.out.println("Masukkan First Name : ");
        firstName = input.next();
        System.out.println("Masukkan Last Name : ");
        lastName = input.next();
        
        System.out.println("Masukkan Domisili: ");
        domisili = input.next();
        
        System.out.println("Masukkan Tahun Lahir : ");
        tahunLahir = input.nextInt();

        System.out.println(" ");
        System.out.println("----- BIODATA SINGKAT -----");
        System.out.println("Nama Lengkap : " + firstName + " " + lastName);
        System.out.println("Domisili : " + domisili);
        System.out.println("Tahun Lahir : " + tahunLahir);
        System.out.println("------------------------------");
        System.out.println(" ");
    }
}
