package contabilidadsalarial;

import java.text.DecimalFormat;
import clases.operaciones.NominaLogica;
import  static clases.constantes.MatematicasEnteros.*;
import menu.Menu;
import javax.swing.JOptionPane;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class NominaSalario extends Frame {
    DecimalFormat decimalFormat = new DecimalFormat("###.###");

    private JTextField txtname;
    private JTextField txtdia;
    private JTextField txta;
    private JTextField txtmes;
    private JTextField txthoras;
    private JPanel nominaSalariofrom;
    private JButton salirButton;
    private JButton calcularButton;

    private JLabel lbltotalpago;
    private JCheckBox diurnoCheckBox;
    private JCheckBox nocturnoCheckBox;
    private JLabel lblstringtotal;
    private JLabel lblstringname;
    private JLabel lblnombre;
    private JPanel jpinformacion;
    private JLabel lblresultadofestivo;
    private JPanel jpmensaje;

  transient  NominaLogica nominaLogica = new NominaLogica();





    public NominaSalario(){

        add(nominaSalariofrom);

        setTitle("opciones de operaciones");
        setSize(QUINIENTOS.getValor(),SEISCIENTOS.getValor());

        salirButton.addActionListener(e -> {
            Menu menu= new Menu();
            //visuluza la ventana cuando le da clik
            menu.setVisible(true);
    
                hidewindow();
        });

        calcularButton.addActionListener(e -> {
            if (txthoras.getText().isEmpty())

            {
                JOptionPane.showMessageDialog(null,"El campo esta vacoio");
            }


            nombres();
                select();
          festivodiurno();
          festivonocturno();

        });

        /*--------------------------SOLO ACEPTE  LETRAS Y NUMEROS-------------------------*/
        txtname.addKeyListener(new KeyAdapter() {
            int limite=80;
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtname.getText().length() >= limite) //aqui lo comparas
                {
                    e.consume();
                }

                super.keyTyped(e);
                escribirSoloLetrasYEspacios(e);

            }
        });
        txtdia.addKeyListener(new KeyAdapter() {
            int limite=2;
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtdia.getText().length() >= limite) //aqui lo comparas
                {
                    e.consume();
                }
                super.keyTyped(e);
                campo4KeyTyped(e);

            }
        });
        txtmes.addKeyListener(new KeyAdapter() {
            int limite=2;
            @Override
            public void keyTyped(KeyEvent e) {
                if (txtmes.getText().length() >= limite) //aqui lo comparas
                {
                    e.consume();
                }
                super.keyTyped(e);
                campo4KeyTyped(e);
            }
        });
        txta.addKeyListener(new KeyAdapter() {
            int limite=4;
            @Override
            public void keyTyped(KeyEvent e) {
                if (txta.getText().length() >= limite) //aqui lo comparas
                {
                    e.consume();
                }
                super.keyTyped(e);
                campo4KeyTyped(e);
            }
        });
        txthoras.addKeyListener(new KeyAdapter() {
            int limite=2;
            @Override
            public void keyTyped(KeyEvent e) {
                if (txthoras.getText().length() >= limite) //aqui lo comparas
                {
                    e.consume();
                }
                super.keyTyped(e);
                campo4KeyTyped(e);
            }
        });
        txtdia.addKeyListener(new KeyAdapter() {
        });
    }









    /*--------------------------METODOS-------------------------*/

    public static void escribirSoloLetrasYEspacios(KeyEvent evt) {

        if (KeyEvent.VK_SPACE == evt.getKeyChar()) {
            return;
        }
        if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
            return;
        }
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();

        }


    }




    private void campo4KeyTyped(java.awt.event.KeyEvent evt) {
        char c=evt.getKeyChar();


        if(Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }






    private void hidewindow(){ this.dispose(); }


    private void select(){

        if(diurnoCheckBox.isSelected()){

            nominaLogica.setHours(Double.parseDouble(txthoras.getText()));
            lbltotalpago.setVisible(true);
            lblstringtotal.setVisible(true);
            jpinformacion.setVisible(true);
            lbltotalpago.setText(String.valueOf(decimalFormat.format(nominaLogica.calcularhorasdia())));
        }
        if (nocturnoCheckBox.isSelected()){
            nominaLogica.setHours(Double.parseDouble(txthoras.getText()));
            lblstringtotal.setVisible(true);
            lbltotalpago.setVisible(true);
            lbltotalpago.setText(String.valueOf(decimalFormat.format(nominaLogica.calsularhorasnoche())));
        }


      if(nocturnoCheckBox.isSelected()&& diurnoCheckBox.isSelected()){

            JOptionPane.showMessageDialog(null,"No se puede ambas opciones (Diurno/Nocturno)",
                    "Alerta de Error de turno",JOptionPane.WARNING_MESSAGE);
        }
    }


    private void nombres(){

        nominaLogica.setNombres(String.format(txtname.getText()));
        lblstringname.setVisible(true);
        lblnombre.setVisible(true);
        lblnombre.setText(String.valueOf(nominaLogica.mostrarnombre()));


    }



private void festivodiurno(){

        nominaLogica.setDay(Integer.parseInt(txtdia.getText()));
        nominaLogica.setMonth(Double.parseDouble(txtmes.getText()));
    nominaLogica.setAnos(Double.parseDouble(txta.getText()));
        if(diurnoCheckBox.isSelected() ){

            if(nominaLogica.fiesta()||
                    nominaLogica.festivouno()||
                    nominaLogica.festivodos()||
                    nominaLogica.festivotres()||
                    nominaLogica.festivocuatro()||
                    nominaLogica.festivocinco()||
                    nominaLogica.festivoseis()||
                    nominaLogica.festivosiete()||
                    nominaLogica.festivoocho()||
                    nominaLogica.festivonueve()||
                    nominaLogica.festivodiez()){
                lblresultadofestivo.setText(String.valueOf(decimalFormat.format(nominaLogica.salariodiez())));
                jpmensaje.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No es un dìa festivo");
                jpmensaje.setVisible(false);
            }

        }

        }



  private void festivonocturno(){

        nominaLogica.setDay(Integer.parseInt(txtdia.getText()));
        nominaLogica.setMonth(Double.parseDouble(txtmes.getText()));
        nominaLogica.setAnos(Double.parseDouble(txta.getText()));
        if (nocturnoCheckBox.isSelected()) {
           if(nominaLogica.fiesta()||
            nominaLogica.festivouno()||
            nominaLogica.festivodos()||
            nominaLogica.festivotres()||
            nominaLogica.festivocuatro()||
            nominaLogica.festivocinco()||
            nominaLogica.festivoseis()||
            nominaLogica.festivosiete()||
            nominaLogica.festivoocho()||
            nominaLogica.festivonueve()||
            nominaLogica.festivodiez()){
               lblresultadofestivo.setText(String.valueOf(decimalFormat.format(nominaLogica.salarioquince())));
               jpmensaje.setVisible(true);
           }
           else
           {
               JOptionPane.showMessageDialog(null, "No es un dìa festivo");
               jpmensaje.setVisible(false);
           }

        }


    }


}



