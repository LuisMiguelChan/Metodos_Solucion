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
public class csJacobi {
    double error;
    int iteraciones;
    double X1, X2, X3,X4;

    public csJacobi(double error, int iteraciones, double X1, double X2, double X3, double X4) {
        this.error = error;
        this.iteraciones = iteraciones;
        this.X1 = X1;
        this.X2 = X2;
        this.X3 = X3;
        this.X4 = X4;
    }

    

    csJacobi() {
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
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

    public double getX4() {
        return X4;
    }

    public void setX4(double X4) {
        this.X4 = X4;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }
}
