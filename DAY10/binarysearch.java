public class Main{
    public static void main(String[] args){
        int[] arr={5, 10, 15, 20, 25, 30, 35};
        int target=25;
        int low=0;
        int high=arr.length-1;
        int resultIndex=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                resultIndex=mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(resultIndex);
    }
}
