import ingresoDatos.Inicio;
import repositorio.navesRepositorio;

public class main {
    public static void main(String[] args) {
        InicioInventarios();
    }

public static void InicioInventarios(){
    navesRepositorio.crearConexion();
    Inicio.entrada();
    }

}
