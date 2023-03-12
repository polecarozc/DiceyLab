public class Dice {
    private int diceAmount;
    private int diceRoll;

    public void setDiceAmount(int diceAmount){
        this.diceAmount = diceAmount;
    }
    public int getDiceAmount(){
        return diceAmount;
    }
    public int diceToss(){
        int min = 1;
        int max = 6;
        diceRoll = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return diceRoll;

    }
    public void setDiceRoll(int diceRoll){
        this.diceRoll = diceRoll;
    }
    public int getDiceRoll(){
        return diceRoll;
    }

}
