public class Airplane {

    private String model;
    private int numberOfSeats;
    private Engine engine;

    public Airplane(String model, int numberOfSeats, Engine engine) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    boolean isEcological(){
        return engine.isEcological();
    }

    public int getProductionYear() {
        return engine.getProductionYear();
    }

    public int getHorsePowers() {
        return engine.getHorsePowers();
    }
}
