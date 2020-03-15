package ua.lviv.iot.stuffForBar.manger;
import java.util.List;

import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ua.lviv.iot.stuffForBar.manager.BarManager;
import ua.lviv.iot.stuffForBar.model.AbstractBar;


class BarManagerTestTest extends BaseBarManagerTest {

    private BarManager barManager;

    @BeforeEach
    public void setUp() {
        barManager = new BarManager();
        barManager.addStuffs(organizersForTheBar);

    }

    @Test
    public void testFindStuffForBarOfGlass() {
        List<AbstractBar> stuffs = barManager.findStuffForBarOfGlass(1000);
        Assertions.assertEquals(2, stuffs.size());
        Assertions.assertEquals(13, stuffs.get(0).getPriceInUAH());
        Assertions.assertEquals(11, stuffs.get(1).getPriceInUAH());


    }

}