public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getAlerta() {
        if (stock == 0) return "AGOTADO";
        if (stock <= 5) return "REPONER";
        return "Disponible";
    }

    public Object[] toRow() {
        return new Object[]{nombre, String.format("$%.2f", precio), stock, getAlerta()};
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void reducirStock(int cantidad) { stock -= cantidad; }
}