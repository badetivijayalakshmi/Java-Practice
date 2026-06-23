import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name);
    }
}

class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + " and my id: " + studentId);
    }
}

class Professor extends Person {
    String subject;

    Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + name + " I teach " + subject);
    }
}

abstract class Staff extends Person {
    Staff(String name, int age) {
        super(name, age);
    }

    abstract void doWork();
}

class Librarian extends Staff {
    Librarian(String name, int age) {
        super(name, age);
    }

    @Override
    void doWork() {
        System.out.println(name + " is managing the library.");
    }
}

public class MyClass {
    public static void main(String args[]) {

        Student s1 = new Student("Sai", 22, 58);
        Student s2 = new Student("Tanu", 15, 44);
        Professor p1 = new Professor("Dr.Das", 45, "AI");
        Professor p2 = new Professor("Ms.Cassy", 38, "English");
        Librarian l1 = new Librarian("Surya", 39);

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(s1);
        list.add(s2);
        list.add(p1);
        list.add(p2);
        list.add(l1);

        System.out.println("--- Introductions ---");
        for (Person person : list) {
            person.introduce();
        }

        System.out.println("\n--- Staff Duties ---");
        for (Person person : list) {
            if (person instanceof Staff) {
                ((Staff) person).doWork();
            }
        }
    }
}
