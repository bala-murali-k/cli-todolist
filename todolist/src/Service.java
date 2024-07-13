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
        System.out.println("+---------------------------------------------------------+");
    };
}
