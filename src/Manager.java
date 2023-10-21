class Manager {
    String name;
    String company;

    Manager(String name) {  // parent constructor
        this.name = name;
    }

    Manager(String name, String company) {  // parent constructor
        this.name = name;
        this.company = company;
    }
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}
