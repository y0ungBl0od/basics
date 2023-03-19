import Interfaces.Test;
import Lesson28.*;

public class Lesson28Protected extends Person28 {
    public static void main(String[] args) {
        Person28 p1 = new Person28();
        System.out.println(p1.name);        /** не дает использовтаь name, потому что переменная protected String name */
    }
}
