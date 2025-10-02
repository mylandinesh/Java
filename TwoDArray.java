import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of the array");
        int row=sc.nextInt();
        System.out.println("Enter the column size of the array");
        int col=sc.nextInt();


        int[][] array1=new int[row][col];
        for (int i=0;i<row;i++){
            System.out.println("Enter the "+(i+1)+" row elements of the array");
            for (int j=0;j<col;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            System.out.println((i+1)+" row elements of the array:");
            for(int j=0;j<col;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
