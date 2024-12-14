import java.util.ArrayList;

public class MyStack2 implements Cloneable {

  private ArrayList<Object> list = new ArrayList<>();

  public boolean isEmpty() {
    return this.list.isEmpty();
  }

  public int getSize() {
    return this.list.size();
  }

  public Object peek() {
    if (isEmpty()) return null;

    return this.list.get(getSize() - 1);
  }

  public Object pop() {
    if (isEmpty()) return null;

    return this.list.remove(getSize() - 1);
  }

  public void push(Object o) {
    this.list.add(o);
  }

  @Override
  protected MyStack2 clone() {
    MyStack2 clonedStack = new MyStack2();

    clonedStack.list = new ArrayList<>(this.list);

    return clonedStack;
  }
}
