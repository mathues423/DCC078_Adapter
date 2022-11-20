package main;

public class DadosAdaptador extends Dados{
    private IEmissora dadosDigital;

    public DadosAdaptador(IEmissora dadosDigital) {
        this.dadosDigital = dadosDigital;
    }

    public String recuperarDado() {
        dadosDigital.setDado(
                this.getConjuntodados().replace("Dados convertidos para o padrão analogico: \n", "Dados convertidos para o padrão digital: \n")
        );
        return dadosDigital.getDado();
    }

    public void salvarDado() {
        this.setConjunto_dados("Dados convertidos para o padrão analogico: \n" + dadosDigital.getDado());
    }
}
