package project6;

public class MyFabric {
    public static void main(String[] args) {
        Creator creator= new ConcreteCreater1();
        Product product=creator.factoryMethod();
        product.write();

        Creator creator2= new ConcreteCreater2();
        Product product2=creator2.factoryMethod();
        product2.write();

        Creator3 creator3= new ConcreteCreater3();
        Product product3=creator3.factoryMethod2();
        product3.write();
    }
}

interface Product{
    public void write();
}

class ConcreteProduct1 implements Product {
    @Override
    public void write() {
        System.out.println("ConcreateProduct-one");
    }
}
class ConcreteProduct2 implements Product {
    @Override
    public void write() {
        System.out.println("ConcreateProduct-two");
    }
}

interface Creator{
    Product factoryMethod();
}

class ConcreteCreater1 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
class ConcreteCreater2 implements Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
class ConcreteCreater3 extends Creator3{
    public ConcreteProduct3 factoryMethod2(){
        return new ConcreteProduct3();
    };
}
class Creator3{
    public ConcreteProduct3 factoryMethod2(){
        return new ConcreteProduct3();
    };
}
class ConcreteProduct3 implements Product {
    @Override
    public void write() {
        System.out.println("ConcreateProduct-three");
    }
}