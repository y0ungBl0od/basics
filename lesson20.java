public class lesson20 {
    public static void main(String[] args) {
        Human2 human1 = new Human2();
    }
}
class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age){                // Собран конструктор, где обязательные 2 параметра String и int
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        this.name = name;
        this.age = age;
    }
    public Human2 (){                                   // Мы можем иметь в одном классе несколько методов с одинаковым именем, пока у них разные поля.
        this.name = "По молчанию";                      // Это норма.
        this.age = 0;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
}