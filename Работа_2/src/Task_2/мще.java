package Task_2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

class Sort_14
{
    public static void main(String[] args)
    {
        ArrayList<Human> company = new ArrayList<>();

        Human Student1 = new Human(19,"Maxim", "Fedorov", LocalDate.of(2002, Month.DECEMBER, 16), 60);

        Human Student2 = new Human(23,"Nikita", "Somov", LocalDate.of(1998, Month.DECEMBER, 10), 70);

        Human Student3 = new Human(20,"Andrew", "Kuzin", LocalDate.of(2001, Month.NOVEMBER, 14), 64);

        Human Student4 = new Human(23,"Vasiliy", "Stepanov", LocalDate.of(1999, Month.FEBRUARY, 21), 75);

        Human Student5 = new Human(22,"Artem", "Zubov", LocalDate.of(2000, Month.FEBRUARY, 12), 55);

        Human Student6 = new Human(18,"Grigory", "Golubev", LocalDate.of(2003, Month.JULY, 27), 70);

        company.add(Student1);

        company.add(Student2);

        company.add(Student3);

        company.add(Student4);

        company.add(Student5);

        company.add(Student6);

        Stream<Human> stream = company.stream();

        stream.sorted(new HumanComparator()).filter(x -> x.getWeight() % 5 == 0).limit(4)
                .forEach(x -> System.out.println(x.getFirstName() + " " + (x.getWeight()  + x.getAge())));

    }
}

class HumanComparator implements Comparator<Human>
{

    public int compare(Human a, Human b)
    {

        return (a.getAge()+a.getWeight())-((b.getAge() + b.getWeight()));

    }
}