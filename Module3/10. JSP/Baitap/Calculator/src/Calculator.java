public class Calculator {

    public static String calculate(float first, float second, String operator) {
        Float result = 0.0F;
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second!=0){
                    result = first / second;
                } else {
                    throw new RuntimeException("Không thể chia cho 0");
                }

        }
        return  first +operator+ second +"="+ result;
    }
}


