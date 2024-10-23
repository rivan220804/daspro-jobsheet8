import java.util.Scanner;

public class Tugas223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahAtletPerCabor = 5;
        String[] namaAtlet = new String[jumlahAtletPerCabor];

        for (String cabor : cabangOlahraga) {
            System.out.println("Masukkan nama atlet untuk cabang " + cabor + ":");
            int i = 0;
            while (i < jumlahAtletPerCabor) {
                System.out.print("Atlet " + (i + 1) + ": ");
                namaAtlet[i] = sc.nextLine();
                i++;
            }
            
            System.out.println("\nDaftar Atlet untuk cabang " + cabor + ":");
            int j = 0;
            do {
                System.out.println("  - " + namaAtlet[j]);
                j++;
            } while (j < jumlahAtletPerCabor);
            System.out.println();
        }

    }
}

