public class add_fraction {



    // Function to compute gcd
    public int gcd(int a, int b) {
        // Base case
        if (b == 0)
            return a;
        // Recursive call
        return gcd(b, a % b);
    }

    // Function to add two fractions
    public void addFractions(int num1, int den1, int num2, int den2) {
        // Find LCM of both denominators
        int lcm = (den1 * den2) / gcd(den1, den2);

        // Convert both numerators to same denominator
        int newNum1 = num1 * (lcm / den1);
        int newNum2 = num2 * (lcm / den2);

        // Add the numerators
        int resultNum = newNum1 + newNum2;
        int resultDen = lcm;

        // Simplify the result by dividing by gcd
        int common = gcd(resultNum, resultDen);
        resultNum /= common;
        resultDen /= common;

        // Print the simplified result
        System.out.println(resultNum + "/" + resultDen);
    }
}

public class add_fraction1 {
    public static void main(String[] args) {
        add_fraction1 sol = new add_fraction1();
        sol.addFractions(1, 3, 1, 6); 
    }

  
}
