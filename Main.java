class Main {
  public static void main(String[] args) {
    System.out.println("Olá Mundo!");
    int myNum = 8;
    float myFloatNum = 6.99f;
    char myLetter = 'M';
    boolean myBool = false;
    String myText = "boa";
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText); 
    // parte dois do código
    System.out.println(myText + myBool);
    int x = 8;
    float y = x;
    System.out.println(x);
    System.out.println(y);
    double myDouble = 5.99d;
    int myInt = (int) myDouble; // Manual casting: double to int
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}