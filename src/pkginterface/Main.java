
package pkginterface;
/**
 * 
 * @author pawelstradomski
 */

public class Main {public static void main(String[] args) {
        
        Kwadrat kwadrat = new Kwadrat(2);
        Prostokat prostokat = new Prostokat(5,6);
            System.out.println(kwadrat.Pole());
            System.out.println(prostokat.Pole());
            
            FiguraGeometryczna[] figury = {kwadrat, prostokat};
            for(int i=0; i<figury.length; i++)
            {
                System.out.println(figury[i].Obwod());
            }
               
    
    }
    
}
