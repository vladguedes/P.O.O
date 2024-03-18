package Unidade_2.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class EntradaEmAgenda {
    private String assunto;
    private String hora;
    private int dia;
    private int mes;
    private int ano;
    
    EntradaEmAgenda(String assunto, String hora, int dia, int mes, int ano) {
        this.assunto = assunto;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "EntradaEMAgenda [assunto=" + assunto + ", hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano="
                + ano + "]";
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        if (dia == this.dia & mes == this.mes & ano == this.ano) {
            return (true);
        } else {
            return (false);
        }
    }

    public void listaDia(ArrayList<EntradaEmAgenda> agenda, int dia, int mes, int ano) {
        Iterator<EntradaEmAgenda> i = agenda.iterator();
        while (i.hasNext()) {
            if (dia == )
        }
    }

}
