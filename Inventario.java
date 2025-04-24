public class Inventario {
    private Articulo[] listaArticulos;
    private int cantidadActual;

    public Inventario() {
        listaArticulos = new Articulo[1000]; // Array de 1000 artículos
        cantidadActual = 0;
    }

    // agregar artículo al inventario
    public void agregarArticulo(Articulo nuevo) {
        listaArticulos[cantidadActual] = nuevo;
        cantidadActual++;
    }

    // eliminar artículo marcarlo como eliminado poniendo el stock a 0
    public void eliminarArticulo(String nombre) {
        for (int i = 0; i < cantidadActual; i++) {
            if (listaArticulos[i].getNombre().equals(nombre)) {
                listaArticulos[i].setStock(0); // Marcamos el artículo como "eliminado"
                break; // Salimos del ciclo si encontramos el artículo
            }
        }
    }

    // actualizar precio y stock de un artículo
    public void actualizarArticulo(String nombre, double nuevoPrecio, int nuevoStock) {
        for (int i = 0; i < cantidadActual; i++) {
            if (listaArticulos[i].getNombre().equals(nombre)) {
                listaArticulos[i].setPrecio(nuevoPrecio);
                listaArticulos[i].setStock(nuevoStock);
                break;
            }
        }
    }

    // lista de articulos
    public void listarArticulos() {
        for (int i = 0; i < cantidadActual; i++) {
            Articulo articulo = listaArticulos[i];
            if (articulo.getStock() > 0) { 
                System.out.println("Nombre: " + articulo.getNombre() + ", Marca: " + articulo.getMarca() +
                        ", Precio: $" + articulo.getPrecio() + ", Stock: " + articulo.getStock());
            }
        }
    }
}
