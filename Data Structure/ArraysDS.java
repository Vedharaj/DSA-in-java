import java.util.Arrays;
import java.util.ArrayList;

public class ArraysDS
{
    public static void main(String[] args) {
        //1. Initalize
        int arr[] = new int[3];
        
        //2. Declare
        arr = new int[]{1, 2, 3};
        
        //3. access
        System.out.println("Access 0 index in arr "+arr[0]);
        
        //4. update
        arr[0]= 2;
        
        //5. Traversal
        System.out.println("Traversal");
        for(int i : arr){
            System.out.println(i);
        }
        
        //6. length
        System.out.println("Length of arr "+arr.length);
        
        //7. sequence search
        System.out.println("To find 3 in arr");
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3){
                System.out.println("3 index is "+i);
            }
        }
        
        //8. sort
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        //9. append
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(4);
        
        System.out.println("\nAppend: "+ arr1);
        
        //10. copy of array
        ArrayList<Integer> arr2 = new ArrayList<>(arr1);
        
        //11. reverse
        int l = arr.length-1;
        for(int i=0;i<=arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[l-i];
            arr[l-i] = temp;
        }
        System.out.println("Reverse of array: "+Arrays.toString(arr));
        
        //12. insert
        arr1.add(1, 2);
        System.out.println("Insert of 2 at 1: "+arr1);
                
        //13. remove by value
        arr1.remove(arr1.indexOf(4));
        System.out.println("remove by value: "+ arr1);
        
        //14. remove by index
        arr1.remove(1);
        System.out.println("remove by index: "+arr1);
    }
}
