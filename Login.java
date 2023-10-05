import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
       String userName, password;
       String user1 = "Nurwahib" ;
       String pass1 = "Wahib123";
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        userName = input21.nextLine();
        System.out.print("Masukkan Password : ");
        password = input21.nextLine();
        String hasil = (userName == user1 && password == pass1) ? "Login berhasil" : "Login gagal";
        System.out.println(hasil);




    }
}
