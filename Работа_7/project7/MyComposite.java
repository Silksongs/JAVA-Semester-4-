package project7;

import java.util.ArrayList;
import java.util.List;

public class MyComposite {
    public static void main(String[] args) {
        Shape square1=new Square();
        Shape square2=new Square();
        Shape triangle1=new Triangle();
        Shape square3=new Square();
        Shape circle1=new Circle();
        Shape circle2=new Circle();
        Shape circle3=new Circle();
        Composite composit = new Composite();
        Composite composit1 = new Composite();
        Composite composit2 = new Composite();

        composit1.add(square1);
        composit1.add(square2);
        composit1.add(triangle1);

        composit2.add(square3);
        composit2.add(circle1);
        composit2.add(circle2);
        composit2.add(circle3);

        composit.add(composit1);
        composit.add(composit2);

        composit.draw();


    }
}
interface Shape{
    void draw();
    public void add(Shape shape);
    public void remove(Shape shape);
    public void getChild(int i);
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Квадрат");
    }

    @Override
    public void add(Shape shape) {

    }

    @Override
    public void remove(Shape shape) {

    }

    @Override
    public void getChild(int i) {

    }

}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Треугольник");
    }

    @Override
    public void add(Shape shape) {

    }

    @Override
    public void remove(Shape shape) {

    }

    @Override
    public void getChild(int i) {

    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void add(Shape shape) {

    }

    @Override
    public void remove(Shape shape) {

    }

    @Override
    public void getChild(int i) {

    }
}

class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    public void add(Shape component){
        components.add(component);
    }
    public void remove(Shape component){
        components.remove(component);
    }

    @Override
    public void getChild(int i) {
        components.get(i);
    }

    @Override
    public void draw() {
        for (Shape component: components){
            component.draw();
        }
    }
}
