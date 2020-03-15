package ua.lviv.iot.stuffForBar.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.stuffForBar.model.AbstractBar;

public class BarManager {
    private List<AbstractBar> stuffs = new LinkedList<AbstractBar>();

    public void addStuffs(List<AbstractBar> stuffs) {
        this.stuffs.addAll(stuffs);
    }

    public List<AbstractBar> findStuffForBarOfGlass(int priceInUAH) {

        List<AbstractBar> stuffsOfGlass = new LinkedList<AbstractBar>();
        for (AbstractBar price : stuffs) {
            if (price.getPriceInUAH() > priceInUAH) {
                stuffsOfGlass.add(price);
            }
        }
        return stuffsOfGlass;
    }
}
