import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Selamat Datang di Kafe Didit ===\n");

        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesenan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesenan];
        double[] hargaPesenan = new double[jumlahPesenan];

        for (int i = 0; i < jumlahPesenan; i++) {
            System.out.println("\nPesanan ke-" + (i +1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Masukkan harga: ");
            hargaPesenan[i] = sc.nextDouble();
            sc.nextLine();
        
        }

        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesenan; i++) {
            totalBiaya += hargaPesenan[i];
        }

        System.out.println("\n=== Daftar Pesanan ===");
        for (int i = 0; i < jumlahPesenan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " / " + "Rp. " + hargaPesenan[i]);
        }

        System.out.println("Total biaya semua pesanan: Rp. " + totalBiaya);
    }
}
