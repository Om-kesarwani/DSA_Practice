public class secondmax {
    public static void main(String[] args) {
        // finding second max of array by using two single for loop
        int[] arr={12,45,2,4-35,204,-35,27};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(fmax<arr[i]) fmax=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(smax<arr[i] && arr[i]!=fmax) smax=arr[i];
        }
        System.out.println("first max is "+fmax);
        System.out.println("second max is "+smax);
    }
}
