import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {

        Service service = new Service();
        Console console = System.console();

        service.clearScreen();
        service.welcomeScreen();
        console.readPassword("Press Enter to continue....");
    }
}
