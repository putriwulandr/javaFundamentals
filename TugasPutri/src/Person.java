
public class Person 
{
    private static String firstName;
    private static String lastName;
    private static String domisili;
    private static int tahunLahir;

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

    public static void getDetailPerson() {
        System.out.println("Nama Lengkap : " + firstName + " " + lastName);
        System.out.println("Domisili : " + domisili);
        System.out.println("Tahun Lahir : " + tahunLahir);
    }
}
