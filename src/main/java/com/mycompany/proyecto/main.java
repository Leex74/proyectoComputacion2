/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.ArrayList;

/**
 *
 * @author Lee
 */
public class main 
{
    protected static ArrayList<paciente> listaPacientes = new ArrayList<paciente>(); //Lista dónde se guarda todos los pacientes.
    protected static String usuarios[]= new String[12];
    protected static String contraseñas[]= new String[12];
    public static boolean repetido(String Iden)
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
    public static boolean correo(String Iden)
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
    public static boolean telefono(String Iden)
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
    public static void main (String[] args)
    {
        login log = new login();
    }
}
