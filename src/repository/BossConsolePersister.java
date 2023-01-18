package repository;

import model.BossModel;

public class BossConsolePersister implements Persistable{

    private BossModel bossModel;

    public BossConsolePersister(BossModel bossModel) {
        this.bossModel = bossModel;
    }

    @Override
    public void save() {
        System.out.println("Save BOSS: " + bossModel.getName()
                + ", " + bossModel.getExperience()
                + ", " + bossModel.getDescription());
    }
}
