package ex4_1;

abstract class AbstractFigure implements Figure {
    /*
    Uma classe abstracta não pode ser instanciada
    Como é uma classe abstrata, não tem que ser implementada
    A superclass da AbstractFigure é Object (não é feito o extend de Figure)
     */

    private int x, y;

    public AbstractFigure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "AbstractFigure{" + "x=" + x + ", y=" + y + '}';
    }
}
