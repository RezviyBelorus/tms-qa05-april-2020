package tms.qa05.lec_7.classwork.point_2;

import java.util.Arrays;

public class StringMethodsExample {
    public static void main(String[] args) {
        String kirill = "   Kirill ";

        System.out.println(kirill);
        kirill = kirill.trim();
        System.out.println(kirill);

        String ill = kirill.substring(3);
        System.out.println("ill:" + ill);

        ill = kirill.substring(3, kirill.length() - 1);
        System.out.println("il:" + ill);

        kirill.concat(" Fedorovich");
        kirill = kirill + " Fedorovich";

        boolean isIll = kirill.contains("ill");
        System.out.println(isIll);

        System.out.println(kirill.indexOf("i"));
        System.out.println(kirill.indexOf("i", 2));

        String empty = "";
        System.out.println(empty.isEmpty());

        System.out.println(kirill.replace("i", "a"));

        String words = "Apple. orange. grape";
        String[] wordsArray = words.split("\\.");
        System.out.println(Arrays.toString(wordsArray));

        System.out.println(kirill.toUpperCase());
    }
}
