package model;

public class User extends UserModel{

    private String name;

    public User(String name) {
        this.name = name;
        this.level = 1;
    }
    public User(String name, int level) {
        this(name);
        this.level = level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "User description";
    }

    @Override
    public String getLevel() {
        return String.format("Level = %d",level);
    }
}
