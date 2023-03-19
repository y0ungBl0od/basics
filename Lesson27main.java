import Lesson27.Mushroom;           // jde импортирует в main автоматически.
import Lesson27.Tree;               // в случае проблем, нужно импортировать классы из Packages в main вручную
// import Lesson27.*                  // можно импортировать сразу все классы
import Lesson27.Bird.Bird;

import java.util.Scanner;           // импортирована автоматом для строки 12

public class Lesson27main {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Mushroom m1 = new Mushroom();
        Scanner s1 = new Scanner(System.in);
        Bird b1 = new Bird();
    }
}
