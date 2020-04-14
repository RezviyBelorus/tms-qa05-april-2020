package tms.qa05.lec_1.classwork.point_4;

public class Types_1 {
    public static void main(String[] args) {
        byte age = -128;
        short month = 377;

        char mySymbol = 'K';
        char numericChar = 23;
        char codeChar = '\u0023';

        System.out.println("My age = " + age);
        System.out.println("mySymbol = " + mySymbol);
        System.out.println("numericChar = " + numericChar);
        System.out.println("codeChar = " + codeChar);


        float percent = 1 ;
        System.out.println("percent = " + percent);

        boolean isTrue = true;
        boolean isFalse = false;

        isTrue = (2 < 4);

        System.out.println("2 < 4? : " + isTrue);


        String myName = null;

        System.out.println("myName: " + myName);

    }

}
