import java.util.ArrayList;

class MultiplyStrings {
    private ArrayList<Integer> addStrings(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0;

        for (int i = 0; i < num1.size() || i < num2.size(); i++) {
            int digit1 = i < num1.size() ? num1.get(i) : 0;
            int digit2 = i < num2.size() ? num2.get(i) : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            res.add(sum % 10);
        }

        if (carry != 0) {
            res.add(carry);
        }
        return res;
    }

    private ArrayList<Integer> multiplyOneDigit(StringBuilder firstNumber, char secondNumberDigit, int numZeros) {
        ArrayList<Integer> currentResult = new ArrayList<>();
        for (int i = 0; i < numZeros; i++) currentResult.add(0);

        int carry = 0;
        for (int i = 0; i < firstNumber.length(); i++) {
            char firstNumberDigit = firstNumber.charAt(i);
            int multiplication =  (secondNumberDigit - '0') * (firstNumberDigit - '0') + carry;
            carry = multiplication / 10;
            currentResult.add(multiplication % 10);
        }

        if (carry != 0) {
            currentResult.add(carry);
        }
        return currentResult;
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);

        firstNumber.reverse();
        secondNumber.reverse();

        int n = firstNumber.length() + secondNumber.length();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) res.add(0);

        for (int i = 0; i < secondNumber.length(); i++) {
            res = addStrings(multiplyOneDigit(firstNumber, secondNumber.charAt(i), i), res);
        }

        if (res.get(res.size() - 1) == 0) {
            res.remove(res.size() - 1);
        }

        StringBuilder result = new StringBuilder();
        for (int i = res.size() - 1; i >= 0; i--) {
            result.append(res.get(i));
        }

        return result.toString();
    }
}