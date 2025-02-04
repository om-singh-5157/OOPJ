import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        int[] arr=inputArray();
        minAndMax(arr);
    }
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter the element no "+i+" :");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }
    public static void minAndMax(int[] arr){
        int min=arr[0], max=arr[0];
        int i=0;
        while(i<arr.length){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        System.out.println("Min of array is: "+min);
        System.out.println("Max of array is: "+max);
    }
}
