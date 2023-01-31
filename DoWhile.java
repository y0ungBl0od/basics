import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhile {
    public static void  main(String [] args){
        // Будет читать цифры с клавиатуры до тех пор, пока не увидит 5
        Scanner s = new Scanner(System.in);
       // System.out.println("Введи 5");
       // int value = s.nextInt();
        // while(value!=5){                    // крутит while пока не увидит 5
           // System.out.println("Введи 5");
           // value = s.nextInt();
            int value;                                 // value задекларирована за пределами фигурных скобок
            do {
                System.out.println("Введи 5");
                value = s.nextInt();
        } while(value!=5);                              // поэтому здесь value может считаться со строки 13

        System.out.println("Вы ввели 5");
    }
}
