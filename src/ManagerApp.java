public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Thomas";
        manager.sayHello("Otong");

        var vp = new VicePresident();
        vp.name = "Udin";
        vp.sayHello("Otong");

    }
}
