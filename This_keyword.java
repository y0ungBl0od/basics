public class This_keyword {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(35);
        human1.setName("Mark");
        human1.getInfo();

    }
}
class Human{
    String name;
    int age;

    public void setName(String name){     // Сеттер
        this.name = name;                   // мы приравниваем переменную класса к переменнной метода. Чтобы не писать одно и тоже name = myName
    }
    public void setAge(int age){          // Сеттер
        this.age = age;                   // В сеттерах мы используем this
    }
    public String getName(){                // Геттер
        return name;
    }
    public int getAge(){                    // Геттер
        return age;
    }
    public void getInfo(){                  // Метод
        System.out.println(name+", "+age);
    }
}

