import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

public class TestEngineField {
    @Test
    public void testHorsePowersField(){
        assertAll( () -> {
            GenericTestFactory.testFieldExists(Engine.class,"horsePowers");
            GenericTestFactory.testFieldType(Engine.class,"horsePowers", int.class);
        });
    }
    @Test
    public void testProductionYearField(){
        assertAll( () -> {
            GenericTestFactory.testFieldExists(Engine.class,"productionYear");
            GenericTestFactory.testFieldType(Engine.class,"productionYear", int.class,true);
        });
    }
    @Test
    public void testEngineField(){
        assertAll( () -> {
            GenericTestFactory.testFieldExists(Airplane.class,"engine");
            GenericTestFactory.testFieldType(Airplane.class,"engine", Engine.class);
        });
    }
}
