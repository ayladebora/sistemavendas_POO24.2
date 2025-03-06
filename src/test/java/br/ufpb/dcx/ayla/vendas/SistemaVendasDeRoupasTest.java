package br.ufpb.dcx.ayla.vendas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SistemaVendasDeRoupasTest {
    @Test
    public void testaCadastro() throws Exception {
        SistemaVendas sistema = new SistemaVendasDeRoupas();
        sistema.cadastrarProduto("B001","Bermuda Preta Hering M");
        assertTrue(sistema.existeProduto("B001"));
    //... TODO: COMPLETAR
    }
}

