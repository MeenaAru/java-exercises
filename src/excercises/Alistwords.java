package excercises;
import java.util.ArrayList;
import java.util.Scanner;

public class Alistwords {
    public static void main(String[] args) {
        ArrayList<String> word_list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 11; i++){
            String input = in.nextLine();
            word_list.add(input);
        }

        for (int i = 0; i < word_list.size(); i++) {
            String word = word_list.get(i);
            if ( word.length() > 5) {
                System.out.println(word_list.get(i));
            }

        }
    }
}
