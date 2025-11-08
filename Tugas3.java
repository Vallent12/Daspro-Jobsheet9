import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        String cari;

        System.out.println(" === Selamat Datang di Kafe Didit ===\n");
        System.out.print("Silahkan cari nama makanan yang diinginkan: ");
        cari = sc.nextLine();

        Boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])) {
                System.out.println("Makanan atau minuman " + menu[i] + " tersedia di menu.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, makanan atau minuman " + cari + " tidak ada di menu.");
        }

        System.out.println();
    }
}
