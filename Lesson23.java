import org.w3c.dom.ls.LSOutput;

public class Lesson23 {
    public static void main(String[] args) {
        //  в java есть 2 типа объектов
        //  mutable - изменяемый
        //  immutable - неизменяемый
        //  Human2 human1 = new Human2("TOM",20);                 мы можем изменять класс
        //  human1.setName("Patrick");                            был TOM стал Патрик
        //  human1.setAge(25);                                    было 20 лет, стало 25 лет
        String x = "hello";
        String y = new  String("Hi");
//      x.toUpperCase();                // не сработает
                                        // буквы не станут большими, потому что методы не изменяют строку String
                                        // ни один метод не изменяет саму строку String
                                        // методы возвращают новую строку
        x = x.toUpperCase();            // работает, мы переопределили х (поместили новую возвращаемую строку в х)
        System.out.println(x);          // (то есть возвращаемую строку мы принимаем за изначальную строку String)

        String string1 = "Hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);
        // конкатенация - объединение
        // когда string1+string2 - создается совершенно новая stringN которая включает в себя "Hello + my"
        // в дальнейшем, если str1 и str2 не используются сборщик мусора удалит эти str1 str2
        // дальше происходит strN + str3 = strY
        // когда конкатенаций немного - это норм. НО при большом количестве это жрет память.
        // чтобы этого не было нужно использовать StringBuilder
        // StringBuilder mutable - объекты могут меняться

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());    // вызываеться доп метод toString
        // плюсы SB - можно не создавая новых объекто конкатенировать (объединять, плюсовать) сколько угодно стрингов
        // для этого нужно вызвать метод append
        sb.append(" my");
        sb.append(" friend");
        sb.append(" !!!");
        System.out.println(sb.toString());
        sb.append(" a").append(" b").append(" c");
        System.out.println(sb.toString());

        // если есть необходимость во множестве изменений строки (стринг) то нужно использовать Стрингбилдер
        // это не будет нагружать память


        // NEXT
        // ранее все время выводили через System.out.println(x); ln = line (print Line - то есть с новой строки)
        // чтобы выводить на той же строке нужно использовать  System.out.print(x)
        // следующий метод printf = System.out.print(x)
        System.out.printf("this string is, %s", "NICE");   // %s - то место куда вставиться следующий перменную стринг внутри скобок
        // можно так же вставлять %d (digit) - цифры
        System.out.println();
        System.out.printf("%f example is %s, %d %% true \n", 10.5, "good", 146);

        // %f - floating - неполное число
        // важно соблюдать последовательность и указат ьвсе переменные
        // которые были в систем принте с %. %f %s %d - все переменные должны здесь быть. логично

        System.out.println();
        System.out.printf("String %10d \n",534);            // \n - перенос на след строку как System.out.println()
        System.out.printf("String %10d \n",4);              // %10d  = 10 пустых мест (символов) для этого числа d - digit
        System.out.printf("String %10d \n",32534);          // условно как 10 пробелов предназначенных именно для d
        System.out.printf("String %5d \n",1000000000);

        System.out.println();
        System.out.printf("String %-10d \n",534);           // все тоже самое только пустота справа от числа
        System.out.printf("String %-10d \n",4);
        System.out.printf("String %-10d \n",32534);
        System.out.printf("String %-10d \n",1000000000);

        System.out.println();
        System.out.printf("String %.2f \n",534.3457457);    // ограничение символов после запятой
        System.out.printf("String %.1f \n",534.56476);
        System.out.printf("String %.3f \n",534.567845679);
        System.out.printf("String %.4f \n",534.8906789);

    }
}

