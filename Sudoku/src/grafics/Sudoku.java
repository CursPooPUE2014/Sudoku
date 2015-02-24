package grafics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Sudoku {

	private JFrame frame;
	private JTable tableSudoku;
	private JTextField textField;
	
	
	private static int TAMANY_QUADRICULA=9;  //9X9

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku window = new Sudoku();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sudoku( int tamanyQuadricula) {
		
		TAMANY_QUADRICULA=tamanyQuadricula;
		initialize();
		
		//afegirValorsInicials();
		//generarTaulaSudoku();
	}
	public Sudoku() {
		
		initialize();
		//afegirValorsInicials();
		//generarTaulaSudoku();
	}

	private void afegirValorsInicials() {
		//tableSudoku.setValueAt(aValue, row, column);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				frame.setVisible(false);
				//contexto.setVisible(true);
			}
		});
		frame.setBounds(400, 500, 450, 300);
		
		
		tableSudoku = new JTable();
		//tableSudoku.setModel(new DefaultTableModel(generarTaulaSudoku(), TAMANY_QUADRICULA));
		
		ModeloTablaSudoku tms=new ModeloTablaSudoku();
		GenerarSudoku sudokuInicial = new GenerarSudoku(TAMANY_QUADRICULA);
		tms.setQuadricula(sudokuInicial.getCuadricula());
		
		tableSudoku.setModel(tms);
		
		
		
		//formatejarColumnes();
		frame.getContentPane().add(tableSudoku, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
	
	private void formatejarColumnes(){
		
		for (int i = 0; i < TAMANY_QUADRICULA; i++) {
		    tableSudoku.getColumnModel().getColumn(i).setWidth(5);
		}
	}
	
}
