import java.util.Scanner;

public class GameFPS {
    public static void main(String[] args) {
        int jarak;
        Scanner input21 = new Scanner(System.in);
        System.out.print("Masukkan jarak : ");
        jarak = input21.nextInt();
        if (jarak <= 5) {
            System.out.println("Gunakan Melee weapon");
        } else {
            System.out.println("Gunakan Range weapon");

        }
    }
}
