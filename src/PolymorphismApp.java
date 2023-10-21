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
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }


    }
}
