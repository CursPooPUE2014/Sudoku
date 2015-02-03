package grafics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Sudoku {

	private JFrame frame;
	private JTable tableSudoku;
	private JTextField textField;
	
	private final static int TAMANY_QUADRICULA=9;  //9X9

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tableSudoku = new JTable();
		//tableSudoku.setModel(new DefaultTableModel(generarTaulaSudoku(), TAMANY_QUADRICULA));
		
		tableSudoku.setModel(new ModeloTablaSudoku());
		//formatejarColumnes();
		frame.getContentPane().add(tableSudoku, BorderLayout.CENTER);
		
		
	}
	private void formatejarColumnes(){
		
		for (int i = 0; i < TAMANY_QUADRICULA; i++) {
		    tableSudoku.getColumnModel().getColumn(i).setWidth(5);
		}
	}

}
