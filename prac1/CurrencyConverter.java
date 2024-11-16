import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = scanner.nextInt();
        double roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);
        System.out.printf("Сумма в российских рублях (в пользу покупателя): %.0f%n", roubles);
        scanner.close();
    }
}
