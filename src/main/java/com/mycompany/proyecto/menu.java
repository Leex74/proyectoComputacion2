/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Lee
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class menu 
{
    //Se agregan como atributos de menú la lista de pacientes y las pantallas a utilizar.
    private ArrayList<paciente> listaPacientes = new ArrayList<paciente>(); //Lista dónde se guarda todos los pacientes.
    private JFrame pantalla = new JFrame();//Se crea la pantalla principal.
    private JFrame pantallaAgregar = new JFrame();//Se crea la pantalla de "agregar".
    private JFrame pantallaBuscar = new JFrame();//Se crea la pantalla de "Buscar".
    private JFrame pantallaEliminar = new JFrame();
    private JFrame pantallaModificar = new JFrame();
    private JFrame pantallalogin = new JFrame();
    private String usuarios[]= new String[12];
    private String contraseñas[]= new String[12];
    private boolean usado= false;
    
    public void pantallalogin()
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
        pantallalogin.add(login);
        
        signup.setBounds(0,0,550,500);
        signup.setLayout(null);
        signup.setBackground(new Color(173,216,230));
        signup.setVisible(false);
        pantallalogin.add(signup);
        
        //Cosas del Login
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey.png"));
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
                        if (usuarios[n]!=null)
                        {
                            if (usuarios[n].equals(usuario.getText()))
                            {
                                if (contraseñas[n].equals(contraseña.getText()))
                                {
                                    usuario.setText("");
                                    contraseña.setText("");
                                    pantallaPrincipal(); 
                                    pantallalogin.setVisible(false);
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

        JLabel backgroundLabel2 = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey.png"));
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
                        if (usuarios[n]!=null)
                        {
                            if (usuarios[n].equals(usuario2.getText()))
                            {
                                JOptionPane.showMessageDialog(null, "Error, usuario ya existe");
                                break;
                            }
                        }
                        else
                        {
                            usuarios[n]=usuario2.getText();
                            contraseñas[n]=contraseña2.getText();
 
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
        
        pantallalogin.setSize(400,300);//Se definen las dimensiones de la pantalla "agregar".
        pantallalogin.setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente. 
        pantallalogin.setVisible(true);//Hace visible la pantalla de "agregar".
        pantallalogin.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantallalogin.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantallalogin.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
    
    public void pantallaPrincipal()
    {

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(new Color(173,216,230));
        panel.setLayout(null);
        pantalla.add(panel);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
        backgroundLabel.setSize(400, 100);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(173,216,230));
        pantalla.setJMenuBar(MenuBar);
        
        JMenu ayuda = new JMenu("Ayuda");
        MenuBar.add(ayuda);
        
        JMenuItem ayudaagre = new JMenuItem("Agregar Paciente");
        ayudaagre.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
               JFrame AA = new JFrame();
               AA.setSize(450,350);
               AA.setVisible(true);
               AA.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
               AA.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 
               
               JPanel paneAA = new JPanel();
               paneAA.setBounds(0, 0, 450, 300);
               paneAA.setBackground(new Color(173,216,230));
               paneAA.setLayout(null);
               AA.add(paneAA);
        
               JLayeredPane layeredPaneAA = new JLayeredPane();
               layeredPaneAA.setSize(450, 300);
        
               JLabel labelAA = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
               labelAA.setSize(450, 100);
               layeredPaneAA.add(labelAA, JLayeredPane.DEFAULT_LAYER);
               
               JTextArea  textoAA = new JTextArea ("Agregar Paciente:\n" +
                                           "\n" +
                                           "  🌷 Te permite registrar un nuevo paciente.\n" +
                                           "\n" +
                                           "  🌷 Completa los campos con la información personal del paciente\n" +
                                           "    (nombre, edad, etc.) y selecciona los antecedentes médicos.\n" +
                                           "\n" +
                                           "  🌷 Opciones:\n" +
                                           "\n" +
                                           "     🌷 Aceptar: Guarda la información del paciente.\n" +
                                           "     🌷 Atrás: Regresa a la pantalla principal sin guardar."); 
               
               JButton sali = new JButton("Atrás"); //Se crea el botón de "atrás".
               sali.setBounds(320,275,80,25);//Estas son las dimensiones de "agregar".
               sali.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
               sali.setFont(new Font("",Font.BOLD,14));
               sali.setBackground(new Color(204,236,255));
               layeredPaneAA.add(sali, JLayeredPane.PALETTE_LAYER);
               sali.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
               {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                  AA.setVisible(false);
                  pantalla.setVisible(true);
                }
               });
               
               textoAA.setLineWrap(true); // Habilita el ajuste de línea
               textoAA.setWrapStyleWord(true); // Ajusta por palabras completas
               textoAA.setEditable(false); // Evita que el usuario edite el texto

               textoAA.setBackground(new Color(173,216,230));
               textoAA.setBounds(50, 100, 450, 350);
               layeredPaneAA.add(textoAA,JLayeredPane.PALETTE_LAYER);
               paneAA.add(layeredPaneAA);
            }
        });
        ayuda.add(ayudaagre);
        
        JMenuItem ayudabuscar = new JMenuItem("Buscar Paciente");
        ayudabuscar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
               JFrame AB = new JFrame();
               AB.setSize(450,350);
               AB.setVisible(true); 
               AB.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
               AB.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 
               
               JPanel paneAB = new JPanel();
               paneAB.setBounds(0, 0, 450, 300);
               paneAB.setBackground(new Color(173,216,230));
               paneAB.setLayout(null);
               AB.add(paneAB);
        
               JLayeredPane layeredPaneAB = new JLayeredPane();
               layeredPaneAB.setSize(450, 300);
        
               JLabel labelAB = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
               labelAB.setSize(450, 100);
               layeredPaneAB.add(labelAB, JLayeredPane.DEFAULT_LAYER);
               
               JTextArea  textoAB = new JTextArea ("Buscar Paciente:\n" +
                                           "\n" +
                                           "  🌷 Busca un paciente registrado utilizando su identificación.\n" +
                                           "\n" +
                                           "  🌷 Opciones:\n" +
                                           "\n" +
                                           "     🌷 Buscar: Muestra la información del paciente.\n" +
                                           "     🌷 Atrás: Regresa a la pantalla principal."); 
               
               JButton sali = new JButton("Atrás"); //Se crea el botón de "atrás".
               sali.setBounds(320,275,80,25);//Estas son las dimensiones de "agregar".
               sali.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
               sali.setFont(new Font("",Font.BOLD,14));
               sali.setBackground(new Color(204,236,255));
               layeredPaneAB.add(sali, JLayeredPane.PALETTE_LAYER);
               sali.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
               {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                  AB.setVisible(false);
                  pantalla.setVisible(true);
                }
               });
               
               textoAB.setLineWrap(true); // Habilita el ajuste de línea
               textoAB.setWrapStyleWord(true); // Ajusta por palabras completas
               textoAB.setEditable(false); // Evita que el usuario edite el texto

               textoAB.setBackground(new Color(173,216,230));
               textoAB.setBounds(50, 100, 450, 350);
               layeredPaneAB.add(textoAB,JLayeredPane.PALETTE_LAYER);
               paneAB.add(layeredPaneAB);
            }
        });
        ayuda.add(ayudabuscar);
        
        JMenuItem ayudamodificar = new JMenuItem("Modificar Paciente");
        ayudabuscar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
               JFrame AM = new JFrame();
               AM.setSize(450,350);
               AM.setVisible(true); 
               AM.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
               AM.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 
               
               JPanel paneAM = new JPanel();
               paneAM.setBounds(0, 0, 450, 300);
               paneAM.setBackground(new Color(173,216,230));
               paneAM.setLayout(null);
               AM.add(paneAM);
        
               JLayeredPane layeredPaneAM = new JLayeredPane();
               layeredPaneAM.setSize(450, 300);
        
               JLabel labelAM = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
               labelAM.setSize(450, 100);
               layeredPaneAM.add(labelAM, JLayeredPane.DEFAULT_LAYER);
               
               JTextArea  textoAM = new JTextArea ("Modificar Paciente:\n" +
                                           "\n" +
                                           "  🌷 Edita los datos de un paciente existente.\n" +
                                           "  🌷 Primero, ingresa la identificación del paciente\n"
                                         + "     para cargar su información.\n" +
                                           "  🌷 Una vez cargados los datos, edítalos como en la\n"
                                         + "     opción Agregar.\n" +
                                           "\n" +
                                           "  🌷 Opciones:\n" +
                                           "\n" +
                                           "     🌷 Aceptar: Guarda los cambios realizados.\n" +
                                           "     🌷 Atrás: Regresa a la pantalla principal."); 
               
               JButton sali = new JButton("Atrás"); //Se crea el botón de "atrás".
               sali.setBounds(320,275,80,25);//Estas son las dimensiones de "agregar".
               sali.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
               sali.setFont(new Font("",Font.BOLD,14));
               sali.setBackground(new Color(204,236,255));
               layeredPaneAM.add(sali, JLayeredPane.PALETTE_LAYER);
               sali.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
               {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                  AM.setVisible(false);
                  pantalla.setVisible(true);
                }
               });
               
               textoAM.setLineWrap(true); // Habilita el ajuste de línea
               textoAM.setWrapStyleWord(true); // Ajusta por palabras completas
               textoAM.setEditable(false); // Evita que el usuario edite el texto

               textoAM.setBackground(new Color(173,216,230));
               textoAM.setBounds(50, 100, 450, 350);
               layeredPaneAM.add(textoAM,JLayeredPane.PALETTE_LAYER);
               paneAM.add(layeredPaneAM);
            }
        });
        ayuda.add(ayudamodificar);
        
        JMenuItem ayudaeliminar = new JMenuItem("Eliminar Paciente");
        ayudaeliminar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
               JFrame AE = new JFrame();
               AE.setSize(450,350);
               AE.setVisible(true); 
               AE.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
               AE.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 
               
               JPanel paneAE = new JPanel();
               paneAE.setBounds(0, 0, 450, 300);
               paneAE.setBackground(new Color(173,216,230));
               paneAE.setLayout(null);
               AE.add(paneAE);
        
               JLayeredPane layeredPaneAE = new JLayeredPane();
               layeredPaneAE.setSize(450, 300);
        
               JLabel labelAE = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
               labelAE.setSize(450, 100);
               layeredPaneAE.add(labelAE, JLayeredPane.DEFAULT_LAYER);
               
               JTextArea  textoAE = new JTextArea ("Eliminar Paciente:\n" +
                                           "\n" +
                                           "  🌷 Elimina un paciente ingresando su identificación.\n" +
                                           "\n" +
                                           "  🌷 Opciones:\n" +
                                           "\n" +
                                           "     🌷 No hay confirmación, asegúrate antes de proceder.\n" +
                                           "     🌷 Atrás: Regresa a la pantalla principal."); 
               
               JButton sali = new JButton("Atrás"); //Se crea el botón de "atrás".
               sali.setBounds(320,275,80,25);//Estas son las dimensiones de "agregar".
               sali.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
               sali.setFont(new Font("",Font.BOLD,14));
               sali.setBackground(new Color(204,236,255));
               layeredPaneAE.add(sali, JLayeredPane.PALETTE_LAYER);
               sali.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
               {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                  AE.setVisible(false);
                  pantalla.setVisible(true);
                }
               });
               
               textoAE.setLineWrap(true); // Habilita el ajuste de línea
               textoAE.setWrapStyleWord(true); // Ajusta por palabras completas
               textoAE.setEditable(false); // Evita que el usuario edite el texto

               textoAE.setBackground(new Color(173,216,230));
               textoAE.setBounds(50, 100, 450, 350);
               layeredPaneAE.add(textoAE,JLayeredPane.PALETTE_LAYER);
               paneAE.add(layeredPaneAE);
            }
        });
        ayuda.add(ayudaeliminar);
        
        JMenu info = new JMenu("Información");
        info.addMenuListener(new javax.swing.event.MenuListener() 
        {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) 
            {
               JFrame inf = new JFrame();
               inf.setSize(400,300);
               inf.setVisible(true);
               
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) 
            {
                // No hacer nada al deseleccionar
            }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) 
            {
                // No hacer nada si el menú se cancela
            }
        });
        MenuBar.add(info);
        
        JMenu cerrar = new JMenu("Cerrar sesión");
        cerrar.addMenuListener(new javax.swing.event.MenuListener() 
        {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) 
            {
                pantalla.setVisible(false);
                pantallalogin.setVisible(true);
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) 
            {
                // No hacer nada al deseleccionar
            }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) 
            {
                // No hacer nada si el menú se cancela
            }
        });
        MenuBar.add(cerrar);
        
        JButton agre = new JButton("Agregar"); //Se crea el botón de "agregar".
        agre.setBounds(50,125,100,30);//Estas son las dimensiones de "agregar".
        agre.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        agre.setFont(new Font("",Font.BOLD,14));
        agre.setBackground(new Color(204,236,255));
        layeredPane.add(agre, JLayeredPane.PALETTE_LAYER);
        agre.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pantalla.setVisible(false);//Hace la pantalla invisible.
                agregar(); // Llamar al método cuando el botón sea presionado.
            }
        });
        JButton busc = new JButton("Buscar");
        busc.setBounds(233,125,100,30);
        busc.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        busc.setFont(new Font("",Font.BOLD,14));
        busc.setBackground(new Color(204,236,255));
        layeredPane.add(busc, JLayeredPane.PALETTE_LAYER);
        busc.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pantalla.setVisible(false);
                pantallaBuscar(); 
            }
        });
        JButton eli = new JButton("Eliminar");
        eli.setBounds(50,200,100,30);
        eli.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        eli.setFont(new Font("",Font.BOLD,14));
        eli.setBackground(new Color(204,236,255));
        layeredPane.add(eli, JLayeredPane.PALETTE_LAYER);
        eli.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pantalla.setVisible(false);
                pantallaEliminar(); 
            }
        }); 
        JButton modi = new JButton("Editar"); //Se crea el botón de "agregar".
        modi.setBounds(233,200,100,30);//Estas son las dimensiones de "agregar".
        modi.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        modi.setFont(new Font("",Font.BOLD,14));
        modi.setBackground(new Color(204,236,255));
        layeredPane.add(modi, JLayeredPane.PALETTE_LAYER);
        modi.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pantalla.setVisible(false);//Hace la pantalla invisible.
                if (!usado)
                {
                    usado=true;
                    pantallaModificar(); // Llamar al método cuando el botón sea presionado.
                }
                else
                {
                    pantallaModificar.setVisible(true);
                }
                
            }
        });
          
        panel.add(layeredPane);
        pantalla.add(panel);
        
//        pantalla.add(agre);//Se agrega el botón de "agregar" y "buscar" a la pantalla principal.
//        pantalla.add(busc);
//        pantalla.add(eli);
//        pantalla.add(modi);

        pantalla.setSize(400,300);//Dimensiones de la pantalla principal.
        pantalla.setBackground(new Color(173,216,230));
        pantalla.setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente.
        pantalla.setVisible(true);//Hace la pantalla principal visible. 
        pantalla.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantalla.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantalla.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.

    }
    public void agregar()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 560, 500);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(560, 550);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grefondo.png"));
        backgroundLabel.setSize(550, 500);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        
        JLabel labelNombre = new JLabel("Nombre"); //Se crea una etiqueta que mostrará la palabra "Nombre".
        labelNombre.setBounds(10,10,100,23);//Se define los dimensiones de la etiqueta.
        layeredPane.add(labelNombre, JLayeredPane.PALETTE_LAYER);
        JTextField nombre = new JTextField();//Se crea un cuadro para que el usuario pueda escribir.
        nombre.setBounds(150,10,100,23);//Se define los dimensiones del cuadro de escritura.
        layeredPane.add(nombre, JLayeredPane.PALETTE_LAYER);

        JLabel labelApellido = new JLabel("Apellidos"); 
        labelApellido.setBounds(10,40,100,23);
        layeredPane.add(labelApellido, JLayeredPane.PALETTE_LAYER);
        JTextField apellido = new JTextField();
        apellido.setBounds(150,40,100,23);
        layeredPane.add(apellido, JLayeredPane.PALETTE_LAYER);
        
        JLabel labelNacimiento = new JLabel("Fecha de Nacimiento"); 
        labelNacimiento.setBounds(10,70,150,23);
        layeredPane.add(labelNacimiento, JLayeredPane.PALETTE_LAYER);
        JTextField fechaNacimiento = new JTextField();
        fechaNacimiento.setBounds(150,70,100,23);
        layeredPane.add(fechaNacimiento, JLayeredPane.PALETTE_LAYER);
        
        JLabel labelFecha = new JLabel("Fecha Consulta"); 
        labelFecha.setBounds(10, 100, 120, 23);
        layeredPane.add(labelFecha, JLayeredPane.PALETTE_LAYER);
        JTextField fechaConsulta = new JTextField(); 
        fechaConsulta.setBounds(150, 100, 100, 23); 
        layeredPane.add(fechaConsulta, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelEdad = new JLabel("Edad"); 
        labelEdad.setBounds(10, 130, 100, 23); 
        layeredPane.add(labelEdad, JLayeredPane.PALETTE_LAYER);
        JTextField edad = new JTextField(); 
        edad.setBounds(150, 130, 100, 23); 
        layeredPane.add(edad, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelIdent = new JLabel("Tipo Identificación"); 
        labelIdent.setBounds(10, 160, 120, 23); 
        layeredPane.add(labelIdent, JLayeredPane.PALETTE_LAYER);
        JTextField tipoIdent = new JTextField(); 
        tipoIdent.setBounds(150, 160, 100, 23); 
        layeredPane.add(tipoIdent, JLayeredPane.PALETTE_LAYER);

      
        JLabel labelSexo = new JLabel("Sexo"); 
        labelSexo.setBounds(10, 190, 100, 23);
        layeredPane.add(labelSexo, JLayeredPane.PALETTE_LAYER);
        JTextField sexo = new JTextField(); 
        sexo.setBounds(150, 190, 100, 23); 
        layeredPane.add(sexo, JLayeredPane.PALETTE_LAYER);

     
        JLabel labelSangre = new JLabel("Tipo de Sangre"); 
        labelSangre.setBounds(10, 220, 100, 23); 
        layeredPane.add(labelSangre, JLayeredPane.PALETTE_LAYER);
        JTextField tipoSangre = new JTextField(); 
        tipoSangre.setBounds(150, 220, 100, 23); 
        layeredPane.add(tipoSangre, JLayeredPane.PALETTE_LAYER);
       
        JLabel labelNacionalidad = new JLabel("Nacionalidad"); 
        labelNacionalidad.setBounds(10, 250, 100, 23); 
        layeredPane.add(labelNacionalidad, JLayeredPane.PALETTE_LAYER);
        JTextField nacionalidad = new JTextField(); 
        nacionalidad.setBounds(150, 250, 100, 23); 
        layeredPane.add(nacionalidad, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelPuesto = new JLabel("Puesto de Trabajo"); 
        labelPuesto.setBounds(10, 280, 120, 23); 
        layeredPane.add(labelPuesto, JLayeredPane.PALETTE_LAYER);
        JTextField puesto = new JTextField(); 
        puesto.setBounds(150, 280, 100, 23); 
        layeredPane.add(puesto, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelTiempo = new JLabel("Tiempo de Trabajo"); 
        labelTiempo.setBounds(10, 310, 120, 23); 
        layeredPane.add(labelTiempo, JLayeredPane.PALETTE_LAYER);
        JTextField tiempoTrabajo = new JTextField(); 
        tiempoTrabajo.setBounds(150, 310, 100, 23); 
        layeredPane.add(tiempoTrabajo, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelCorreo = new JLabel("Correo"); 
        labelCorreo.setBounds(10, 340, 100, 23); 
        layeredPane.add(labelCorreo, JLayeredPane.PALETTE_LAYER);
        JTextField correo = new JTextField(); 
        correo.setBounds(150, 340, 100, 23); 
        layeredPane.add(correo, JLayeredPane.PALETTE_LAYER);

       
        JLabel labelDireccion = new JLabel("Dirección"); 
        labelDireccion.setBounds(10, 370, 100, 23); 
        layeredPane.add(labelDireccion, JLayeredPane.PALETTE_LAYER);
        JTextField direccion = new JTextField(); 
        direccion.setBounds(150, 370, 100, 23); 
        layeredPane.add(direccion, JLayeredPane.PALETTE_LAYER);

       
        JLabel labelContacto = new JLabel("Contacto Emergencia"); 
        labelContacto.setBounds(10, 400, 150, 23); 
        layeredPane.add(labelContacto, JLayeredPane.PALETTE_LAYER);
        JTextField contactoEmergencia = new JTextField(); 
        contactoEmergencia.setBounds(150, 400, 100, 23); 
        layeredPane.add(contactoEmergencia, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelTelEmerg = new JLabel("Teléfono Emergencia");
        labelTelEmerg.setBounds(10, 430, 150, 23); 
        layeredPane.add(labelTelEmerg, JLayeredPane.PALETTE_LAYER);
        JTextField telefonoContEmer = new JTextField(); 
        telefonoContEmer.setBounds(150, 430, 100, 23); 
        layeredPane.add(telefonoContEmer, JLayeredPane.PALETTE_LAYER);

        JLabel labelAntecedentes = new JLabel("Antecedentes"); 
        labelAntecedentes.setBounds(350,10,150,23);
        labelAntecedentes.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        labelAntecedentes.setFont(new Font("Times New Roman",Font.BOLD,18));
        layeredPane.add(labelAntecedentes, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox diabetes = new JCheckBox("Diabetes");//Crea el check que mostrara en este caso "Diabetes".
        diabetes.setBounds(300, 40, 100, 23);//Posición y tamaño de la etiqueta "Diabetes".
        diabetes.setBackground(new Color(173, 216, 230));
        layeredPane.add(diabetes, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox TB = new JCheckBox("TB");
        TB.setBounds(300, 70, 100, 23);
        TB.setBackground(new Color(173, 216, 230));
        layeredPane.add(TB, JLayeredPane.PALETTE_LAYER);
    
        JCheckBox enfermedadMental = new JCheckBox("Enfermedad Mental");
        enfermedadMental.setBounds(300, 100, 200, 23);
        enfermedadMental.setBackground(new Color(173, 216, 230));
        layeredPane.add(enfermedadMental, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox cardiopatia = new JCheckBox("Cardiopatia");
        cardiopatia.setBounds(300, 130, 100, 23);
        cardiopatia.setBackground(new Color(173, 216, 230));
        layeredPane.add(cardiopatia, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox epilepsia = new JCheckBox("Epilepsia");
        epilepsia.setBounds(300, 160, 100, 23);
        epilepsia.setBackground(new Color(173, 216, 230));
        layeredPane.add(epilepsia, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox genetica = new JCheckBox("Genética");
        genetica.setBounds(300, 190, 100, 23);
        genetica.setBackground(new Color(173, 216, 230));
        layeredPane.add(genetica, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox HTA = new JCheckBox("HTA");
        HTA.setBounds(300, 220, 50, 23);
        HTA.setBackground(new Color(173, 216, 230));
        layeredPane.add(HTA, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox asma = new JCheckBox("Asma");
        asma.setBounds(300, 250, 60, 23);
        asma.setBackground(new Color(173, 216, 230));
        layeredPane.add(asma, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox hepatopatias = new JCheckBox("Hepatopatias");
        hepatopatias.setBounds(300, 280, 100, 23);
        hepatopatias.setBackground(new Color(173, 216, 230));
        layeredPane.add(hepatopatias, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox carcinomas = new JCheckBox("Carcinomas");
        carcinomas.setBounds(300, 310, 100, 23);
        carcinomas.setBackground(new Color(173, 216, 230));
        layeredPane.add(carcinomas, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox enfermedadEndocrinas = new JCheckBox("Enfermedad Endocrinas");
        enfermedadEndocrinas.setBounds(300, 340, 200, 23);
        enfermedadEndocrinas.setBackground(new Color(173, 216, 230));
        layeredPane.add(enfermedadEndocrinas, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox otros = new JCheckBox("Otros");
        otros.setBounds(300, 370, 100, 23);
        otros.setBackground(new Color(173, 216, 230));
        layeredPane.add(otros, JLayeredPane.PALETTE_LAYER);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds(300, 420, 100, 25);
        layeredPane.add(aceptar, JLayeredPane.PALETTE_LAYER);
        aceptar.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)//Se llama así por estandar.
            {
                
                if (nombre.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                {
                    
                    if (apellido.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                    {
                        
                        if (fechaNacimiento.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")) 
                        {
                            
                            if (correo.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")&& correo(correo.getText())) 
                            {
                                
                                if (telefonoContEmer.getText().matches("\\d+")&& telefono(telefonoContEmer.getText())) 
                                {
                                    
                                    if (fechaConsulta.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")) 
                                    {
                                        
                                        if (edad.getText().matches("\\d+")) 
                                        {
                                            
                                            if (tipoIdent.getText().matches("[a-zA-Z0-9]+") && repetido(tipoIdent.getText())) 
                                            {
                                                
                                                if (sexo.getText().matches("[a-zA-Z]+")) 
                                                {
                                                    
                                                    if (tipoSangre.getText().matches("[a-zA-Z0-9\\+\\-]+")) 
                                                    {
                                                        
                                                        if (nacionalidad.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                        {
                                                            
                                                            if (puesto.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                            {
                                                                
                                                                if (tiempoTrabajo.getText().matches("[a-zA-Z0-9\\s]+")) 
                                                                {
                                                                    
                                                                    if (direccion.getText().matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s,\\.]+")) 
                                                                    {
                                                                        
                                                                        if (contactoEmergencia.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                                        {
                                                            
                                                                            // Todos los datos son válidos, se crea un paciente y se agrega a la lista
                                                                            listaPacientes.add(new paciente(nombre.getText(), apellido.getText(), fechaNacimiento.getText(), fechaConsulta.getText(), 
                                                                            Integer.parseInt(edad.getText()), tipoIdent.getText(), sexo.getText(), tipoSangre.getText(), nacionalidad.getText(),
                                                                            puesto.getText(), tiempoTrabajo.getText(), correo.getText(), direccion.getText(), contactoEmergencia.getText(),
                                                                            Integer.parseInt(telefonoContEmer.getText()),diabetes.isSelected(),TB.isSelected(), enfermedadMental.isSelected(),cardiopatia.isSelected(),epilepsia.isSelected(), genetica.isSelected(), HTA.isSelected(),
                                                                            asma.isSelected(), hepatopatias.isSelected(), carcinomas.isSelected(),enfermedadEndocrinas.isSelected(), ""));
                                                            
                                                                            nombre.setText(""); //Limpia el cuadrito en el que el usuario escribe "en este caso nombre"
                                                                            apellido.setText("");
                                                                            fechaNacimiento.setText("");
                                                                            fechaConsulta.setText("");
                                                                            edad.setText("");
                                                                            tipoIdent.setText("");
                                                                            sexo.setText("");
                                                                            tipoSangre.setText("");
                                                                            nacionalidad.setText("");
                                                                            puesto.setText("");
                                                                            tiempoTrabajo.setText("");
                                                                            correo.setText("");
                                                                            direccion.setText("");
                                                                            contactoEmergencia.setText("");
                                                                            telefonoContEmer.setText("");
                                                                            
                                                                            diabetes.setSelected(false); //Quita el check de selección "en este caso para diabetes"
                                                                            TB.setSelected(false);
                                                                            enfermedadMental.setSelected(false);
                                                                            cardiopatia.setSelected(false);
                                                                            epilepsia.setSelected(false);
                                                                            genetica.setSelected(false);
                                                                            HTA.setSelected(false);
                                                                            asma.setSelected(false);
                                                                            hepatopatias.setSelected(false);
                                                                            carcinomas.setSelected(false);
                                                                            enfermedadEndocrinas.setSelected(false);
                                                                            otros.setSelected(false);
                                                                            
                                                                            listaPacientes.get(0).mostrarDatos(); // Prueba para mostrar datos del paciente agregado

                                                                        } else 
                                                                            
                                                                        {
                                                                            JOptionPane.showMessageDialog(null, "Oh no, parece que el nombre del contacto de emergencia no es válido. (ŏ﹏ŏ。) \n"
                                                                            + "¡Inténtalo de nuevo!");
                                                                        }
                                                                    } else 
                                                                    
                                                                    {
                                                                        JOptionPane.showMessageDialog(null, "Oh no, parece que la dirección contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                                        + "¡Inténtalo de nuevo!");
                                                                    }
                                                                } else 
                                                                
                                                                {
                                                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el tiempo de trabajo no es válido. (ŏ﹏ŏ。) \n"
                                                                    + "¡Inténtalo de nuevo!");
                                                                }
                                                            } else 
                                                            {
                                                                JOptionPane.showMessageDialog(null, "Oh no, parece que el puesto no es válido. (ŏ﹏ŏ。) \n"
                                                                + "¡Inténtalo de nuevo!");
                                                            }
                                                        } else 
                                                        {
                                                            JOptionPane.showMessageDialog(null, "Oh no, parece que la nacionalidad contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                            + "¡Inténtalo de nuevo!");
                                                        }
                                                    } else 
                                                    {
                                                        JOptionPane.showMessageDialog(null, "Oh no, parece que el tipo de sangre no es válido. (ŏ﹏ŏ。) \n"
                                                        + "¡Inténtalo de nuevo!");
                                                    }
                                                } else 
                                                {
                                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el campo sexo contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                    + "¡Inténtalo de nuevo!");
                                                }
                                            } else 
                                            {
                                                JOptionPane.showMessageDialog(null, "Oh no, parece que el tipo de identificación contiene caracteres no válidos o ya existe en el registro. (ŏ﹏ŏ。) \n"
                                                + "¡Inténtalo de nuevo!");
                                            }
                                        } else 
                                        {
                                            JOptionPane.showMessageDialog(null, "Oh no, parece que la edad no es un número válido. (ŏ﹏ŏ。) \n"
                                            + "¡Inténtalo de nuevo!");
                                        }
                                    } else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Oh no, parece que la fecha de consulta no tiene el formato correcto (dd/mm/yyyy). (ŏ﹏ŏ。) \n"
                                        + "¡Inténtalo de nuevo!");
                                    }
                                } else 
                                {
                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el teléfono contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                    + "¡Inténtalo de nuevo!");
                                }
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Oh no, parece que el correo no es válido. (ŏ﹏ŏ。) \n"
                                + "¡Inténtalo de nuevo!");
                            }
                        } else 
                        {
                            JOptionPane.showMessageDialog(null, "Oh no, parece que la fecha de nacimiento no tiene el formato correcto (dd/mm/yyyy). (ŏ﹏ŏ。) \n"
                            + "¡Inténtalo de nuevo!");
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Oh no, parece que ingresaste un carácter no válido para el apellido. (ŏ﹏ŏ。) \n"
                        + "¡Inténtalo de nuevo!");
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Oh no, parece que ingresaste un caracter no válido para el nombre. (ŏ﹏ŏ。) \n"
                    + "¡Inténtalo de nuevo!");
                }
            }
        });
        
        JButton atras = new JButton("Atrás");
        atras.setBounds(410, 420, 100, 25);
        layeredPane.add(atras, JLayeredPane.PALETTE_LAYER);
        atras.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               nombre.setText(""); //Limpia el cuadrito en el que el usuario escribe "en este caso nombre"
               apellido.setText("");
               fechaNacimiento.setText("");
               fechaConsulta.setText("");
               edad.setText("");
               tipoIdent.setText("");
               sexo.setText("");
               tipoSangre.setText("");
               nacionalidad.setText("");
               puesto.setText("");
               tiempoTrabajo.setText("");
               correo.setText("");
               direccion.setText("");
               contactoEmergencia.setText("");
               telefonoContEmer.setText("");
                                                                            
               diabetes.setSelected(false); //Quita el check de selección "en este caso para diabetes"
               TB.setSelected(false);
               enfermedadMental.setSelected(false);
               cardiopatia.setSelected(false);
               epilepsia.setSelected(false);
               genetica.setSelected(false);
               HTA.setSelected(false);
               asma.setSelected(false);
               hepatopatias.setSelected(false);
               carcinomas.setSelected(false);
               enfermedadEndocrinas.setSelected(false);
               otros.setSelected(false);
               
               pantallaAgregar.setVisible(false); 
               pantalla.setVisible(true);
            }
        });
        
        panel.add(layeredPane);
        pantallaAgregar.add(panel);
        
        pantallaAgregar.setSize(560,500);//Se definen las dimensiones de la pantalla "agregar".
        pantallaAgregar.setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente. 
        pantallaAgregar.setVisible(true);//Hace visible la pantalla de "agregar".
        pantallaAgregar.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantallaAgregar.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantallaAgregar.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
    public void pantallaBuscar ()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(new Color(173,216,230));
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
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
                    
                    if (listaPacientes.size()== posicion)//Se pregunta si posición se salió del tamaño de la lista.
                    {
                        bandera = false; //En caso de que posición se salió del tamaño de la lista, "salimos"  ya que no hay paciente que coincida. 
                    }
                    else if (listaPacientes.get /*paciente*/(posicion).getTipoIdent().equals /*Y comparalos*/ (pacienteBuscar.getText()))//Se compara el ID del paciente por el que vamos contando, con ID ingresado en la busqueda. 
                    {
                        bandera = false;//En caso que coinciden pasamos a bandera false para salir del bucle.
                    }
                    else
                    {
                        posicion +=1;// Y continua la verificación del siguiente paciente. 
                    }
                }
                
                if (listaPacientes.size()== posicion)
                {
                     JOptionPane.showMessageDialog(null,"Ups, parece que no ingresaste una identificación existente.(ŏ﹏ŏ。)\n    ¡Por favor, intenta otra vez con una identificación existente!" , "¡Oh no! (ŏ﹏ŏ。)", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                   listaPacientes.get(posicion).mostrarDatos();//Utilizando la posición con la que salimos del bucle, se muestra los datos de ese paciente. 
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
               pantallaBuscar.setVisible(false); 
               pantalla.setVisible(true);
            }
        });
        panel.add(layeredPane);
        pantallaBuscar.add(panel);
        
        
        pantallaBuscar.setSize(400,300);
        pantallaBuscar.setLayout(null);
        pantallaBuscar.setVisible(true);
        pantallaBuscar.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantallaBuscar.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantallaBuscar.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 

    }
    public void pantallaEliminar()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(new Color(173,216,230));
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
        backgroundLabel.setSize(400, 100);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        
        JLabel buscar = new JLabel("Ingrese la identificación"); 
        buscar.setBounds(95,100,500,30);
        buscar.setForeground(new Color(0,0,139));
        buscar.setFont(new Font("Times New Roman",Font.BOLD,20));//Style:Estilo de letra.
        layeredPane.add(buscar, JLayeredPane.PALETTE_LAYER);
        
        JTextField pacienteBuscar = new JTextField(); 
        pacienteBuscar.setBounds(55, 140, 280, 30); 
        pacienteBuscar.setFont(new Font("Times New Roman",Font.BOLD,14));
        layeredPane.add(pacienteBuscar, JLayeredPane.PALETTE_LAYER);
        
        JButton aceptar = new JButton("Eliminar");
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
                    
                    if (listaPacientes.size()== posicion)//Se pregunta si posición se salió del tamaño de la lista.
                    {
                        bandera = false; //En caso de que posición se salió del tamaño de la lista, "salimos"  ya que no hay paciente que coincida. 
                    }
                    else if (listaPacientes.get /*paciente*/(posicion).getTipoIdent().equals /*Y comparalos*/ (pacienteBuscar.getText()))//Se compara el ID del paciente por el que vamos contando, con ID ingresado en la busqueda. 
                    {
                        bandera = false;//En caso que coinciden pasamos a bandera false para salir del bucle.
                    }
                    else
                    {
                        posicion +=1;// Y continua la verificación del siguiente paciente. 
                    }
                }
                
                if (listaPacientes.size()== posicion)
                {
                     JOptionPane.showMessageDialog(null,"Ups, parece que no ingresaste una identificación existente.(ŏ﹏ŏ。)\n    ¡Por favor, intenta otra vez con una identificación existente!" , "¡Oh no! (ŏ﹏ŏ。)", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                   listaPacientes.get(posicion).mostrarDatos();
                   listaPacientes.remove(posicion);
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
               pantallaEliminar.setVisible(false); 
               pantalla.setVisible(true);
            }
        });
        
        panel.add(layeredPane);
        pantallaEliminar.add(panel);
        
        
        pantallaEliminar.setSize(400,300);
        pantallaEliminar.setLayout(null);
        pantallaEliminar.setVisible(true);
        pantallaEliminar.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantallaEliminar.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantallaEliminar.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio. 
    }
    
    public void pantallaModificar ()
    {
        int[] posicion = {0};
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 560, 500);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 400, 300);
        panel2.setBackground(new Color(173,216,230));
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(560, 550);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grefondo.png"));
        backgroundLabel.setSize(550, 500);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        
        JLabel labelNombre = new JLabel("Nombre"); //Se crea una etiqueta que mostrará la palabra "Nombre".
        labelNombre.setBounds(10,10,100,23);//Se define los dimensiones de la etiqueta.
        layeredPane.add(labelNombre, JLayeredPane.PALETTE_LAYER);
        JTextField nombre = new JTextField();//Se crea un cuadro para que el usuario pueda escribir.
        nombre.setBounds(150,10,100,23);//Se define los dimensiones del cuadro de escritura.
        layeredPane.add(nombre, JLayeredPane.PALETTE_LAYER);

        JLabel labelApellido = new JLabel("Apellidos"); 
        labelApellido.setBounds(10,40,100,23);
        layeredPane.add(labelApellido, JLayeredPane.PALETTE_LAYER);
        JTextField apellido = new JTextField();
        apellido.setBounds(150,40,100,23);
        layeredPane.add(apellido, JLayeredPane.PALETTE_LAYER);
        
        JLabel labelNacimiento = new JLabel("Fecha de Nacimiento"); 
        labelNacimiento.setBounds(10,70,150,23);
        layeredPane.add(labelNacimiento, JLayeredPane.PALETTE_LAYER);
        JTextField fechaNacimiento = new JTextField();
        fechaNacimiento.setBounds(150,70,100,23);
        layeredPane.add(fechaNacimiento, JLayeredPane.PALETTE_LAYER);
        
        JLabel labelFecha = new JLabel("Fecha Consulta"); 
        labelFecha.setBounds(10, 100, 120, 23);
        layeredPane.add(labelFecha, JLayeredPane.PALETTE_LAYER);
        JTextField fechaConsulta = new JTextField(); 
        fechaConsulta.setBounds(150, 100, 100, 23); 
        layeredPane.add(fechaConsulta, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelEdad = new JLabel("Edad"); 
        labelEdad.setBounds(10, 130, 100, 23); 
        layeredPane.add(labelEdad, JLayeredPane.PALETTE_LAYER);
        JTextField edad = new JTextField(); 
        edad.setBounds(150, 130, 100, 23); 
        layeredPane.add(edad, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelIdent = new JLabel("Tipo Identificación"); 
        labelIdent.setBounds(10, 160, 120, 23); 
        layeredPane.add(labelIdent, JLayeredPane.PALETTE_LAYER);
        JTextField tipoIdent = new JTextField(); 
        tipoIdent.setBounds(150, 160, 100, 23); 
        layeredPane.add(tipoIdent, JLayeredPane.PALETTE_LAYER);

      
        JLabel labelSexo = new JLabel("Sexo"); 
        labelSexo.setBounds(10, 190, 100, 23);
        layeredPane.add(labelSexo, JLayeredPane.PALETTE_LAYER);
        JTextField sexo = new JTextField(); 
        sexo.setBounds(150, 190, 100, 23); 
        layeredPane.add(sexo, JLayeredPane.PALETTE_LAYER);

     
        JLabel labelSangre = new JLabel("Tipo de Sangre"); 
        labelSangre.setBounds(10, 220, 100, 23); 
        layeredPane.add(labelSangre, JLayeredPane.PALETTE_LAYER);
        JTextField tipoSangre = new JTextField(); 
        tipoSangre.setBounds(150, 220, 100, 23); 
        layeredPane.add(tipoSangre, JLayeredPane.PALETTE_LAYER);
       
        JLabel labelNacionalidad = new JLabel("Nacionalidad"); 
        labelNacionalidad.setBounds(10, 250, 100, 23); 
        layeredPane.add(labelNacionalidad, JLayeredPane.PALETTE_LAYER);
        JTextField nacionalidad = new JTextField(); 
        nacionalidad.setBounds(150, 250, 100, 23); 
        layeredPane.add(nacionalidad, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelPuesto = new JLabel("Puesto de Trabajo"); 
        labelPuesto.setBounds(10, 280, 120, 23); 
        layeredPane.add(labelPuesto, JLayeredPane.PALETTE_LAYER);
        JTextField puesto = new JTextField(); 
        puesto.setBounds(150, 280, 100, 23); 
        layeredPane.add(puesto, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelTiempo = new JLabel("Tiempo de Trabajo"); 
        labelTiempo.setBounds(10, 310, 120, 23); 
        layeredPane.add(labelTiempo, JLayeredPane.PALETTE_LAYER);
        JTextField tiempoTrabajo = new JTextField(); 
        tiempoTrabajo.setBounds(150, 310, 100, 23); 
        layeredPane.add(tiempoTrabajo, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelCorreo = new JLabel("Correo"); 
        labelCorreo.setBounds(10, 340, 100, 23); 
        layeredPane.add(labelCorreo, JLayeredPane.PALETTE_LAYER);
        JTextField correo = new JTextField(); 
        correo.setBounds(150, 340, 100, 23); 
        layeredPane.add(correo, JLayeredPane.PALETTE_LAYER);

       
        JLabel labelDireccion = new JLabel("Dirección"); 
        labelDireccion.setBounds(10, 370, 100, 23); 
        layeredPane.add(labelDireccion, JLayeredPane.PALETTE_LAYER);
        JTextField direccion = new JTextField(); 
        direccion.setBounds(150, 370, 100, 23); 
        layeredPane.add(direccion, JLayeredPane.PALETTE_LAYER);

       
        JLabel labelContacto = new JLabel("Contacto Emergencia"); 
        labelContacto.setBounds(10, 400, 150, 23); 
        layeredPane.add(labelContacto, JLayeredPane.PALETTE_LAYER);
        JTextField contactoEmergencia = new JTextField(); 
        contactoEmergencia.setBounds(150, 400, 100, 23); 
        layeredPane.add(contactoEmergencia, JLayeredPane.PALETTE_LAYER);

        
        JLabel labelTelEmerg = new JLabel("Teléfono Emergencia");
        labelTelEmerg.setBounds(10, 430, 150, 23); 
        layeredPane.add(labelTelEmerg, JLayeredPane.PALETTE_LAYER);
        JTextField telefonoContEmer = new JTextField(); 
        telefonoContEmer.setBounds(150, 430, 100, 23); 
        layeredPane.add(telefonoContEmer, JLayeredPane.PALETTE_LAYER);

        JLabel labelAntecedentes = new JLabel("Antecedentes"); 
        labelAntecedentes.setBounds(350,10,150,23);
        labelAntecedentes.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
        labelAntecedentes.setFont(new Font("Times New Roman",Font.BOLD,18));
        layeredPane.add(labelAntecedentes, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox diabetes = new JCheckBox("Diabetes");//Crea el check que mostrara en este caso "Diabetes".
        diabetes.setBounds(300, 40, 100, 23);//Posición y tamaño de la etiqueta "Diabetes".
        diabetes.setBackground(new Color(173, 216, 230));
        layeredPane.add(diabetes, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox TB = new JCheckBox("TB");
        TB.setBounds(300, 70, 100, 23);
        TB.setBackground(new Color(173, 216, 230));
        layeredPane.add(TB, JLayeredPane.PALETTE_LAYER);
    
        JCheckBox enfermedadMental = new JCheckBox("Enfermedad Mental");
        enfermedadMental.setBounds(300, 100, 200, 23);
        enfermedadMental.setBackground(new Color(173, 216, 230));
        layeredPane.add(enfermedadMental, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox cardiopatia = new JCheckBox("Cardiopatia");
        cardiopatia.setBounds(300, 130, 100, 23);
        cardiopatia.setBackground(new Color(173, 216, 230));
        layeredPane.add(cardiopatia, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox epilepsia = new JCheckBox("Epilepsia");
        epilepsia.setBounds(300, 160, 100, 23);
        epilepsia.setBackground(new Color(173, 216, 230));
        layeredPane.add(epilepsia, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox genetica = new JCheckBox("Genética");
        genetica.setBounds(300, 190, 100, 23);
        genetica.setBackground(new Color(173, 216, 230));
        layeredPane.add(genetica, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox HTA = new JCheckBox("HTA");
        HTA.setBounds(300, 220, 50, 23);
        HTA.setBackground(new Color(173, 216, 230));
        layeredPane.add(HTA, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox asma = new JCheckBox("Asma");
        asma.setBounds(300, 250, 60, 23);
        asma.setBackground(new Color(173, 216, 230));
        layeredPane.add(asma, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox hepatopatias = new JCheckBox("Hepatopatias");
        hepatopatias.setBounds(300, 280, 100, 23);
        hepatopatias.setBackground(new Color(173, 216, 230));
        layeredPane.add(hepatopatias, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox carcinomas = new JCheckBox("Carcinomas");
        carcinomas.setBounds(300, 310, 100, 23);
        carcinomas.setBackground(new Color(173, 216, 230));
        layeredPane.add(carcinomas, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox enfermedadEndocrinas = new JCheckBox("Enfermedad Endocrinas");
        enfermedadEndocrinas.setBounds(300, 340, 200, 23);
        enfermedadEndocrinas.setBackground(new Color(173, 216, 230));
        layeredPane.add(enfermedadEndocrinas, JLayeredPane.PALETTE_LAYER);
        
        JCheckBox otros = new JCheckBox("Otros");
        otros.setBounds(300, 370, 100, 23);
        otros.setBackground(new Color(173, 216, 230));
        layeredPane.add(otros, JLayeredPane.PALETTE_LAYER);

        JButton aceptar = new JButton("Aceptar");
        aceptar.setBounds(300, 420, 100, 25);
        layeredPane.add(aceptar, JLayeredPane.PALETTE_LAYER);
        aceptar.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
        {
            @Override
            public void actionPerformed(ActionEvent e)//Se llama así por estandar.
            {
                
                if (nombre.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                {
                    
                    if (apellido.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                    {
                        
                        if (fechaNacimiento.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")) 
                        {
                            
                            if (correo.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) 
                            {
                                
                                if (telefonoContEmer.getText().matches("\\d+")) 
                                {
                                    
                                    if (fechaConsulta.getText().matches("^\\d{2}/\\d{2}/\\d{4}$")) 
                                    {
                                        
                                        if (edad.getText().matches("\\d+")) 
                                        {
                                            
                                            if (tipoIdent.getText().matches("[a-zA-Z0-9]+") ) 
                                            {
                                                
                                                if (sexo.getText().matches("[a-zA-Z]+")) 
                                                {
                                                    
                                                    if (tipoSangre.getText().matches("[a-zA-Z0-9\\+\\-]+")) 
                                                    {
                                                        
                                                        if (nacionalidad.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                        {
                                                            
                                                            if (puesto.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                            {
                                                                
                                                                if (tiempoTrabajo.getText().matches("[a-zA-Z0-9\\s]+")) 
                                                                {
                                                                    
                                                                    if (direccion.getText().matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ\\s,\\.]+")) 
                                                                    {
                                                                        
                                                                        if (contactoEmergencia.getText().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) 
                                                                        {
                                                            
                                                                            int pos = posicion[0];
                                                                            listaPacientes.get(pos).setNombre(nombre.getText());
                                                                            listaPacientes.get(pos).setApellido(apellido.getText());
                                                                            listaPacientes.get(pos).setFechaNacimiento(fechaNacimiento.getText());
                                                                            listaPacientes.get(pos).setFechaConsulta(fechaConsulta.getText());
                                                                            listaPacientes.get(pos).setEdad(Integer.valueOf(edad.getText()));
                                                                            listaPacientes.get(pos).setTipoIdent(tipoIdent.getText());
                                                                            listaPacientes.get(pos).setSexo(sexo.getText());
                                                                            listaPacientes.get(pos).setTipoSangre(tipoSangre.getText());
                                                                            listaPacientes.get(pos).setNacionalidad(nacionalidad.getText());
                                                                            listaPacientes.get(pos).setPuesto(puesto.getText());
                                                                            listaPacientes.get(pos).setTiempoTrabajo(tiempoTrabajo.getText());
                                                                            listaPacientes.get(pos).setCorreo(correo.getText());
                                                                            listaPacientes.get(pos).setDireccion(direccion.getText());
                                                                            listaPacientes.get(pos).setContactoEmergencia(contactoEmergencia.getText());
                                                                            listaPacientes.get(pos).setTelefonoContEmer(Integer.valueOf(telefonoContEmer.getText()));
                                                                            listaPacientes.get(pos).setDiabetes(diabetes.isSelected());
                                                                            listaPacientes.get(pos).setTB(TB.isSelected());
                                                                            listaPacientes.get(pos).setEnfermedadMental(enfermedadMental.isSelected());
                                                                            listaPacientes.get(pos).setCardiopatia(cardiopatia.isSelected());
                                                                            listaPacientes.get(pos).setEpilepsia(epilepsia.isSelected());
                                                                            listaPacientes.get(pos).setGenetica(genetica.isSelected());
                                                                            listaPacientes.get(pos).setHTA(HTA.isSelected());
                                                                            listaPacientes.get(pos).setAsma(asma.isSelected());
                                                                            listaPacientes.get(pos).setHepatopatias(hepatopatias.isSelected());
                                                                            listaPacientes.get(pos).setCarcinomas(carcinomas.isSelected());
                                                                            listaPacientes.get(pos).setEnfermedadEndocrinas(enfermedadEndocrinas.isSelected());
                                                                            listaPacientes.get(pos).setOtros("");
                                                                            listaPacientes.get(pos).mostrarDatos(); // Prueba para mostrar datos del paciente agregado
                                                                            
                                                                            panel2.setVisible(true);
                                                                            panel.setVisible(false);
                                                                            pantallaModificar.setSize(400, 300);

                                                                        } else 
                                                                            
                                                                        {
                                                                            JOptionPane.showMessageDialog(null, "Oh no, parece que el nombre del contacto de emergencia no es válido. (ŏ﹏ŏ。) \n"
                                                                            + "¡Inténtalo de nuevo!");
                                                                        }
                                                                    } else 
                                                                    
                                                                    {
                                                                        JOptionPane.showMessageDialog(null, "Oh no, parece que la dirección contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                                        + "¡Inténtalo de nuevo!");
                                                                    }
                                                                } else 
                                                                
                                                                {
                                                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el tiempo de trabajo no es válido. (ŏ﹏ŏ。) \n"
                                                                    + "¡Inténtalo de nuevo!");
                                                                }
                                                            } else 
                                                            {
                                                                JOptionPane.showMessageDialog(null, "Oh no, parece que el puesto no es válido. (ŏ﹏ŏ。) \n"
                                                                + "¡Inténtalo de nuevo!");
                                                            }
                                                        } else 
                                                        {
                                                            JOptionPane.showMessageDialog(null, "Oh no, parece que la nacionalidad contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                            + "¡Inténtalo de nuevo!");
                                                        }
                                                    } else 
                                                    {
                                                        JOptionPane.showMessageDialog(null, "Oh no, parece que el tipo de sangre no es válido. (ŏ﹏ŏ。) \n"
                                                        + "¡Inténtalo de nuevo!");
                                                    }
                                                } else 
                                                {
                                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el campo sexo contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                                    + "¡Inténtalo de nuevo!");
                                                }
                                            } else 
                                            {
                                                JOptionPane.showMessageDialog(null, "Oh no, parece que el tipo de identificación contiene caracteres no válidos o ya existe en el registro. (ŏ﹏ŏ。) \n"
                                                + "¡Inténtalo de nuevo!");
                                            }
                                        } else 
                                        {
                                            JOptionPane.showMessageDialog(null, "Oh no, parece que la edad no es un número válido. (ŏ﹏ŏ。) \n"
                                            + "¡Inténtalo de nuevo!");
                                        }
                                    } else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Oh no, parece que la fecha de consulta no tiene el formato correcto (dd/mm/yyyy). (ŏ﹏ŏ。) \n"
                                        + "¡Inténtalo de nuevo!");
                                    }
                                } else 
                                {
                                    JOptionPane.showMessageDialog(null, "Oh no, parece que el teléfono contiene caracteres no válidos. (ŏ﹏ŏ。) \n"
                                    + "¡Inténtalo de nuevo!");
                                }
                            } else 
                            {
                                JOptionPane.showMessageDialog(null, "Oh no, parece que el correo no es válido. (ŏ﹏ŏ。) \n"
                                + "¡Inténtalo de nuevo!");
                            }
                        } else 
                        {
                            JOptionPane.showMessageDialog(null, "Oh no, parece que la fecha de nacimiento no tiene el formato correcto (dd/mm/yyyy). (ŏ﹏ŏ。) \n"
                            + "¡Inténtalo de nuevo!");
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Oh no, parece que ingresaste un carácter no válido para el apellido. (ŏ﹏ŏ。) \n"
                        + "¡Inténtalo de nuevo!");
                    }
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Oh no, parece que ingresaste un caracter no válido para el nombre. (ŏ﹏ŏ。) \n"
                    + "¡Inténtalo de nuevo!");
                }
            }
        });
        
        JButton atras = new JButton("Atrás");
        atras.setBounds(410, 420, 100, 25);
        layeredPane.add(atras, JLayeredPane.PALETTE_LAYER);
        atras.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               panel2.setVisible(true);
               panel.setVisible(false);
               pantallaModificar.setSize(400, 300);
            }
        });
        
        panel.add(layeredPane);
        pantallaModificar.add(panel);
        panel.setVisible(false);
        
        JLayeredPane layeredPane2 = new JLayeredPane();
        layeredPane2.setSize(400, 300);
        
        JLabel backgroundLabel2 = new JLabel(new ImageIcon("C:/Users/derek/OneDrive/Documentos/NetBeansProjects/proyecto/src/main/java/com/mycompany/proyecto/grey2.png"));
        backgroundLabel2.setSize(400, 100);
        layeredPane2.add(backgroundLabel2, JLayeredPane.DEFAULT_LAYER);
        
        JLabel buscar = new JLabel("Ingrese la identificación"); 
        buscar.setBounds(95,100,500,30);
        buscar.setForeground(new Color(15, 70, 111)); //Se creo el color azul oscuro
        buscar.setFont(new Font("Times New Roman",Font.BOLD,20));//Style:Estilo de letra.
        layeredPane2.add(buscar, JLayeredPane.PALETTE_LAYER);
        
        JTextField pacienteBuscar = new JTextField(); 
        pacienteBuscar.setBounds(55, 140, 280, 30); 
        pacienteBuscar.setFont(new Font("Times New Roman",Font.BOLD,14));
        layeredPane2.add(pacienteBuscar, JLayeredPane.PALETTE_LAYER);
        
        JButton aceptar2 = new JButton("Aceptar");
        aceptar2.setBounds(150, 200, 100, 25);
        layeredPane2.add(aceptar2, JLayeredPane.PALETTE_LAYER);
        aceptar2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                boolean bandera = true; //Bandera es cuando encontramos el caso de salida del bucle.
                int pos = 0;
                while (bandera)//Empieza el bucle y sale cuando bandera es false.
                {
                    
                    if (listaPacientes.size()== pos)//Se pregunta si posición se salió del tamaño de la lista.
                    {
                        bandera = false; //En caso de que posición se salió del tamaño de la lista, "salimos"  ya que no hay paciente que coincida. 
                    }
                    else if (listaPacientes.get /*paciente*/(pos).getTipoIdent().equals /*Y comparalos*/ (pacienteBuscar.getText()))//Se compara el ID del paciente por el que vamos contando, con ID ingresado en la busqueda. 
                    {
                        bandera = false;//En caso que coinciden pasamos a bandera false para salir del bucle.
                    }
                    else
                    {
                        pos +=1;// Y continua la verificación del siguiente paciente. 
                    }
                }
                
                if (listaPacientes.size()== pos)
                {
                     JOptionPane.showMessageDialog(null,"Ups, parece que no ingresaste una identificación existente.(ŏ﹏ŏ。)\n    ¡Por favor, intenta otra vez con una identificación existente!" , "¡Oh no! (ŏ﹏ŏ。)", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    posicion[0] = pos; 
                    
                   nombre.setText(listaPacientes.get(pos).getNombre()); //Limpia el cuadrito en el que el usuario escribe "en este caso nombre"
                   apellido.setText(listaPacientes.get(pos).getApellido());
                   fechaNacimiento.setText(listaPacientes.get(pos).getFechaNacimiento());
                   fechaConsulta.setText(listaPacientes.get(pos).getFechaConsulta());
                   edad.setText(listaPacientes.get(pos).getEdad()+"");
                   tipoIdent.setText(listaPacientes.get(pos).getTipoIdent());
                   sexo.setText(listaPacientes.get(pos).getSexo());
                   tipoSangre.setText(listaPacientes.get(pos).getTipoSangre());
                   nacionalidad.setText(listaPacientes.get(pos).getNacionalidad());
                   puesto.setText(listaPacientes.get(pos).getPuesto());
                   tiempoTrabajo.setText(listaPacientes.get(pos).getTiempoTrabajo());
                   correo.setText(listaPacientes.get(pos).getCorreo());
                   direccion.setText(listaPacientes.get(pos).getDireccion());
                   contactoEmergencia.setText(listaPacientes.get(pos).getContactoEmergencia());
                   telefonoContEmer.setText(listaPacientes.get(pos).getTelefonoContEmer()+"");                                                         
                                                                            
                   diabetes.setSelected(listaPacientes.get(pos).isDiabetes()); //Quita el check de selección "en este caso para diabetes"
                   TB.setSelected(listaPacientes.get(pos).isTB());
                   enfermedadMental.setSelected(listaPacientes.get(pos).isEnfermedadMental());
                   cardiopatia.setSelected(listaPacientes.get(pos).isCardiopatia());
                   epilepsia.setSelected(listaPacientes.get(pos).isEpilepsia());
                   genetica.setSelected(listaPacientes.get(pos).isGenetica());
                   HTA.setSelected(listaPacientes.get(pos).isHTA());
                   asma.setSelected(listaPacientes.get(pos).isAsma());
                   hepatopatias.setSelected(listaPacientes.get(pos).isHepatopatias());
                   carcinomas.setSelected(listaPacientes.get(pos).isCarcinomas());
                   enfermedadEndocrinas.setSelected(listaPacientes.get(pos).isEnfermedadEndocrinas());
                   otros.setSelected(!listaPacientes.get(pos).getOtros().equals("")); 
                   
                   pacienteBuscar.setText("");
                   panel2.setVisible(false);
                   panel.setVisible(true);
                   pantallaModificar.setSize(560, 500);
                }
            }
        }); 
        
        JButton atras2 = new JButton("Atrás");
        atras2.setBounds(270, 230, 100, 25);
        layeredPane2.add(atras2, JLayeredPane.PALETTE_LAYER);
        atras2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               pacienteBuscar.setText("");
               pantallaModificar.setVisible(false); 
               pantalla.setVisible(true);
            }
        });
        panel2.add(layeredPane2);
        pantallaModificar.add(panel2);
        
        pantallaModificar.setSize(400,300);//Se definen las dimensiones de la pantalla "agregar".
        pantallaModificar.setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente. 
        pantallaModificar.setVisible(true);//Hace visible la pantalla de "agregar".
        pantallaModificar.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false. 
        pantallaModificar.setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        pantallaModificar.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    } 
    
    public boolean repetido(String Iden)
    {
        for (paciente p:listaPacientes)
        {
            if (p.getTipoIdent().equals(Iden))
            {
                return false;
            }
        }
        return true;
    }
    public boolean correo(String Iden)
    {
        for (paciente p:listaPacientes)
        {
            if (p.getCorreo().equals(Iden))
            {
                return false;
            }
        }
        return true;
    }
    public boolean telefono(String Iden)
    {
        for (paciente p:listaPacientes)
        {
            if (Integer.toString(p.getTelefonoContEmer()).equals(Iden))
            {
                return false;
            }
        }
        return true;
    }
      
        
}
