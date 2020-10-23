package ru.mirea.lab2;

public class HighStudent extends Student {
    protected String group;

    public HighStudent(String name, int age, String number, String group) {
        super(name, age, number);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
       /* return "HighStudent{" +
                "group='" + group + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}'; */
        return "HighStudent{" +
                "group='" + group + '\'' +
                "name" + super.getName() +
                "number" + super.getNumber() +
                "age" + super.getAge() +
                '}';
    }

    public static void say(){
        System.out.println("Hello!");
    }
}
