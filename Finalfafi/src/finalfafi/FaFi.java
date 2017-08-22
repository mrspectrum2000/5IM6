/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfafi;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * Esta clase es la que realiza la tarea de la sucesión fibonacci.
 * 
 * @author Elliot y Sachiro
 * @version 1.5
 * @date 22-08-2017
 */
public class FaFi  extends JFrame implements ActionListener{
    //Parametros
    private final JTextField txtPosicion;
    private final JButton btnCalcular;
    private final JLabel lblPosicion; 
    public FaFi() 
        {
            //Creador de la ventana junto a los componentes
        this.setTitle("Fibonacci");
        this.setLayout(new GridLayout(3,1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtPosicion = new JTextField("");
        btnCalcular = new JButton("Calcular");
        lblPosicion = new JLabel("Introduzca la posición a calcular:");
        this.add(lblPosicion);
        this.add(txtPosicion);
        this.add(btnCalcular);
        btnCalcular.addActionListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Permite a la clase que los componentes gráficos sean visibles.
       new FaFi().setVisible(true);
            
    }  
    private static int calPosc(int posicion) {
        //Creamos un array para almacenar las posiciones que se vayan generando.
        int numFibo[] = new int[posicion];
        //Creamos un bucle para rellenar las posiciones.
        for(int i = 0; i < posicion; i++)
        {
            //Condición para rellenar las primeras dos posiciones con un "1".
            if(i <= 1)
                numFibo[i] = 1;
            //Después de rellenar las dos primeras posiciones comenzaremos a asignarle a cada posición del array la sumatoria de las dos posiciones anteriores.
            else
                numFibo[i] = numFibo[i-1] + numFibo[i-2];
        }
        //Retornamos el valor de la posición que deseábamos calcular.
        return numFibo[posicion-1];
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            //Obtenemos la posición a calcular.
            int posicion;
            posicion = Integer.parseInt(txtPosicion.getText());
            //Imprimimos la posición y para ello hacemos llamado al método que la calculará.
            JOptionPane.showMessageDialog(null, "El número de la posición "+posicion+" es: "+calPosc(posicion));
        } catch (NumberFormatException ex) {
            txtPosicion.setText(null);
            JOptionPane.showMessageDialog(null, "La posición ingresada no es válida");
            ex.printStackTrace(System.out);
        }
    }
}