class Comutative {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
         int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            System.out.print(count+" ");
        }

        
        for(int n=1;n<=5;){
          n=n++;
          System.out.println(n);
        }
    }
}