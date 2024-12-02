package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame
{
    public login()
    {
        JPanel login = new JPanel();
        JPanel signup = new JPanel();

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);

        JLayeredPane layeredPane2 = new JLayeredPane();
        layeredPane2.setSize(400, 300);

        login.setBounds(0,0,550,500);
        login.setBackground(new Color(173,216,230));
        login.setLayout(null);
        add(login);

        signup.setBounds(0,0,550,500);
        signup.setLayout(null);
        signup.setBackground(new Color(173,216,230));
        signup.setVisible(false);
        add(signup);

        //Cosas del Login

        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey.png"));
        backgroundLabel.setSize(400, 260);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);

        JLabel Lusuario = new JLabel("Usuario");
        Lusuario.setBounds(30, 37, 70, 30);
        layeredPane.add(Lusuario, JLayeredPane.PALETTE_LAYER);

        JTextField usuario = new JTextField();
        usuario.setBounds(110, 40, 120, 25);
        layeredPane.add(usuario, JLayeredPane.PALETTE_LAYER);

        JLabel Lcontraseña = new JLabel("Contraseña");
        Lcontraseña.setBounds(30, 107, 100, 30);
        layeredPane.add(Lcontraseña, JLayeredPane.PALETTE_LAYER);

        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(110, 110, 120, 25);
        layeredPane.add(contraseña, JLayeredPane.PALETTE_LAYER);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds(150, 175, 100, 25);
        layeredPane.add(aceptar, JLayeredPane.PALETTE_LAYER);
        aceptar.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!usuario.getText().equals("")&&!contraseña.getText().equals(""))
                {
                    for (int n = 0;n<12;n++)
                    {
                        if (main.usuarios[n]!=null)
                        {
                            if (main.usuarios[n].equals(usuario.getText()))
                            {
                                if (main.contraseñas[n].equals(contraseña.getText()))
                                {
                                    usuario.setText("");
                                    contraseña.setText("");
                                    dispose();
                                    menu men = new menu();
                                    return;
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Error, contraseña incorrecta");
                                    usuario.setText("");
                                    contraseña.setText("");
                                    return;
                                }

                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Error, usuario no encontrado");
                    usuario.setText("");
                    contraseña.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error, ningún espacio puede estar vacio");
                }
            }
        });

        JButton registro = new JButton("Registrarse");
        registro.setBounds(270, 230, 110, 25);
        registro.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                login.setVisible(false);//Hace la pantalla invisible.
                signup.setVisible(true);
            }
        });
        layeredPane.add(registro, JLayeredPane.PALETTE_LAYER);

        login.add(layeredPane);
        //Panel de registro

        JLabel backgroundLabel2 = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey.png"));
        backgroundLabel2.setSize(400, 260);
        layeredPane2.add(backgroundLabel2, JLayeredPane.DEFAULT_LAYER);

        JLabel nombre2 = new JLabel("Nombre completo");
        nombre2.setBounds(30, 37, 120, 30);
        layeredPane2.add(nombre2, JLayeredPane.PALETTE_LAYER);

        JTextField nombreC2 = new JTextField();
        nombreC2.setBounds(150, 40, 200, 25);
        layeredPane2.add(nombreC2, JLayeredPane.PALETTE_LAYER);

        JLabel Lusuario2 = new JLabel("Usuario");
        Lusuario2.setBounds(30, 107, 70, 30);
        layeredPane2.add(Lusuario2, JLayeredPane.PALETTE_LAYER);

        JTextField usuario2 = new JTextField();
        usuario2.setBounds(150, 110, 200, 25);
        layeredPane2.add(usuario2, JLayeredPane.PALETTE_LAYER);

        JLabel Lcontraseña2 = new JLabel("Contraseña");
        Lcontraseña2.setBounds(30, 177, 100, 30);
        layeredPane2.add(Lcontraseña2, JLayeredPane.PALETTE_LAYER);

        JPasswordField contraseña2 = new JPasswordField();
        contraseña2.setBounds(150, 180, 200, 25);
        layeredPane2.add(contraseña2, JLayeredPane.PALETTE_LAYER);

        JButton aceptar2 = new JButton("Aceptar");
        aceptar2.setBounds(150, 230, 100, 25);
        aceptar2.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (!usuario2.getText().equals("")&&!contraseña2.getText().equals("")&&!nombreC2.getText().equals(""))
                {
                    for (int n = 0;n<12;n++)
                    {
                        if (main.usuarios[n]!=null)
                        {
                            if (main.usuarios[n].equals(usuario2.getText()))
                            {
                                JOptionPane.showMessageDialog(null, "Error, usuario ya existe");
                                break;
                            }
                        }
                        else
                        {
                            main.usuarios[n]=usuario2.getText();
                            main.contraseñas[n]=contraseña2.getText();

                        }
                    }
                    usuario2.setText("");
                    contraseña2.setText("");
                    nombreC2.setText("");
                    signup.setVisible(false);//Hace la pantalla invisible.
                    login.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error, ningún espacio puede estar vacio");
                }
            }
        });
        layeredPane2.add(aceptar2, JLayeredPane.PALETTE_LAYER);

        JButton atras = new JButton("Atrás");
        atras.setBounds(270, 230, 90, 25);
        atras.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                signup.setVisible(false);//Hace la pantalla invisible.
                login.setVisible(true);
            }
        });
        layeredPane2.add(atras, JLayeredPane.PALETTE_LAYER);
        signup.add(layeredPane2);

        setSize(400,300);//Se definen las dimensiones de la pantalla "agregar".
        setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente.
        setVisible(true);//Hace visible la pantalla de "agregar".
        setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
}
