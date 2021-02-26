package _3_array.Test;

public class XuatMang {

    public static void main(String[] args) {
        //Khai bao va khoi tao mang arr
        int [] arr ;
        arr =new int[5];
        arr[0]=5;
        arr[1]=3;
        arr[2]=6;
        arr[3]=8;
        arr[4]=3;
        //Khai bao va khoi tao mang arr1
        int arr1 []={1,8,6,9,7};

        for(int index=0;index<arr.length;index++){
            System.out.println(arr[index]);
        }
        for(int element:arr1){
            System.out.println(element);
        }
    }
}
