public class Break_Continue {
    public static void main(String[] args) {
//        int i = 0;
//        while (true){
//            if (i==15){
//                break;
//            }
//           System.out.println(i);
//           i++;
//
//        }
//        System.out.println("мы вышли из цикла");

        int i;
        for (i = 0; i <= 15; i++) {
            if (i % 2 == 0) {                       // почему то здесь речь идет о делении i на 2 и дает остаток ноль (ХЗ??)
                                                    // Если число 7 делить на 2 то остаток не нулевой и мы даем оманду считать такое число нечетным в систем аут
                continue;
            }
            System.out.println("Это не четное число "+i);
        }
    }
}
