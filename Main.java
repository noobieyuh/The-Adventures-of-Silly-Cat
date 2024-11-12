// for input
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException
    {
        // The Adventures of Silly Cat - By noobieyuh
        
        // Adding variables and more
        Scanner input = new Scanner(System.in);

        // Introduction sorta
        System.out.print("Welcome to");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(".");
        TimeUnit.SECONDS.sleep(1);

        // Title screen
        System.out.println("___________.__                _____       .___                    __                                        _____    _________.__.__  .__          _________         __   ");
        System.out.println("\\__    ___/|  |__   ____     /  _  \\    __| _/__  __ ____   _____/  |_ __ _________   ____   ______   _____/ ____\\  /   _____/|__|  | |  | ___.__. \\_   ___ \\_____ _/  |_ ");
        System.out.println("  |    |   |  |  \\_/ __ \\   /  /_\\  \\  / __ |\\  \\/ // __ \\ /    \\   __\\  |  \\_  __ \\_/ __ \\ /  ___/  /  _ \\   __\\   \\_____  \\ |  |  | |  |<   |  | /    \\  \\/\\__  \\\\   __\\");
        System.out.println("  |    |   |   Y  \\  ___/  /    |    \\/ /_/ | \\   /\\  ___/|   |  \\  | |  |  /|  | \\/\\  ___/ \\___ \\  (  <_> )  |     /        \\|  |  |_|  |_\\___  | \\     \\____/ __ \\|  |");
        System.out.println("  |____|   |___|  /\\___  > \\____|__  /\\____ |  \\_/  \\___  >___|  /__| |____/ |__|    \\___  >____  >  \\____/|__|    /_______  /|__|____/____/ ____|  \\______  (____  /__|  ");
        System.out.println("                \\/     \\/          \\/      \\/           \\/     \\/                        \\/     \\/                         \\/              \\/              \\/     \\/      ");
        System.out.println("\nMade with love by noobieyuh <3\n");

        System.out.println("Press enter to continue...");
        System.in.read();

        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("\n???: Hey, wake up!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You wake up in what appears to be a cabin.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You see a black cat holding their paw out.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: Finally, it took me 30 minutes to wake you up!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: So, what's your name?");

        // User input for name
        String mainName = input.nextLine();
        

    }
}
