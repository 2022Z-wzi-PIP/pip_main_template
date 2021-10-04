import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAirplaneFields {


    @Test
    public void testModelField(){
        assertAll( () -> {
            GenericTestFactory.testFieldExists(Airplane.class,"model");
            GenericTestFactory.testFieldType(Airplane.class,"model", String.class);
        });
    }
    @Test
    public void testNumberOfSeatsField(){
        assertAll( () -> {
            GenericTestFactory.testFieldExists(Airplane.class,"numberOfSeats");
            GenericTestFactory.testFieldType(Airplane.class,"numberOfSeats", int.class,true);
        });
    }
}
