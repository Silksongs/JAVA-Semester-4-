package project7;

public class MyMostPattern {
    public static void main(String[] args) {
        Car c=new Sedan(new Kia());
        c.showDetails();
    }
}

abstract class Car{
    Make make;
    public Car(Make m){
        make=m;
    }
    abstract  void showType();
    void showDetails(){
        showType();
        make.setMake();
    };
}

class Sedan extends Car{
    public Sedan(Make m){super(m);}

    @Override
    void showType() {
        System.out.println("Sedan");
    }
}

class Hatchback extends Car{
    public Hatchback(Make m){super(m);}

    @Override
    void showType() {
        System.out.println("Hatcback");
    }
}

interface Make{
    void setMake();
}

class Kia implements Make{
    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}

class Skoda implements Make{
    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}
