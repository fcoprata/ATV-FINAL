public class IPVA extends Regular {
    private String dataVencimento;

    public IPVA(double valor, String descricao, String dataVencimento) {
        super(valor, descricao);
        this.dataVencimento = dataVencimento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
