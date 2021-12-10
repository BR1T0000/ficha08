public class Funcionario {
        private String nome ;
        private String departamento ;
        private double salario;
        private String dataEntrada;
        private String bi;
        private int identificador;

        public Funcionario() {
        }
        public Funcionario(String nome) {
        }

        public recebeAumento(double) {
        }
        public calculaGanhoAnual(double) {
        }
        public calculaHoraExtra(int) {
        }
        public getBonificacao(double) {
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getDepartamento() {
                return departamento;
        }

        public void setDepartamento(String departamento) {
                this.departamento = departamento;
        }

        public double getSalario() {
                return salario;
        }

        public void setSalario(double salario) {
                this.salario = salario;
        }

        public String getDataEntrada() {
                return dataEntrada;
        }

        public void setDataEntrada(String dataEntrada) {
                this.dataEntrada = dataEntrada;
        }

        public String getBi() {
                return bi;
        }

        public void setBi(String bi) {
                this.bi = bi;
        }

        public int getIdentificador() {
                return identificador;
        }

        public void setIdentificador(int identificador) {
                this.identificador = identificador;
        }

        @Override
        public String toString() {
                return "nome='" + nome + '\'' + ", salario=" + salario;
        }
}

