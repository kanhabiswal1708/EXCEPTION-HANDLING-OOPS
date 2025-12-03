package Exception_oops;
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
