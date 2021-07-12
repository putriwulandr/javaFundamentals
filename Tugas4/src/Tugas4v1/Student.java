package Tugas4v1;

import java.util.Scanner;

public class Student extends Person implements Service
{
    // Student nge extends Person. jadi semua override ada disini
    Scanner input = new Scanner(System.in);

    public int[] sks = new int[5];
    public String room;
    public String cardIdentitas;
    public String[] courseName = new String[5];
    
    public int[] getSks() { return sks; }
    public String[] getCourseName() { return courseName; }
    public String getRoom() { return room; }
    public String getCardIdentitas() { return cardIdentitas; }

    public void setSks(int[] sks) { this.sks = sks; }
    public void setCourseName(String[] courseName) { this.courseName = courseName; }
    public void setRoom(String room) { this.room = room; }
    public void setCardIdentitas(String cardIdentitas) { this.cardIdentitas = cardIdentitas; }

    @Override
    public void studentRegistration() {
        // TODO Auto-generated method stub
        System.out.println("NIM : " + this.getCardIdentitas());
        return;
    }

    @Override
    public void learningPlan() {
        // TODO Auto-generated method stub
        for(int i=1; i < courseName.length; i++)
        {
          System.out.println("Mata Kuliah " + i + " : " + (courseName [i] = input.next()));
        }
        return;
    }

    public void sks(){
        for(int j=1; j < sks.length; j++)
        {
          System.out.println(j + " " + courseName[j] + " : " + (sks [j] = input.nextInt()) + " sks");
        }
        return;
    }

    @Override
    public void fullName() {
        // TODO Auto-generated method stub
        int jumlah = 0;
        for (int total : sks) { jumlah = jumlah + total; }
        if (jumlah > 144) {
            System.out.println("Jumlah Total SKS : " + jumlah);
            System.out.println("Nama Lengkap dengan Gelar : " + fullName + ", S.Pd.");
        }
        return;
    }
}
