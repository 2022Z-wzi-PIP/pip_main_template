import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class TestAirplaneMethods {

    @Test
    public void testModelGetter(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers = 22000;
        int productionYear = 1999;
        List<Engine> listEngines = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers,productionYear},true);
        List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,listEngines.get(0)},true);

        for (Airplane airplane: listPlanes) {
            String valueFromAirplane = GenericTestFactory.testGetter(airplane, "model");
            if (Objects.equals(valueFromAirplane,model))
                assertTrue(Objects.equals(valueFromAirplane,model));
        }

    }
    @Test
    public void testNumberOfSeatsSetter(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers = 22000;
        int productionYear = 1999;
        List<Engine> listEngines = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers,productionYear},true);
        List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,listEngines.get(0)},true);

        GenericTestFactory.testSetter(listPlanes.get(0), "model", model);
    }

    @Test
    public void testHorsePowersSetter(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers = 22000;
        int productionYear = 1999;
        List<Engine> listEngines = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers,productionYear},true);
        List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,listEngines.get(0)},true);

        int expectedValue = GenericTestFactory.testGetter(listEngines.get(0),"horsePowers");
        List<Integer> realValue = GenericTestFactory.invokeMethod(listPlanes.get(0), "getHorsePowers", new Object[]{});
        assertEquals(expectedValue,realValue.get(0));
    }
    @Test
    public void testGetProductionYearGetter(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers = 22000;
        int productionYear = 1999;
        List<Engine> listEngines = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers,productionYear},true);
        List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,listEngines.get(0)},true);

        int expectedValue = GenericTestFactory.testGetter(listEngines.get(0),"productionYear");
        List<Integer> realValue = GenericTestFactory.invokeMethod(listPlanes.get(0), "getProductionYear", new Object[]{});
        assertEquals(expectedValue,realValue.get(0));
    }

    @Test
    public void testIsEcologicalFalse1(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers1 = 20001;
        int productionYear1 = 2099;

        List<Engine> listEngines1 = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers1,productionYear1},true);
        for (Engine e: listEngines1) {
            int productionYear11 = GenericTestFactory.testGetter(e,"productionYear");
            if(productionYear1 == productionYear11){
                List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,e},true);
                List<Boolean> ecological = GenericTestFactory.invokeMethod(listPlanes.get(0),"isEcological",null);
                assertFalse(ecological.get(0));
                return;
            }
        }
        fail();
    }

    @Test
    public void testIsEcologicalFalse2(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers1 = 19999;
        int productionYear1 = 1999;

        List<Engine> listEngines1 = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers1,productionYear1},true);
        for (Engine e: listEngines1) {
            int productionYear11 = GenericTestFactory.testGetter(e,"productionYear");
            if(productionYear1 == productionYear11){
                List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,e},true);
                List<Boolean> ecological = GenericTestFactory.invokeMethod(listPlanes.get(0),"isEcological",null);
                assertFalse(ecological.get(0));
                return;
            }
        }
        fail();
    }

    @Test
    public void testIsEcologicalTrue(){
        String model = "Airbus";
        int numberOfSeats = 25;

        int horsePowers1 = 19999;
        int productionYear1 = 2001;

        List<Engine> listEngines1 = GenericTestFactory.getInstance(Engine.class,new Object[]{horsePowers1,productionYear1},true);
        for (Engine e: listEngines1) {
            int productionYear11 = GenericTestFactory.testGetter(e,"productionYear");
            if(productionYear1 == productionYear11){
                List<Airplane> listPlanes = GenericTestFactory.getInstance(Airplane.class,new Object[]{model,numberOfSeats,e},true);
                List<Boolean> ecological = GenericTestFactory.invokeMethod(listPlanes.get(0),"isEcological",null);
                assertTrue(ecological.get(0));
                return;
            }
        }
        fail();

    }
}
