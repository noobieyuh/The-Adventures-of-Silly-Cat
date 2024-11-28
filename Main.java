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
        TimeUnit.SECONDS.sleep(2);
        // Title screen
        System.out.println("___________.__                _____       .___                    __                                        _____    _________.__.__  .__          _________         __   ");
        System.out.println("\\__    ___/|  |__   ____     /  _  \\    __| _/__  __ ____   _____/  |_ __ _________   ____   ______   _____/ ____\\  /   _____/|__|  | |  | ___.__. \\_   ___ \\_____ _/  |_ ");
        System.out.println("  |    |   |  |  \\_/ __ \\   /  /_\\  \\  / __ |\\  \\/ // __ \\ /    \\   __\\  |  \\_  __ \\_/ __ \\ /  ___/  /  _ \\   __\\   \\_____  \\ |  |  | |  |<   |  | /    \\  \\/\\__  \\\\   __\\");
        System.out.println("  |    |   |   Y  \\  ___/  /    |    \\/ /_/ | \\   /\\  ___/|   |  \\  | |  |  /|  | \\/\\  ___/ \\___ \\  (  <_> )  |     /        \\|  |  |_|  |_\\___  | \\     \\____/ __ \\|  |");
        System.out.println("  |____|   |___|  /\\___  > \\____|__  /\\____ |  \\_/  \\___  >___|  /__| |____/ |__|    \\___  >____  >  \\____/|__|    /_______  /|__|____/____/ ____|  \\______  (____  /__|  ");
        System.out.println("                \\/     \\/          \\/      \\/           \\/     \\/                        \\/     \\/                         \\/              \\/              \\/     \\/      ");
        System.out.println("\n(All ASCII Art comes from https://www.asciiart.eu/)\n");
        // made with love
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Made with love by noobieyuh <3\n");
        TimeUnit.SECONDS.sleep(2);
        // press to start
        System.out.println("Press enter to continue...");
        input.nextLine();
        // start of chapter 1
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Chapter 1: Awakening\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n???: Hey, wake up!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You wake up in what appears to be a cabin.)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You see a black cat holding their paw out.)");
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
        System.out.println("\n(You do wonder.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, why am I in this cabin..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Well... you sorta just, appeared.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHuh..?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I just... appeared?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Judging by your face, you must be confused as well...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah... I am...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + ", try to think back, what is your purpose here?");
        TimeUnit.SECONDS.sleep(2);
        // role assignment
        String userRole = "";
        System.out.println("...My purpose here? I was a...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1. Wizard - A powerful being able to conjure spells. (More magicial skills down the line)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. Warrior - Swords and shields, you can move and fight. (Base weapon damage +10)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3. Tank - Big and bad. You can take a hit. (More health, less movement...)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("4. Thief - Thiefs take goodies you can use anytime. (You will be able to take items from enemies, not now, but later)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("5. Average Joe - Civilian level... (No advantages, no disadvantages)\n");
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
        MainCharacter protagonist = new MainCharacter(mainName, userRole, (int)(Math.random() * 200) + 100, 1);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I remember... I'm a " + userRole + "! I think... I might be wrong, but that's fine...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Wow! Good to know you haven't lost that many memories...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You hear a bell ring in the distance...)\n");
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
        System.out.println("\nMoon and Sun? Huh, that's strange...\n");
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
        System.out.println("\n(You feel the ground shake...)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(The sky turns dark...)\n");
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
        input.nextLine();
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
            System.out.println("You did not select any of the choices provided, defaulting to 10. Awkward silence. You did this, not me >:c");
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
        System.out.println("\n(This is a scripted battle, so you're going to lose and get embarrassed... c: )");
        // display names
        TimeUnit.SECONDS.sleep(2);
        // while true for scripted battle and unique code for this part
        int mainHP = protagonist.getHealth();
        boolean battleActive = true;
        while (battleActive)
        {
            firstMonster.printDragonMonster();
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
        System.out.println(mainName + ": You guys too? Come on, that was my first battle.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Yeah, and you lost so fast...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: I guess you tried your best, " + mainName + ".");
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
        // old text from demo, should delete
        // System.out.println("\nThis is the end of the demo. I know it felt a little short and rushed, but I will add more later on.\n");
        // System.out.println("Look out for future updates!");
        System.out.println(mainName + ": Moon, or Sun, could you guys knock it off...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: You're funny.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: You want to get stronger, right?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHow do they know that..?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Where did you hear that?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: That is something I can't say.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: If you want to get stronger, do as I say.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nShould I trust this... thing?\n");
        TimeUnit.SECONDS.sleep(2);
        // first decision
        System.out.println("You are about to make your first story changing decision... depending on what your choice is, the story will be changed accordingly...");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\n1. Do as they say.");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("2. Close your eyes");
        TimeUnit.SECONDS.sleep(5);
        int firstStoryChoice = input.nextInt();
        if(firstStoryChoice == 1)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": Okay, I'll do as you say...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("???: Heh, I'll keep my eyes on you.");
        }
        else if(firstStoryChoice == 2)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.print("\nI don't think I should interact with them, time to close my eyes...\n");
        }
        else
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("(Next time, type any of the numbers shown... just for that, you will not be getting the special text. >:( )");
            firstStoryChoice = (int)((Math.random() * 2) + 1);
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHave I made the right choice?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You feel... scared.)\n");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 4
        // start of chapter 5
        System.out.println("Chapter 5: ???\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Where am I?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You woke up, all you can see is a dark, empty abyss.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Why am I here?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: We meet again... " + mainName);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": You... what are you doing here?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: Does that really matter?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": It does to me.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: I never introduced myself, haven't I?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This is my chance to learn more about this thing..!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, that's true.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": You know everything about me, but I barely know anything about you...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("???: I guess I could tell you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I am the almightly being known as Holy Cat...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHoly... Cat?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Holy Cat? That's an interesting name.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Yeah, I need your help, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Huh? My help?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Why me?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You were chosen...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Chosen? Me? Are you sure you have the right guy?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: The book doesn't lie, you, " + mainName + ", are the chosen one.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I have a task for you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nA task? For me?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Yes, you must... protect the village.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + "Protect the village? How am I supposed to do that?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I can't be here for much longer...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Why not? Why can't you stay?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Take this book, it'll have all the information you need. Until we meet again.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Wait..!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You hear the sound of glass shattering...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("What's happening???\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You open your eyes, you see that you're inside the cabin, with a book in your hand.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Was it just a dream?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("No, I have the book in my hand...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("So then...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("What was that..?\n");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 5
        // start of chapter 6
        System.out.println("Chapter 6: The rise of the hero\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Moon: Hey " + mainName + ", we're back!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: We had some pudding for you, but Moon got hungry and ate half of yours.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: That's not my fault! We were outside for like... 10 hours!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: You were only thinking about yourself.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Whatever, at least we still have the other snacks...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Oh right, someone came up to me and asked if I could gift this to you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": A gift for me?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yeah, I wasn't too sure myself...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: You can choose whether you want it or not.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Well, alright.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nI think I should...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1. Keep it");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. Toss it");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("3. Destroy it");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("4. Scan it");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("5. Eat it");
        TimeUnit.SECONDS.sleep(2);
        int secondStoryChoice = input.nextInt();
        if(secondStoryChoice == 1)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I think I'll keep it for now.");
        }
        else if(secondStoryChoice == 2)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I think I'll just toss it somewhere.");
        }
        else if(secondStoryChoice == 3)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I think I should destroy this gift for good.");
        }
        else if(secondStoryChoice == 4)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I think I should scan the gift, just to be safe.");
        }
        else if(secondStoryChoice == 5)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I have made the executive decision to... eat the gift.");
        }
        else
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println(mainName + ": I think I will twirl around in circles.");
            secondStoryChoice = 5;
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Wow, I shouldn't judge you for your decision. I think we should just give it back to the sender.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks, I guess..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Ignore Moon, I think the choice you made is right.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Wow, picking sides now?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Sorry.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I guess I could forgive you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Moon, Sun, can you tell me how you two met?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I'm just curious...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Well...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: We used to work together. We were co-workers.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Everything was going so well, we were working on something important.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yeah, that important thing caused us our jobs.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Oh, I'm sorry...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Why are you sorry?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: You didn't do anything " + mainName + ". No need to be sorry.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: It wasn't any of our faults, it was the company's.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yeah, never working for them again...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": If you don't mind me asking, what was the company's name?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I wish I could tell you, but that was about...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: 10 years ago...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Honestly, it felt like yesterday to me.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Wow, that's insane...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Yep, it is.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: We're getting off topic, we need to talk about you " + mainName + ", how are you?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I'm... alive. I think I need some more rest, tomorrow is an important day.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: That's right! It's important you are in good condition for tomorrow.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: True that.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Have a good night, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Night " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nShould I tell them..?\n");
        // end of chapter 6
        // start of chapter 7
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Chapter 7: A hero's duty\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Holy Cat: " + mainName + ", you need to act fast...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Something is coming for you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I wrote something down on your notepad.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: If you need something, write on the notepad.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Good luck, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks Holy Cat!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + "? What was that?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Is something up?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nI think it's best not to tell them...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Oh, it's nothing!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Uh huh.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: No need to lie...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: It's pretty obvious...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Sorry.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I'll tell you guys when I'm ready.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: You better, I'm interested.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Me too!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Yeah, yeah...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I'll think about it.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Do you think it's a good idea to tell your friends?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I added some more stuff on your notebook, check whenever.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHuh. Should I check my notebook now?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1. Open your notebook.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("2. Don't open your notebook.");
        TimeUnit.SECONDS.sleep(2);
        int firstNotebook = input.nextInt();
        if(firstNotebook == 1)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n(You open the notebook...)\n");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Holy Cat: Your goal is to save the village as of right now, you can do that by getting stronger.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Holy Cat: To get stronger, you could ask your friends to spar with you.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Holy Cat: Another way to get stronger is to climb the mountain near the village, alone.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Holy Cat: There is another way, but as of right now, you have to discover that one on your own.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Holy Cat: Good luck, " + mainName + ".");
        }
        if(firstNotebook == 2)
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n(You save the notebook for another day... hopefully.)\n");
        }
        else
        {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("\n(You stand there... and do nothing.)\n");
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Well, what should I do next?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You hear the sounds of a bell ringing...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Is that monster back?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I think I should go check it out...");
        TimeUnit.SECONDS.sleep(2);
        // first weapon
        String heroWeapon = "Old Broomstick";
        System.out.println("\n(You find an old broomstick next to the cabin door.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I think I'll pick this up, just in case.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You open the door and see some evil mice at the door.)");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Evil Mice: *speaks in mice in an angry tone*");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nIs my second fight, really going to be against mice..?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": This really isn't a good start to my journey...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("- This is your (technically) first real battle.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("- There's absolutely no way you can lose, this is not a challenge.");
        TimeUnit.SECONDS.sleep(2);
        // first real monster battle - mice
        Monster mice = new Monster("Evil Mice", 10, "Small bite", 1);
        // battle loop
        while(battleActive)
        {
            TimeUnit.SECONDS.sleep(2);
            mice.printMiceMonster();

            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("\nWhat will you do?\n");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("1. Attack");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("2. Guard");
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println("3. Flee");
            TimeUnit.MILLISECONDS.sleep(500);
            
            int userPick = input.nextInt();
            if(userPick == 1)
            {
                int weaponDamage = (int)((Math.random() * 10) + 1);
                TimeUnit.SECONDS.sleep(2);
                System.out.println(mainName + " attacked " + mice.getName() + " with a " + heroWeapon + " for " + weaponDamage + " damage!");
                mice.setHealth(weaponDamage);
                if(mice.getHealth() <= 0)
                {
                    break;
                }
            }
            if(userPick == 2)
            {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(mainName + " gets into a guard position. (Why are you guarding against mice..?)");
            }
            if(userPick == 3)
            {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You cannot flee from the " + mice.getName() + "...");
            }
            else
            {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Type a number provided...");
            }

            System.out.println(mice.getName() + " attacks using " + mice.getAttack() + ", it does 0 damage...");
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Stupid mice... distracting me...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Even though it wasn't much, I feel a little bit stronger...");
        TimeUnit.SECONDS.sleep(2);
        protagonist.setLevel(2);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Great job, " + mainName + ". You did a good job getting those mice.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks Holy Cat! What should I do next?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: As the chosen one, I believe you know the answer to that.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nRight, I'm the chosen one.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I don't want to lie to you Holy Cat, but honestly...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I have no idea what to do...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Huh, that's strange.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I'll give you some advice. If you don't know what to do, think about what's important to you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What's important... to me?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nI need to think...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Well, these new friends of mine are important so...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nI need to protect them...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Holy Cat, I've made up my mind.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Good. That's good.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: There's a reason why you're the chosen one, " + mainName);
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I guess...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I'll be leaving now, good luck.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks for the help Holy Cat!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nI don't understand you Holy Cat, but maybe someday I will...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You head back to the cabin and see Moon and Sun.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: " + mainName + "! Where did you go?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yeah, where did you go?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I heard something and went to go check it out...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I didn't know you guys would worry that much...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Who wouldn't be worried?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Next time, tell us.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: How would you feel if someone you cared about just disappeared?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Sorry guys, I just felt like I had to check it out.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Anyways, I actually won my first battle!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon and Sun: Really?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I didn't know you were a comedian...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Moon...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": For real! I actaully did something.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Are you guys proud?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I guess we are?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Good job!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Heh, it was nothing.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": No big deal or anything...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: Yeah...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Yep! 100%!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I think we should get some rest, we're all drained.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Moon: I agree, but me and Sun have to do one more thing, so you can go ahead and go to bed " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Oh, okay...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + "Stay safe!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun: Don't worry, we will.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(Sun and Moon leave the cabin)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Finally, time for bed...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Get some sleep, " + mainName + ", you deserve it.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks Holy Cat...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": For helping me out so much...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: It's my duty to help you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: The chosen one.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: One day, you'll be strong enough to end that monster's life...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Wait...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Oh... right!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I forgot all about that monster...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("It... makes me mad... thinking about what happened.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I could've done something...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...but I didn't.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I want to get stronger.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("No...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I need to get stronger...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Is something the matter?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I sense something coming from you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Whatever it is, you must disregard it. I have a feeling it's related to that monster.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Well, you're not wrong.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I shouldn't get too worked up...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Anyways, I need to get to bed.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You're right. I'm here if you need anything, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Hopefully you feel better tomorrow.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy: There is a lot of work to do...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nHere's hoping tomorrow will be a good day...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You close your eyes, and head to sleep.)\n");
        TimeUnit.SECONDS.sleep(2);
        // end of chapter 7
        // start of chapter 8
        System.out.println("Chapter 8: Revenge\n");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("(It's morning...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You wake up and see a bright light outside...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(Your head hurts a lot...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Ow...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": My head hurts...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You look out the window and see fog everywhere.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You can't see anything outside.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You wonder, what's going on?)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("What's happening?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Is anyone there?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": ...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Hello..?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Say something...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": ???");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(You feel scared...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You have no-one to rely on.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You can't move a muscle.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Where is everyone?\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("This better be a dream...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("A really bad one at it.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Please wake up...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(It's your lucky day, it was a dream!)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Thank goodness...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Thank you Holy Cat!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You summoned me, " + mainName + "?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Whoops, sorry Holy Cat...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: It's fine. I have something to say.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What is it?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: That dream you saw...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Might become reality if you don't act fast.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I can't say much more.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Why not?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I need all the help I can get...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Sorry, I can't say anything else right now.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: If I could, I would tell you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Before I go...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: There's another thing I didn't tell you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What is it?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I have the ability to grant you blessings to help on your journey...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": What do you mean by blessings?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I have the power to grant blessings.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: However and whenever I want.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Wow! That's amazing!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: It sounds amazing yes, but it's really just a curse.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": A curse? How?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: With every good thing, comes a bad thing...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You know that right?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: It's hard being a living holy entity...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Wow...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": That must suck...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I hope it all goes well in the end for you, Holy Cat...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Don't speak like it's my last day on this world...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I'll always be here to support you.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: I'm glad that you of all people, were chosen.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Aww, thanks Holy Cat!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": I have more questions to ask you...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": But honestly, now is not the time.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You can always summon me anytime.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: You can treat me like a servant if you'd like.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: My sole purpose is to help you on your journey, " + mainName + ".");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Thanks!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": You'll always be in my heart, Holy Cat");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: If saying that will help you, then go ahead.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Anything else?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": No, nothing else Holy Cat...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Okay then, see you soon...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Bye bye Holy Cat!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat: Until we meet again...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Uh huh!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n(Holy Cat disappears...)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Holy Cat is so awesome...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I'm so jealous...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I wish I was just like you Holy Cat...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Having the power to give blessings would make things so much easier.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I don't want to be cursed though...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Oh well...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I feel like I'm forgeting something...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Sun and Moon..!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I need to find them...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Time to look for them.\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You open the door and look for Sun and Moon.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(You travel to the village and ask people questions.)\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(mainName + ": Hello? Has anyone seen Sun and or Moon?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Villager #1: Who's Moon?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Villager #2: What are you talking about?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Villager #3: Huh?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nNo good...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Nobody knows, or hasn't seen them...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Maybe I should check somewhere else...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I've got it!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("The mountains!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("It's a long walk...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Hopefully they're both okay...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Enough stalling...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("It's time to get to work!\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("...\n");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Why can't I move..?\n");
        TimeUnit.SECONDS.sleep(2);
    }
}
