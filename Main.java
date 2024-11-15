// for input
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException
    {
        // The Adventures of Silly Cat - By noobieyuh <3
        
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
        // press to start
        System.out.println("Press enter to continue...");
        input.nextLine();
        // start of chapter 1
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Chapter 1: Awakening\n");
        TimeUnit.SECONDS.sleep(5);
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
        // name
        System.out.println("???: So, what's your name?\n");
        System.out.println("Enter your name: \n");
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
        MainCharacter protagonist = new MainCharacter(mainName, userRole, (int)(Math.random() * 200) + 100);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I remember... I'm a " + userRole + "! I think...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Wow! Good to know you haven't lost that many memories...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You hear a bell ring in the distance...\n");
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
        TimeUnit.SECONDS.sleep(5);
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
        System.out.println(mainName + ": Yep, follow my lead!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + " and Moon travel to the nearby village to see what's happening.\n");
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
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: I guess you could say that...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nYou feel the ground shake...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nThe sky turns dark...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What's going on?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: It's approaching...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nWait a minute, thats...\n");
        TimeUnit.SECONDS.sleep(2);
        // assign monster name
        System.out.print("Enter the monster's name: ");
        System.out.println("\n");
        String mainMonster = input.nextLine();
        // assign monster hp
        int monsterHP = (int)((Math.random() * 200) + 100);
        // assign monster attack
        System.out.println("What attack will the monster have?: ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n1. Demonic grip");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. World's end");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3. Star strike");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("4. Blasty blast");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("5. Decompose");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("6. Fury rush");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("7. Deep beats");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("8. Fish slap");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("9. Squishy slippy punch");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("10. Awkward silence");
        TimeUnit.SECONDS.sleep(2);
        // user choice
        String monsterAttack = "";
        int monsterChoice = input.nextInt();
        if(monsterChoice == 1)
        {
            monsterAttack = "Demonic grip";
        }
        if(monsterChoice == 2)
        {
            monsterAttack = "World's end";
        }
        if(monsterChoice == 3)
        {
            monsterAttack = "Star strike";
        }
        if(monsterChoice == 4)
        {
            monsterAttack = "Blasty blast";
        }
        if(monsterChoice == 5)
        {
            monsterAttack = "Decompose";
        }
        if(monsterChoice == 6)
        {
            monsterAttack = "Fury rush";
        }
        if(monsterChoice == 7)
        {
            monsterAttack = "Deep beats";
        }
        if(monsterChoice == 8)
        {
            monsterAttack = "Fish slap";
        }
        if(monsterChoice == 9)
        {
            monsterAttack = "Squishy slippy punch";
        }
        if(monsterChoice == 10)
        {
            monsterAttack = "Awkward silence";
        }
        if(monsterChoice < 1 || monsterChoice > 10)
        {
            System.out.println("You did not select any of the choices provided, defaulting to 10. Awkward silence.");
            monsterAttack = "Awkward silence";
        }
        // end of monster attack
        // setting monster level to a random int
        int monsterLevel = (int)((Math.random() * 100) + 1);
        Monster firstMonster = new Monster(mainMonster, monsterHP, monsterAttack, monsterLevel);
        // end of monster
        // continue
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": That's " + mainMonster + "!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Who?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Who is " + mainMonster + "..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainMonster + ": Mwahahaha! It is I, " + mainMonster + "! Here to destroy your village!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon + Sun: Oh no!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I won't let you destroy the village " + mainMonster + "!");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 2
        // start of chapter 3
        System.out.println("\nChapter 3: War of Cats and Dogs\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println(mainMonster + ": You got jokes, " + mainName + ". Try to hit me.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I wasn't joking. It's time for me to end you!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + ", " + "you are about to enter your first battle!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: First battle huh? You better not lose, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        // add first battle here tutorial
        System.out.println("\nThis is a scripted battle, so you're going to lose and get embarrassed... c:");
        // display names
        TimeUnit.SECONDS.sleep(2);
        // while true for scripted battle and unique code for this part
        int mainHP = protagonist.getHealth();
        boolean battleActive = true;
        while (battleActive)
        {
            firstMonster.printMonster();
            int randomDamagePlus = (int)((Math.random() * 200) + 100);
            System.out.println("\n" + mainName + "'s HP: " + mainHP);
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            System.out.println(mainMonster + "'s HP: " + firstMonster.getHealth());
            TimeUnit.SECONDS.sleep(1);
            System.out.println("(You feel as if your body is frozen. You can't attack.)");
            System.out.println(mainMonster + " uses " + monsterAttack + " on " + mainName + "!");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("It did " + randomDamagePlus + " damage!");
            TimeUnit.SECONDS.sleep(1);
            mainHP -= randomDamagePlus;
            if(mainHP < 1)
            {
                mainHP = 0;
                System.out.println(mainName + "'s HP is now at " + mainHP + ".");
                System.out.println(mainMonster + " has won...");
                break;
            }
            else
            {
                System.out.println(mainName + "'s HP is now at " + mainHP + ".");
            }
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainMonster + ": Wow, you suck at fighting...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Whatever, you cheated.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I agree with " + mainMonster + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: I expected more from you, " + mainName);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": You guys too? Come on, that was my first battle");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Yeah, and you lost so fast");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: I guess you tried your best, " + mainName);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainMonster + ": You know what? I won't destroy the village now... our battle was very fun, " + mainName + ". Until we meet again...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": All part of my master plan. I was 2 steps ahead.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Be honest " + mainName + ", you didn't have a plan didn't you?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nYeah I really didn't...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: It's whatever, they're gone now. Good job " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nThat monster might be a huge problem down the line... I need to get stronger...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You feel dizzy...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You passed out...)\n");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 3
        // start of chapter 4
        System.out.println("\nChapter 4: Recovery");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("It's... so dark...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You feel a paw touching your hand...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Huh..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You open your eyes slowly... you see Moon next to you.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + "! You're awake...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Oh, " + mainName + ", what's up? How are you feeling?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Ugh... What happened?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: You don't remember?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: You lost to " + mainMonster + ", it wasn't even close...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nWow, now I wish I didn't remember...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Oh, I did? Wow.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: We need to train and get stronger if we want to defeat that monster!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: I agree with you Moon. What if that monster comes back later?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Before we start training, I need to recover...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Oh, right. Me and Sun got you some food, hopefully this speeds up your recovery.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": You did?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yeah, we felt bad we didn't do anything...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, you guys just watched me get destroyed.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Well, what happened, happened");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: If only you could go back in time, huh?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, if only I could.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(A bell rings in the distance.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Hearing that bell gives me horrible flashbacks.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Me and Sun will go check it out, you stay here, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Well, if you say so.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHopefully nothing bad happens...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: " + mainName + ", you must save them...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHuh? I think I'm hearing things.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: I know you can hear me...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nThis is the end of the demo. I know it felt a little short and rushed, but I will add more later on.\n");
        System.out.println("Look out for future updates!");
    }
}
