public class FabricaItemVeneno implements ItemFactory{
    public Tonico criaTonico() {
        return new TonicoVeneno();
    }

    public Pocao criaPocao() {
        return new PocaoVeneno();
    }

    public Granada criaGranada() {
        return new GranadaVeneno();
    }
}
