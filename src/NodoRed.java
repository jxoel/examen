public class NodoRed {

    private int id;
    private int maxconexiones;
    private int conexionesactivas;

    private static int contadornodos = 0;
    private static int contadornodosfinal = 0 ;

    public NodoRed(int id, int maxconexiones) {
        this.id = id;
        this.maxconexiones = maxconexiones;
        contadornodos++;

    }

    public void setConexionesactivas(int conexionesactivas) {
        if (maxconexiones < conexionesactivas){
            System.out.println("Limite de conexiones de el nodo");
            return;
        }
        this.conexionesactivas = conexionesactivas;
        contadornodosfinal++;
    }


    public boolean conectar (){
        if (maxconexiones > conexionesactivas){
            conexionesactivas++;
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public boolean desconectar(){
        if (conexionesactivas<1){
            System.out.println("false");
            return false;
        }else{
            conexionesactivas--;
            System.out.println("true");
            return true;
        }
    }

    public int getConexionesactivas() {return conexionesactivas;}

    public int getContadornodos(){return contadornodos;}
    public int getContadornodosfinal(){return contadornodosfinal;}



    }




