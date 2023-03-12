import java.util.ArrayList;

public class Bins {
    private int binSize;

    private volatile ArrayList<Integer> results = new ArrayList<>(binSize);
    public void setBinSize(int binSize){
        this.binSize = binSize;
    }
    public void appendBin(int value){
        results.add(value);
    }
    public int displayBinElement(int index){
        return results.get(index);
    }
    public void clear(){
        results.clear();
    }

    public int getBinSize(){
        return binSize;
    }
}
