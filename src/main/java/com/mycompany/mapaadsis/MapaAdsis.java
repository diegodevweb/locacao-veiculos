package com.mycompany.mapaadsis;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author diego
 */
public class MapaAdsis{

    public static void main(String[] args) {
        Carro carro = new Carro();
        Cliente cliente = new Cliente();
        Aluguel aluguel = new Aluguel();
       
        
        aluguel.iniciarLocacao();
        
        aluguel.fecharLocacao();
        
        aluguel.mostrarResumoLocacao();
    }
}
