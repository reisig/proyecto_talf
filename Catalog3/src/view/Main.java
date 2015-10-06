package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

import model.CatalogLexer;
import model.CatalogParser;
import model.Visitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.Color;
import java.io.PrintStream;

public class Main extends JFrame {

    private JPanel contentPane;
    private JPanel panel;
    private JTextArea txtEntrada;
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenuItem mntmOpen;
    private JMenuItem mntmSave;
    private JMenuItem mntmSaveAs;
    private JMenuItem mntmClose;
    private JMenuItem mntmNew;
    private JMenu mnRun;
    private JMenuItem mntmEjecutarCodigo;
    private JMenu mnAyuda;
    private JMenuItem mntmAcercaDe;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane_2;
    private JPanel panel_1;
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Main frame = new Main();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the frame.
     */
    public Main() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 600);
	setJMenuBar(getMenuBar_1());
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	GridBagLayout gbl_contentPane = new GridBagLayout();
	gbl_contentPane.columnWidths = new int[]{400, 400, 0};
	gbl_contentPane.rowHeights = new int[]{0, 0};
	gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
	gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
	contentPane.setLayout(gbl_contentPane);
	GridBagConstraints gbc_scrollPane = new GridBagConstraints();
	gbc_scrollPane.fill = GridBagConstraints.BOTH;
	gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
	gbc_scrollPane.gridx = 0;
	gbc_scrollPane.gridy = 0;
	contentPane.add(getScrollPane(), gbc_scrollPane);
	GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
	gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
	gbc_scrollPane_2.gridx = 1;
	gbc_scrollPane_2.gridy = 0;
	contentPane.add(getScrollPane_2(), gbc_scrollPane_2);
    }
	public JPanel getPanel_2() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTxtEntrada(), BorderLayout.CENTER);
		}
		return panel;
	}
	public JTextArea getTxtEntrada() {
		if (txtEntrada == null) {
			txtEntrada = new JTextArea();
			txtEntrada.setFont(new Font("Consolas", Font.PLAIN, 13));
		}
		return txtEntrada;
	}
	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnRun());
			menuBar.add(getMenu_1());
		}
		return menuBar;
	}
	public JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("Archivo");
			mnFile.add(getMntmNew());
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmSaveAs());
			mnFile.add(getMntmClose());
		}
		return mnFile;
	}
	public JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Abrir");
		}
		return mntmOpen;
	}
	public JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Guardar");
		}
		return mntmSave;
	}
	public JMenuItem getMntmSaveAs() {
		if (mntmSaveAs == null) {
			mntmSaveAs = new JMenuItem("Guardar Como");
		}
		return mntmSaveAs;
	}
	public JMenuItem getMntmClose() {
		if (mntmClose == null) {
			mntmClose = new JMenuItem("Cerrar");
		}
		return mntmClose;
	}
	public JMenuItem getMntmNew() {
		if (mntmNew == null) {
			mntmNew = new JMenuItem("Nuevo");
		}
		return mntmNew;
	}
	public JMenu getMnRun() {
		if (mnRun == null) {
			mnRun = new JMenu("Ejecutar");
			mnRun.add(getMntmEjecutarCodigo());
		}
		return mnRun;
	}
	public JMenuItem getMntmEjecutarCodigo() {
		if (mntmEjecutarCodigo == null) {
			mntmEjecutarCodigo = new JMenuItem("Ejecutar codigo");
			mntmEjecutarCodigo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    if(!txtEntrada.getText().isEmpty()){
					
					    //Se le agrega una linea extra para una ejecucion correcta (requerimientos de la gramatica)
					    if(!txtEntrada.getText().endsWith("\n"))
					    	txtEntrada.append("\n");
					    try{
					         String line = txtEntrada.getText();
					         ANTLRInputStream input = new ANTLRInputStream(line);
					         CatalogLexer lexer = new CatalogLexer(input);
					         CommonTokenStream tokens = new CommonTokenStream(lexer);
					         CatalogParser parser = new CatalogParser(tokens);
					         ParseTree tree = parser.parse();  
					         Visitor visitor = new Visitor();
					         visitor.visit(tree);
					    }
	        			catch(Exception e){
	        			     e.printStackTrace();
	        			}
						
					}else{
						
						JOptionPane.showMessageDialog(null,"Ingrese parametros para ejecutar","Error en la entrada",JOptionPane.ERROR_MESSAGE);
					}
				}
				    
			});
		}
		return mntmEjecutarCodigo;
	}
	public JMenu getMenu_1() {
		if (mnAyuda == null) {
			mnAyuda = new JMenu("Ayuda");
			mnAyuda.add(getMntmAcercaDe());
		}
		return mnAyuda;
	}
	public JMenuItem getMntmAcercaDe() {
		if (mntmAcercaDe == null) {
			mntmAcercaDe = new JMenuItem("Acerca de");
		}
		return mntmAcercaDe;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel_2());
		}
		return scrollPane;
	}
	public JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setViewportView(getPanel_1());
		}
		return scrollPane_2;
	}
	public JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getTextArea(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
		    textArea = new JTextArea();
		    textArea.setEditable(false);
		    textArea.setFont(new Font("Consolas", Font.PLAIN, 13));
		    textArea.setForeground(Color.WHITE);
		    textArea.setBackground(Color.BLACK);
			PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
			System.setOut(printStream);
			System.setErr(printStream);
		}
		return textArea;
	}
}
