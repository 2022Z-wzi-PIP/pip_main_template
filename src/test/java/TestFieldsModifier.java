import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertAll;

public class TestFieldsModifier {


    @Test
    public void testFieldsModifiers(){
        assertAll( () -> {
            GenericTestFactory.testFieldModifier(Engine.class,"productionYear", Modifier.PRIVATE);
            GenericTestFactory.testFieldModifier(Engine.class,"horsePowers", Modifier.PRIVATE);
            GenericTestFactory.testFieldModifier(Airplane.class,"engine", Modifier.PRIVATE);
            GenericTestFactory.testFieldModifier(Airplane.class,"model", Modifier.PRIVATE);
            GenericTestFactory.testFieldModifier(Airplane.class,"numberOfSeats", Modifier.PRIVATE);
        });
    }


    @Test
    public void testMethodsModifiers(){
        assertAll( () -> {
            GenericTestFactory.testMethodModifier(Engine.class,"getProductionYear",Modifier.PUBLIC );
            GenericTestFactory.testMethodModifier(Airplane.class,"getProductionYear",Modifier.PUBLIC );
            GenericTestFactory.testMethodModifier(Engine.class,"horsePowers",Modifier.PUBLIC );
            GenericTestFactory.testMethodModifier(Airplane.class,"horsePowers",Modifier.PUBLIC );
            GenericTestFactory.testMethodModifier(Airplane.class,"getModel",Modifier.PUBLIC );
            GenericTestFactory.testMethodModifier(Airplane.class,"setNumberOfSeats",Modifier.PUBLIC );
        });
    }

    @Test
    public void testProductionYearField(){
        GenericTestFactory.testMethodHasNoModifiers(Engine.class,"isEcological");
    }
}
