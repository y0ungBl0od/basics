import java.util.Scanner;

public class Switch {
    public static void  main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
//        if (age == 10){
//            System.out.println("Ты школьник");
//        } else if (age== 18){
//            System.out.println("Ты закончил школу");
//        }
//        и так далее по схожей логике
//        теперь как это сделать через switch

        switch (age){
            case 0 :
                System.out.println("ТЫ родился");
                break;
            case 7:
                System.out.println("ты в школе");
                break;
            case 18:
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");

        }
    }
}
