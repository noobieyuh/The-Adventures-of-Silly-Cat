public class MainCharacter
{
    private String name;
    private String role;
    private int health;
    private int level;

    public MainCharacter(String name, String role, int health, int level)
    {
        this.name = name;
        this.role = role;
        this.health = health;
    }

    // returns name
    public String getName()
    {
        return name;
    }

    // returns role
    public String getRole()
    {
        return role;
    }

    public int getHealth()
    {
        return health;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
        if(this.level > level)
        {
            System.out.println("Level up! " + name + " is now level " + level + "!");
        }
    }

    // Awaken role - best role in game
    public void setRole(String awakenRole)
    {
        role = awakenRole;
    }
}
