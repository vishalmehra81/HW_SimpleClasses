import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }
    @Test
    public void hasVolumeOf700(){
        assertEquals(700, waterBottle.getVolume());
    }
    @Test
    public void hasVolumeOf690AfterOneDrink(){
        waterBottle.drinkWater();
        assertEquals(690, waterBottle.getVolume());
    }
    @Test
    public void emptyBottleWithVolumeDownTo0(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void fillBottleWithVolumeBackTo700(){
        waterBottle.emptyBottle();
        waterBottle.fillBottle();
        assertEquals(700, waterBottle.getVolume());
    }

}


