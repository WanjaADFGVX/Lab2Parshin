package ru.mirea.lab2;

import static ru.mirea.lab2.HighStudent.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Антон Чехов", "theCherryOrchard@mail.ru", 'M');
        System.out.println(a1);

        Blogger b1 = new Blogger("Стас", "ikakprosto@mail.ru", 'M', "ikakprosto");
        System.out.println(b1);

        b1.name = "Савватеев";
        System.out.println(b1);

        Student s1 = new Student("Кирилл", 20, "5ecc4s44ec");
        Student.say();

        HighStudent h1 = new HighStudent("Настя", 20, "43xs4wc5", "GIBO0318");
        HighStudent.say();
    }
}
