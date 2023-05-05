public class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
