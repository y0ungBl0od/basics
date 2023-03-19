package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("SLIM SHADY!!");

        // Если класс реализует какой-то интерфейс, тогда этот класс обязан иметь внутри себя методы
        // из этого интерфейса.

        Info info1 = new Animal(1);                   //  так сделать можно только потому, что коассы Animal и Person
        Info info2 = new Person("Mr. Peters");     //  связаны с Interface Info
        // пример выше - есть пример Полиморфизма.
        // Объект класса new Animal не как класс Animal,
        // а как нечто, что реализует интрефейс Info

        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        info2.showName2();              // можно вызвать лишь те методы, которые описаны в интерфейсе Info
                                        // и они должны быть имплементированы в классы Animal и Person
        outputInfo(info1);
        outputInfo(person1);              // тоже работает, из Info в классы, из Test в классы тоже работает
    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
}


// Теперь неважно, что за объект попадает в метод.
// Важно чтобы у класса этого объекта был метод интерфейса Info.
// и это будет работать