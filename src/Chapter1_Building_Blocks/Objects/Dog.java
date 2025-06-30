package Chapter1_Building_Blocks.Objects;

/**
 *
 * @author hoandk
 */
public class Dog {
  private String name = "Cici";
  public Dog() {
    name = "Eny";
    System.out.println("Inside the consuctor...");
  }
  {
    System.out.println("Inside the initializer block...");
  }
  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println("Dog's name is: " + dog.name);
  }
}
