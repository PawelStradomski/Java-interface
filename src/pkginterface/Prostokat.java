
package pkginterface;
/**
 * 
 * @author pawelstradomski
 */

public class Prostokat implements FiguraGeometryczna
{
    int a;
    int b;
    Prostokat(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Pole() {
        return a*b;
        
    }

    @Override
    public double Obwod() {
        return 2*(a+b);
        
    }
    
}
