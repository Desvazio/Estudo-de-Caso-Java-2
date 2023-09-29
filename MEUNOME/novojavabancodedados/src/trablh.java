public class trablh {
    public class Produto {
        private String nome;
        private String descricao;
     
        public Produto(String nome, String descricao) {
             this.nome = nome;
             this.descricao = descricao;
        }
     
        // Getters e setters
     }
     
     public class Processador extends Produto {
        private String modelo;
        private double velocidadeGHz;
     
        public Processador(String nome, String descricao, String modelo, double velocidadeGHz) {
             super(nome, descricao);
             this.modelo = modelo;
             this.velocidadeGHz = velocidadeGHz;
        }
     
        // Getters e setters
     }
     
     public class SistemaOperacional extends Produto {
        private String versao;
     
        public SistemaOperacional(String nome, String descricao, String versao) {
             super(nome, descricao);
             this.versao = versao;
        }
     
        // Getters e setters
     }
     
     public class Computador extends Produto {
        private String tipo;
     
        public Computador(String nome, String descricao, String tipo) {
             super(nome, descricao);
             this.tipo = tipo;
        }
     
        // Getters e setters
     }
}
