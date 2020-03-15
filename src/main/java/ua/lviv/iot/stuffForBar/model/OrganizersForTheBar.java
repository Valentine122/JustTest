package ua.lviv.iot.stuffForBar.model;

public class OrganizersForTheBar extends AbstractBar {
    public OrganizersForTheBar(float priceInUAH, String material, int productionYear) {
        super(priceInUAH, material, productionYear);

    }

    @Override
    protected int compare(float priceInUAH, float priceInUAH1) {
        return 0;
    }
}