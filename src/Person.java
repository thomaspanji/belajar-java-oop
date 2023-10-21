class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        this(paramName, null); // supaya tidak menulis manual dan refer ke constructor pertama
    }

    Person() {
        this(null);
    }

//    Person(String name, String address){  // contoh variable shadowing, nama variable sama dengan variable constructor
//        name = name;
//        address = address;
//    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name );
    }
}
