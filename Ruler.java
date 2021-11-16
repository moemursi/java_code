public class Ruler {
  public static void main(String[] args) {
    //expected output
    // *  1 
    //*  1 2 1 
    //*  1 2 1 3 1 2 1 
    //*  1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
    //*  1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
    String ruler1,ruler2,ruler3,ruler4,ruler5;
    ruler1 = " 1 ";
    ruler2 = ruler1 + "2" + ruler1;
    ruler3 = ruler2 + "3" + ruler2;
    ruler4 = ruler3 + "4" + ruler3;
    ruler5 = ruler4 + "5" + ruler4;
    
    System.out.println(ruler1);
    System.out.println(ruler2);
    System.out.println(ruler3);
    System.out.println(ruler4);
    System.out.println(ruler5);

    
  }
  
}
