public class Pizza {
    public static void main(String[] args) {
        final int CALORIES_PER_SQUARE_CM = 40;
        final int DIAMETER_24 = 24;
        final int DIAMETER_28 = 28;
        int totalCalories24 = (int) (Math.pow(DIAMETER_24 / 2, 2) * Math.PI * CALORIES_PER_SQUARE_CM);
        int totalCalories28 = (int) (Math.pow(DIAMETER_28 / 2, 2) * Math.PI * CALORIES_PER_SQUARE_CM);
        int excessCalories = totalCalories28 - totalCalories24;
        System.out.println("Excess calories: " + excessCalories);
    }
}
