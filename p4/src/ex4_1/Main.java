package ex4_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    Figure -> AbstractFigure -> (Rectangle, Circle)
     */

    public static void main(String[] args) {

        // Há 4 maneiras de definir um retângulo
        Rectangle r = new Rectangle(0, 0, 20, 10);
        AbstractFigure af = new Rectangle(0, 0, 20, 10);
        Figure f = new Rectangle(0, 0, 20, 10);
        Object o = new Rectangle(0, 0, 20, 10);

        List<Object> figures = new ArrayList<>();

        figures.add(r);
        figures.add(af);
        figures.add(f);
        figures.add(o);

        for (Object obj : figures)
            System.out.println(obj);
    }
}
