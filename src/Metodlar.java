import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Metodlar {
    public static List<Book> books = new ArrayList<>();

    public static void Bookadd() {


        Book book = new Book("Qurur ve Qerez", "Ceyn Ostin", "55555", 15.50, 10);
        books.add(book);
        Book book1 = new Book("Yad", "Albert Kamyu", "3216", 10.50, 8);
        books.add(book1);
        Book book2 = new Book("Karenina", "Lev Tolstoy", "9696", 20.50, 11);
        books.add(book2);
    }

    public static void BookUpdate() throws BookNotFound {

        try {
            throw new BookNotFound("Axtarisiniz uzre netice tapilmadi");
        } catch (BookNotFound e) {
            throw new RuntimeException(e);
        }

    }

    public static void axtardiginizKitab() throws BookNotFound {
        System.out.println("Axtardiginiz kitabin adini daxil edin");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean b = true;
        for (int i = 0; i < books.size(); i++) {
            if (str.equals(books.get(i).getTitle())) {
                System.out.println(books.get(i));
                b = false;


            }

        }
        if (b == true) {
            BookUpdate();
        }

    }

    public static void axtardiginizYazici() throws BookNotFound {
        System.out.println("Axtardiginiz yazici adini daxil edin");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        boolean b = true;
        for (int i = 0; i < books.size(); i++) {
            if (str.equals(books.get(i).getAuthor())) {
                System.out.println(books.get(i));
                b = false;


            }

        }
        if (b == true) {
            BookUpdate();

        }
    }

    public static void removeBookByTitle() throws BookNotFound {
        System.out.println("Silmek istediyiniz kitabi daxil edin: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (Book b : books) {
            if (b.getTitle().equals(str)) {
                books.remove(b);

             throw new BookNotFound("Axtarisiniz uzre netice tapilmadi");
           }
            }
        }
    }





//        boolean tapildi = true;
//        for (int i = 0; i < books.size(); i++) {
//            if (str.equals(books[i].getTitle)) {
//                books.remove(i);
//                {
//
//                }
//                {
//                    System.out.println(books.remove(i));
//                    tapildi = false;
//
//                }
//            }
//            if (tapildi == true) {
//





