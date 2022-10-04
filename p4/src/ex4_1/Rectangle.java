package ex4_1;

class Rectangle extends AbstractFigure {

    /*
    A superclass de Rectange é AbstractFigure (é feito o extend de AbstractFigure)
     */

    private int width;
    private int height;

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        // super.toString() vai buscar os método toString da superclass no extends
        return super.toString() + " -> Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
}
