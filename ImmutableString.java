import java.sql.SQLOutput;
import java.util.Scanner;

public class ImmutableString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //string constant pool
        //without using new then it is said to string constant pool........
        //not allow duplicates in string store on same reference
        String str1="java";
        String str2="java";



        //for checking the reference are equal
        if(str1==str2){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Reference are not equal");
        }

        //for checking value are equal
        if (str1.equals(str2)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }


        //for checking value are equal ignore cases
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }


        System.out.println("=================================================================================");
        // string non constant pool
        //with using new then it is said to string constant pool........
        //allow duplicates in string store on different reference
        String s1=new String("java");
        String s2=new String("java");


        //for checking the reference are equal
        if(s1==s2){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Reference are not equal");
        }

        //for checking value are equal
        if (s1.equals(s2)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }


        //for checking value are equal ignore cases
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }

        System.out.println("===============================================================================");
        //String Concatenation using +
        String s3="JAVA";
        String s4="PYTHON";
        String s5="JAVA"+"PYTHON";
        String s6="JAVA"+"PYTHON";

        if(s5==s6){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Reference are not equal");
        }


        if(s5.equals(s6)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }
        System.out.println("============================================================================");
        String s7="JAVA";
        String s8="PYTHON";
        String s9=s7+s8;
        String s10=s7+s8;

        if(s9==s10){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Reference are not equal");
        }

        if(s9.equals(s10)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }

        System.out.println("===============================================================================");
        //string concatenation using concat menthod
        String s11="JAVA";
        String s12="PYTHON";
        String s13=s11.concat(s12);
        String s14=s11.concat(s12);


        if(s13==s14){
            System.out.println("Reference are equal");
        }
        else{
            System.out.println("Reference are not equal");
        }
        if(s13.equals(s14)){
            System.out.println("value are equal");
        }
        else{
            System.out.println("values are not equal");
        }
    }
}
