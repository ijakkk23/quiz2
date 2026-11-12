import java.util.Scanner;

public class kuis01iza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int parkirterlama = -1;


        do {
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
            if (jam < 0 || jam > 24) {
                System.out.println("Input tidak valid. Silakan masukkan jam parkir yang benar.");
                continue;
            }
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            jumlahKendaraan++;
        if (jam > parkirterlama) {
            parkirterlama = jam;
        }
        } while (jam != 0);
       

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Lama parkir terlama : " + parkirterlama + " jam");
    }
}