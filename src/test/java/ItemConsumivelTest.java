import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemConsumivelTest {

    @Test
    void deveCriarOleoCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Óleo de Cura",consumivel.criaOleo());
    }

    @Test
    void deveUsarOleoCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Cura 50% dos pontos de vida quando aplicado em ferimentos.",consumivel.usaOleo());
    }

    @Test
    void deveCriarOleoVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Óleo de Veneno",consumivel.criaOleo());
    }

    @Test
    void deveUsarOleoVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Adiciona o dano por veneno quando aplicado em uma arma.",consumivel.usaOleo());
    }

    @Test
    void deveCriarPocaoCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Poção de Cura", consumivel.criaPocao());
    }

    @Test
    void deveUsarPocaoCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Cura todos os pontos de vida.",consumivel.usaPocao());
    }

    @Test
    void deveCriarPocaoVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Poção de Veneno",consumivel.criaPocao());
    }

    @Test
    void deveUsarPocaoVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Morte instantânea se consumida.",consumivel.usaPocao());
    }

    @Test
    void deveCriarGranadaCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Granada de Cura", consumivel.criaGranada());
    }

    @Test
    void deveUsarGranadaCura(){
        ItemFactory fabrica = new FabricaItemCura();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Cura de 50% dos pontos de vida em uma área.",consumivel.usaGranada());
    }

    @Test
    void deveCriarGranadaVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Item criado: Granada de Veneno", consumivel.criaGranada());
    }

    @Test
    void deveUsarGranadaVeneno(){
        ItemFactory fabrica = new FabricaItemVeneno();
        ItemConsumivel consumivel = new ItemConsumivel(fabrica);
        assertEquals("Efeito: Dano cumulativo de veneno por 30 sgundos em área.",consumivel.usaGranada());
    }

}