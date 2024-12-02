package com.mycompany.proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agregar extends JFrame
{
    public Agregar()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 560, 500);

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

                            if (correo.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")&& main.correo(correo.getText()))
                            {

                                if (telefonoContEmer.getText().matches("\\d+")&& main.telefono(telefonoContEmer.getText()))
                                {

                                    if (fechaConsulta.getText().matches("^\\d{2}/\\d{2}/\\d{4}$"))
                                    {

                                        if (edad.getText().matches("\\d+"))
                                        {

                                            if (tipoIdent.getText().matches("[a-zA-Z0-9]+") && main.repetido(tipoIdent.getText()))
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
                                                                            main.listaPacientes.add(new paciente(nombre.getText(), apellido.getText(), fechaNacimiento.getText(), fechaConsulta.getText(),
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

                                                                            main.listaPacientes.get(0).mostrarDatos(); // Prueba para mostrar datos del paciente agregado

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

                dispose();

            }
        });

        panel.add(layeredPane);
        add(panel);

        setSize(560,500);//Se definen las dimensiones de la pantalla "agregar".
        setLayout(null);//Apaga el acomodo automatico, todo se coloca manualmente.
        setVisible(true);//Hace visible la pantalla de "agregar".
        setResizable(false); //No permite cambiar el tamaño de la ventana ya que es false.
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Hace que al cerrar la ventana se termine la ejecusión.
        setLocationRelativeTo(null); //Hace que la ventana se coloque en el medio.
    }
}
