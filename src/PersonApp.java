public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Thomas", "Bandung");
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();

        System.out.println(person1);

//        person1.name = "Thomas Panji";
//        person1.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");
//        person3.sayHello("Budi");
    }
}
