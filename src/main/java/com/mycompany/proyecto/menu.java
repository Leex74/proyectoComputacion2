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

public class menu extends JFrame
{
    public menu()
    {

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(new Color(173,216,230));
        panel.setLayout(null);
        add(panel);
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(400, 300);
        
        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
        backgroundLabel.setSize(400, 100);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        
        JMenuBar MenuBar = new JMenuBar();
        MenuBar.setBackground(new Color(173,216,230));
        setJMenuBar(MenuBar);
        
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
        
               JLabel labelAA = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
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
                  AA.dispose();
                  setVisible(true);
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
        
               JLabel labelAB = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
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
                  AB.dispose();
                  setVisible(true);
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
        
               JLabel labelAM = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
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
                  AM.dispose();
                  setVisible(true);
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
        
               JLabel labelAE = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
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
                  AE.dispose();
                  setVisible(true);
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
        MenuBar.add(info);

        JMenuItem somos = new JMenuItem("¿Quienes Somos?");
        info.add(somos);
        somos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame som = new JFrame();
                som.setSize(450,350);
                som.setVisible(true);
                som.setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
                som.setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.


                JPanel panesom = new JPanel();
                panesom.setBounds(0, 0, 450, 300);
                panesom.setBackground(new Color(173,216,230));
                panesom.setLayout(null);
                som.add(panesom);

                JLayeredPane layeredPanesom = new JLayeredPane();
                layeredPanesom.setSize(450, 300);

                JLabel labelsom = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
                labelsom.setSize(450, 100);
                layeredPanesom.add(labelsom, JLayeredPane.DEFAULT_LAYER);

                JTextArea  textosom = new JTextArea ("Quienes somos:\n" +
                                                     "\n" +
                                                     "   Somos un grupo de estudiantes de la Universidad \n" +
                                                     "Americana, conformado por Brenda Lee Avendaño Matarrita,\n" +
                                                     "Allan Raschit Díaz Salazar y Sasha Tamaya Arias Aguero. \n" +
                                                     "Actualmente estamos cursando la clase deProgramación 2, \n" +
                                                     "donde desarrollamos proyectos innovadores para mejorar\n" +
                                                     "nuestras habilidades y conocimientos en el desarrollo de software.\n"
                                                     );

                JButton sali = new JButton("Atrás"); //Se crea el botón de "atrás".
                sali.setBounds(320,275,80,25);//Estas son las dimensiones de "agregar".
                sali.setForeground(new Color(15,70,111)); //Cambia el color de la fuente.
                sali.setFont(new Font("",Font.BOLD,14));
                sali.setBackground(new Color(204,236,255));
                layeredPanesom.add(sali, JLayeredPane.PALETTE_LAYER);
                sali.addActionListener(new ActionListener()//Agrega una acción al botón, en este caso un escuchador de acción que es el click del botón.
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        som.dispose();
                        setVisible(true);
                    }
                });

                textosom.setLineWrap(true); // Habilita el ajuste de línea
                textosom.setWrapStyleWord(true); // Ajusta por palabras completas
                textosom.setEditable(false); // Evita que el usuario edite el texto

                textosom.setBackground(new Color(173,216,230));
                textosom.setBounds(50, 100, 450, 350);
                layeredPanesom.add(textosom,JLayeredPane.PALETTE_LAYER);
                panesom.add(layeredPanesom);
            }
        });
        
        JMenu cerrar = new JMenu("Cerrar sesión");
        cerrar.addMenuListener(new javax.swing.event.MenuListener() 
        {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) 
            {
                dispose();
                login log = new login();
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
                dispose();
                Agregar ag = new Agregar(); // Llamar al método cuando el botón sea presionado.
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
                dispose();
                Buscar bus = new  Buscar();
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
                dispose();
                Eliminar el = new  Eliminar();
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
                dispose();
                Modificar mod = new Modificar();
            }
        });
          
        panel.add(layeredPane);
        add(panel);

        setSize(400,300);//Dimensiones de la pantalla principal.
        setBackground(new Color(173,216,230));
        setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente.
        setVisible(true);//Hace la pantalla principal visible.
        setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
}
