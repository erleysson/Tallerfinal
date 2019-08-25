package clases.constantes;

public enum MatematicasString {

    TITULO_OPCION_MATEMATICAS("Opción de Operaciones Matemáticas"),
    ERROR("No se puede las tres opciones (Dolar/Yen/Euro)");

    private String texto;

    MatematicasString(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
