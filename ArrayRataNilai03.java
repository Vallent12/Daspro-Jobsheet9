import java.util.Scanner;
public class ArrayRataNilai03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs;
        int lulus = 0, tidakLulus = 0, mhs;
        double totalLulus = 0, totalTidakLulus= 0;
        double rataLulus, rataTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        mhs = sc.nextInt();

        nilaiMhs = new int[mhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }

        rataLulus= totalLulus / lulus;
        rataTidakLulus = totalTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
