import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
            // Variabel standar
        int gajiPokok = 5000000;
        double bonus = 0;
        double gajiTotal;
        int uangLembur = 50000;
        int jamKerjaNormalPerMinggu = 40;
        
        // Input dari user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan masa kerja (tahun): ");
       int masaKerja = scanner.nextInt();
        
        System.out.print("Masukkan total jam kerja dalam 1 bulan: ");
        int jamKerja = scanner.nextInt();
        
        // Menghitung bonus berdasarkan masa kerja
        if (masaKerja >= 5 && masaKerja <= 10) {
            bonus = 0.05 * gajiPokok;
        } else if (masaKerja > 10) {
            bonus = 0.10 * gajiPokok;
        }
        
        // Menghitung jam lembur
        int jamKerjaPerMinggu = jamKerja / 4; // Membagi total jam per minggu
        int jamLembur = (jamKerjaPerMinggu > jamKerjaNormalPerMinggu) 
                         (jamKerjaPerMinggu - jamKerjaNormalPerMinggu) * 4 
                         0; // Mengalikan dengan 4 untuk total dalam sebulan
        
        // Menghitung gaji total
        gajiTotal = gajiPokok + bonus + (jamLembur * uangLembur);
        
        // Output hasil
        System.out.println("Gaji total yang diterima: Rp " + gajiTotal);
    }
}

//Deklarasi
// Var gajiPokok = 5000000;
//     uangLembur = 50000;
//     masaKerja;
//     jamKerja;
//     jumlahJamKerja;
//     jumlahJamLembur;
//     : integer;
//     totalGaji;
//     bonus;
//     : double;

//Algoritma
//input (masaKerja);
// input (JumlahJamKerja);

// if (masa kerja <5 tahun) then
// output (bonus = 0);
// else if (masa kerja >= 5 && masaKerja <= 10 ) then
// output (bonus = 0,05 * uangLembur);
// else(masa kerja > 10 tahun) then
// output (bonus = 0,10)
