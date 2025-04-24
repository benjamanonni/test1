public class Main {
    public static void main(String[] args) {
        // crear inventario
        Inventario inventario = new Inventario();

        // crear aticulo
        Articulo articulo1 = new Articulo("Perfume1", "Dior", 1000, 2);
        Articulo articulo2 = new Articulo("Perfume2", "Savage", 1500, 1);
        Articulo articulo3 = new Articulo("Perfume3", "Paco", 2000, 10);

        // agregar articulo
        inventario.agregarArticulo(articulo1);
        inventario.agregarArticulo(articulo2);
        inventario.agregarArticulo(articulo3);

        // Mostrar lista de artículos
        System.out.println("lista de artículos:");
        inventario.listarArticulos();

        // Actualizar un artículo
        inventario.actualizarArticulo("Perfume2", 1600, 5);

        // Eliminar un artículo
        inventario.eliminarArticulo("Perfume1");

        // Mostrar lista actualizada
        System.out.println("lista de artículos después de actualizar y eliminar:");
        inventario.listarArticulos();
    }
}
