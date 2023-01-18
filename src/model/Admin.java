package model;

public class Admin extends AdminModel{
    private String name;

    public Admin(String name) {
        this.name = name;
        this.skills = 1;
    }

    public Admin(String name,int skills) {
        this(name);
        this.skills = skills;
    }

    @Override
    public String getSkills() {
        return String.format("Skills = %d",skills);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Admin Description";
    }
}
