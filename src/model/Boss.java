package model;

public class Boss extends BossModel{
    String name;

    public Boss(String name) {
        this.name = name;
        this.experience = 1;
    }

    public Boss(String name, int experience) {
        this(name);
        this.experience= experience;
    }

    @Override
    public String getExperience() {
        return String.format("Experience = %d",experience);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Boss for admins,users";
    }
}
