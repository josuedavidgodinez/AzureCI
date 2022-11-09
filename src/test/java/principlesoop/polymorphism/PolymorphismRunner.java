package principlesoop.polymorphism;

public class PolymorphismRunner {

    public static void main(String[] args) {

        Perro a = new Perro("Scooby Doo", 2, 25, "Gran Danés");
        Perro b = new Perro("Pluto", 4, 20);
        Gato c = new Gato("Félix", 3, 17, "Blanquinegro");
        Gato d = new Gato("Garfield", 6, 32, "Naranja");
        Perro e = new Perro("Ayudante de Santa", 2, 14, "Galgo");
        Gato f = new Gato("Bola de nieve II", 4, 20, "Negro");
        Loro g = new Loro("Alex", 2, 1, 80);

        Mascota[] mascotas = {b, a, f, g, c, e, d};

        // Aquí se ve al polimorfismo por interfaces en acción
        for (int i = 0; i < mascotas.length; i++) {
            mascotas[i].comer(); // Todos responden al mismo mensaje, de diferentes formas
        }
    }

}
