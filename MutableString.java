public class MutableString {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append("World");
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse().toString());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        stringBuffer.trimToSize();
        System.out.println(stringBuffer.capacity());
    }
}
