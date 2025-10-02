import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("block size");
        int block=sc.nextInt();
        System.out.println("row size");
        int row=sc.nextInt();
        System.out.println("col size");
        int col=sc.nextInt();

        int[][][] ThreeDArray=new int[block][row][col];

        //for enter the elements:
        for (int i=0;i<block;i++){
            for (int j=0;j<row;j++){
                for (int k=0;k<col;k++){
                    System.out.println("Enter the "+(i+1)+" block "+(j+1)+" row "+(k+1)+" col elements of the array");
                    ThreeDArray[i][j][k]=sc.nextInt();
                }
            }
        }


        //for Print
        for (int i=0;i<block;i++){
            System.out.println("elements of "+(i+1)+" block elements:");
            for (int j=0;j<row;j++){
                for (int k=0;k<col;k++){
                    System.out.print(ThreeDArray[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }



    }
}
