import java.util.Scanner;

public class kuis01iza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();

        do {
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            System.out.println("Biaya parkir: Rp " + biaya);
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt(); 
            jumlahKendaraan++;
        } while (jam != 0);
       

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}