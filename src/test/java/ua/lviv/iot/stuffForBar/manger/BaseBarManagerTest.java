package ua.lviv.iot.stuffForBar.manger;

import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.stuffForBar.model.*;

import java.util.LinkedList;
import java.util.List;

import static ua.lviv.iot.stuffForBar.model.OrganizersForTheBar.*;

public abstract class BaseBarManagerTest {

    protected List<AbstractBar> formsForIce;
    protected List<AbstractBar> iceBuckets;
    protected List<AbstractBar> organizersForTheBar;
    protected List<AbstractBar> setsForTheBar;


    @BeforeEach
    public void createOrganizersForTheBar() {
        formsForIce = new LinkedList<>();
        iceBuckets = new LinkedList<>();
        organizersForTheBar = new LinkedList<>();
        setsForTheBar = new LinkedList<>();

        formsForIce.add(new FormsForIce(500));
        formsForIce.add(new FormsForIce(335));
        formsForIce.add(new FormsForIce(445));
        formsForIce.add(new FormsForIce(665));
        iceBuckets.add(new IceBuckets(110));
        iceBuckets.add(new IceBuckets(355));
        iceBuckets.add(new IceBuckets(531));
        organizersForTheBar.add(new OrganizersForTheBar(950, "Glass",1999));
        organizersForTheBar.add(new OrganizersForTheBar(350, "Gold", 2005));
        organizersForTheBar.add(new OrganizersForTheBar(680, "Metal", 2020));
        setsForTheBar.add(new SetsForTheBar(700));
        setsForTheBar.add(new SetsForTheBar(1200));

    }
}
