package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buscar extends JFrame
{
    public Buscar()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(new Color(173,216,230));

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);

        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
        backgroundLabel.setSize(400, 100);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);

        JLabel buscar = new JLabel("Ingrese la identificación");
        buscar.setBounds(95,100,500,30);
        buscar.setForeground(new Color(15, 70, 111)); //Se creo el color azul oscuro
        buscar.setFont(new Font("Times New Roman",Font.BOLD,20));//Style:Estilo de letra.
        layeredPane.add(buscar, JLayeredPane.PALETTE_LAYER);

        JTextField pacienteBuscar = new JTextField();
        pacienteBuscar.setBounds(55, 140, 280, 30);
        pacienteBuscar.setFont(new Font("Times New Roman",Font.BOLD,14));
        layeredPane.add(pacienteBuscar, JLayeredPane.PALETTE_LAYER);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds(150, 200, 100, 25);
        layeredPane.add(aceptar, JLayeredPane.PALETTE_LAYER);
        aceptar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean bandera = true; //Bandera es cuando encontramos el caso de salida del bucle.
                int posicion = 0;//Es para ir contando en cuál posición encontramos el paciente que coincide.
                while (bandera)//Empieza el bucle y sale cuando bandera es false.
                {

                    if (main.listaPacientes.size()== posicion)//Se pregunta si posición se salió del tamaño de la lista.
                    {
                        bandera = false; //En caso de que posición se salió del tamaño de la lista, "salimos"  ya que no hay paciente que coincida.
                    }
                    else if (main.listaPacientes.get /*paciente*/(posicion).getTipoIdent().equals /*Y comparalos*/ (pacienteBuscar.getText()))//Se compara el ID del paciente por el que vamos contando, con ID ingresado en la busqueda.
                    {
                        bandera = false;//En caso que coinciden pasamos a bandera false para salir del bucle.
                    }
                    else
                    {
                        posicion +=1;// Y continua la verificación del siguiente paciente.
                    }
                }

                if (main.listaPacientes.size()== posicion)
                {
                    JOptionPane.showMessageDialog(null,"Ups, parece que no ingresaste una identificación existente.(ŏ﹏ŏ。)\n    ¡Por favor, intenta otra vez con una identificación existente!" , "¡Oh no! (ŏ﹏ŏ。)", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    main.listaPacientes.get(posicion).mostrarDatos();//Utilizando la posición con la que salimos del bucle, se muestra los datos de ese paciente.
                    pacienteBuscar.setText("");
                }
            }
        });

        JButton atras = new JButton("Atras");
        atras.setBounds(270, 230, 100, 25);
        layeredPane.add(atras, JLayeredPane.PALETTE_LAYER);
        atras.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pacienteBuscar.setText("");
                dispose();
                menu men = new menu();
            }
        });
        panel.add(layeredPane);
        add(panel);


        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
}
