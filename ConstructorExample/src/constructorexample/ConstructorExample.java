/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package constructorexample;
import java.util.*;
/**
 *
 * @author HP
 */
//constructor is the method name with the same name as class name.
  
public class ConstructorExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Map<Integer, List<Object>> mapp = new HashMap<Integer, List<Object>>();
    System.out.println("enter 0 to continue 1 to exit" );
      int option=1;
      while(option==1)
      {
        System.out.println("press 1 to add press 2 search");
        Scanner s1 = new Scanner(System.in);
        int c = s1.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("enter the regno, mark1, mark2, name");
                     int regno=0;
                     int mark1;
                     int mark2;
                     String name;
                      System.out.println("enter the name");
                     regno = s1.nextInt();
                     mark1 = s1.nextInt();
                     mark2 = s1.nextInt();
                     name = s1.next();
                     mapp.put(regno, new ArrayList<Object>(Arrays.asList(regno,mark1,mark2,name)));
                     break;
            case 2:
                   System.out.println("enter the key value");
                int findregno = s1.nextInt();
                  System.out.println(mapp.get(findregno));
                   break;
            default: System.out.println("incorrect choice");
        }
        System.out.println("enter 1 to continue 0 to exit");
      option= s1.nextInt();
      }     // TODO code application logic here


}
}