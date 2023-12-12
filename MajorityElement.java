public class MajorityElement {
    public static int majorityElement(int a[], int size)
    {
        // your code here
        int el=0;
        int count=0;
        for (int i=0;i<size;i++){
            if(count==0){
                el=a[i];
            }
            if(el==a[i]){
                count++;
            }
            else{
                count--;
            }
                
        }
        
        count=0;
        for(int i=0;i<size;i++){
            if(el==a[i]){
                count++;
            }
        }
        
        if(count>size/2){
            return el;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,3,2,3,2,3,1};
        int Element = majorityElement(nums,nums.length);
        System.out.println("Majority Element: " + Element);
    }
}
