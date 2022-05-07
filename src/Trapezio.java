
/**
 * <u> Trapezio </u>
 * 
 * <UL>
 * <LI>CalcolaArea
 * </UL>
 * 
 * @author <b> Emmanuel Casole </b>
 * @version 1.0
 */
public class Trapezio {

private double baseMag, baseMin, altezza;

/** 
 * 
 * @param baseMag in cm
 * @param baseMin in cm
 * @param altezza in cm
 */

public Trapezio(double baseMag, double baseMin, double altezza) {

this.baseMag = baseMag;
this.baseMin = baseMin;
this.altezza = altezza;
}

/**
 * 
 * Questo metodo ritorna il valore della Base Maggiore
 * 
 * @return
 * 
 */

public double getBaseMag() {
	return baseMag;
}

/**
 * 
 * Questo metodo assegna il valore della Base Maggiore
 * 
 * @param base
 * 
 */

public void setBaseMag(double baseMag) {
	this.baseMag = baseMag;
}

/**
 * 
 * Questo metodo ritorna il valore della Base Minore
 * 
 * @return
 * 
 */

public double getBaseMin() {
	return baseMin;
}

/**
 * 
 * Questo metodo assegna il valore della Base Minore
 * 
 * @param base
 * 
 */

public void setBaseMin(double baseMin) {
	this.baseMin = baseMin;
}

/**
 * 
 * Questo metodo ritorna il valore dell'Altezza
 * 
 * @return
 * 
 */


public double getAltezza() {
	return altezza;
}

/**
 * 
 * Questo metodo assegna il valore dell'Altezza
 * 
 * @param altezza
 * 
 */


public void setAltezza(double altezza) {
	this.altezza = altezza;
}



/**
 * Questo metodo calcola l'area del trapezio
 * 
 * @return area in cm^2
 * 
 */
public double area() {

return(baseMag + baseMin * altezza)/2;
}

public static void main(String[] args) {
	
	Trapezio t = new Trapezio(7,9,8);
	
	System.out.println("Area ="+ " "+t.area());
}


}
