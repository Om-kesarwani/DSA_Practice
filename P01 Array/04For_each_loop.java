public class foreachloop {
    public static void main(String[] args) {
        int[] arr={12,13,66,532,53,24,462,53,2,5};
        // for each is use to  acces the element of arrays
        for(int ele :arr){
            System.out.print(ele+" ");
        }

        System.out.println();


        
        // by suing for each we change the value oof array add 10 in even number and double the odd number
        // for each loop is copy of arry change is not occuer in main arrya
        for(int ele : arr){
            if(ele%2==0) ele=ele+10;
            else ele=ele*2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        // for change in main array we use the for loop 
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                arr[i]=arr[i]+10;
            else
                arr[i]=arr[i]*2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
