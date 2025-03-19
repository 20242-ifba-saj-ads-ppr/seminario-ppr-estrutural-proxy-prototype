package ExemploDeCodigo;

class ProxySistemaSaude implements SistemaSaude {
    private SistemaSaudeReal sistemaReal;
    private String usuario;

    public ProxySistemaSaude(String usuario) {
        this.usuario = usuario;
        this.sistemaReal = new SistemaSaudeReal();
    }

    @Override
    public void visualizarDados(String paciente) {
        if (temPermissao()) {
            sistemaReal.visualizarDados(paciente);
        } else {
            System.out.println("Acesso negado. Você não tem permissão para visualizar os dados do paciente.");
        }
    }

    @Override
    public void editarDados(String paciente, String novosDados) {
        if (temPermissao()) {
            sistemaReal.editarDados(paciente, novosDados);
        } else {
            System.out.println("Acesso negado. Você não tem permissão para editar os dados do paciente.");
        }
    }

    private boolean temPermissao() {
        return "MEDICO".equals(usuario) || "ENFERMEIRO".equals(usuario);
    }
}
