public class Service {
    
    public void clearScreen() {
        try {
            if(System.getProperty("os.name").contains("Linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void welcomeScreen(){
        System.out.println("+----------------------------------------------+");
        System.out.println("| ___________                ________           |");
        System.out.println("| \\__    ___/___             \\______ \   ____   |");
        System.out.println("|   |    | /  _ \    ______   |    |  \\ /  _ \\  |");
        System.out.println("|   |    |(  <_> )  /_____/   |    `   (  <_> ) |");
        System.out.println("|   |____| \\____/            /_______  /\\____/  |");
        System.out.println("|                                    \\/         |");
        System.out.println("|         .____    .__          __              |");
        System.out.println("|         |    |   |__| _______/  |_            |");
        System.out.println("|         |    |   |  |/  ___/\\   __\\           |");
        System.out.println("|         |    |___|  |\___ \\  |  |             |");
        System.out.println("|         |_______ \\__/____  > |__|             |");
        System.out.println("|                 \\/       \\/                   |");
        System.out.println("|                                               |");
        System.out.println("+-----------------------------------------------+");
    };
}