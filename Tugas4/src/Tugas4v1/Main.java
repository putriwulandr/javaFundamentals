package Tugas4v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Person person = new Person();
        Student student = new Student();

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("-------- Sistem Informasi Akademik  ----------");
            int pilihMenu;

            System.out.println("Pilihan Menu: \n 1. Menampilkan Detail Data Mahasiswa \n 2. Exit\n");
            System.out.println("Masukkan Pilihan :");
            pilihMenu = input.nextInt();
            System.out.println(" ");
            
            switch (pilihMenu) {
                case 1:
                    System.out.println("//////////// DATA MAHASISWA /////////////");
                    System.out.println("Masukkan Nama Depan : ");
                    student.setFirstName(input.next());
                    System.out.println("Masukkan Nama Belakang : ");
                    student.setLastName(input.next());
                    System.out.println("Masukkan NIM : ");
                    student.setCardIdentitas(input.next());
                    System.out.println("Masukkan Domisili : ");
                    person.setDomisili(input.next());
                    System.out.println(" "); 

                    System.out.println("//////////// MENAMBAHKAN MATA KULIAH /////////////");
                    System.out.println("Masukkan Nama Mata Kuliah : ");
                    student.learningPlan();
                    System.out.println("Masukkan Jumlah SKS : ");
                    student.sks();
                    System.out.println(" ");

                    System.out.println("//////////// MENAMPILKAN DETAIL SIAKAD MAHASISWA /////////////");                 
                    student.fullName();
                    student.studentRegistration();
                    person.domisili(); 
                    
                    System.out.println("/////////////////////////////////////////////////////////////");
                    System.out.println(" ");
                break;
                case 2:
                    System.exit(0);
                break;
                
                default:
                    break;
            }
            System.out.println("Tekan Y untuk kembali ke menu atau N untuk keluar : ");
            choice = input.next();
        }

        while ((choice.equalsIgnoreCase("y")));
        System.out.println(" ");
        System.out.println(">>>>>>>>> Program Selesai <<<<<<<<<");
        input.close();
    }
}
