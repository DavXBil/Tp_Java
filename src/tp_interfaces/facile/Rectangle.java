package tp_interfaces.facile;

public class Rectangle implements ObjetGeometrique{

    int longeur;
    int largeur;

    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (this.longeur + this.largeur) * 2;
    }

    @Override
    public double surface() {
        return this.longeur * this.largeur;
    }
}
