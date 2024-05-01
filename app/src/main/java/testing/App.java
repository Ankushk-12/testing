package testing;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        String name = System.getenv("USER_NAME");
        System.out.println("Hello " + name + "!");
    }
}
