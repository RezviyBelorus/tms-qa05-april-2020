package tms.qa05.lec_7.classwork.point_3_4_5;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Egor");
        StringBuffer stringBuffer = new StringBuffer("Egor");

        stringBuilder.append(" Fedorovich");
        stringBuffer.append(" Fedorovich");

        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

        StringBuilder alucard = new StringBuilder("alucard");
        alucard.reverse();
        System.out.println(alucard);
    }
}
