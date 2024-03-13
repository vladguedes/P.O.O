package Unidade_2.Arrays;

public class EntradaEmAgenda {
    private String assunto;
    private String hora;
    private int dia;
    private int mes;
    private int ano;
    
    public EntradaEmAgenda(String assunto, String hora, int dia, int mes, int ano) {
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

}
