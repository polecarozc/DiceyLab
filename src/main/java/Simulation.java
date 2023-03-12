import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public int pickedDiceAmount;
    public int pickedInterations;
    public int possibleThrows;

    public void startSimulation(){
        System.out.println("Welcome to this dice simulation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dice amount: ");
        pickedDiceAmount= scanner.nextInt();
        System.out.println("Okay great, now enter how many times you'd like to toss the dice");
        pickedInterations = scanner.nextInt();
        System.out.println("Computing Simulation...");
        computing();
    }
    public void computing(){
        Dice dice = new Dice();
        Bins bin = new Bins();
        dice.setDiceAmount(pickedDiceAmount);
        possibleThrows = pickedDiceAmount * 6;
        ArrayList<Integer> simlist = new ArrayList<>(possibleThrows - pickedDiceAmount);
        for(int i = 0; i<=possibleThrows; i++){
            simlist.add(i, 0);
        }
        for(int i = 0;i<pickedInterations; i++){
            int temp = 0;
            for(int j = 1;j<=pickedDiceAmount;j++){
                temp += dice.diceToss();
            }
            simlist.set(temp, simlist.get(temp)+1);
        }
        for(int i = pickedDiceAmount; i<=possibleThrows; i++){
            System.out.println("Roll " + i + "  " + simlist.get(i));
        }
    }
    public static void main(String[] args){
        Simulation sim = new Simulation();
        sim.startSimulation();
    }
}
