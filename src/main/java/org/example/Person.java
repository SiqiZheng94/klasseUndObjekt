package org.example;

import javax.xml.namespace.QName;

public class Person {
    String name;
    int age;
    String gender;
    float height;
    float weight;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void introduction(){
        System.out.println("Hallo, ich bin " + name +" und " + age + " Jahre alt.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
