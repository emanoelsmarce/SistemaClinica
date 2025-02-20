package org.example;

import java.util.ArrayList;

public class Agenda {
    private String data;
    private ArrayList<Paciente> pacientes;


    public Agenda() {
        pacientes = new ArrayList<Paciente>();
        data = "";

    }

    public void adicionar(Paciente p) {
        pacientes.add(p);
    }

    public void remover(String cpf) {
        for (int i=0; i< pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i).getNome()+ "Foi removido com sucesso!!");
                pacientes.remove(i);
                i= pacientes.size();
            }
        }
    }

    public void pesquisar(String cpf) {

        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCpf().equals(cpf)) {
                System.out.println(pacientes.get(i).getNome());
                System.out.println(pacientes.get(i).getTelefone());
                System.out.println(pacientes.get(i).getIdade());
                i= pacientes.size();
            }
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}