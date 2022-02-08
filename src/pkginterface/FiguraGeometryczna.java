
package pkginterface;
/**
 * 
 * @author pawelstradomski
 */

public interface FiguraGeometryczna {
    public double Pole();
    
    public double Obwod();
    
    //interface ma tylko metody abstrakcyjne
    //w interface zmienne int, double sa juz final
    //klasy moga implementowac wiecej niz 1 interface
}
