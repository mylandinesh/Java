public class ImmutableStringMethods {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO  ";
        System.out.println("length: " + str1.length());
        System.out.println("substring: " + str1.substring(1,3));
        System.out.println("character1: " + str1.charAt(0));
        System.out.println("character Index: " + str1.indexOf("o"));
        System.out.println("characters Index: " + str1.lastIndexOf("l"));
        System.out.println("replace H to A: " + str1.replace("H", "A"));
        System.out.println("replaceAll: " + str1.replaceAll("l", "g"));
        System.out.println("lowerCase: " + str1.toLowerCase());
        System.out.println("upperCase: " + str1.toUpperCase());
        System.out.println("trim white spaces: " + str1.trim());
        System.out.println("==================================================================================");


        String s1="java javascirpt python";
        String[] arr=s1.split(" ");
        //for each loop does not allow reverse
        for(String s:arr){
            System.out.println(s);
        }
    }
}
