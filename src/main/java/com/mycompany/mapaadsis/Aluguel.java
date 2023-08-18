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
public class Aluguel {

    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    void iniciarLocacao() {

        cliente = new Cliente();
        cliente.cadastrarUsuario();

        carro = new Carro();
        carro.cadastrarCarro();

        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do km inicial"));
    }

    void fecharLocacao() {

        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do km final"));    
        qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias locados: "));
        
        calcularLocacao();
    }

    void mostrarResumoLocacao() {

        String mensagem = "Resumo Aluguel\n"
                + "Cliente\n"
                + "Nome: " + cliente.getNome() + "\n"
                + "CPF: " + cliente.getCpf() + "\n"
                + "Telefone: " + cliente.getTelefone() + "\n"
                + "Carro\n"
                + "Modelo: " + carro.getModelo() + "\n"
                + "Marca: " + carro.getMarca() + "\n"
                + "Valor por Km: " + carro.getValorPorKm() + "\n"
                + "Aluguel\n"
                + "Quantidade de dias: " + qtdDias + "\n"
                + "Km Inicial: " + kmInicial + "\n"
                + "Km Final: " + kmFinal + "\n"
                + "Valor Total: R$" + valorTotalAluguel;

        JOptionPane.showMessageDialog(null, mensagem);

    }

    void calcularLocacao() {

        double valorPorKm = carro.getValorPorKm();
        double valorParcialAluguel = (valorPorKm * qtdDias);

        if (qtdDias > 20) {
            valorTotalAluguel = valorParcialAluguel * 0.8;
        } else if (qtdDias > 10) {
            valorTotalAluguel = valorParcialAluguel * 0.9;
        } else {
            valorTotalAluguel = valorParcialAluguel;
        }

    }

}
