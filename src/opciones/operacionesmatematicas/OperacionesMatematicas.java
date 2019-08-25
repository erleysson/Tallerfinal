package opciones.operacionesmatematicas;

import static clases.constantes.MatematicasString.*;
import static clases.constantes.MatematicasEnteros.*;
import clases.operaciones.MatematicasLogica;
import menu.Menu;
import javax.swing.*;
import java.awt.*;

public class OperacionesMatematicas extends Frame {

    protected JPanel operacionesmatematicasform;
    protected JTextField txtnumero1;
    protected JTextField txtnumero2;
    protected JButton btnsumar;
    protected JButton btnrestar;
    protected JButton btnmultiplicar;
    protected JButton btndividir;
    protected JButton btnsalir;
    protected JLabel lblresultado;

    public OperacionesMatematicas(){
        MatematicasLogica matematicasLogica = new MatematicasLogica();
        add(operacionesmatematicasform);
        setTitle(TITULO_OPCION_MATEMATICAS.getTexto());
        setSize(QUINIENTOS.getValor(), SEISCIENTOS.getValor());
        btnsalir.addActionListener(e -> {
                Menu menu = new Menu();
                menu.setVisible(true);
                esconderVentana();
        });

        btnsumar.addActionListener(e -> {
            matematicasLogica.setNumero1(Double.parseDouble(txtnumero1.getText()));
            matematicasLogica.setNumero2(Double.parseDouble(txtnumero2.getText()));
            lblresultado.setVisible(true);
            lblresultado.setText(String.valueOf(matematicasLogica.calcularSuma()));
        });
        btnrestar.addActionListener(e ->{
            matematicasLogica.setNumero1(Double.parseDouble(txtnumero1.getText()));
            matematicasLogica.setNumero2(Double.parseDouble(txtnumero2.getText()));
            lblresultado.setVisible(true);
            lblresultado.setText(String.valueOf(matematicasLogica.calcularResta()));
        });
        btnmultiplicar.addActionListener(e ->{
            matematicasLogica.setNumero1(Double.parseDouble(txtnumero1.getText()));
            matematicasLogica.setNumero2(Double.parseDouble(txtnumero2.getText()));
            lblresultado.setVisible(true);
            lblresultado.setText(String.valueOf(matematicasLogica.calcularMultiplicacion()));
        });
        btndividir.addActionListener(e ->{
            matematicasLogica.setNumero1(Double.parseDouble(txtnumero1.getText()));
            matematicasLogica.setNumero2(Double.parseDouble(txtnumero2.getText()));
            lblresultado.setVisible(true);
            lblresultado.setText(String.valueOf(matematicasLogica.calcularDivision()));
        });

    }

    private void esconderVentana(){ this.dispose();  }

}
