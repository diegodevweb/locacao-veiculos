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
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    void cadastrarUsuario() {
        
        nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        cpf = JOptionPane.showInputDialog("Digite o cpf do usuário:");
        telefone = JOptionPane.showInputDialog("Digite o telefone do usuário:");
    }

    public String mostrarDadosUsuario() {
        
        String resultado = "Nome: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Telefone: " + getTelefone() + "\n";
        
        return resultado;
        
    }
}
