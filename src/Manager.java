class Manager extends Employee {
    String company;

    Manager(String name) {  // parent constructor
        super(name);
    }

    Manager(String name, String company) {  // parent constructor
        super(name);
        this.company = company;
    }
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}
