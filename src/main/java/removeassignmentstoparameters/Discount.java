package removeassignmentstoparameters;

public class Discount {
    // In kotlin, there is no way to reassign value to parameter. In this case, java is used.
    public int discount(int inputVal, int quantity, int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) {
            result -= 2;
        }
        if (quantity > 100) {
            result -= 1;
        }
        if (yearToDate > 10000) {
            result -= 4;
        }
        return result;
    }
}
