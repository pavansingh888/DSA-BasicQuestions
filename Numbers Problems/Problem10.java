public class Problem10 {

    // Function to calculate the sum of an Arithmetic Progression (AP)
    public static float sumofAp(float a, float d, int n) {
        float sum = (n / 2.0f) * (2.0f * a + (n - 1) * d);
        return sum;
    }

    public static void main(String[] args) {
        float a = 1.5f;
        float d = 3.0f;
        int n = 5;

        System.out.println("Sum of Given AP Series: " + sumofAp(a, d, n));
    }
}

