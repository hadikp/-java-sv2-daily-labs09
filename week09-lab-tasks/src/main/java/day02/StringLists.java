package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        List<String> shortestWords = new ArrayList<>();
        int min = 1000;
        for (String st: words) {
            if (st.length() < min) {
                min = st.length();
            }
        }
        for (String st: words) {
            if (st.length() == min) {
                shortestWords.add(st);
            }
        }
        return shortestWords;
    }
}
