import java.util.ArrayList;

public class Memory {
    private ArrayList<String> vals = new ArrayList<String>();

    public Memory(){
        vals.add("Initial");
        vals.add("Elements");
    }

    public void addInMem(String v) {
        this.vals.add(v);
    }

    public void printMem() {
        for (String val : vals) {
            System.out.print(val + ' ');
        }
        System.out.println();
    }

    public void removeByInd(int ind) {
        this.vals.remove(ind);
    }

    public void clearMem(){
        this.vals.clear();
    }

}
