import java.util.*;

public class Clientes {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Chavo"));
        clientes.add(new Cliente("Chilindrina"));
        clientes.add(new Cliente("Don Ramón"));
        clientes.add(new Cliente("Florinda"));
        clientes.add(new Cliente("Kiko"));

        Scanner scan = new Scanner(System.in);

        System.out.println("Programa que busca un cliente en una lista por su nombre.");

        System.out.print("\nIngrese el nombre cliente: ");
        String nombreBuscado = scan.nextLine();

        int pos  = buscarCliente(nombreBuscado, clientes);

        if( pos != -1){
            System.out.println(String.format("El cliente/a \"%s\" se encuentra en la posición %d.", nombreBuscado, pos));
        }else{
            System.out.println(String.format("El cliente/a \"%s\" no se encuentra en la lista.", nombreBuscado));
        }

    }

    /**
     * Método que busca la primera coincidencia por nombre en una lista.
     * @param nombre, a buscar.
     * @param clientes, lista donde buscar.
     * @return devuelve la posición en la lista, ó -1 si no se encuentra.
     */
    private static int buscarCliente(String nombre, List<Cliente> clientes){
        for(Cliente c : clientes){
            if(c.getNombre().equals(nombre))
                return clientes.indexOf(c);
        }
        return -1;
    }
}