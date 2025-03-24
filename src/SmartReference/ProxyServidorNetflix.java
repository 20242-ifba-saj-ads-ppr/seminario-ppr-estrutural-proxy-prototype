import java.util.ArrayList;
import java.util.List;

class ProxyServidorNetflix implements StreamingService {
    private List<ServidorNetflix> servidores;

    public ProxyServidorNetflix() {
        servidores = new ArrayList<>();
    }

    public void adicionarServidor(ServidorNetflix servidor) {
        servidores.add(servidor);
    }

    private ServidorNetflix encontrarServidorDisponivel() {
        ServidorNetflix melhorServidor = null;
    
        for (ServidorNetflix servidor : servidores) {
            if (!servidor.estaCheio()) {
                if (melhorServidor == null || servidor.getUsuariosConectados() < melhorServidor.getUsuariosConectados()) {
                    melhorServidor = servidor;
                }
            }
        }
    
        return melhorServidor;
    }    

    @Override
    public void assistirFilme() {
        ServidorNetflix servidor = encontrarServidorDisponivel();
        if (servidor != null) {
            servidor.assistirFilme();
        } else {
            System.out.println("Todos os servidores estão cheios no momento. Tente novamente mais tarde.");
        }
    }

    @Override
    public void sairDoFilme() {
        for (ServidorNetflix servidor : servidores) {
            if (servidor.getUsuariosConectados() > 0) {
                servidor.sairDoFilme();
                return;
            }
        }
    
        System.out.println("Nenhum usuário conectado em nenhum servidor.");
    }
}