//Hello, World!

//some added text from my pull request!
//Add something here

pubic class Women {
String name;
int age;
double weight;

public void Women() {
  age = 0;
  name = "harold";
  weight = 100.0;
}

public void Women(String name, int age, double weight) {
  this.name = name;
  this.age = age;
  this.weight = weight;
}

public String getName() {
  return name;
}
}

public class Main {
  public static void main(String args[]) {
  Women james = new Women("James", 10, 100.2);
}
}
