package excercises;
import java.util.ArrayList;
import java.util.Scanner;


public class Evenarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> no_list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 11; i++){
            no_list.add(i);
        }

        for (int i = 0; i < no_list.size(); i++) {
            if (no_list.get(i) % 2 == 0) {
                System.out.println(no_list.get(i) + "is an even no");
            }

        }
    }
}
