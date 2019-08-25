package menu;

import contabilidadsalarial.NominaSalario;
import conversion.ConversionMoneda;
import opciones.operacionesmatematicas.OperacionesMatematicas;


import javax.swing.*;
import java.awt.*;



public class Menu extends Frame {
    private JPanel menuprincipal;
    private JButton operacionesMatematicasButton;
    private JButton calcularSalarioButton;
    private JButton cerrarButton;
    private JButton convertidorDeMonedasButton;

    public Menu(){
        add(menuprincipal);
        setTitle("Menu principal");
        setSize(500, 600);
        operacionesMatematicasButton.addActionListener(e -> {
                OperacionesMatematicas operacionesMatematicas = new OperacionesMatematicas();
                operacionesMatematicas.setVisible(true);
                esconderVentana();
        });
        calcularSalarioButton.addActionListener(e -> {

            NominaSalario nominaSalariofrom= new NominaSalario();
            nominaSalariofrom.setVisible(true);
            esconderVentana();

        });
        cerrarButton.addActionListener(e -> dispose());


        convertidorDeMonedasButton.addActionListener(e ->{
            ConversionMoneda conversionMonedafrom = new ConversionMoneda();
           conversionMonedafrom.setVisible(true);
            esconderVentana();

        });
    }

    private void esconderVentana(){
        this.dispose();
    }

}
