import java.util.*;
/**
 * 
 *
 *
 *
 */
public class nwiggy
{
    static String lastupdate="26/8/2022";
    static int x=0;
    static int[] arr1= new int[x];
    static String[] sc= new String[x];
    static int[] rate= new int [x];
    static Scanner in = new Scanner(System.in);
    static  void logo()
    {
        
            System.out .println("$$\\   $$\\               $$\\                               ");
            System.out .println("$$$\\  $$ |              \\__|                              ");
            System.out .println("$$$$\\ $$ |$$\\  $$\\  $$\\ $$\\  $$$$$$\\   $$$$$$\\  $$\\   $$\\ ");
            System.out .println("$$ $$\\$$ |$$ | $$ | $$ |$$ |$$  __$$\\ $$  __$$\\ $$ |  $$ |");
            System.out .println("$$ \\$$$$ |$$ | $$ | $$ |$$ |$$ /  $$ |$$ /  $$ |$$ |  $$ |");
            System.out .println("$$ |\\$$$ |$$ | $$ | $$ |$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |");
            System.out .println("$$ | \\$$ |\\$$$$$\\$$$$  |$$ |\\$$$$$$$ |\\$$$$$$$ |\\$$$$$$$ |");
            System.out .println("\\__|  \\__| \\_____\\____/ \\__| \\____$$ | \\____$$ | \\____$$ |");
            System.out .println("                            $$\\   $$ |$$\\   $$ |$$\\   $$ |");
            System.out .println("                            \\$$$$$$  |\\$$$$$$  |\\$$$$$$  |");
            System.out .println("                             \\______/  \\______/  \\______/ ");
            
        
    }
    static void line(int i)
    {
        for(int x=0;x<=i;x++)
        System.out.println();
    }

    static void infor()
    {
        line(5);
        System.out.println("                 Created by                   "); 
        System.out.println("              Anselm Mascarenhas              ");
        System.out.println("This project is a simple copy of swiggy in java");
        System.out.println("               Out only for beta               ");
        System.out.println("            LastUpdate"+lastupdate              );
        line (2);
        System.out.println("                   Welcome                      ");
        System.out .println("-----------------------------------------------");
    }
    static void cuisineSelect(){
        System.out.println("Select your cuisine");
        System.out.println("1.Chinese");
        System.out.println("2.North Indian");
        System.out.println("3.South Indian");
        System.out.println("4.Fast food");
        int x=in.nextInt();
        
        
    
    }
    public static void main ()
    {
        
        {
            logo();
            infor();
            System.out.println("Choose city:-");
            System.out.println("1.Mumbai");
            System.out.println("2.Delhi");
            System.out.println("3.Kolkata");
            System.out.println("4.Hyderabad");
            System.out.println("5.Jaipur");
            int x=in.nextInt();
            if (x==1)
            
            
            
            
        }
        
        
        
    }
    
}
