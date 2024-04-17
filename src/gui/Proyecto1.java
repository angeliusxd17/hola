package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Proyecto1 extends JFrame {

    private JPanel contentPane;
    private JTextField txtMarcas;
    private JTextField txtPrecio;
    private JTextPane txtResultados;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Proyecto1 frame = new Proyecto1();
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
    public Proyecto1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Marcas ");
        lblNewLabel.setBounds(10, 11, 46, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Precio");
        lblNewLabel_1.setBounds(10, 36, 46, 14);
        contentPane.add(lblNewLabel_1);
        
     
        
        txtPrecio = new JTextField();
        txtPrecio.setBounds(82, 33, 86, 20);
        contentPane.add(txtPrecio);
        txtPrecio.setColumns(10);
        
        JButton btnProcesar = new JButton("Procesar");
        btnProcesar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos ingresados por el usuario
                String marca = txtMarcas.getText();
                double precio = Double.parseDouble(txtPrecio.getText());

                // Calcular la cantidad de obsequios de tablet
                int cantidadObsequio = precio < 10000 ? 1 : 2;

                // Mostrar resultados en el JTextPane
                txtResultados.setText("Marca: " + marca + "\n" + "Precio: S/. " + precio + "\n"
                        + "Cantidad de obsequios de tablet: " + cantidadObsequio);
            }
        });
        btnProcesar.setBounds(313, 7, 89, 23);
        contentPane.add(btnProcesar);
        
        JButton btnLimpiar = new JButton("Limpiar ");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Limpiar los campos de texto y el JTextPane
                txtMarcas.setText("");
                txtPrecio.setText("");
                txtResultados.setText("");
            }
        });
        btnLimpiar.setBounds(313, 32, 89, 23);
        contentPane.add(btnLimpiar);
        
        txtResultados = new JTextPane();
        txtResultados.setBounds(10, 81, 402, 169);
        contentPane.add(txtResultados);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(191, 7, 86, 22);
        
        comboBox.addItem("LG");
        comboBox.addItem("SONY");
        comboBox.addItem("SAMSUNG");
        comboBox.addItem("HUAWEI");
        comboBox.addItem("PANASONIC");
        
        contentPane.add(comboBox);
    }
}

