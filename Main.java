import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner it=new Scanner(System.in);

    ArrayList <String> lastNames=new ArrayList <String>();

    lastNames.add("Appoline");
    lastNames.add("Bartleby");
    lastNames.add("Chandra");
    System.out.println(lastNames);
    lastNames.add(1,"Dumbledore");
    System.out.println(lastNames);
    System.out.println("Size of lastNames is "+lastNames.size());
    System.out.println("String removed: "+lastNames.remove(2));
    System.out.println(lastNames);
    System.out.println("Size of lastNames is "+lastNames.size());
    System.out.println("Removed String using set is "+lastNames.set(0, "Eanderson"));
    lastNames.clear();
    System.out.println(lastNames);
    System.out.println("Size of lastNames is "+lastNames.size());
    Integer one=new Integer(1);
    Double two=new Double(2.0);
    String three=new String("3");
    //lastNames.add(one);
    //lastNames.add(two);
    //lastNames.add(three);
    ArrayList demo=new ArrayList();
    demo.add(one);
    demo.add(two);
    demo.add(three);
    System.out.println(demo);


  }
}