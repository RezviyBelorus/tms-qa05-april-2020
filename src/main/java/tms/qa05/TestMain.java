package tms.qa05;

import java.util.List;

public class TestMain {
    private static Integer[] array = {1, 2, 3};

    public static void main(String[] args) {
        String text = "aaaaa";

        int countWord;

        String alert = "a";
        String add = "add";
        String good = "good";
        String plan = "plan";

        /*
        String[] words = {alertSearch, ...};
        for (int i = 0; i < words.length; i++ {
             countWord = findWord(alertSearch, text);
             System.out.println("Слово 'alert' содердится с тексте " + countWord + " раз");
        }
        */

        countWord = findWord(alert, text);
        System.out.println("alert = " + countWord);
        countWord = findWord(add, text);
        System.out.println("add = " + countWord);
        countWord = findWord(good, text);
        System.out.println("good = " + countWord);
        countWord = findWord(plan, text);
        System.out.println("plan = " + countWord);
    }

    public static int findWord(String searchWord, String text){
        int countWord = 0;
        for (int i = 0; i > -1; i++) {
            i = text.indexOf(searchWord, i);
            if (i == -1) {
                break;
            }
            countWord++;
        }
        return countWord;
    }

    private static void addAll(List<Number> from, List<? extends Number> to) {
        from.addAll(to);
    }
    private static Integer[] get() {
        return array;
    }
}
