import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookNotFound {

        Scanner sc = new Scanner(System.in);


        Metodlar.Bookadd();

        System.out.println("Kitab adina axtaris ucun 1: "+ '\''
                +"Yazici adina axtaris ucun 2: " +'\'' +
                "Silmek istediyiniz kitabi daxil etmek ucun 3: "

        );
        int n = sc.nextInt();


        switch (n){
            case 1:
                Metodlar.axtardiginizKitab();
                break;
            case 2:
                Metodlar.axtardiginizYazici();
                break;
            case 3:
                Metodlar.removeBookByTitle();
                break;
            default:
                System.out.println("Daxil etdiyiniz reqemde emeliyyet movcud deyil");
        }

    }
}