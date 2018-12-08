package org.launchcode.java.studios;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Wordcount {
        public static void main(String[] args) {
            String para="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
            String lpara= para.toLowerCase();
            char[] ch = para.toCharArray();

            HashMap<Character, Integer> char_count = new HashMap<>();
            for (  int j = 32; j <= 126; j++){
                int ct = 0;
                for (int i = 0; i < ch.length; i++) {
                    int ascii = ch[i];
                    if (j == ascii) {
                        ct++;
                    }
                    char c = (char)j;
                    char_count.put(c, ct);
                }
            }
            for (Map.Entry<Character, Integer> char_counts : char_count.entrySet()) {
                System.out.println(char_counts.getKey() + " (" + char_counts.getValue() + ")");
            }
        }
}
