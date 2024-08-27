import java.util.Objects;
import java.util.TreeSet;

class Producto implements Comparable<Producto> {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return this.codigo.compareTo(otroProducto.codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null; // Si no se encuentra el producto, retorna null
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}

public class punto2 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar productos a la empresa
        empresa.agregarProducto(new Producto("001", "Laptop", 1200.50));
        empresa.agregarProducto(new Producto("002", "Mouse", 25.75));
        empresa.agregarProducto(new Producto("003", "Teclado", 45.00));

        // Mostrar productos
        empresa.mostrarProductos();

        // Buscar un producto por su código
        String codigoBusqueda = "002";
        Producto productoEncontrado = empresa.buscarProductoPorCodigo(codigoBusqueda);

        if (productoEncontrado != null) {
            System.out.println("Producto encontrado: " + productoEncontrado);
        } else {
            System.out.println("Producto con código " + codigoBusqueda + " no encontrado.");
        }
    }
}
