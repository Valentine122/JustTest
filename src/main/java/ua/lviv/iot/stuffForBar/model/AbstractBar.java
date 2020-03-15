package ua.lviv.iot.stuffForBar.model;
import static java.lang.Integer.compare;

public abstract class AbstractBar implements Comparable<AbstractBar> {
    private float priceInUAH;
    private String material;
    private int productionYear;

    public AbstractBar(float priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public AbstractBar(float priceInUAH, String material) {
        this(priceInUAH);
        this.material = material;
    }

    public AbstractBar(float priceInUAH, String material, int productionYear) {
        this(priceInUAH, material);
        this.productionYear = productionYear;

    }

    public float getPriceInUAH() {
        return priceInUAH;
    }

    public String getMaterial() {
        return material;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public int compareTo(AbstractBar another) {
        return compare(this.getPriceInUAH(), another.getPriceInUAH());
    }

    protected abstract int compare(float priceInUAH, float priceInUAH1);
}
