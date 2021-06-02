package Model;

import java.util.Objects;

public class Articulo {

    int codigo;
    String descripcion;
    String genero;
    String talla;
    String composicion;
    double precio;

    public Articulo(int codigo, String descripcion, String genero, String talla, String composicion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.talla = talla;
        this.composicion = composicion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return codigo == articulo.codigo && Double.compare(articulo.precio, precio) == 0 && Objects.equals(descripcion, articulo.descripcion) && Objects.equals(genero, articulo.genero) && Objects.equals(talla, articulo.talla) && Objects.equals(composicion, articulo.composicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, genero, talla, composicion, precio);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", genero='" + genero + '\'' +
                ", talla='" + talla + '\'' +
                ", composicion='" + composicion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
