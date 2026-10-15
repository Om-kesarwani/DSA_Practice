import java.util.Scanner;
public class Output_Input {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

        //methods to declor the 2D Array
      // int[][] arr=new int[3][4];
      int[][] arr={{6,0,2,6,8},{3,9,1,3,0},{9,3,1,0,5}};
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      //taking the inputs of 2D Arrays
      int[][] brr=new int[3][4];
      System.out.println("Enter the element in 2D Array");
      for(int i=0;i<brr.length;i++){
        for(int j=0;j<brr[0].length;j++){
          brr[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<brr.length;i++){
        for(int j=0;j<brr[0].length;j++){
          System.out.print(brr[i][j]+" ");
        }
        System.out.println();
      }
    }
}
