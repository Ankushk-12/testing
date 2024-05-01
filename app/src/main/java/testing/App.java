package testing;

import io.github.cdimascio.dotenv.Dotenv;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    public static final  Dotenv environments = Dotenv.load();
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        String name = environments.get("NAME");
        System.out.println("Hello " + name + "!");
    }
}
