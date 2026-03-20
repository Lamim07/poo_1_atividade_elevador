public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador(10);

        elevador.status();

        elevador.abrirPorta();
        elevador.subir();

        elevador.fecharPorta();
        elevador.subir();
        elevador.subir();

        elevador.descer();

        elevador.status();
    }
}