public class FabricaItemCura implements ItemFactory{

    public Oleo criaOleo() {
        return new OleoCurativo();
    }

    public Pocao criaPocao() {
        return new PocaoDeCura();
    }

    public Granada criaGranada() {
        return new GranadaCurativa();
    }
}
