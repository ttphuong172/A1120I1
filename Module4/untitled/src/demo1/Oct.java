package demo1;

public class Oct {
    public static void main(String[] args) {
        int ia[] = new int[4];
       for (int i=0; i<ia.length;i++){
           System.out.println(i);
       }
        System.out.println(Math.floor(-4.7));
        System.out.println(Math.round(-4.7));
        System.out.println(Math.ceil(-4.7));
        System.out.println("---------------------------");
        Oct oct=new Oct();
        oct.amethod();

        System.out.println("------");
        System.out.println(5<<3);
    }

    public void amethod(){
   int oi= 012;
    System.out.println(oi);
    }
}
