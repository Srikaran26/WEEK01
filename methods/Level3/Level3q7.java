import java.util.HashSet;
import java.util.Set;
public class Level3q7 {
    public static int generateOTP() {
        return (int) (Math.random() * (999999 - 100000 + 1)) + 100000;
    }
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        boolean areUnique = areOTPsUnique(otps);
        System.out.println("\nAre all OTPs unique? " + areUnique);
    }
}
