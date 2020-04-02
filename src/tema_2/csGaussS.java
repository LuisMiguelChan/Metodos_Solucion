/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_2;

/**
 *
 * @author jtyhr
 */
public class csGaussS {
    int iteraciones;
    double X1,X2,X3, Ex1,Ex2,Ex3;

    public csGaussS(int iteraciones, double X1, double X2, double X3, double Ex1, double Ex2, double Ex3) {
        this.iteraciones = iteraciones;
        this.X1 = X1;
        this.X2 = X2;
        this.X3 = X3;
        this.Ex1 = Ex1;
        this.Ex2 = Ex2;
        this.Ex3 = Ex3;
    }

    public double getEx1() {
        return Ex1;
    }

    public void setEx1(double Ex1) {
        this.Ex1 = Ex1;
    }

    public double getEx2() {
        return Ex2;
    }

    public void setEx2(double Ex2) {
        this.Ex2 = Ex2;
    }

    public double getEx3() {
        return Ex3;
    }

    public void setEx3(double Ex3) {
        this.Ex3 = Ex3;
    }

   
    
    public csGaussS(){
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public double getX1() {
        return X1;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public double getX2() {
        return X2;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public double getX3() {
        return X3;
    }

    public void setX3(double X3) {
        this.X3 = X3;
    }    
}
