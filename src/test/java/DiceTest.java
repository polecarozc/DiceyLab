import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void testDiceAmount() {
        Dice dice = new Dice();
        int expected = 1;

        dice.setDiceAmount(expected);
        int actual = dice.getDiceAmount();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testDiceRoll(){
        Dice dice = new Dice();
        int expected = 5;

        dice.setDiceRoll(expected);

        int actual = dice.getDiceRoll();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRandomDiceToss(){
        Dice dice = new Dice();
        int expected = dice.diceToss();

        int actual = dice.getDiceRoll();

        Assert.assertEquals(expected, actual);
    }

}