public class Operations {
  public static void main(String[] args) {
//  *   1234 + 99 = 1333
int a = 1234;
int b = 99;

//  *  1234 * 99 = 122166
System.out.println("product  is : " + (a + b));

//  *  1234 / 99 = 12
System.out.println("Division is : " + (a / b));

//  *  1234 % 99 = 46
System.out.println("Remainder is : " + (a % b));

//  *  1234 = 12 * 99 + 46
System.out.println("product then add" + (a*b+46));

//  * 
//  *  % java IntOps 10 -3
int c = 10;
int d = 3;

//  *  10 + -3 = 7
System.out.println("add to -ve number " + (c+(-d)));

//  *  10 * -3 = -30
System.out.println(c*(-d));

//  *  10 / -3 = -3
System.out.println(c/(-d));

//  *  10 % -3 = 1
System.out.println(10%(-3));

//  *  10 = -3 * -3 + 1
// System.out.println(10=(-3*-3+1));

  }
  
}
