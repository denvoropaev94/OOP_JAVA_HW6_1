package client;

import model.Boss;
import repository.*;
import model.User;
import model.Admin;

import java.util.ArrayList;
import java.util.List;


public class AppRun {
    public static void startApp() {
        Persistable user = new UserConsolePersister(new User("Nik"));
        Persistable admin = new AdminConsolePersister(new Admin("Denis", 90));
        Persistable boss = new BossConsolePersister(new Boss("Mark",190));

        Reportable user1 = new UserConsoleReporter(new User("Andrey",5));
        Reportable admin1 = new AdminConsoleReporter(new Admin("Sasha",39));
        Reportable boss1 = new BossConsoleReporter(new Boss("Vova",12));

        List<Persistable> listModel = new ArrayList<>();
        List<Reportable> listModel2 = new ArrayList<>();

        listModel.add(user);
        listModel.add(admin);
        listModel.add(boss);
        listModel2.add(user1);
        listModel2.add(admin1);
        listModel2.add(boss1);

        for (Persistable model : listModel) {
            model.save();
        }
        for (Reportable model : listModel2) {
            model.report();
        }
    }
}
