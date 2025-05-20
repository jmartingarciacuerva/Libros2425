import java.util.ArrayList;
import java.util.Scanner;

public class GestionLibros {

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(new Libro("Geronimo","AutorGeronimo","Planeta",123,1));
        Libro libro1 = new Libro("AAA","BBB","CCC",300,1);
        libros.add(libro1);

        System.out.println(libros.get(0));
        System.out.println(libros.get(1));

        System.out.println(libros.get(0).equals(libros.get(1)));

        //Menu
        listado(libros);
        mostrarUnLibro(libros);
        crearNuevoLibro(libros);




    }

    private static void crearNuevoLibro(ArrayList<Libro> libros) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro ");
        String titulo = teclado.nextLine();
        System.out.println("Introduce el autor del libro ");
        String autor = teclado.nextLine();
        System.out.println("Introduce el editorial del libro ");
        String editorial = teclado.nextLine();
        System.out.println("Introduce el numero de paginas del titulo ");
        int nPaginas = teclado.nextInt();
        System.out.println("Introduce la edicion del libro ");
        int edicion = teclado.nextInt();

        Libro nuevoLibro= new Libro(titulo,autor,editorial,nPaginas,edicion);
        libros.add(nuevoLibro);

    }

    private static void mostrarUnLibro(ArrayList<Libro> libros) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro buscado ");
        String tituloBuscado= teclado.nextLine();
        //Creamos un libro solo con el titulo, para hacer la busqueda
        Libro libroBuscado =new Libro(tituloBuscado);

        if(libros.contains(libroBuscado)){ //Si está en la lista
            int posicion=libros.indexOf(libroBuscado); //Obtenemos su posicion
            Libro libroEncontrado = libros.get(posicion); //Cogemos el libro de la lista
            System.out.println(libroEncontrado); //Mostramos el libro encontrado
        }else{//Si no está en la lista
            System.out.println("NO ESTA");
        }
    }

    private static void listado(ArrayList<Libro> libros) {
        /*
        for(int i=0;i<libros.size();i++){
            System.out.println(libros.get(i));
        }*/
        for(Libro libro:libros){
            System.out.println(libro);
        }
    }

}
