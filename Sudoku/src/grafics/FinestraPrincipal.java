package grafics;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JButton;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;

public class FinestraPrincipal extends JFrame {

	
	private JTable tableSudoku;
	private JTextField textField;
	private static JTextPane textPane;
	
	
	private final static int TAMANY_QUADRICULA=9;  //9X9

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FinestraPrincipal finestra = new FinestraPrincipal();
				finestra.setVisible(true);
				
			}
		});
	}
	
	public FinestraPrincipal(){
		
		setResizable(false);
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JComboBox list = new JComboBox();
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.getSelectedIndex()!=0){
					JOptionPane.showMessageDialog(null,
							"Esta acción no esta implementada, ¿desea implementarla?");

					list.setSelectedItem(0);		
				}
			}
		});
		list.setBounds(20,20,80,20);
		list.addItem("9");
		list.addItem("12");
		list.addItem("15");
		list.setSelectedItem(0);
		getContentPane().add(list);
		
		JButton btnComensar = new JButton("Comen\u00E7ar");
		btnComensar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//setVisible(false);
				Sudoku su = new Sudoku(Integer.parseInt(list.getSelectedItem().toString()));
			}
		});
		btnComensar.setBounds(20,129,80,20);
		getContentPane().add(btnComensar);
		
		textPane = new JTextPane();
		textPane.setBounds(128, 20, 306, 37);
		getContentPane().add(textPane);
		
		
	}
	public static void imprimirLog(String text){
		if (textPane!=null){
			textPane.setText(text);
		}
		
	}
}
