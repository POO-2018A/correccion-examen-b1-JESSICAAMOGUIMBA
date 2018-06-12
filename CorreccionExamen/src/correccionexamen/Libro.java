
package correccionexamen;

/**
 *
 * @author FRANCISCO
 */
public class Libro {
    
    private String titulo;
    private int anio;
    private boolean favorito;
    private Autor autor;
    
    //get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String Datos =  "Libro{" + "titulo=" + titulo + ", anio=" + anio + ", autor=" + autor + '}';
        return Datos;
    }
    
    
    
}
