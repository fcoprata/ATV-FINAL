public class Multa extends Regular {
    private String dataOcorrencia;

    public Multa(double valor, String descricao, String dataOcorrencia) {
        super(valor, descricao);
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(String dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }
}
