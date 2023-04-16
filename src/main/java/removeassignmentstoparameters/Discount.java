package removeassignmentstoparameters;

public class Discount {
    // In kotlin, there is no way to reassign value to parameter. In this case, java is used.
    public int discount(int inputVal, int quantity, int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) {
            inputVal -= 2;
        }
        if (quantity > 100) {
            inputVal -= 1;
        }
        if (yearToDate > 10000) {
            inputVal -= 4;
        }
        return inputVal;
    }
}
