public class Engine {

    private int productionYear;
    private int horsePowers;

    public Engine(int productionYear, int horsePowers) {
        this.productionYear = productionYear;
        this.horsePowers = horsePowers;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    boolean isEcological() {
        return productionYear > 2000 && horsePowers < 20000;
    }
}
