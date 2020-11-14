import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[ ] seats = {1,2,3,4,5,6,7,8,9,0,11,12,13,14,15};

    String[] name = new String [15];

    Scanner Scanner = new Scanner
      (System.in);
    for (int i = 0; i < 15; i++){

      Scanner Scan = new Scanner
        (System.in);
      System.out.print("What is your name?");
       name [i] = Scanner.next();
        System.out.println(name[i] + " You will sit in seat " + seats[i]);
    }
    int i = 0;
    while (i <15){
      System.out.println(name[i] + "you will sit in " + seats [i]);
      i++;}
  }
}