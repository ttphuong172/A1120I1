package demo1;

public class MyClass {
    int x;
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        int [] mang = new int[2];
        mang[0]=1;
        mang[1]=2;
        System.out.println(myClass.x);
        for(int i=0; i<2;i++){
            System.out.println(mang[i]);
        }
    }
}
