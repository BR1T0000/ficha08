import java.util.Arrays;

public class Empresa {
    private String nome;
    private String numeroFiscal;
    private int numeroFuncionários;
    Funcionario[]array;


    public Empresa(String,String) {

    }
    public void adiciona(Funcionario f) {
        this.array[numeroFuncionários]=f;
        numeroFuncionários ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public int getNumeroFuncionários() {
        return numeroFuncionários;
    }

    public void setNumeroFuncionários(int numeroFuncionários) {
        this.numeroFuncionários = numeroFuncionários;
    }

    public mostraFuncionarios(){
        
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome='" + nome + '\'' + ", numeroFiscal='" + numeroFiscal + '\'';
    }
}
