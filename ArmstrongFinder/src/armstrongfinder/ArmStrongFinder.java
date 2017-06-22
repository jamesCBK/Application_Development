/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package armstrongfinder;

/**
 *
 * @author HP
 */
public class ArmStrongFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int firstnum=0,r=0;
System.out.println("thew list of armstrong numbers");
for(int i=100;i<1000;i++)
{


    r= i;
    int m=0,b=0;
    while(r>0)
    {
            firstnum = r%10;        
            b = firstnum * firstnum * firstnum;
        
            m = b+m;

            r =r/10;
    }
if(m==i)
{
  System.out.println(" "+i);
}
//}
        // TODO code application logic here
    }
    }
}
