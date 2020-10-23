package ru.mirea.lab2;

public class Student extends Person{
    protected String number;

    public Student(String name, int age, String number) {
        super(name, age);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void say(){
        System.out.println("What's up!");
    }
}
