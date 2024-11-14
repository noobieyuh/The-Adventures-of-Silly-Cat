public class MainCharacter
{
    private String name;
    private String role;
    private int health;

    public MainCharacter(String name, String role, int health)
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

    // Awaken role - best role in game
    public void setRole(String awakenRole)
    {
        role = awakenRole;
    }
}
