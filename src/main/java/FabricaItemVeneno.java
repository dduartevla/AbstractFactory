public class FabricaItemVeneno implements ItemFactory{
    public Oleo criaOleo() {
        return new OleoVeneno();
    }

    public Pocao criaPocao() {
        return new PocaoVeneno();
    }

    public Granada criaGranada() {
        return new GranadaVeneno();
    }
}
