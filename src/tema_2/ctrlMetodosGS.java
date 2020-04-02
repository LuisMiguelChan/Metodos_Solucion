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
public class ctrlMetodosGS {
    
    public tblGaussSeidel seidel(double errorDeseado){
        ArrayList<csGaussS>lista=null;
        tblGaussSeidel tabla=null;
        
        int iteracion=1;
        double errorCalcu[]=new double[4];
        double valoresAnt[]=new double[3];
        double a,b,c;
        double e1, e2,e3;
        
        double valorsAnt[]=new double [3];
        for(int x=0;x<valorsAnt.length;x++){
            valorsAnt[x]=0;
        }
        double resultado[]=new double[3];
        //primer calculo en el sistema de ecua.
        resultado=formula(0,0,0);
        
        //calculo de error
        errorCalcu=errorCalculador(valorsAnt,resultado);
        
        
        e1=errorCalcu[0];
        e2=errorCalcu[1];
        e3=errorCalcu[2];
        
       
        double errorM=errorCalcu[3];
        lista=new ArrayList<csGaussS>();
        
        while(errorM>=errorDeseado){
            a=resultado[0];
            b=resultado[1];
            c=resultado[2];
            
            csGaussS fila=new csGaussS();
            fila.setIteraciones(iteracion);
            fila.setX1(a);
            fila.setX2(b);
            fila.setX3(c);
            fila.setEx1(e1);
            fila.setEx2(e2);
            fila.setEx3(e3);
            
            
            valorsAnt=resultado;
            resultado=formula(a,b,c);
            
            //calculo de error
             errorCalcu=errorCalculador(valorsAnt,resultado);
             e1=errorCalcu[0];
             e2=errorCalcu[1];
             e3=errorCalcu[2];
             errorM=errorCalcu[3];
             
             
            lista.add(fila);
            tabla=new tblGaussSeidel(lista);
            iteracion++;
            
        }
        
        csGaussS fila=new csGaussS();
            a=resultado[0];
            b=resultado[1];
            c=resultado[2];
        fila.setIteraciones(iteracion);
            fila.setX1(a);
            fila.setX2(b);
            fila.setX3(c);
            fila.setEx1(e1);
            fila.setEx2(e2);
            fila.setEx3(e3);
        lista.add(fila);
        tabla=new tblGaussSeidel(lista);
        
        return tabla;
    }
    
    public double[] formula(double x1, double x2, double x3){
        
        double resultado[]=new double[3];
        
        resultado[0]=(2-3*x2+5*x3)/7;
        resultado[1]=(8-4*resultado[0]+3*x3)/5;
        resultado[2]=(5-6*resultado[0]+2*resultado[1])/-9;
        
        return resultado;
    }
    public double[] errorCalculador(double x[], double y[]){
        //double error=0;
        double resError[]=new double[4];
        for(int h=0;h<3;h++){
            
            resError[h]=((y[h]-x[h])/y[h])*100;
            
            if(resError[h]<0){
                resError[h]=(resError[h]*-1)*100;
            }
            
        }
        //buscando el mayor
       double mayor = 0;
       for(int t=0;t<3;t++){
            if(t==0){
             mayor=resError[t];
            }
            if(resError[t]>=mayor){
                mayor=resError[t];
            }  
                
        }
       
        resError[3]=mayor;
        return resError;
    }
}
