import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    MyStack1 stack = new MyStack1();

    System.out.println("Введите 5 строк:");
    for (int i = 0; i < 5; i++) stack.push(input.nextLine());

    System.out.println("Строки в обратном порядке:");
    while (!stack.isEmpty()) System.out.println(stack.pop());
    input.close();
  }
}
