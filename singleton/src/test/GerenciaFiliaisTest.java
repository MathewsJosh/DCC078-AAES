package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class GerenciaFiliaisTest {

    @Test
    public void deveRetornarNomeFilial() {
        main.GerenciaFiliais.getInstance().setNomeFilial("Bahamas 3541");
        assertEquals("Bahamas 3541", main.GerenciaFiliais.getInstance().getNomeFilial());
    }

    @Test
    public void deveRetornarVendedorLogado() {
        main.GerenciaFiliais.getInstance().setVendedorLogado("Vendedor 1");
        assertEquals("Vendedor 1", main.GerenciaFiliais.getInstance().getVendedorLogado());
    }


    @Test
    public void deveRetornarTelefoneFilial() {
        main.GerenciaFiliais.getInstance().setTelefoneLoja("(32)3551-1420");
        assertEquals("(32)3551-1420", main.GerenciaFiliais.getInstance().getTelefoneLoja());
    }

}