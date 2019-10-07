package homework6;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Zamora Vladyslav", 22);
        person2.talk("хочу спать");
        System.out.println(person1.getFullName() +" "+ person1.getAge());
    }
}
