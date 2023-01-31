import java.security.spec.RSAOtherPrimeInfo;

public class WhileLoops {
    public static void  main(String [] args){
        int x = 6;
        boolean check = 1==1;  //   == equal
        // >=
        // <=
        // !=

        while (x<=10){                          // пока условие в круглых скобках true
            System.out.println("Correct!");     // данное условие будет выполняться
            x = x-1;                            // действие при каждой итерации
        }

        System.out.println(check);


    }
}
