import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int SizeOfArray=scanner.nextInt();


        //byte Array
        byte[] array4=new byte[SizeOfArray];
        System.out.println("Enter the elements of the Byte Array");
        for(int i=0;i<SizeOfArray;i++){
            array4[i]=scanner.nextByte();
        }
        System.out.println("elements of the byte array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array4[i]+" ");
        }
        System.out.println();




        //Short Array
        short[] array5=new short[SizeOfArray];
        System.out.println("Enter the elements of the Short Array");
        for(int i=0;i<SizeOfArray;i++){
            array5[i]=scanner.nextShort();
        }
        System.out.println("elements of the short array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array5[i]+" ");
        }
        System.out.println();




        //Integer Array
        int[] array1 =new int[SizeOfArray];
        System.out.println("Enter the elements of the Int Array");
        for(int i=0;i<SizeOfArray;i++){
            array1[i]=scanner.nextInt();
        }
        System.out.println("elements of the Int array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();





        //Long Array
        long[] array6 =new long[SizeOfArray];
        System.out.println("Enter the elements of the Long Array");
        for(int i=0;i<SizeOfArray;i++){
            array6[i]=scanner.nextLong();
        }
        System.out.println("elements of the Long array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array6[i]+" ");
        }
        System.out.println();




        //Float Array
        float[] array2=new float[SizeOfArray];

        System.out.println("Enter the elements of the FloatArray");
        for(int i=0;i<SizeOfArray;i++){
            array2[i]=scanner.nextFloat();
        }
        System.out.println("elements of the float array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();




        //double Array
        double[] array7=new double[SizeOfArray];

        System.out.println("Enter the elements of the double Array");
        for(int i=0;i<SizeOfArray;i++){
            array7[i]=scanner.nextDouble();
        }
        System.out.println("elements of the double array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array7[i]+" ");
        }
        System.out.println();




        //boolean Array
        boolean[] array3=new boolean[SizeOfArray];

        System.out.println("Enter the elements of the Boolean Array");
        for(int i=0;i<SizeOfArray;i++){
            array3[i]=scanner.nextBoolean();
        }
        System.out.println("elements of the boolean array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array3[i]+" ");
        }
        System.out.println();




        //char Array
        char[] array8=new char[SizeOfArray];

        System.out.println("Enter the elements of the char Array");
        for(int i=0;i<SizeOfArray;i++){
            array8[i]=scanner.next().charAt(0);
        }
        System.out.println("elements of the char array");
        for(int i=0;i<SizeOfArray;i++){
            System.out.print(array8[i]+" ");
        }
        System.out.println();




    }
}
