package main;

public class GerenciaFiliais {

    private GerenciaFiliais() {};
    private static main.GerenciaFiliais instance = new main.GerenciaFiliais();
    public static main.GerenciaFiliais getInstance() {
        return instance;
    }

    private String nomeFilial;
    private String vendedorLogado;
    private String telefoneLoja;

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setVendedorLogado(String vendedorLogado) {
        this.vendedorLogado = vendedorLogado;
    }

    public String getVendedorLogado() {
        return vendedorLogado;
    }

    public void setTelefoneLoja(String telefoneLoja) {
        this.telefoneLoja = telefoneLoja;
    }

    public String getTelefoneLoja() {
        return telefoneLoja;
    }


}
