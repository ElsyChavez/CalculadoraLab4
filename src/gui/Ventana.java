/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aritmetica.Aritmetica;
import conversor.Conversor;
import factory.AbstractFactory;
import factory.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author elsyc
 */
public class Ventana extends JFrame{
    private JTextField caja1, caja2, caja3, caja4, caja5;
    private JButton botonSu, botonRe, botonMu, botonDi, botonCo;
    private JLabel label1, label2;
    
    
    
    public Ventana(){
        super("Titulo de la ventana");
        initComponent();
    }
    
    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Container contenedor = getContentPane();
        
        label1 = new JLabel("Calculadora");
        label1.setBounds(140,4,500,20);
        contenedor.add(label1);
        
        caja1 = new JTextField("Numero1");
        caja1.setBounds(10,30,150,30);
        contenedor.add(caja1);
        
        caja2 = new JTextField("Numero2");
        caja2.setBounds(210,30,150,30);
        contenedor.add(caja2);

        botonSu = new JButton("+");
        botonSu.setBounds(10,80,50,30);
        contenedor.add(botonSu);
        
        botonRe = new JButton("-");
        botonRe.setBounds(60,80,50,30);
        contenedor.add(botonRe);
        
        botonMu = new JButton("*");
        botonMu.setBounds(110,80,50,30);
        contenedor.add(botonMu);
        
        botonDi = new JButton("/");
        botonDi.setBounds(160,80,50,30);
        contenedor.add(botonDi);
        
        label2 = new JLabel("Conversor");
        label2.setBounds(140,130,500,20);
        contenedor.add(label2);
        
        caja3 = new JTextField("Numero3");
        caja3.setBounds(10,170,150,30);
        contenedor.add(caja3);
        
        botonCo = new JButton("a binario");
        botonCo.setBounds(210,170,150,30);
        contenedor.add(botonCo);
        
        caja4 = new JTextField();
        caja4.setBounds(400,30,150,30);
        contenedor.add(caja4);
        
        caja5 = new JTextField("");
        caja5.setBounds(400,170,150,30);
        contenedor.add(caja5);
        
        botonSu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica suma = factory.getAritmetica("suma");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();
                
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);
                
                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = suma.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });
        
        botonRe.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica resta = factory.getAritmetica("resta");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();
                
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);
      
            while(true){
                if(matcher.matches() && matcher2.matches()){
                    float result = resta.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                    caja4.setText(Float.toString(result));
                    break;
                }
                else{
                    System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                    break;
                }
            }   
            }
        });
        
        botonMu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica multi = factory.getAritmetica("multiplicacion");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();
                
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);
                
                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = multi.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }
            }
        });
        
        botonDi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("aritmetica");
                Aritmetica div = factory.getAritmetica("division");
                String cont1 = caja1.getText();
                String cont2 = caja2.getText();
                
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont1);
                Matcher matcher2 = patron.matcher(cont2);
                
                while(true){
                    if(matcher.matches() && matcher2.matches()){
                        float result = div.operacion(Integer.parseInt(caja1.getText()),Integer.parseInt(caja2.getText()));
                        caja4.setText(Float.toString(result));
                        break;
                    }
                    else{
                        System.out.println("No es un numero o no es entero, ingreselo nuevamente.");
                        break;
                    }
                }

            }
        });
        
        botonCo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AbstractFactory factory;
                factory =  FactoryProducer.getFactory("conversor");
                Conversor conver = factory.getConversor("binario");
                String cont3 = caja3.getText();
                
                Pattern patron = Pattern.compile("\\d*");
                Matcher matcher = patron.matcher(cont3);
                
                while(true){
                    if(matcher.matches()){
                        String result = conver.convertir(Integer.parseInt(caja3.getText()));
                        caja5.setText(result);
                        break;
                    }
                    else{
                        System.out.println("No puede convertirse a binario porque no es un numero o no es positivo.");
                        System.out.println("Ingreselo nuevamente");
                        break;
                    }
                }

            }
        });
        
        setSize(600,270);
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Ventana().setVisible(true);
            }
        });
    }
}
