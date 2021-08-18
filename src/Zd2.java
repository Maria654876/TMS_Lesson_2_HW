public class Zd2 {
    /*
    В данном методе объявлены четыре переменные.
    Каждой переменной присвоено произвольное числовое значение в разном системе счисления.
    Результат выводится на консоль.
     */
    public static void main(String[] args) {
        int a=23;
        int b=0b010101;
        int c=012345667;
        int d=0x4787;
        System.out.println("В двоичном формате "+b);
        System.out.println("В восьмеричном формате "+c);
        System.out.println("В десячином формате "+a);
        System.out.println("В шестнадцатиричном формате "+d);
    }
}
