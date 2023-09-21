package org.example.Sum;

public class SumCalculator {

    public int sum(int n) {
        ValidateSum validateSum = new ValidateSum();
        validateSum.validate(n);
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }


}
