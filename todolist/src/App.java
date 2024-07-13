import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Service service = new Service();
        Console console = System.console();
        Scanner scan = new Scanner(System.in);

        service.clearScreen();
        service.welcomeScreen();
        console.readPassword("Press Enter to continue....");
        while(true) {

            service.clearScreen();
            service.display();

            System.out.print("Press N/n to exit....");
            String exit = scan.nextLine();
            if(exit.equals("n")) break;
        }

        scan.close();
    }
}
