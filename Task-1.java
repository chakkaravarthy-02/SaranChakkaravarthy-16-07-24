import java.util.Scanner;

public class OddEvenSort {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //for even numbers
        for(int i=0;i<n-2;i+=2){
            int index=i;
            for(int j=i+2;j<n;j+=2){
                if(arr[index]<arr[j]){
                    index=j;
                }
            }
            swap(arr,index,i);
        }
        //for odd numbers
        for(int i=1;i<n-2;i+=2){
            int index=i;
            for(int j=i+2;j<n;j+=2){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            swap(arr,index,i);
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int[] arr,int x,int i){
        int temp=arr[x];
        arr[x]=arr[i];
        arr[i]=temp;
    }
}
