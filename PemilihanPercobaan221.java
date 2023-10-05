import java.util.Scanner;

public class PemilihanPercobaan221 {
    public static void main(String[] args) {
     Scanner input21 = new Scanner(System.in);
     System.out.print("Nilai uas : ");
     float uas = input21.nextFloat();
     System.out.print("Nilai uts : ");
     float uts = input21.nextFloat();
     System.out.print("Nilai kuiz : ");
     float kuiz = input21.nextFloat();
     System.out.print("Nilai tugas : ");
     float tugas = input21.nextFloat();
     float total = (uas * 0.4F) + (uts * 0.3F) + (kuiz * 0.1F) + (tugas * 0.2F);
     
     if (total > 80 && total <=100){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total > 73 && total <=80){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total > 65 && total <=73){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total > 60 && total <=65){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total > 50 && total <=60){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total > 39 && total <=50){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }else if (total < 39 ){
        System.out.print("Nilai angka = " + total + ", Nilai huruf = A, " + "Nilai setara = 4, " + "Kualifikasi = Sangat Baik.");
     }
    }
}
