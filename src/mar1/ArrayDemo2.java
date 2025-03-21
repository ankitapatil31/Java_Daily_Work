package mar1;

public class ArrayDemo2 {
    public static void main(String[] arg){
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Display Orignal Array");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int j = arr.length-1;
     /* for (int i = 0; i < arr.length; i++){
            int temp = 0;
            if(i>j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            System.out.println("------"+i);
           j--;
        } */
        for (int i = 0; i<j; i++){
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.println("Display Array After Reverse ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
     }
}
