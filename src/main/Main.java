package main;

import static entidades.Mensajes.*;
import entidades.nombres.Persona;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        String nom = JOptionPane.showInputDialog(null,MENSAJE_PREGUNTA.getMensajes());
        persona.setNombre(nom);

        JOptionPane.showMessageDialog(null,MENSAJE_IMPRIMIR.getMensajes()+persona.mostrarNombre());
    }
}
