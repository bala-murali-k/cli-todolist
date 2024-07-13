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
        System.out.println("+-----------------------------------------------+");
        System.out.println("| ___________                ________           |");
        System.out.println("| \\__    ___/___             \\______ \\   ____   |");
        System.out.println("|   |    | /  _ \\    ______   |    |  \\ /  _ \\  |");
        System.out.println("|   |    |(  <_> )  /_____/   |    `   (  <_> ) |");
        System.out.println("|   |____| \\____/            /_______  /\\____/  |");
        System.out.println("|                                    \\/         |");
        System.out.println("|         .____    .__          __              |");
        System.out.println("|         |    |   |__| _______/  |_            |");
        System.out.println("|         |    |   |  |/  ___/\\   __\\           |");
        System.out.println("|         |    |___|  |\\___ \\  |  |             |");
        System.out.println("|         |_______ \\__/____  > |__|             |");
        System.out.println("|                 \\/       \\/                   |");
        System.out.println("|                                               |");
        System.out.println("+-----------------------------------------------+");
    }

    public void display(){

        int height = 15;
        int width = 49;
        String frame_size[][] = new String[height][width];

        int top_start = 0;
        int top_end = 49;
        int bottom_start = 15;
        int bottom_end = 49;

        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                frame_size[i][j] = " ";
            }
        }

        for (int i=1; i<top_end-1; i++) {
            frame_size[top_start][i] = "-";
        }

        for (int i=1;i<bottom_end-1;i++) {
            frame_size[bottom_start-1][i] = "-";
        }

        for (int i=1; i<bottom_start-1; i++) {
            frame_size[i][top_start] = "|";
        }

        for (int i=1; i<bottom_start-1; i++) {
            frame_size[i][bottom_end-1] = "|";
        }

        frame_size[top_start][top_start] = "+";
        frame_size[top_start][top_end-1] = "+";
        frame_size[bottom_start-1][top_start] = "+";
        frame_size[bottom_start-1][bottom_end-1] = "+";

        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                System.out.print(frame_size[i][j]);
            }
            System.out.println("");
        }

    }

}