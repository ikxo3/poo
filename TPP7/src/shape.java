public abstract class shape {
    protected point position ;
    protected String name ;
    public shape(String name ,double x,double y){
        this.name = name ;
        position = new point(x,y) ;
    }

    @Override
    public String toString() {
        return   "name='" + name +  ", position=" + position ;
    }
    public abstract double area();
    public abstract double perimeter();
}
class point {
    private double x, y ;
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return   "x=" + x + ", y=" + y ;

    }
}
class rectangle extends shape {
    protected double width, height ;
    public rectangle(String name, double x, double y, double width, double height) {
        super(name, x, y);
        this.width = width;
        this.height = height;
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter();
    }
}
class square extends rectangle {
    public square(String name, double x, double y, double side) {
        super(name, x, y, side, side);
    }

    @Override
    public String toString() {
        return  "name='" + name +  ", position=" + position + ", side=" + width;
    }
}
 class circle extends shape {
    String color ;
    double radus ;
    public circle(String name, double x, double y, double radus, String color) {
        super(name, x, y);
        this.radus = radus;
        this.color = color;
    }
    public double area() {
        return Math.PI * Math.pow(radus, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * radus;
    }
    @Override
    public String toString() {
        return super.toString() + ", radius=" + radus + ", area=" + area() + ", perimeter=" + perimeter() + ", color=" + color;
    }


 }