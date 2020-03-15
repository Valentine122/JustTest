package ua.lviv.iot.stuffForBar.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.stuffForBar.model.AbstractBar;
import ua.lviv.iot.stuffForBar.model.SortType;


public class BarManagerUtils {

    private static final PopularSorterByPriceInUAH STUFF_BY_PRICE_IN_UAH_SORTER = new PopularSorterByPriceInUAH();

    private static class PopularSorterByPriceInUAH implements Comparator<AbstractBar> {

        @Override
        public int compare(AbstractBar firstStuff, AbstractBar secondStuff) {
            return (int) (firstStuff.getPriceInUAH() - secondStuff.getPriceInUAH());
        }
    }
    private class PopularSorterByMaterial implements Comparator<AbstractBar> {
        @Override
        public int compare(AbstractBar firstStuff, AbstractBar secondStuff) {
            return firstStuff.compareTo(secondStuff);
        }

    }
    public static void sortByPriceInUAH(List<AbstractBar> stuffs, SortType sortType) {

        stuffs.sort(sortType == SortType.ASCENDING ? STUFF_BY_PRICE_IN_UAH_SORTER : STUFF_BY_PRICE_IN_UAH_SORTER.reversed());
    }

    public static void sortByMaterial(List<AbstractBar> stuffs, SortType sortType) {
        Comparator<AbstractBar> comparator = Comparator.comparing(AbstractBar::getMaterial);
        stuffs.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }

    public static void sortByPriceInUAHAndMaterial(List<AbstractBar> stuffs, SortType sortType) {


        Comparator<AbstractBar> comparator = new Comparator<>() {

            @Override
            public int compare(AbstractBar firstStuff, AbstractBar secondStuff) {

                int capacityComparisonResult = (int) (firstStuff.getPriceInUAH() - secondStuff.getPriceInUAH());

                if (capacityComparisonResult != 0) {
                    return capacityComparisonResult;
                }

                return firstStuff.getMaterial().compareTo(secondStuff.getMaterial());

            }
        };
        stuffs.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
    }
    public static void sortByProductionYear(List<AbstractBar> stuffs, SortType sortType) {
        if (sortType == SortType.ASCENDING) {
            stuffs.sort((firstStuff, secondStuff) -> Integer.compare(firstStuff.getProductionYear(), secondStuff.getProductionYear()));
        } else stuffs.sort((secondStuff, firstStuff) -> Integer.compare(secondStuff.getProductionYear(), firstStuff.getProductionYear()));

    }
}
