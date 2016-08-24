import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[32];
        secureRandom.nextBytes(randomBytes);
        StringBuilder sb = new StringBuilder();
        for (byte b : randomBytes) {
            sb.append(Byte.toString(b));
        }
        System.out.println(sb.toString());
    }
}
