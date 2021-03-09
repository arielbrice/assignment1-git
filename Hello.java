import java.util.*;
public class Hello{

//Comment to break the commit
    public static void main(String args[])
    {
        Random rand = new Random();
        int num = rand.nextInt();
        if(num % 2 == 0)
         System.out.println("The Number, Hello World");
        if(num % 2 != 0)
            System.out.println("Other Number, Hello World");
    }
}