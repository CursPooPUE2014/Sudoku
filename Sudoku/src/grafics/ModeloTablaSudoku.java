package grafics;


import java.util.Arrays;
import java.util.Random;

import javax.swing.table.AbstractTableModel;

import sun.rmi.runtime.Log;

import java.util.logging.Logger;


public class ModeloTablaSudoku extends AbstractTableModel{

	private static final boolean DEBUG = false;
	
	private int[][] cuadricula;
		
	
	public ModeloTablaSudoku(){
		
	}
	public void setQuadricula(int[][] cuadri){
		this.cuadricula=cuadri;
	}

	@Override
	public int getRowCount() {
		
		return cuadricula.length;
	}

	@Override
	public int getColumnCount() {
		
		return cuadricula[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return cuadricula[rowIndex][columnIndex];
	}
	
}
