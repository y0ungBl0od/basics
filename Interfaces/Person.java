package Interfaces;

// любой класс может реализовывать любое количество интрефейсов
// Но наследовать extends - Только один другой класс
public class Person implements Info {           // можно через запятую указать следующие интерфейсы Info, Interf2, Inter3...
    public String name;

    public Person (String name){
        this.name = name;
    }
    public void showName2() {
        System.out.println(this.name);
    }
    public void sayHello(){
        System.out.println("HI! MY NAME IS...");
        System.out.println("WHO??");
        System.out.println("MY NAME IS ...");
        System.out.println(name);
    }

    @Override
    public void showInfo() {
        System.out.println("WIKI WIKI!! "+this.name);
    }

}
