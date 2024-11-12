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

    public void setHealth(int mainAttack)
    {
        health -= mainAttack;
        if(health <= 0)
        {
            System.out.println(name + " has been killed!");
        }
    }
}
