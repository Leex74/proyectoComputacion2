package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modificar extends JFrame
{
    public Modificar()
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

        JLabel backgroundLabel = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grefondo.png"));
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
                                                                            main.listaPacientes.get(pos).setNombre(nombre.getText());
                                                                            main.listaPacientes.get(pos).setApellido(apellido.getText());
                                                                            main.listaPacientes.get(pos).setFechaNacimiento(fechaNacimiento.getText());
                                                                            main.listaPacientes.get(pos).setFechaConsulta(fechaConsulta.getText());
                                                                            main.listaPacientes.get(pos).setEdad(Integer.valueOf(edad.getText()));
                                                                            main.listaPacientes.get(pos).setTipoIdent(tipoIdent.getText());
                                                                            main.listaPacientes.get(pos).setSexo(sexo.getText());
                                                                            main.listaPacientes.get(pos).setTipoSangre(tipoSangre.getText());
                                                                            main.listaPacientes.get(pos).setNacionalidad(nacionalidad.getText());
                                                                            main.listaPacientes.get(pos).setPuesto(puesto.getText());
                                                                            main.listaPacientes.get(pos).setTiempoTrabajo(tiempoTrabajo.getText());
                                                                            main.listaPacientes.get(pos).setCorreo(correo.getText());
                                                                            main.listaPacientes.get(pos).setDireccion(direccion.getText());
                                                                            main.listaPacientes.get(pos).setContactoEmergencia(contactoEmergencia.getText());
                                                                            main.listaPacientes.get(pos).setTelefonoContEmer(Integer.valueOf(telefonoContEmer.getText()));
                                                                            main.listaPacientes.get(pos).setDiabetes(diabetes.isSelected());
                                                                            main.listaPacientes.get(pos).setTB(TB.isSelected());
                                                                            main.listaPacientes.get(pos).setEnfermedadMental(enfermedadMental.isSelected());
                                                                            main.listaPacientes.get(pos).setCardiopatia(cardiopatia.isSelected());
                                                                            main.listaPacientes.get(pos).setEpilepsia(epilepsia.isSelected());
                                                                            main.listaPacientes.get(pos).setGenetica(genetica.isSelected());
                                                                            main.listaPacientes.get(pos).setHTA(HTA.isSelected());
                                                                            main.listaPacientes.get(pos).setAsma(asma.isSelected());
                                                                            main.listaPacientes.get(pos).setHepatopatias(hepatopatias.isSelected());
                                                                            main.listaPacientes.get(pos).setCarcinomas(carcinomas.isSelected());
                                                                            main.listaPacientes.get(pos).setEnfermedadEndocrinas(enfermedadEndocrinas.isSelected());
                                                                            main.listaPacientes.get(pos).setOtros("");
                                                                            main.listaPacientes.get(pos).mostrarDatos(); // Prueba para mostrar datos del paciente agregado

                                                                            panel2.setVisible(true);
                                                                            panel.setVisible(false);
                                                                            setSize(400, 300);

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
                setSize(400, 300);
            }
        });

        panel.add(layeredPane);
        add(panel);
        panel.setVisible(false);

        JLayeredPane layeredPane2 = new JLayeredPane();
        layeredPane2.setSize(400, 300);

        JLabel backgroundLabel2 = new JLabel(new ImageIcon("C:/Users/abarc/Documents/GitHub/proyectoComputacion2/src/main/java/com/mycompany/proyecto/grey2.png"));
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

                    if (main.listaPacientes.size()== pos)//Se pregunta si posición se salió del tamaño de la lista.
                    {
                        bandera = false; //En caso de que posición se salió del tamaño de la lista, "salimos"  ya que no hay paciente que coincida.
                    }
                    else if (main.listaPacientes.get /*paciente*/(pos).getTipoIdent().equals /*Y comparalos*/ (pacienteBuscar.getText()))//Se compara el ID del paciente por el que vamos contando, con ID ingresado en la busqueda.
                    {
                        bandera = false;//En caso que coinciden pasamos a bandera false para salir del bucle.
                    }
                    else
                    {
                        pos +=1;// Y continua la verificación del siguiente paciente.
                    }
                }

                if (main.listaPacientes.size()== pos)
                {
                    JOptionPane.showMessageDialog(null,"Ups, parece que no ingresaste una identificación existente.(ŏ﹏ŏ。)\n    ¡Por favor, intenta otra vez con una identificación existente!" , "¡Oh no! (ŏ﹏ŏ。)", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    posicion[0] = pos;

                    nombre.setText(main.listaPacientes.get(pos).getNombre()); //Limpia el cuadrito en el que el usuario escribe "en este caso nombre"
                    apellido.setText(main.listaPacientes.get(pos).getApellido());
                    fechaNacimiento.setText(main.listaPacientes.get(pos).getFechaNacimiento());
                    fechaConsulta.setText(main.listaPacientes.get(pos).getFechaConsulta());
                    edad.setText(main.listaPacientes.get(pos).getEdad()+"");
                    tipoIdent.setText(main.listaPacientes.get(pos).getTipoIdent());
                    sexo.setText(main.listaPacientes.get(pos).getSexo());
                    tipoSangre.setText(main.listaPacientes.get(pos).getTipoSangre());
                    nacionalidad.setText(main.listaPacientes.get(pos).getNacionalidad());
                    puesto.setText(main.listaPacientes.get(pos).getPuesto());
                    tiempoTrabajo.setText(main.listaPacientes.get(pos).getTiempoTrabajo());
                    correo.setText(main.listaPacientes.get(pos).getCorreo());
                    direccion.setText(main.listaPacientes.get(pos).getDireccion());
                    contactoEmergencia.setText(main.listaPacientes.get(pos).getContactoEmergencia());
                    telefonoContEmer.setText(main.listaPacientes.get(pos).getTelefonoContEmer()+"");

                    diabetes.setSelected(main.listaPacientes.get(pos).isDiabetes()); //Quita el check de selección "en este caso para diabetes"
                    TB.setSelected(main.listaPacientes.get(pos).isTB());
                    enfermedadMental.setSelected(main.listaPacientes.get(pos).isEnfermedadMental());
                    cardiopatia.setSelected(main.listaPacientes.get(pos).isCardiopatia());
                    epilepsia.setSelected(main.listaPacientes.get(pos).isEpilepsia());
                    genetica.setSelected(main.listaPacientes.get(pos).isGenetica());
                    HTA.setSelected(main.listaPacientes.get(pos).isHTA());
                    asma.setSelected(main.listaPacientes.get(pos).isAsma());
                    hepatopatias.setSelected(main.listaPacientes.get(pos).isHepatopatias());
                    carcinomas.setSelected(main.listaPacientes.get(pos).isCarcinomas());
                    enfermedadEndocrinas.setSelected(main.listaPacientes.get(pos).isEnfermedadEndocrinas());
                    otros.setSelected(!main.listaPacientes.get(pos).getOtros().equals(""));

                    pacienteBuscar.setText("");
                    panel2.setVisible(false);
                    panel.setVisible(true);
                    setSize(560, 500);
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
                dispose();
                menu men = new menu();
            }
        });
        panel2.add(layeredPane2);
        add(panel2);

        setSize(400,300);//Se definen las dimensiones de la pantalla "agregar".
        setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente.
        setVisible(true);//Hace visible la pantalla de "agregar".
        setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
}
