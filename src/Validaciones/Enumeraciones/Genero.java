package Validaciones.Enumeraciones;

public enum Genero {
    M("Masculino"), F("Femenino"), U("Unisex");
    private final String genero;

    Genero(String miGenero) {
        genero = miGenero;
    }

    public String getGenero() {
        return genero;
    }
}
