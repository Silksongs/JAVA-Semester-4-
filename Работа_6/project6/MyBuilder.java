package project6;

import java.util.Set;

public class MyBuilder {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder().withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
        System.out.println(myPerson.name +" "+ myPerson.age);
    }
}
class Person {

    public String name;
    public String surname;
    public int age;
    private int height;
    private int weight;
    private Set<Person> parents;
    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name) {
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents) {
            newPerson.parents = parents;
            return this;
        }

        public Person build() {
            return newPerson;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "newPerson=" + newPerson +
                    '}';
        }
    }
}
class Builder {
    private Person newPerson;

    public Builder() {
        newPerson = new Person();
    }

    public Builder withName(String name){
        newPerson.name = name;
        return this;
    }

    public Person build(){
        return newPerson;
    }
}