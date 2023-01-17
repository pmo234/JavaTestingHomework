import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    WaterBottle waterBottle1;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canTake10AwayFromTheVolume() {
        assertEquals(90, waterBottle.takeADrink());
    }

    @Test
    public void canSetTheVolumeTo0() {
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void canSetTheVolumeBackToOneHundred() {
        waterBottle1 = new WaterBottle(0);
        assertEquals(100, waterBottle1.setToOneHundred());
    }

}