package tributaveis;

// ponto 5
public class Veiculo implements Cores, Tributavel {

    private String matricula;
    private int cilindrada;
    private String cor;

//    Variáveis para a alínea 13    
    private static int limiteEscalao1 = 1500;
    private static float impostoEscalao1 = 15;
    private static float impostoEscalao2 = 40;    

    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d "
                              + "tem cor %s", matricula, cilindrada, cor);
    }

    @Override
    public float calcularImposto() {
        return cilindrada<limiteEscalao1 ? impostoEscalao1 : impostoEscalao2;
    }

    public static int getLimiteEscalao1() {
        return limiteEscalao1;
    }

    public static float getImpostoEscalao1() {
        return impostoEscalao1;
    }

    public static float getImpostoEscalao2() {
        return impostoEscalao2;
    }

    public static void setLimiteEscalao1(int LimiteEscalao1) {
        Veiculo.limiteEscalao1 = LimiteEscalao1;
    }

    public static void setImpostoEscalao1(float aImpostoEscalao1) {
        impostoEscalao1 = aImpostoEscalao1;
    }

    public static void setImpostoEscalao2(float aImpostoEscalao2) {
        impostoEscalao2 = aImpostoEscalao2;
    }

}
