public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Thomas", "Bandung");
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();
        var person2 = new Person("Otong");
        var person3 = new Person();
        person3.name = "Ucup";


        System.out.println(person1);

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");
        person3.sayHello("Otong");
    }
}
