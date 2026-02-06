
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

    @Named("usuarioBean")
    @RequestScoped
    public class UsuarioBean {

        private String nome;
        private String mensagem;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }

        public String dizerOla() {
            if (nome != null && !nome.isBlank()) {
                mensagem = "Olá, " + nome + "!";
            } else {
                mensagem = "Por favor, digite seu nome.";
            }
            return null; // mantém na mesma página
        }
    }
