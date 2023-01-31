public class Lesson21 {
    public static void main(String[] args) {
        Human3 first = new Human3 ("Michael",35);
        Human3 sec  = new Human3("Trevor",45);
        Human3.descr = "Nice";
        first.getAllFields();
        sec.getAllFields();
        Human3.descr = "Bad";
        first.getAllFields();
        sec.getAllFields();
    }
}
class Human3 {
    private String name;
    private int age;
    public static String descr;             //  это статическая перменная присвоенная всему классу.
                                            //  все объекты в классе будут делить эту переменную между собой.
                                            //  Мы не можем меня перменную descr у объекта, можем только у класса.




    public Human3 (){
        this("Bob",12);
    }

    public Human3(String name){                // Собран конструктор, где обязательные 2 параметра String и int
        System.out.println("Given only Name:"+name);
        this.name = name;
        }
    public Human3 (String name, int age){                                   // Мы можем иметь в одном классе несколько методов с одинаковым именем, пока у них разные поля.
        System.out.println("Given name + age: "+name+", "+age);
        this.name = name;                      // Это норма.
        this.age = age;
    }
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void  getAllFields (){
        System.out.println(name+", "+age+", "+descr);
    }
    public static void receiveFullInfo (){              // static метод общий на весь класс и все объекты
//        System.out.println(name);                     // name - invorrect, потому что name Относится к перменной конкретного объекта
        System.out.println(descr);                      // correct, потому что descr относится к классу (всем объектам). static может брать только такие общие переменные (атрибуты)
    }
}