import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> glist = new ArrayList<>(); //10,6,2,5,8,4,9,-3
        glist.add(10);
        glist.add(6);
        glist.add(2);
        glist.add(5);
        glist.add(8);
        glist.add(4);
        glist.add(9);
        glist.add(-3);
        System.out.println("Изначально список выглядит так: " + glist);
        for (int i = glist.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (glist.get(i) < glist.get(j)) {
                    int temp1 = glist.get(i);
                    int temp2 = glist.get(j);
                    glist.set(j, temp1);
                    glist.set(i, temp2);
                }
            }
        }
        System.out.println("А после сортировки, так: " + glist);
    }
}
