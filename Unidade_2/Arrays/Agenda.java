package Unidade_2.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private  ArrayList<EntradaEmAgenda> agenda = new ArrayList<EntradaEmAgenda>();

    public Agenda(ArrayList<EntradaEmAgenda> agenda) {
        this.agenda = agenda;
    }

    public void addCompromisso(ArrayList<EntradaEmAgenda> agenda, EntradaEmAgenda novoCompromisso) {
        agenda.add(novoCompromisso);
    }

    
}
