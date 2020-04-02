/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_2;

import java.util.ArrayList;

/**
 *
 * @author jtyhr
 */
public class ctrlMetodosJ {
    
    public tbllJacobi jacobi(double errorDeseado){
    ArrayList<csJacobi> lista =  null;
    tbllJacobi tabla=null;
    
    int itera=1;
    double errorCalculado=2;
    double valoresAnterior[]=new double[4];
    double v1,v2,v3,v4;

    for(int z=0;z<valoresAnterior.length;z++){
        valoresAnterior[z]=0;
    }
    
    //calculamos con la formula
    double recibo[]=new double[4];
    recibo=formula(0,0,0,0);
   
    
    
    //sacamos el error
    errorCalculado=errorCalc(valoresAnterior,recibo);
    
   lista=new ArrayList<csJacobi>();
   while(errorCalculado>errorDeseado){
       v1=recibo[0];
       v2=recibo[1];
       v3=recibo[2];
       v4=recibo[3];
       
       csJacobi fila=new csJacobi();
       fila.setIteraciones(itera);
       fila.setX1(v1);
       fila.setX2(v2);
       fila.setX3(v3);
       fila.setX4(v4);
       fila.setError(errorCalculado);

       
       valoresAnterior=recibo;//los valores recibidos como resultados ahora seran valores anteriores
       //realizamos otro calculo de valores en los sistemas de ecuaciones
       recibo=formula(v1,v2,v3,v4);
       //calculamos el error de nuevo
       errorCalculado=errorCalc(valoresAnterior,recibo);
       //System.out.println("Error calculado de nuevo "+errorCalculado);
       lista.add(fila);
       tabla=new tbllJacobi(lista);
       itera++;
   }



       return tabla;   

   

    }
    
    public double[] formula(double x1, double x2, double x3, double x4){
        
        double resultado[]=new double[4];
        
        resultado[0]=(6+x2-(2*x3))/10;
        resultado[1]=(25+x1+x3-(3*x4))/11;
        resultado[2]=(-11-(2*x1)+x2+x4)/10;
        resultado[3]=(15-(3*x2+x3))/8;
        
        return resultado;
    }
    public double errorCalc(double x[], double y[]){
        double error=0;
        double resError[]=new double[4];
        for(int h=0;h<x.length;h++){
            //System.out.println("Valor anterior"+x[h]);
            //System.out.println("Valor actual "+y[h]);
            resError[h]=(y[h]-x[h])/y[h];
            
            //el error siempre va a ser un valor absoluto
            if(resError[h]<0){
                resError[h]=resError[h]*-1;
            }
            //System.out.println("Resultado de busqueda error "+resError[h]);
        }
       double mayor = 0;
        for(int t=0;t<resError.length;t++){
            if(t==1){
             mayor=resError[t];
            }
            if(resError[t]>=mayor){
                mayor=resError[t];
            }  
        }
        error=mayor;
        
        return error;
    }
}
