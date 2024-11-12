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
        System.out.println(".\n");
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
        input.nextLine();

        // start of chapter 1
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Chapter 1: Awakening\n");
        TimeUnit.SECONDS.sleep(3);
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
        System.out.println("???: Finally, it took me " + (int)((Math.random() * 60) + 2) + " minutes to wake you up!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: So, what's your name?");

        // User input for name
        String mainName = input.nextLine();
        System.out.println("???: " + mainName + "... huh. I never heard that name before.");
        TimeUnit.SECONDS.sleep(2);
        // introducing character that acts as a guide
        System.out.println("???: Well, since you told me your name, I'll tell you mine.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: My name is Moon. It's nice to meet you I guess.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Well, you're probably wondering why you're in this cabin.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nYou do wonder.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, why am I in this cabin..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Well... you sorta just, appeared.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(Huh..?)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(I just... appeared?)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Judging by your face, you must be confused as well...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah... I am...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + ", try to think back, what is your purpose here?");
        TimeUnit.SECONDS.sleep(2);
        // role assignment
        String userRole = "";
        System.out.println("(...My purpose here? I was a...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1. Wizard - A powerful being able to conjure spells.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. Warrior - Swords and shields, you can move and fight.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3. Tank - Big and bad. You can take a hit.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("4. Thief - Thiefs take goodies you can use anytime.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("5. Average Joe - Civilian level...\n");
        TimeUnit.SECONDS.sleep(2);
        // selecting roles
        int roleSelect = input.nextInt();
        if(roleSelect == 1)
        {
            userRole = "Wizard";
        }
        if(roleSelect == 2)
        {
            userRole = "Warrior";
        }
        if(roleSelect == 3)
        {
            userRole = "Tank";
        }
        if(roleSelect == 4)
        {
            userRole = "Thief";
        }
        if(roleSelect == 5)
        {
            userRole = "Average Joe";
        }
        if(roleSelect < 1 || roleSelect > 5)
        {
            System.out.println("Please choose a number between 1 - 5 next time. The default role is Average Joe.");
            userRole = "Average Joe";
        }
        // end of role select
        // making a MainCharacter class
        MainCharacter protagonist = new MainCharacter(mainName, userRole);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I remember... I'm a " + userRole + "! I think...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Wow! Good to know you haven't lost that many memories...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You hear a bell ring in the distance...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I guess it's that time already, huh?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Huh? What does that mean Moon?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I'll tell you later, just follow me " + mainName + "!");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 1
        // start of chapter 2
        System.out.println("\nChapter 2: Chaos\n");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Moon: Wow... This is awful!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: There's so many dogs... everywhere!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(...What..?)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What's wrong with dogs?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: If I'm being honest... everything.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What did dogs do to you?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: It's a long story really...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Uh huh...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: ...Are you doubting me?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Maybe... yeah, I am.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: You're no better than the dogs " + mainName + "... Anyways, let's get back on track.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(Oh, right.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Let's check on the dogs, Moon.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Sure, you take the lead...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yep, follow my lead!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + " and Moon travel to the nearby village to see what's happening.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: Hey! You two! What are you doing here?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: We're here to see what all the commotion is about...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: You guys don't seem that bad...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": We come in peace, uhh...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Sun. My name is Sun.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(Moon and Sun? Huh, that's strange...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Sun..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Moon? Is that you?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Do you guys know each other?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: It's complicated...");
    }
}
