package com.mycompany.mapaadsis;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author diego
 */
    class Carro {

    private int id;
    private String modelo;
    private String marca;
    private double valorPorKm;

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public String mostrarDadosCarro() {
        
        String dadosCarro = "Modelo: " + getModelo() + "\n" + "Marca: " + getMarca() + "\n" + "valor por km: " + getValorPorKm() + "\n";

        return dadosCarro;
    }

    void cadastrarCarro() {
        
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
        marca = JOptionPane.showInputDialog("Digite a marca do carro: ");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por km: "));
    }
}
