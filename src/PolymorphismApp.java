public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Employee("Thomas");
        employee.sayHello("Budi");

        employee = new Manager("Thomas");
        employee.sayHello("Budi");

        employee = new VicePresident("Thomas");
        employee.sayHello("Budi");

        sayHello(new Employee("Thomas"));
        sayHello(new Manager("Thomas"));
        sayHello(new VicePresident("Thomas"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
