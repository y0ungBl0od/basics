import org.w3c.dom.ls.LSOutput;

public class Incapsulation {
    public static void main(String[] args) {
        Persona1 person1 = new Persona1 ();
        person1.setName("Any name");                    // СЕТТЕР
        person1.setAge(12);                             // СЕТТЕР
        System.out.println("Выводим значение в main методе "+person1.getName());       // ГЕТТЕР
        System.out.println("Выводим значение в main методе: "+person1.getAge());        // ГЕТТЕР
//        person1.speak();
//        person1.name = "Peter";
//        person1.age = 50;               // Минусы прямого обращения к полям класса .name .age - пользователь может ввести невалидную информацию (пустое имя + отрицательный возраст).
                                        // лучше всего чтобы пользователь обращался к методам класса, внутри класса будут происходить действия, проверки.
    }
}
class Persona1 {
    private String name;                        // можно сделать Private String name; тогда String name не выйдет за пределы своего класса.
    private int age;

    public void setName (String userName){
        if (userName.isEmpty()){
            System.out.println("Поле является обязательным");
        } else{
            name = userName;
        }
        }

    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<18){
            System.out.println("Возраст должен быть больше 18 лет");
            System.out.println();;
        } else{
            age = userAge;
        }
    }
    public int getAge(){
        return  age;
    }

    //          В чем преимущество ттакого метода, мы можем менять логику внутри класса как нам необходимо.
    //          Пользователь не увидит никакой разницы. Для него все останется по прежнему.
    //          Например можно заменить name на login. age на vozrast и т.д
    //          user будеть обращаться только к Сеттеру setAge setName и получать ответ в Геттере.





//    int yearsToRetirement(){
//        int years = 65-age;
//        return years;
//    }

//    void speak (){
//        System.out.println();
//        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
//        }

//     void beforeRetirement(){
//        int years = 65-age;
//         System.out.println("Количество лет до пенсии "+years);
//     }
//     int beforeRetirementNext(){
//        int ages = 65-age;
//        return  ages;
//     }
//        void sayHello() {
//            System.out.println("Hi there");
//        }

}
