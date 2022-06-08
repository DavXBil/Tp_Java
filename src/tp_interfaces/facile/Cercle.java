package tp_interfaces.facile;

public class Cercle implements ObjetGeometrique {

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double surface() {
        return Math.PI * (this.rayon * this.rayon);
    }
}
