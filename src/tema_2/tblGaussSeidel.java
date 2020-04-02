/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jtyhr
 */
public class tblGaussSeidel extends AbstractTableModel {
    private String[] columnas = {"I", "X1", "X2", "X3", "E-X1","E-X2", "E-X3"};
    private ArrayList <csGaussS> lista = null;
    
  
   public  tblGaussSeidel(ArrayList<csGaussS> resultados) {
                this.lista=resultados;

    }
   

  
    @Override
    public int getRowCount() {
                return this.lista.size();

    }

    @Override
    public int getColumnCount() {
                return this.columnas.length;

    }

    @Override
    public Object getValueAt(int i, int columna) {
        csGaussS fila = this.lista.get(i);
        switch(columna){
            case 0: return fila.getIteraciones();
            case 1: return fila.getX1();
            case 2: return fila.getX2();
            case 3: return fila.getX3();
            case 4: return fila.getEx1();
            case 5: return fila.getEx2();
            case 6: return fila.getEx3();
        }
        return null;
    }
     public boolean isCellEditable(int i, int i1) {
        return true;
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
