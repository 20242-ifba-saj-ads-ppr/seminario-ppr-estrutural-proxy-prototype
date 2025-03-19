package ExemploDeCodigo;


class SistemaSaudeReal implements SistemaSaude {
    @Override
    public void visualizarDados(String paciente) {
        System.out.println("Visualizando dados do paciente: " + paciente);
    }

    @Override
    public void editarDados(String paciente, String novosDados) {
        System.out.println("Editando dados do paciente: " + paciente + " com novos dados: " + novosDados);
    }
}
