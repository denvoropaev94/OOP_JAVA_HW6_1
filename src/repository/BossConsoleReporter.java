package repository;

import model.BossModel;

public class BossConsoleReporter implements Reportable{
    private BossModel bossModel;

    public BossConsoleReporter(BossModel bossModel) {
        this.bossModel = bossModel;
    }

    @Override
    public void report() {
        System.out.println("Report for BOSS: " + bossModel.getName() + " , " + bossModel.getExperience());
    }
}
