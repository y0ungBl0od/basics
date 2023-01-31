public class Arrays {
    public static void main (String[] args){
        int number = 10; // примитивный тип данных
//        char character = 'a'; //                примитивный   [10]
//        String s = "Hi mate";
//        String s1 = new String("Hello mate");
        int[] numbers = new int[5];         //          массив -> [массив] ссылочный тип данных, нет инциализации данных в ячейках..
//        System.out.println(numbers[1]);     //  0 1 2 3 4  почти во всех ЯП отчет начинается с нуля
//        numbers [0] = 1;
//        numbers[1] = 2;       // можно вручную инициализировать данные в массиве
//        numbers[2] = 3;       // и т.д.
//                                 можно задать значения всему массиву одной строкой.
//        int [] numbers = {1,2, 3, 4, 5};
//          но можно применить оператор for each
        int i;
        for(i = 0;i<numbers.length;i++) {
            numbers[i] = i*(100-34);
            System.out.println(numbers[i]);
                    }
        int [] numbers1 = {1,2,3,6,8};
        int x;
        for(x = 0;x<numbers1.length;x++){

            System.out.println("\n"+numbers1[x]);           // "\n" - новая строка , печать с новой строки
        }
    }


}
