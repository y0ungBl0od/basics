import Lesson28.*;
public class Lesson28 {                 // public - модификатор доступа
    public int id;
    private int idPrivate;

    public static void main(String[] args) {
        // модификаторы доступа: public, private, default(), protect
        // public - разрешает доступ везде в рамках проекта
        // private - доступ только в пределах 1 класса (вне Lesson28 не работает)
/**        private void technicalMethod(;){}        // можно использовать метод только внутри public class Lesson28 */
        // technicalMethod - не должен быть виден в других классах проекта
        // default - если не указано ничего (мод. доступа), по умолчанию
        // default Доступен в пределах пакета
        // protected - доступен в пределах 1 пакета, доступен подклассам. даже если внепакета.



        Person pers1 = new Person();
        pers1.name = "Any";
    }

}

// public class Any{} // в одном классе не может содержаться 2 public class.
// для нового public class создать новый файл .java
class Lesson28New{} // Так можно
/** НЕ надо, крайне нежелательно выводить какие либо переменные в public
 * всегда нужно использовтаь private
 * Можно использовтаь public final static String CONSTANT = "XXX";
 * в других классах можно будет использовать метод для этой строки
 */

