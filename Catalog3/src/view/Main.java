package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.CatalogLexer;
import model.CatalogParser;
import model.Visitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main extends JFrame {

    private static final long serialVersionUID = -490702507079911903L;
    private JPanel contentPane;
    private JPanel panel;
    private JTextArea txtEntrada;
    private JMenuBar menuBar;
    private JMenu mnFile;
    private JMenuItem mntmOpen;
    private JMenuItem mntmSave;
    private JMenuItem mntmClose;
    private JMenuItem mntmNew;
    private JMenu mnRun;
    private JMenuItem mntmEjecutarCodigo;
    private JMenu mnAyuda;
    private JMenuItem mntmAcercaDe;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane_2;
    private JPanel panel_1;
    private JTextArea txtSalida;
    private JMenu mnOpciones;
    private JMenuItem mntmBorrarConsola;
    private JMenuItem mntmGuardarComo;
    private static File actualFile = null;

    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    Main frame = new Main();
		    frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    public Main() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/img/multimedia-5.png")));
    	setTitle("CATALOG2");
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
			txtEntrada.setLineWrap(true);
			txtEntrada.setFont(new Font("Consolas", Font.PLAIN, 13));
		}
		return txtEntrada;
	}
	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnRun());
			menuBar.add(getMnOpciones());
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
			mnFile.add(getMntmGuardarComo());
			mnFile.add(getMntmClose());
		}
		return mnFile;
	}
	public JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Abrir");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    guardarCambios(e);
				    JFileChooser fileChooser = new JFileChooser();
				    FileNameExtensionFilter filter = new FileNameExtensionFilter("CATALOG Files", "ctl", ".ctl");
				    fileChooser.setFileFilter(filter);
				    fileChooser.setAcceptAllFileFilterUsed(false);
				    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				    int result = fileChooser.showOpenDialog(Main.this);
				    if (result == JFileChooser.APPROVE_OPTION) {
				        File selectedFile = fileChooser.getSelectedFile();
				        BufferedReader buffReader = null;
				        try {
				            FileReader fileReader = new FileReader(selectedFile);
				            buffReader = new BufferedReader(fileReader);
				            txtEntrada.read(buffReader, null);
				            buffReader.close();
				          }  catch (Exception e1) {
				            e1.printStackTrace();
				          } 
				    }
				    
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	public JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Guardar");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    guardarArchivo(e);
				}
			});
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	public JMenuItem getMntmClose() {
		if (mntmClose == null) {
			mntmClose = new JMenuItem("Cerrar");
			mntmClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    guardarCambios(e);
				    dispose();
				}
			});
		}
		return mntmClose;
	}
	public JMenuItem getMntmNew() {
		if (mntmNew == null) {
			mntmNew = new JMenuItem("Nuevo");
			mntmNew.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    guardarCambios(e);				    
				}
			});
			mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
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
			mntmEjecutarCodigo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
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
			mntmAcercaDe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    
				}
			});
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
			panel_1.add(getTxtSalida(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	public JTextArea getTxtSalida() {
		if (txtSalida == null) {
		    txtSalida = new JTextArea();
		    txtSalida.setLineWrap(true);
		    txtSalida.setEditable(false);
		    txtSalida.setFont(new Font("Consolas", Font.PLAIN, 13));
		    txtSalida.setForeground(Color.WHITE);
		    txtSalida.setBackground(Color.BLACK);
			PrintStream printStream = new PrintStream(new CustomOutputStream(txtSalida));
			System.setOut(printStream);
			System.setErr(printStream);
		}
		return txtSalida;
	}
	public JMenu getMnOpciones() {
		if (mnOpciones == null) {
			mnOpciones = new JMenu("Opciones");
			mnOpciones.add(getMntmBorrarConsola());
		}
		return mnOpciones;
	}
	public JMenuItem getMntmBorrarConsola() {
		if (mntmBorrarConsola == null) {
			mntmBorrarConsola = new JMenuItem("Borrar consola");
			mntmBorrarConsola.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				    txtSalida.setText("");
				}
			});
			mntmBorrarConsola.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		}
		return mntmBorrarConsola;
	}
	public JMenuItem getMntmGuardarComo() {
		if (mntmGuardarComo == null) {
			mntmGuardarComo = new JMenuItem("Guardar Como");
			mntmGuardarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
			mntmGuardarComo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    guardarArchivo(e);
				}
			});
		}
		return mntmGuardarComo;
	}
	
	private void guardarCambios(ActionEvent e){
	    if(actualFile != null || !txtEntrada.getText().trim().isEmpty()){
		int dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?", "Aviso", JOptionPane.YES_NO_OPTION);
	    	if(dialogResult == JOptionPane.YES_OPTION){
	    	    guardarArchivo(e);
	    	}
	    	actualFile = null;
	    	txtEntrada.setText("");	    
	    }
	}
	
	private void guardarComo(File f){
	    int dialogResult = JOptionPane.showConfirmDialog(null, "¿Desea sobreescribir el archivo "+f.getName()+"?", "Aviso", JOptionPane.YES_NO_OPTION);
	    if(dialogResult == JOptionPane.YES_OPTION){
		sobreEscribir(f);
	    }
	}
	
	private void guardarArchivo(ActionEvent e){
	    if(actualFile != null && e.getSource()==mntmSave)
		sobreEscribir(actualFile);
	    else{
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int retrival = fileChooser.showSaveDialog(Main.this);
		if (retrival == JFileChooser.APPROVE_OPTION) {
		    File selected = fileChooser.getSelectedFile();	
		    if (!selected.getName().endsWith(".ctl"))
			selected = new File (selected.getAbsolutePath().concat(".ctl"));
		    if(selected.exists() && selected.canWrite()){
			guardarComo(selected);
		    }else{
			sobreEscribir(selected);
		    }
            	}
    	    }
	}
	
	private void sobreEscribir(File f){
	    if(actualFile == null)
		actualFile = f;
	    FileWriter fw = null;
	    try {
		fw = new FileWriter(f);
		fw.write(txtEntrada.getText());
		fw.close();
	    } catch (IOException e) {
		e.printStackTrace();
	    }
	}
}
