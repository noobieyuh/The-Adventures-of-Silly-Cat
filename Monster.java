public class Monster
{
    private int health;
    private String attack;
    private String name;
    private int level;

    public Monster(String name, int health, String attack, int level)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.level = level;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public String getAttack()
    {
        return attack;
    }

    public int getLevel()
    {
        return level;
    }

    public void printMonster()
    {
        System.out.println("Monster name: " + name);
        System.out.println("Level: " + level);
        System.out.println();

        System.out.println("                      ^\\    ^                  ");
        System.out.println("                      / \\\\  / \\               ");
        System.out.println("                     /.  \\\\/   \\      |\\___/|   ");
        System.out.println("  *----*           / / |  \\\\    \\  __/  O  O\\   ");
        System.out.println("  |   /          /  /  |   \\\\    \\_\\/  \\     \\     ");
        System.out.println(" / /\\/         /   /   |    \\\\   _\\/    '@___@      ");
        System.out.println("/  /         /    /    |     \\\\ _\\/       |U");
        System.out.println("|  |       /     /     |      \\\\\\/        |");
        System.out.println("\\  |     /_     /      |       \\\\  )   \\ _|_");
        System.out.println("\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'");
        System.out.println("~    ~.           .-~-.|.-*      _        {-,");
        System.out.println(" \\      ~-. _ .-~                 \\      /\\'");
        System.out.println("  \\                   }            {   .*");
        System.out.println("   ~.                 '-/        /.-~----.");
        System.out.println("     ~- _             /        >..----.\\\\\\");
        System.out.println("         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
    }

    public void setHealth(int mainAttack)
    {
        health -= mainAttack;
        if(health <= 0)
        {
            System.out.println(name + " has been killed!");
        }
    }
}
