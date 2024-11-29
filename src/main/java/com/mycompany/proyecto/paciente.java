/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Lee
 */
import javax.swing.JOptionPane;

public class paciente 
{
    //Aquí inician los atributos.
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String fechaConsulta;
    private int edad;
    private String tipoIdent;
    private String sexo;
    private String tipoSangre;
    private String nacionalidad;
    private String puesto;
    private String tiempoTrabajo;
    private String correo;
    private String direccion;
    private String contactoEmergencia;
    private int telefonoContEmer;
    private boolean diabetes;
    private boolean TB;
    private boolean enfermedadMental;
    private boolean cardiopatia;
    private boolean epilepsia;
    private boolean genetica;
    private boolean HTA;
    private boolean asma;
    private boolean hepatopatias;
    private boolean carcinomas;
    private boolean enfermedadEndocrinas;
    private String otros;
    //Y aquí terminan los atributos.
    
    //Creación del constructor.
    public paciente(String nombre,String apellido,String fechaNacimiento,String fechaConsulta,int edad,String tipoIdent,String sexo,String tipoSangre,
            String nacionalidad, String puesto,String tiempoTrabajo,String correo, String direccion,String contactoEmergencia,int telefonoContEmer,
            boolean diabetes,boolean TB,boolean enfermedadMental,boolean cardiopatia,boolean epilepsia,boolean genetica,boolean HTA,boolean asma,
            boolean hepatopatias, boolean carcinomas, boolean enfermedadEndocrinas, String otros)
            //Datos que necesita el constructor para guardar en los atributos.
            //Constructor pide los datos dentro de los paréntesis. 
    {  
            // El constructor va guardar lo que pregunto.
            this.nombre = nombre;
            //this es una forma de asegurarse que llama al atributo de toda la clase (los de arriba del todo).
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.fechaConsulta = fechaConsulta;
            this.edad = edad;
            this.tipoIdent = tipoIdent;
            this.sexo = sexo;
            this.tipoSangre = tipoSangre;
            this.nacionalidad = nacionalidad;
            this.puesto = puesto;
            this.tiempoTrabajo = tiempoTrabajo;
            this.correo = correo;
            this.direccion = direccion;
            this.contactoEmergencia = contactoEmergencia;
            this.telefonoContEmer = telefonoContEmer; 
            this.diabetes = diabetes;
            this.TB = TB;
            this.enfermedadMental = enfermedadMental;
            this.cardiopatia = cardiopatia;
            this.epilepsia = epilepsia;
            this.genetica = genetica;
            this.HTA = HTA;
            this.asma = asma;
            this.hepatopatias = hepatopatias;
            this.carcinomas = carcinomas;
            this.enfermedadEndocrinas = enfermedadEndocrinas;
            this.otros = otros;

    }
    //Inicia los getters (Son los métodos que utilizamos para acceder a los atributos, ya que arriba están en privado)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoIdent() {
        return tipoIdent;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public int getTelefonoContEmer() {
        return telefonoContEmer;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public boolean isTB() {
        return TB;
    }

    public boolean isEnfermedadMental() {
        return enfermedadMental;
    }

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public boolean isEpilepsia() {
        return epilepsia;
    }

    public boolean isGenetica() {
        return genetica;
    }

    public boolean isHTA() {
        return HTA;
    }

    public boolean isAsma() {
        return asma;
    }

    public boolean isHepatopatias() {
        return hepatopatias;
    }

    public boolean isCarcinomas() {
        return carcinomas;
    }

    public boolean isEnfermedadEndocrinas() {
        return enfermedadEndocrinas;
    }

    public String getOtros() {
        return otros;
    }
    
    //Inicio de los setters (Son métodos que utilizamos para editar los atrubutos, ya que los atributos son privados)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoIdent(String tipoIdent) {
        this.tipoIdent = tipoIdent;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setTiempoTrabajo(String tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public void setTelefonoContEmer(int telefonoContEmer) {
        this.telefonoContEmer = telefonoContEmer;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public void setTB(boolean TB) {
        this.TB = TB;
    }

    public void setEnfermedadMental(boolean enfermedadMental) {
        this.enfermedadMental = enfermedadMental;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public void setEpilepsia(boolean epilepsia) {
        this.epilepsia = epilepsia;
    }

    public void setGenetica(boolean genetica) {
        this.genetica = genetica;
    }

    public void setHTA(boolean HTA) {
        this.HTA = HTA;
    }

    public void setAsma(boolean asma) {
        this.asma = asma;
    }

    public void setHepatopatias(boolean hepatopatias) {
        this.hepatopatias = hepatopatias;
    }

    public void setCarcinomas(boolean carcinomas) {
        this.carcinomas = carcinomas;
    }

    public void setEnfermedadEndocrinas(boolean enfermedadEndocrinas) {
        this.enfermedadEndocrinas = enfermedadEndocrinas;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }
    
    public void mostrarDatos() 
    {
        //Es un constructor de String que mediante el: .append agrega más texto.
        //Es una forma de crear "String: cadenas de texto" de una fortma ordenada para que sea más fácil editar el texto qeu estamos haciendo.
        //StringBuilder permite agregar (".append") texto fácilmente y unir todo al final sin crear nuevas cadenas de texto.
        StringBuilder datos = new StringBuilder();//Sea crea un creador de Strings llamado "Datos" para agregarle texto a continuación:
        
        datos.append("Nombre: ").append(nombre).append("\n");
        datos.append("Apellido: ").append(apellido).append("\n");
        datos.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
        datos.append("Fecha de Consulta: ").append(fechaConsulta).append("\n");
        datos.append("Edad: ").append(edad).append("\n");
        datos.append("Tipo de Identificación: ").append(tipoIdent).append("\n");
        datos.append("Sexo: ").append(sexo).append("\n");
        datos.append("Tipo de Sangre: ").append(tipoSangre).append("\n");
        datos.append("Nacionalidad: ").append(nacionalidad).append("\n");
        datos.append("Puesto: ").append(puesto).append("\n");
        datos.append("Tiempo de Trabajo: ").append(tiempoTrabajo).append("\n");
        datos.append("Correo: ").append(correo).append("\n");
        datos.append("Dirección: ").append(direccion).append("\n");
        datos.append("Contacto de Emergencia: ").append(contactoEmergencia).append("\n");
        datos.append("Teléfono de Contacto de Emergencia: ").append(telefonoContEmer).append("\n");
        datos.append("Diabetes: ").append(diabetes ? "Sí" : "No").append("\n");
        datos.append("Tuberculosis: ").append(TB ? "Sí" : "No").append("\n");
        datos.append("Enfermedad Mental: ").append(enfermedadMental ? "Sí" : "No").append("\n");
        datos.append("Cardiopatía: ").append(cardiopatia ? "Sí" : "No").append("\n");
        datos.append("Epilepsia: ").append(epilepsia ? "Sí" : "No").append("\n");
        datos.append("Genética: ").append(genetica ? "Sí" : "No").append("\n");
        datos.append("HTA: ").append(HTA ? "Sí" : "No").append("\n");
        datos.append("Asma: ").append(asma ? "Sí" : "No").append("\n");
        datos.append("Hepatopatías: ").append(hepatopatias ? "Sí" : "No").append("\n");
        datos.append("Carcinomas: ").append(carcinomas ? "Sí" : "No").append("\n");
        datos.append("Enfermedades Endocrinas: ").append(enfermedadEndocrinas ? "Sí" : "No").append("\n");
        datos.append("Otros: ").append(otros).append("\n");

        // Muestra un cuadro de diálogo con los datos
        JOptionPane.showMessageDialog(null, datos.toString(), "Datos del Paciente", JOptionPane.INFORMATION_MESSAGE);
    }

}
