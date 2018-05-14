import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasDrink(){
        assertEquals(90, waterbottle.getDrink());
    }

    @Test
    public void hasEmpty(){
        assertEquals(0,waterbottle.getEmpty());
    }

    @Test
    public void hasFill(){
        assertEquals(100, waterbottle.getFill());
    }

}
