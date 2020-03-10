package tema_2;

public class csBiseccion {
    
   private int iteracion;
   private double xi,xs,xr,fxi,fxr,producto,error;

    @Override
    public String toString() {
        System.out.println("fxi: "+ fxi + " fxr: " + fxr + "  Producto: " + producto + "  Iteraciones: " + iteracion + " xi: " + xi + "  xs: " + xs + "  xr: " + xr + "  Error: " + error + "\n");        
        
        return super.toString(); //To change body of generated methods, choose Tools | Templates.                
    }

    public int getIteracion() {
        return iteracion;
    }

    public void setIteracion(int iteracion) {
        this.iteracion = iteracion;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getXs() {
        return xs;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public double getXr() {
        return xr;
    }

    public void setXr(double xr) {
        this.xr = xr;
    }

    public double getFxi() {
        return fxi;
    }

    public void setFxi(double fxi) {
        this.fxi = fxi;
    }

    public double getFxr() {
        return fxr;
    }

    public void setFxr(double fxr) {
        this.fxr = fxr;
    }

    public double getProducto() {
        return producto;
    }

    public void setProducto(double producto) {
        this.producto = producto;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
    
}
