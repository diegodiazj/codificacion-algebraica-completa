
package Algebraica;

public class pareja {
    public double tramo[] = new double [2];
    private char caracter;
    public double proba;
    public String codigo="";
    
    
    public pareja (char caracter, double proba){
        this.caracter= caracter;
        this.proba = proba;
        
        
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void setProba(double proba) {
        this.proba = proba;
    }

    @Override
    public String toString() {
        return "pareja{" + "caracter=" + caracter + ", proba=" + proba + " vector = " + tramo[0] + " " + tramo[1] + '}';
    }

    public char getCaracter() {
        return caracter;
    }

    public double getProba() {
        return proba;
    }
   

    /*@Override
    public int compareTo(pareja t) {
        double a= Double.parseDouble(this.proba);
        double b= Double.parseDouble(t.proba);
        if( a > b) return+1;
        if(a < b) return-1;
        return 0;
    }
    */
}
