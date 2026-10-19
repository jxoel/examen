public class MainNodoRed {
    static void main() {
        NodoRed nodo1 = new NodoRed(1, 2);
        nodo1.setConexionesactivas(0);

        nodo1.conectar();
        nodo1.conectar();
        nodo1.conectar();

        nodo1.desconectar();
        nodo1.desconectar();
        nodo1.desconectar();

    }





}
