import org.w3c.dom.ls.LSOutput;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person ();
//    Тип данных   переменная  || ссылаем на новый объект класса Person
        person1.name = "Peter";     // здесь мы напрямую обращаемся к полям объекта через .name
        person1.age = 50;           // это не совсем правильно с точки зрения инкапсуляции
        Person person2 = new Person();
        person2.name = "Mark";
        person2.age = 20;
        System.out.println("Меня зовут "+person1.name + " и мне "+person1.age);
        System.out.println("А меня зовут "+person2.name+" и мне "+person2.age);
    }
    // в java файле может быть несколько/сколько угодно классов. Паблик является как бы основным
}
class Persona {
    String name;
    int age;

    // у класса могут быть:
    // 1. данные (поля)
    // 2. Действия, которые он может совершать (методы)

}
//class test{
//
//}
//class randomName{
//
//}
// публичных классов может быть только 1
