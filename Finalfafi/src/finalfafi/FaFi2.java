/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfafi;

/**
 *Clase para la sucesión factorial
 * 
 * @author Elliot y Sachiro
 * @version 1.5
 * @date 22-08-2017
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FaFi2 extends JFrame {
    //parametros
	JTextField t1, t2;

	FaFi2() {
            //el resto de los parametros
		JLabel l1 = new JLabel("Enter Number: ");
		JLabel l2 = new JLabel("Factorial of Input Number: ");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		JPanel p = new JPanel(new GridLayout(3, 2));
		JButton b = new JButton("Find");
                //Esto permite al botón realizar la operación con un solo click
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            /*Parte lógica del programa, usando un string para que sea
                            accesible para el usuario anotar el número, para después ser
                            transformado en la int llamnada num y esta pueda ser usada en el for
                            por medio de la variable fac
                            */
				String number = t1.getText();
				int num = Integer.parseInt(number);
				long fac = num;
				for (int i = num; i > 1; i--) {
					fac = fac * (i - 1);
				}
                                //establece el producto de toda la talacha
				t2.setText(Long.toString(fac));

			}
		});
                //agrega y hace visibles a las siguientes componentes
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b);
		add(p);
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
            //visionaliza la clase
		FaFi2 f = new FaFi2();
	}
}