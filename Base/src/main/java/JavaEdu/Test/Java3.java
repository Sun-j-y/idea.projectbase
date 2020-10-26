package JavaEdu.Test;

interface Shape {
    double area(double d);
}

class Square implements Shape {
    public double area(double d) {
        return d * d;
    }
}

class Circle implements Shape {
    public double area(double d) {
        return Math.PI * d * d;
    }
}

public class Java3 {
    public static void main(String[] args) {
        Shape sq = new Square();
        System.out.println("正方形的面积为：" + sq.area(2));
        Shape ci = new Circle();
        System.out.println("圆的面积为：" + ci.area(3));
    }
}
