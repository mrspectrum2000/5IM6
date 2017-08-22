/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfafi;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *La clase constructora
 * 
 * 
 * @author Elliot y Sachiro
 * @version 1.5
 * @date 22-08-2017
 */
public class Choice extends JFrame implements ActionListener{
    //Declaración de parametros
    private JButton Fibo,Facto;
    private JLabel NipL;
    public Choice(){
        //Metodos para los componentes gráficos
        Madotsuki();
        Parts();
    }
    private void Madotsuki()
    {
        //Madotsuki es el metodo que crea la ventana 
        setTitle("Banco Batiziano");
        setSize(650, 510);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     private void Parts()
     {
         //Todos los componentes gráficos del menú.
        Fibo = new JButton("Fibonacci");
        Fibo.setBounds(500, 400, 100, 30);
        add(Fibo);
        Fibo.addActionListener(this);
        Fibo.setVisible(true);
        
        Facto = new JButton("Factorial");
        Facto.setBounds(250, 400, 100, 30);
        add(Facto);
        Facto.addActionListener(this);
        Facto.setVisible(true);
        
        NipL = new JLabel("Fibo-Facto");
        NipL.setBounds(250, 165, 200, 30);
        NipL.setFont(new Font("TimeRoman",Font.BOLD,18));
        add(NipL);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Se personalizó el metodo a modo de que pueda invocar clases que hagan sus respectivas
        funciones, una para factorial y otra para fibonacci
        */
        if(e.getSource() == NipL)
        {
            //Estandar
            NipL.setVisible(true);
            Fibo.setVisible(true);
            Facto.setVisible(true);
        }else{
            if(e.getSource() == Fibo){
                //invoca la clase que realiza la función fibonacci
                FaFi ff = new FaFi();
                ff.setVisible(true);
            }else{
                if(e.getSource() == Facto){
                    //Y esto invoca a la clase de los factoriales.
                    FaFi2 ffii = new FaFi2();
                    ffii.setVisible(true);
                }
            }
        }
    }
     
}
