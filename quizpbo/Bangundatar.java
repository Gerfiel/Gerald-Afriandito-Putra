package QuizPBO;
import java.util.Scanner;

public class Bangundatar {

    public static void main(String[] args) {
        int p;
        int l;
        int s;
        double luas;

        Scanner input = new Scanner (System.in);

        System.out.println("=====================================");
        System.out.println("===Menghitung Luas Persegi Panjang===");
        System.out.println("=====================================");
        System.out.print("inputkan panjang : ");
        p =input.nextInt();
        System.out.print("inputkan lebar : ");
        l =input.nextInt();
        luas = p*l;
        System.out.println("luas persegi panjang adalah : "+luas+"cm");

        System.out.println("=====================================");
        System.out.println("=======Menghitung Luas Persegi=======");
        System.out.println("=====================================");
        System.out.print("inputkan sisi : ");
        s =input.nextInt();
        System.out.print("inputkan sisi : ");
        s =input.nextInt();
        luas = s*s;
        System.out.println("luas persegi adalah : "+luas+"cm"); 
    }   
}