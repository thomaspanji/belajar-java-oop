public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.name = "Thomas Panji";
        person1.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
