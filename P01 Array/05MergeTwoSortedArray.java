public class MergeTwoSortedArray {
    public static void main(String[] args) {
        //we are merging two sorted arry in single arry
        //example {2,5,6,9,20} and {1,3,4,5,7,8} out put is {1,2,3,4,5,5,6,7,8,9,20}
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8};
        int[] c=new int[a.length+b.length];
        for(int ele:c)System.out.print(ele+" ");
        System.out.println();
        merge(a,b,c);
        for(int ele:c)System.out.print(ele+" ");

    } 
    public static void merge(int[] a,int[] b,int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){   // a array khatam -> b  ke bache hue elemnt lo
            while(j<b.length){
                c[k]=b[j];
                k++;
                j++;
            }
        }
        if(j==b.length){  // b array khatam -> a  ke bache hue elemnt lo
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }

    }
}
