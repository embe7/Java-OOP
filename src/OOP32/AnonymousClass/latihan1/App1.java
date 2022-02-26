package OOP32.AnonymousClass.latihan1;

public class App1 {
    public static void main(String[] args) {
        HelloWord1 english = new HelloWord1() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println(name);
            }
        };

        HelloWord1 indonesia = new HelloWord1() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println(name);
            }
        };

        english.sayHello("Suhendri");
        english.sayHello();

        indonesia.sayHello("Budi");
        indonesia.sayHello();
    }
}
