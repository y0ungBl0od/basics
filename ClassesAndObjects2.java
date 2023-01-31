import javax.swing.text.html.parser.TagElement;

public class ClassesAndObjects2 {
    public static void main(String[] args) {
        Person person1 = new Person ();
        person1.name = "Peter";     // здесь мы напрямую обращаемся к полям объекта через .name
        person1.age = 50;           // это не совсем правильно с точки зрения инкапсуляции 
        person1.speak();            // мы вызвали метод speak
        Person person2 = new Person();
        person2.name = "Mark";
        person2.age = 20;
        person2.sayHello();
        int year1 = person2.beforeRetirementNext();
        int year2 = person1.beforeRetirementNext();
        System.out.println(year1);
        System.out.println(year2);
//        person2.speak();
//        person1.speak();
//        person2.speak();
     }
}
class Person {
    String name;
    int age;


    void speak (){                          // метод void имя метода speak
        for(int i = 0;i<3; i++) {
            System.out.println("Меня зовут " + name + " и мне " + age + " лет");}
        }

     void beforeRetirement(){
        int years = 65-age;
         System.out.println("Количество лет до пенсии "+years);
     }
     int beforeRetirementNext(){
        int ages = 65-age;
        return  ages;
     }
        void sayHello() {
            System.out.println("Hi there");
        }
                                     // методом мы просто заскриптовали некое действие. Но сам метод необходимо еще и вызвать

}

    // у класса могут быть:
    // 1. данные (поля)
    // 2. Действия, которые он может совершать (методы)


//class test{
//
//}
//class randomName{
//
//}
// публичных классов может быть только 1
