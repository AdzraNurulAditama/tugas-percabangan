import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji;
        

        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();

        final int GAJI_POKOK = 5000000;
        final int UANG_LEMBUR_PER_JAM = 50000;
        final int MAX_REGULAR_HOURS = 240; // 240 jam = 8 jam/hari * 30 hari
        int masaKerja, jamKerja, jamLembur;
        double tambahan, totalGaji;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa kerja (dalam tahun): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid. Masukkan masa kerja (dalam tahun): ");
            scanner.next();
        }
        masaKerja = scanner.nextInt();

        System.out.print("Masukkan jumlah jam kerja dalam 1 bulan: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid. Masukkan jumlah jam kerja dalam 1 bulan: ");
            scanner.next();
        }
        jamKerja = scanner.nextInt();

        // Hitung jam lembur
        if (jamKerja > MAX_REGULAR_HOURS) {
            jamLembur = jamKerja - MAX_REGULAR_HOURS;
        } else {
            jamLembur = 0;
        }

        // Hitung tambahan berdasarkan masa kerja
        if (masaKerja < 5) {
            tambahan = 0;
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            tambahan = GAJI_POKOK * 0.05; // Tambahan 5%
        } else {
            tambahan = GAJI_POKOK * 0.10; // Tambahan 10%
        }

        // Hitung total gaji
        totalGaji = GAJI_POKOK + tambahan + (jamLembur * UANG_LEMBUR_PER_JAM);
        
        System.out.println(totalGaji);
    }
}

        */
        
        System.out.println(totalGaji);
    }
}


Program PenghitunganGaji
    
Deklarasi
Var gajiPokok = 5000000;
uangLembur = 50000;
 masaKerja;
jamKerja;
jumlahJamKerja;
jumlahJamLembur;
: integer;
totalGaji;
bonus;
: double;

Algoritma
 input (masaKerja);
input (jumlahJamKerja);
if (masa kerja <5 tahun) then;
output (bonus = 0);
else if (masa kerja>= 5 && masaKerja <= 10 ) then;
output (bonus = 0,05 * uangLembur);
else(masa kerja > 10 tahun) then;
output (bonus = 0,01);
end if;
end;
