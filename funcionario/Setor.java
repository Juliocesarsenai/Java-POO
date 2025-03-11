package funcionario;

public enum Setor {
  
        RECURSOS_HUMANOS("Recursos Humanos"),
        FINANCEIRO("Financeiro"),
        OPERACOES("Operações");
    
        private final String descricao;
    
        Setor(String descricao) {
            this.descricao = descricao;
        }
    
        public String getDescricao() {
            return descricao;
        }
    }

