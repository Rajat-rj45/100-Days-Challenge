import java.util.Arrays;

class MaxMin{
   

    public static int findSum(int A[]) 
    {
        //code here
        Arrays.sort(A);
        
        return A[0]+A[A.length-1];
    }



  public static void main(String[] args) {
    int A[]={-2, 1, -4, 5, 3};
    int sum=findSum(A);
    System.out.println(sum);
  }
}