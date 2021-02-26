package _2_loop.BT;

public class InSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int N = 2; N < 100; N++) {
            boolean check = true;
            for (int index = 2; index <= Math.sqrt(N); index++) {
                if (N % index == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
            }
        }
    }

}

