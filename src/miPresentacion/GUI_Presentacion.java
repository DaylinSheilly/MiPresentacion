package miPresentacion;

import javax.security.auth.callback.TextOutputCallback;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class GUI_Presentacion extends JFrame {
    //atributos
    private JButton miFoto, miHobby, misExpectativas;
    private JPanel panelBotones, panelDatos;
    private Titulos titulo;
    private JLabel labelImagen;
    private JTextArea textoExpectativas;
    private Escucha escucha;

    //métodos
    public GUI_Presentacion(){
        initGUI();
        //Conguracion base de la ventana
        this.setTitle("Mi Presentacion");
        this.setSize(600,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void initGUI() {
        //Definir Container y Layout del JFrame
        //Crear objetos Escucha y Control
        escucha = new Escucha();
        //Configurar JComponents
        titulo = new Titulos("Hola, soy Sheilly Ortega, oprime los botones...", Color.PINK);
        this.add(titulo, BorderLayout.NORTH);

        panelDatos = new JPanel();
        panelDatos.setBorder(BorderFactory.createTitledBorder(null,"Un poco más de mí...",
                            TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION,
                            new Font("calibri", Font.BOLD, 20), Color.BLACK));

        this.add(panelDatos, BorderLayout.CENTER);

        miFoto = new JButton("Este soy yo");
        miFoto.addMouseListener(escucha);
        miFoto.addKeyListener(escucha);
        miHobby = new JButton("Este es mi hobby");
        miHobby.addMouseListener(escucha);
        miHobby.addKeyListener(escucha);
        misExpectativas = new JButton("Creo que...");
        misExpectativas.addKeyListener(escucha);

        panelBotones = new JPanel();
        panelBotones.add(miFoto);
        panelBotones.add(miHobby);
        panelBotones.add(misExpectativas);

        this.add(panelBotones,BorderLayout.SOUTH);

        labelImagen = new JLabel();
        textoExpectativas = new JTextArea(9,9);

    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI_Presentacion miGUIPresentacion = new GUI_Presentacion();
            }
        });
    }

    private class Escucha extends MouseAdapter implements KeyListener{
        private ImageIcon image;
        private Image imagenOtroTamanho;
        private ImageIcon imagenNuevoTamanho;

        @Override
        public void mouseClicked(MouseEvent e){
            panelDatos.removeAll();
            if(e.getSource()==miFoto){

                image = new ImageIcon(getClass().getResource("/recursos/miFoto.jpeg"));
                imagenOtroTamanho = image.getImage().getScaledInstance(500, 650, Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                labelImagen.setIcon(imagenNuevoTamanho);
                panelDatos.add(labelImagen);
            }
            else if(e.getSource()==miHobby){

                if(e.getClickCount()==2){

                    image = new ImageIcon(getClass().getResource("/recursos/miHobby.jpeg"));
                    imagenOtroTamanho = image.getImage().getScaledInstance(550, 600, Image.SCALE_SMOOTH);
                    imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                    labelImagen.setIcon(imagenNuevoTamanho);
                    panelDatos.add(labelImagen);
                }
            }
            revalidate();
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e)
        {

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            panelDatos.removeAll();
            if(e.getSource()==miFoto){

                if (e.VK_M == e.getKeyCode()){
                    textoExpectativas.setText("Espero aprender a programar en Java de manera\n"
                            +"óptima y profesional. También espero que la\n"
                            +"profesora nos comparta sus experiencias y\n"
                            +"recomendaciones en el mundo laboral para saber\n"
                            +"cómo debemos encaminarnos al programar.\n"
                            +"\nTengo cero experiencia programando en Java,\n"
                            +"pero hasta ahora he aprendido programación\n"
                            +"funcional en Javascript e introducción a\n"
                            +"programación orientada a objetos en C++.\n");

                    textoExpectativas.setBackground(Color.WHITE);
                    textoExpectativas.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.pink));
                    textoExpectativas.setFont(new Font(Font.MONOSPACED, Font.PLAIN+Font.PLAIN, 20));
                    panelDatos.add(textoExpectativas);
                }
                revalidate();
                repaint();
            }
            else if(e.getSource()==miHobby){
                if (e.VK_M == e.getKeyCode()){

                    textoExpectativas.setText("Espero aprender a programar en Java de manera\n"
                            +"óptima y profesional. También espero que la\n"
                            +"profesora nos comparta sus experiencias y\n"
                            +"recomendaciones en el mundo laboral para saber\n"
                            +"cómo debemos encaminarnos al programar.\n"
                            +"\nTengo cero experiencia programando en Java,\n"
                            +"pero hasta ahora he aprendido programación\n"
                            +"funcional en Javascript e introducción a\n"
                            +"programación orientada a objetos en C++.\n");

                    textoExpectativas.setBackground(Color.WHITE);
                    textoExpectativas.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.pink));
                    textoExpectativas.setFont(new Font(Font.MONOSPACED, Font.PLAIN+Font.PLAIN, 20));
                    panelDatos.add(textoExpectativas);
                }
                revalidate();
                repaint();
            }else{
                if (e.VK_M == e.getKeyCode()) {

                    textoExpectativas.setText("Espero aprender a programar en Java de manera\n"
                            +"óptima y profesional. También espero que la\n"
                            +"profesora nos comparta sus experiencias y\n"
                            +"recomendaciones en el mundo laboral para saber\n"
                            +"cómo debemos encaminarnos al programar.\n"
                            +"\nTengo cero experiencia programando en Java,\n"
                            +"pero hasta ahora he aprendido programación\n"
                            +"funcional en Javascript e introducción a\n"
                            +"programación orientada a objetos en C++.\n");

                    textoExpectativas.setBackground(Color.WHITE);
                    textoExpectativas.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.pink));
                    textoExpectativas.setFont(new Font(Font.MONOSPACED, Font.PLAIN+Font.PLAIN, 20));
                    panelDatos.add(textoExpectativas);
                }
                revalidate();
                repaint();
            }
        }

        @Override
        public void keyReleased(KeyEvent e)
        {

        }
    }

}
