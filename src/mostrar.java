import javax.swing.*;

public class mostrar {
        public static void main(String[] args) {
            //Instancia de la clase panel
            dibujo panel = new dibujo();
            //crear un marco de ventana
            JFrame aplicacion = new JFrame();
            //boton para cerrar ventana
            aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion.add(panel); //agregar panel a la ventana
            aplicacion.setSize(650,650); //settear tamaño de ventana
            aplicacion.setVisible(true); // visualizar ventana

           dibujo1 panel2 = new dibujo1();
            //crear un marco de ventana
            JFrame aplicacion2 = new JFrame();
            //boton para cerrar ventana
            aplicacion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion2.add(panel2); //agregar panel a la ventana
            aplicacion2.setSize(650,650); //settear tamaño de ventana
            aplicacion2.setVisible(true); // visualizar ventana

            dibujo3 panel3 = new dibujo3(); // crear un marco de ventana
            JFrame aplicacion3 = new JFrame(); // boton para cerrar ventana
            aplicacion3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion3.add(panel3); // agregar panel a la ventana
            aplicacion3.setSize(650, 650); // settear tamaño de ventana
            aplicacion3.setVisible(true); // visualizar ventana

            dibujo4 panel4 = new dibujo4(); // crear un marco de ventana
            JFrame aplicacion4 = new JFrame(); // boton para cerrar ventana
            aplicacion4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion4.add(panel4); // agregar panel a la ventana
            aplicacion4.setSize(650, 650); // settear tamaño de ventana
            aplicacion4.setVisible(true); // visualizar ventana
        }

}
