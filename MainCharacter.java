public class MainCharacter {
    private String name;
    private String role;

    public MainCharacter(String name, String role)
    {
        this.name = name;
        this.role = role;
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

    // Awaken role - best role in game
    public void setRole(String awakenRole)
    {
        role = awakenRole;
    }
}
