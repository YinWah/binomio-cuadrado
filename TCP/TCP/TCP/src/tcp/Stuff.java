/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Sorzano Torres Pablo, Wah Ortiz Yin Chew
 */
public class Stuff extends JFrame implements ActionListener {
    JTextField x,y,resultado;                                    //CReamos  objetos de las clases JTectField,JLabel,JComboBox y Jbutton
        JLabel P1,P2,V1,V2;                                     
        JComboBox signo;
        JButton calcular;
        double a, b, ab;

    /**
     *El constructor de la clase Stuff() inicializa el contenido de los metodos iniciarVentana() e iniciarComponentes().
     */
    public Stuff(){
        iniciarVentana();
        iniciarComponentes();
    }
    
    /**
     *Los componentes de la ventana pricipal se ajustan en el metodo iniciarVentana() 
     */
    public void iniciarVentana(){                               //Ajustamos la pantalla principal
        this.setTitle("Trinomio Cuadrado Perfecto");
        this.setSize(400,300);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *Lo componentes(Campos de texto, Labels, Combos y botones) se inician en el metodo inicialComponentes
     */
    public void iniciarComponentes(){
        //Incializamos los objetos objetos de las clases JTectField,JLabel,JComboBox y Jbutton y escribimos sus propiedades                            
        x=new JTextField();                         //inicializamos el campo de texto correspondiente con la variable x                 
        x.setBounds(130, 50, 30, 30);                          
        x.setVisible(true);                                    
        x.addActionListener(this);
        x.setHorizontalAlignment(0);
        x.setFont(new java.awt.Font("Tahoma", 0, 20));
        this.add(x);
        
        signo=new JComboBox();          //inicializamos el jcombobox donde se podrá seleccionar el signo del TCP
        signo.setBounds(175, 55, 40, 20);
        signo.addItem("+");
        signo.addItem("-");
        signo.addActionListener(this);
        signo.setFont(new java.awt.Font("Tahoma", 0, 20));
        signo.setVisible(true);
        this.add(signo);
        
        y=new JTextField();             //inicializamos el campo de texto correspondiente a la varibale y 
        y.setBounds(220, 50, 30, 30);
        y.setVisible(true);
        y.setHorizontalAlignment(0);
        y.addActionListener(this);
        y.setFont(new java.awt.Font("Tahoma", 0, 20));
        this.add(y);
        
        P1=new JLabel("(");             //establecemos el escrito del primer paréntesis
        P1.setBounds(120, 50, 30, 30);
        P1.setVisible(true);
        P1.setFont(new java.awt.Font("Tahoma", 0, 20));
        this.add(P1);
        
        P2=new JLabel(")^2");       //establecemos el escrito del segundo paréntesis
        P2.setBounds(260, 50, 60, 30);
        P2.setFont(new java.awt.Font("Tahoma", 0, 20));
        P2.setVisible(true);
        this.add(P2);
        
        V1=new JLabel("x");   //establecemos el escrito de la variable x
        V1.setBounds(160, 50, 30, 30);
        V1.setVisible(true);
        V1.setFont(new java.awt.Font("Tahoma", 0, 20));
        this.add(V1);
        
        V2=new JLabel("y");     //establecemos el escrito de la variable y
        V2.setBounds(250, 50, 30, 30);
        V2.setVisible(true);
        V2.setFont(new java.awt.Font("Tahoma", 0, 20));
        this.add(V2);
        
        calcular= new JButton("CALCULAR");      //incializamos el botón que dará la instrucción de calcular el TCP
        calcular.setBounds(150,125, 100, 20);
        calcular.setVisible(true);
        calcular.setFont(new java.awt.Font("Tahoma", 0, 20));
        calcular.setBorder(null);
        calcular.addActionListener(this);
        this.add(calcular);
        Metodos obj= new Metodos();  
        resultado= new JTextField();    //inicializamos el campo de texto donde será desplegado el texto final
        resultado.setBounds(0,165, 400, 35);
        resultado.setVisible(true);
        resultado.setFont(new java.awt.Font("Tahoma", 0, 20));
        resultado.addActionListener(this);
        resultado.setFocusable(false);
        resultado.setHorizontalAlignment(0);
        this.add(resultado);
    }
    /**
     * En el metodo instanciamos un objeto de lase Metodos() y por medio de los ActionListener recibimos datos tecleados por el usuario, despues de que el programa recibe las variables 
     * el programa calcula el binomio al cuadrado 
     * 
     */
    /**
     * 
     * @param e 
     */
    @Override public void actionPerformed(ActionEvent e) {
        Metodos obj= new Metodos();                                //
       if(e.getSource()==calcular){                                //
           
           if(x.getText().matches("[abcdefghijklmnñopqrstuvwxyz]")||y.getText().matches("[abcdefghijklmnñopqrstuvwxyz]")){      //Validamos que no acepte letras
               JOptionPane.showMessageDialog(rootPane, "Favor de ingresar sólamente números");
               x.setText("");
               y.setText("");
           }else{
               if(x.getText().isEmpty()||y.getText().isEmpty()){
                   JOptionPane.showMessageDialog(rootPane, "Favor de ingresar números en ambos campos");                        //Validamos que los capos esten llenos   
                   x.setText("");
                   y.setText("");
               }else{
                   if(signo.getSelectedItem().equals("+")){ //en caso de que el signo seleccionado sea '+'
                       obj.setX(Double.parseDouble(x.getText()));
                       obj.setY(Double.parseDouble(y.getText()));
                       obj.setXy2();
                       resultado.setText(obj.getX2()+" x^2 "+" + "+"2("+obj.getX()+")("+obj.getY()+")"+" xy "+" + "+obj.getY2()+" y^2 ");//despliega el resultado en el campo de texto correspondiente
                   }else if(signo.getSelectedItem().equals("-")){//en caso del que el signo seleccionado sea '-'
                       obj.setX(Double.parseDouble(x.getText()));
                       obj.setY(Double.parseDouble(y.getText()));
                       obj.setXy2();
                       resultado.setText(obj.getX2()+" x^2 "+" - "+"2("+obj.getX()+")("+obj.getY()+")"+" xy "+" + "+obj.getY2()+" y^2 ");//despliega el resultado en el campo de texto correspondiente
                   }
               }
           }
       }
    }
}
