import java.util.Scanner;

public class CurrencyConverterWithEnding {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();
        int digit = yuan % 10;
        int lastTwoDigits = yuan % 100;
        String yuanEnding;
        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            yuanEnding = "китайских юаней";
        } else if (digit == 1) {
            yuanEnding = "китайский юань";
        } else if (digit >= 2 && digit <= 4) {
            yuanEnding = "китайских юаня";
        } else {
            yuanEnding = "китайских юаней";
        }
        double roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);
        System.out.printf("%s %s в российских рублях (в пользу покупателя): %.0f%n", yuan, yuanEnding, roubles);
        scanner.close();
    }
}

