class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
//        super(company); // bisa tidak dimasukkan, yang penting ada parent constructor yang dipanggil
    }
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is VP " + this.name);
    }
}
