import java.util.Scanner;

public class Ochroniarz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie=sc.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String nazwisko=sc.nextLine();
        System.out.println("Miasto zamieszkania?");
        String miasto=sc.nextLine();
        System.out.println("Ile masz lat?");
        int wiek=sc.nextInt();
        System.out.println("Podaj stan cywilny?");
        String stan_cywilny=sc.nextLine();

        System.out.println(imie + "\n" + nazwisko + "\n" + miasto + "\n" + wiek + "\n" + stan_cywilny);
    }
}
