package main;

public class Emissora {
    IEmissora conjuntoDadosGerados;
    DadosAdaptador benjamin;

    public Emissora() {
        conjuntoDadosGerados = new DadosDigital();
        benjamin = new DadosAdaptador(conjuntoDadosGerados);
    }

    public void setConjuntoDadosGerados(String dados){
        conjuntoDadosGerados.setDado(dados);
        benjamin.salvarDado();
    }

    public String getConjuntoDadosGerados(){
        return benjamin.recuperarDado();
    }
}
