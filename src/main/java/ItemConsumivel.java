public class ItemConsumivel {

    private Oleo oleo;
    private Pocao pocao;
    private Granada granada;

    public ItemConsumivel (ItemFactory fabricaItem){
        this.granada = fabricaItem.criaGranada();
        this.oleo = fabricaItem.criaOleo();
        this.pocao = fabricaItem.criaPocao();
    }

    String criaOleo(){
        return this.oleo.criar();
    }

    String usaOleo(){
        return this.oleo.usar();
    }

    String criaPocao(){
        return this.pocao.criar();
    }

    String usaPocao(){
        return this.pocao.usar();
    }

    String criaGranada(){
        return this.granada.criar();
    }

    String usaGranada(){
        return this.granada.usar();
    }
}
