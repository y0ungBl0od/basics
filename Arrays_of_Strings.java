import java.security.spec.RSAOtherPrimeInfo;

public class Arrays_of_Strings {
    public static void  main(String[] args) {
        int [] numbers = new int [5];       // ячейки в массиве покуа пустые
        numbers [0] = 10;                   // проинициализировали ячейку под индексом 0
        String[] name = new String[3];      // [3] - Означает что массив name вмещает в себя 3 объекта
        name [0] = "Hi mate";
        name [1] = "howdy";
        name [2] = "!!!";
//        System.out.println(name[0]);
//        System.out.println(name [1]);
//        System.out.println(name [2]);
//        for(int i = 0; i<name.length; i++){
//            System.out.println(name[i]);
        for (String string:name){           //    for (Тип_данных переменная:имя_массива){
            System.out.println(string);     //    }
        }

        int [] numbers1 = {1,2,3};
        int sum = 0;
        for (int x:numbers1) {                  // на первой итерации int x равняется единице
            sum = sum+x;                        // на второй итерации int x равняется двум и т.д.
            }
        System.out.println();
        System.out.println(sum);
        int value = 0;              //  выделяем память под целое число 32 бита
        String s;                   //  Не выделяется память под Стринг. размер строки стринг неизвестен может 10 букв, может тысяча букв
                                    //  По умолчанию String s = null;


    }
}

