package conversion;
import java.text.DecimalFormat;
import clases.operaciones.ConversionLogica;
import menu.Menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static clases.constantes.ConversionEnteros.*;


public class ConversionMoneda extends Frame {
    DecimalFormat decimalFormat = new DecimalFormat("###.###");
    DecimalFormat decimalFormato = new DecimalFormat("###.000");

    private JCheckBox eurosCheckBox;
    private JCheckBox dolaresCheckBox;
    private JCheckBox yenCheckBox;
    private JCheckBox pesosCOPCheckBox1;

    private JTextField txtvaloringresado;
    private JLabel lbltotal;
    private JPanel conversionMonedafrom;
    private JButton salirButton;
    private JButton convertidorbutton;
    transient ConversionLogica conversionLogica=new ConversionLogica();

    public ConversionMoneda(){
        setTitle("opciones de conversion ");
        setSize(QUINIENTOS.getValor(),SEISCIENTOS.getValor() );

        add(conversionMonedafrom);


        salirButton.addActionListener(e -> {
            menu.Menu menu = new Menu();
            menu.setVisible(true);
            esconderVentana();

        });
        convertidorbutton.addActionListener(e -> {
            if (txtvaloringresado.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"El campo esta vacoio");
            }

            eruosaPesos();
            dolaresPesos();
            yenPesos();
            validariguales();
        });
        /*------------------VALIDAR JTEXTFIELD----------*/
        txtvaloringresado.addKeyListener(new KeyAdapter() {

                int limite=15;
                @Override
                public void keyTyped(KeyEvent e) {
                    if (txtvaloringresado.getText().length() >= limite) //aqui lo comparas
                    {
                        e.consume();
                    }
                    super.keyTyped(e);
                    soloNumeros(e);
                }



        });
    }

    /*--------------------METODOS---------------------------*/
    private void esconderVentana(){ this.dispose();  }


    private void eruosaPesos(){
        if(eurosCheckBox.isSelected()&&pesosCOPCheckBox1.isSelected()){

            conversionLogica.setNumero1(Double.parseDouble(txtvaloringresado.getText()));
            lbltotal.setVisible(true);
            lbltotal.setText(String.valueOf(decimalFormat.format(conversionLogica.calculareurosapesos())));

        }

    }

    private void dolaresPesos(){
        if(dolaresCheckBox.isSelected()&&pesosCOPCheckBox1.isSelected()){

            conversionLogica.setNumero1(Double.parseDouble(txtvaloringresado.getText()));
            lbltotal.setVisible(true);
            lbltotal.setText(String.valueOf(decimalFormato.format(conversionLogica.calculardolaresapesos())));

        }

    }
    private void yenPesos(){
        if(yenCheckBox.isSelected()&&pesosCOPCheckBox1.isSelected()){

            conversionLogica.setNumero1(Double.parseDouble(txtvaloringresado.getText()));
            lbltotal.setVisible(true);
            lbltotal.setText(String.valueOf(decimalFormato.format(conversionLogica.calcularyenapesos())));

        }

    }
 private void validariguales(){

     if(eurosCheckBox.isSelected()&& dolaresCheckBox.isSelected()&&yenCheckBox.isSelected()){

         JOptionPane.showMessageDialog(null,"No se puede las tres opciones (Dolar/Yen/Euro)",
                 "Alerta de Error de conversion ",JOptionPane.WARNING_MESSAGE);
     }
 }


    private void soloNumeros(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();

        }
    }
}
