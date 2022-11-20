package main;

public class DadosDigital implements IEmissora{
    private String dadosDigital;


    @Override
    public String getDado() {
        return this.dadosDigital;
    }

    @Override
    public void setDado(String dado) {
        this.dadosDigital = dado;
    }
}
