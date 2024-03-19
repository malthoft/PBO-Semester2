import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class codelab1 {

    public static void main(String[] args) {
        String nama;
        String jenisKelamin, jkelamin;
        String tanggalLahir;
        LocalDate tahunSekarang;
        
        Scanner input = new Scanner(System.in);

        System.out.println("NAMA: ");
        nama = input.nextLine();

        System.out.println("Jenis Kelamin:");
        jenisKelamin = input.nextLine();

        System.out.println("Tanggal Lahir (YYYY-MM-DD):");
        tanggalLahir = input.nextLine();

        LocalDate DOB = LocalDate.parse(tanggalLahir); // mengubah varibel tanggal lahir menjadi format localdate

        tahunSekarang = LocalDate.now(); // LocalDate.now untuk mengisi tanggal sekarang

        Period umur = Period.between(DOB, tahunSekarang); //

        if (jenisKelamin.equals("L")) {
            jkelamin = "Laki-Laki";
            
        }else if (jenisKelamin.equals("P")) {
            jkelamin = "Perempuan";
        }else{
            jkelamin = "Anda salah memasukkan Jenis kelamin";
        }

        System.out.println("NAMA: " + nama);
        System.out.println("Jenis Kelamin:" + jkelamin);
        System.out.printf("Umur Anda %d tahun %d bulan", umur.getYears(), umur.getMonths());

    }
}