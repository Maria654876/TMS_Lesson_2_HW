import java.util.Scanner;

public class zd6 {
    /*
    В данном методе необхдимо ввести слово и вывести его в ковычках.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите слово ");
        String a=console.nextLine();
        System.out.print(a +" \""+ a+"\"");
    }
}
