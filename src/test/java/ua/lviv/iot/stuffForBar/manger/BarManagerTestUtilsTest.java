package ua.lviv.iot.stuffForBar.manger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.stuffForBar.manager.BarManagerUtils;
import ua.lviv.iot.stuffForBar.model.SortType;

public class BarManagerTestUtilsTest extends BaseBarManagerTest {


    @Test
    public void testSortingDescending() {
        BarManagerUtils.sortByPriceInUAH(organizersForTheBar, SortType.DESCENDING);
        Assertions.assertEquals(700, organizersForTheBar.get(0).getPriceInUAH());
        Assertions.assertEquals(650, organizersForTheBar.get(1).getPriceInUAH());
        Assertions.assertEquals(500, organizersForTheBar.get(2).getPriceInUAH());
        Assertions.assertEquals(450, organizersForTheBar.get(3).getPriceInUAH());


    }

    @Test
    public void testSortByYear() {
        BarManagerUtils.sortByProductionYear(iceBuckets, SortType.ASCENDING);
        Assertions.assertEquals(1999, iceBuckets.get(0).getProductionYear());
        Assertions.assertEquals(2005, iceBuckets.get(1).getProductionYear());
        Assertions.assertEquals(2008, iceBuckets.get(2).getProductionYear());
        Assertions.assertEquals(2015, iceBuckets.get(3).getProductionYear());
        Assertions.assertEquals(2018, iceBuckets.get(4).getProductionYear());
        Assertions.assertEquals(2020, iceBuckets.get(5).getProductionYear());
    }

    @Test
    public void testSortByMaterialComparing() {
        BarManagerUtils.sortByMaterial(iceBuckets, SortType.DESCENDING);
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(0).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(1).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(2).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(3).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(4).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(5).getMaterial());
    }


    @Test
    public void testSortByGenreCompare() {
        BarManagerUtils.sortByPriceInUAHAndMaterial(iceBuckets, SortType.ASCENDING);
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(0).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(1).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(2).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(3).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(4).getMaterial());
        Assertions.assertEquals(setsForTheBar, iceBuckets.get(5).getMaterial());


    }
}
