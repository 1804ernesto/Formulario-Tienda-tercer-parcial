/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.formulariotienda;

/**
 *
 * @author DELL
 */
public class FormularioTienda {
    public static void main(String[] args) {
        // Ejecutar el formulario principal
        java.awt.EventQueue.invokeLater(() -> {
            // Crea y muestra el formulario principal
            new FormularioPrincipal().setVisible(true);
        });
    }

    private static class FormularioPrincipal {

        public FormularioPrincipal() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
