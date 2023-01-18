package repository;

import model.UserModel;

public class UserConsoleReporter implements Reportable{
    private UserModel userModel;

    public UserConsoleReporter(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + userModel.getName() + " , " + userModel.getLevel());
    }
}
