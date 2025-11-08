import java.util.Scanner;
public class Tugas1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilai;
        int mhs, tertinggi = 0, terendah = 0;
        double sum = 0, rata2 = 0;

        System.out.println("=== Program Pengelola Nilai Mahasiswa ===");
        System.out.print("Masukkan jumlah nilai mahasiswa yang ingin diinput: ");
        mhs = sc.nextInt();

        nilai = new int[mhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            sum += nilai[i];
        }

        rata2 = sum / nilai.length;

        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        System.out.println("Data nilai: ");

        int no = 1;
        for (int i : nilai) {
            System.out.println(no + ". " + i);
            no++;
        }

        System.out.println("\nNilai Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }    
}
