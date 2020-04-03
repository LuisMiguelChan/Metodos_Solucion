package tema_2;

import java.util.ArrayList;

public class Metodoo{
    public ArrayList<csFijo> Metodoo(double xo, double errorDeseado, int iteraciones)
    	{ 
        double x = this.funcion(xo);
        double errorCalculado=1;
        
        ArrayList<csFijo> lista;
        int i = 1; 
        lista = new ArrayList<csFijo>();
        
        while (i <= iteraciones && errorCalculado > errorDeseado) {
           
            csFijo fila = new csFijo();
            fila.setIteracion(i);
            fila.setXi(xo); 
            fila.setGx(this.funcion(fila.getXi()));
            
            xo = fila.getGx();         
            if (i > 1) 
            	{
         errorCalculado = Math.abs((this.funcion(fila.getXi()) - fila.getXi()) / this.funcion(fila.getXi()));
                fila.setError(errorCalculado);
            } 
             else 
            		{
                fila.setError(errorCalculado);
            }
            lista.add(fila);
            i++;
        }
         return lista;   
          }
   
    private double funcion(double x)
    	{
        return Math.pow(2.7182818284590452353602874713527,-x);
    }
}