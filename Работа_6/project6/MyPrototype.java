package project6;

public class MyPrototype {
    public static void main(String[] args) {
        Human original= new Human(21, "Max");
        System.out.println(original);

        Human copy=(Human)original.copy();
        System.out.println(copy);
    }
}

interface Copyable{
    Object copy();
}

class Human implements Copyable{
    int age;
    String name;
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}
