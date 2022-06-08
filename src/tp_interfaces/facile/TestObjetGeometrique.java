package tp_interfaces.facile;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] objects = new ObjetGeometrique[2];

        objects[0] = new Cercle(2.8);
        objects[1] = new Rectangle(20, 10);


        for (ObjetGeometrique object: objects) {

            System.out.println(object.perimetre());
            System.out.println(object.surface());
        }
    }

}
