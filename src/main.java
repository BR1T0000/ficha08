public class main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empresa.Funcionario = new Funcionario[10];
        Funcionario funcionario = new Funcionario();
        Funcionario f1 = new Funcionario();
        f1.salario = 1000;
        empresa.adiciona(f1);


    }
}
