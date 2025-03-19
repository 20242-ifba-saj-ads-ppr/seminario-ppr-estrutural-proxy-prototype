package ExemploDeCodigo;

public class ExemploProxySaude {
    public static void main(String[] args) {
        SistemaSaude sistemaMedico = new ProxySistemaSaude("MEDICO");
        SistemaSaude sistemaEnfermeiro = new ProxySistemaSaude("ENFERMEIRO");
        SistemaSaude sistemaUsuarioComum = new ProxySistemaSaude("USUARIO");

        sistemaMedico.visualizarDados("Pedro Silva");

        sistemaEnfermeiro.editarDados("Pedro Silva", "Alergia a dipirona");

        sistemaUsuarioComum.visualizarDados("Pedro Silva");

        sistemaUsuarioComum.editarDados("Pedro Silva", "Novo endereço: Rua 123");
    }
}