import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    public void TestbinSize() {
        Bins bin = new Bins();
        int expected = 1;
        bin.setBinSize(expected);

        int actual = bin.getBinSize();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testAppendBin() {
        Dice dice = new Dice();
        Bins bin = new Bins();
        int expected = 1;
        dice.setDiceRoll(1);
        bin.setBinSize(1);
        bin.appendBin(expected);
        int actual = bin.displayBinElement(0);
        Assert.assertEquals(expected, actual);
    }
}