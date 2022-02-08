
package pkginterface;
/**
 * 
 * @author pawelstradomski
 */

public class Kwadrat implements FiguraGeometryczna
{
    int a;
    Kwadrat(int a)
    {
        this.a=a;
    }

    @Override
    public double Pole() {
        return a*a;
        
    }

    @Override
    public double Obwod() {
        return 4*a;
        
    }
    
    
}
