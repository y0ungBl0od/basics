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
    }
}
