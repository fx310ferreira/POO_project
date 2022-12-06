
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddEmpresa extends JFrame{

    private Empresa empresa;
    private ArrayList<Empresa> empresas = new ArrayList<Empresa>();

    private String type = "";
    private JFrame frame;
    private JPanel panelA;
    private JButton submeter, voltar;
    private JTextField nome, lon, lat, dist;
    private JTextField nomeCafe1, nomeCafe2, nomeCafe3, nomeCafe4;
    private JTextField nomeRest1, nomeRest2, nomeRest3, nomeDrive1, nomeDrive2, nomeLocal1, nomeLocal2;
    private JTextField nomeMerc1, nomeMerc2, nomeMerc3, nomeMerc4, nomeMerc5;
    private JLabel labelCafe1, labelCafe2, labelCafe3, labelCafe4;
    private JLabel labelRest1, labelRest2, labelRest3, labelDrive1, labelDrive2, labelLocal1, labelLocal2;
    private JLabel labelMerc1, labelMerc2, labelMerc3, labelMerc4, labelMerc5;

    JRadioButton rb1, rb2, rb3, rb4, rb5, rb6;
    JButton b;

    private Font fonte = new Font("Arial", Font.BOLD, 25);
    private Font fonte1 = new Font("Arial", Font.BOLD, 20);
    private Color fgColor = new Color(10, 10, 10);
    private Color bgColor = new Color(100, 100, 150);



    public AddEmpresa(Empresa empresa) {
        this.empresa = empresa;
        frame = new JFrame();
        frame.setTitle("Aula 01");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        panelA = drawPanel();
        panelA.setVisible(true);

        frame.add(panelA);
        frame.setVisible(true);

    }

    public JPanel drawPanel() {

        JLabel labelName = new JLabel("Adiciona empresa");
        labelName.setBounds(400-15, 0, 250,100);
        labelName.setFont(fonte);



        JLabel labelName1 = new JLabel("Nome");
        labelName1.setBounds(150, 100, 100,40);
        labelName1.setFont(fonte1);

        nome = new JTextField();
        nome.setBounds (300, 100, 550,40);



        JLabel labelName2 = new JLabel("Longitude");
        labelName2.setBounds(100, 160, 110,40);
        labelName2.setFont(fonte1);

        lon = new JTextField();
        lon.setBounds(250, 160, 50,40);



        JLabel labelName3 = new JLabel("Latitude");
        labelName3.setBounds(320, 160, 110,40);
        labelName3.setFont(fonte1);

        lat = new JTextField();
        lat.setBounds (480, 160, 50,40);


        JLabel labelName4 = new JLabel("Distrito");
        labelName4.setBounds(550, 160, 110,40);
        labelName4.setFont(fonte1);

        dist = new JTextField();
        dist.setBounds (670, 160, 150,40);


        JLabel labelName5 = new JLabel("Tipo");
        labelName5.setBounds(150, 220, 100,40);
        labelName5.setFont(fonte1);

        rb1=new JRadioButton("Cafe");
        rb1.setBounds(300,220,100,30);
        rb2=new JRadioButton("Pastelaria");
        rb2.setBounds(400,220,100,30);
        rb3=new JRadioButton("Restaurante Local");
        rb3.setBounds(500,220,200,30);
        rb4=new JRadioButton("Restaurante Fast-Food");
        rb4.setBounds(500,260,200,30);
        rb5=new JRadioButton("Frutaria");
        rb5.setBounds(400,260,100,30);
        rb6=new JRadioButton("Mercado");
        rb6.setBounds(300,260,100,30);

        ButtonGroup b = new ButtonGroup();

        b.add(rb1);
        b.add(rb2);
        b.add(rb3);
        b.add(rb4);
        b.add(rb5);
        b.add(rb6);



        submeter = new JButton();
        submeter.setText("Submeter");
        submeter.setBounds (750, 700, 200,40);
        submeter.setFont(new Font("Arial", Font.BOLD, 30));
        submeter.setForeground(fgColor);
        submeter.setBackground(bgColor);

        voltar = new JButton();
        voltar.setText("Voltar");
        voltar.setBounds (500, 700, 200,40);
        voltar.setFont(new Font("Arial", Font.BOLD, 30));
        voltar.setForeground(fgColor);
        voltar.setBackground(bgColor);

        submeter.addActionListener(new ButtonListener());
        voltar.addActionListener(new ButtonListener());
        rb1.addActionListener(new RadioButtonActionListener());
        rb2.addActionListener(new RadioButtonActionListener());
        rb3.addActionListener(new RadioButtonActionListener());
        rb4.addActionListener(new RadioButtonActionListener());
        rb5.addActionListener(new RadioButtonActionListener());
        rb6.addActionListener(new RadioButtonActionListener());



        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(labelName);
        panel.add(labelName1);
        panel.add(labelName2);
        panel.add(labelName3);
        panel.add(labelName4);
        panel.add(labelName5);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(rb4);
        panel.add(rb5);
        panel.add(rb6);
        panel.add(nome);
        panel.add(lon);
        panel.add(lat);
        panel.add(dist);



        panel.add(submeter);
        panel.add(voltar);

        // componentes cafe
        labelCafe1 = new JLabel("Empregados");
        labelCafe1.setBounds(100, 300, 210,40);
        labelCafe1.setFont(fonte1);

        nomeCafe1 = new JTextField();
        nomeCafe1.setBounds (330, 300, 50,40);

        labelCafe2 = new JLabel("Salario Medio Anual");
        labelCafe2.setBounds(400, 300, 210,40);
        labelCafe2.setFont(fonte1);

        nomeCafe2 = new JTextField();
        nomeCafe2.setBounds (640, 300, 50,40);

        labelCafe3 = new JLabel("Clientes Medio Diario");
        labelCafe3.setBounds(100, 400, 210,40);
        labelCafe3.setFont(fonte1);

        nomeCafe3 = new JTextField();
        nomeCafe3.setBounds (330, 400, 50,40);

        labelCafe4 = new JLabel("Cafe vendido Dia");
        labelCafe4.setBounds(400, 400, 210,40);
        labelCafe4.setFont(fonte1);

        nomeCafe4 = new JTextField();
        nomeCafe4.setBounds (640, 400, 50,40);

        labelCafe1.setVisible(false);
        nomeCafe1.setVisible(false);
        labelCafe2.setVisible(false);
        nomeCafe2.setVisible(false);
        labelCafe3.setVisible(false);
        nomeCafe3.setVisible(false);
        labelCafe4.setVisible(false);
        nomeCafe4.setVisible(false);

        panel.add(labelCafe1);
        panel.add(nomeCafe1);
        panel.add(labelCafe2);
        panel.add(nomeCafe2);
        panel.add(labelCafe3);
        panel.add(nomeCafe3);
        panel.add(labelCafe4);
        panel.add(nomeCafe4);

        // componentes restaurante
        labelRest1 = new JLabel("Dias de  funcionamento");
        labelRest1.setBounds(400, 400, 230,40);
        labelRest1.setFont(fonte1);

        nomeRest1 = new JTextField();
        nomeRest1.setBounds (640, 400, 50,40);

        labelRest2 = new JLabel("Numero de mesas");
        labelRest2.setBounds(100, 500, 210,40);
        labelRest2.setFont(fonte1);

        nomeRest2 = new JTextField();
        nomeRest2.setBounds (330, 500, 50,40);

        labelRest3 = new JLabel("Faturacao mesa");
        labelRest3.setBounds(400, 500, 210,40);
        labelRest3.setFont(fonte1);

        nomeRest3 = new JTextField();
        nomeRest3.setBounds (640, 500, 50,40);

        labelDrive1 = new JLabel("Clientes Drive");
        labelDrive1.setBounds(100, 600, 210,40);
        labelDrive1.setFont(fonte1);

        nomeDrive1 = new JTextField();
        nomeDrive1.setBounds (330, 600, 50,40);

        labelDrive2 = new JLabel("Faturaçao Drive");
        labelDrive2.setBounds(400, 600, 210,40);
        labelDrive2.setFont(fonte1);

        nomeDrive2 = new JTextField();
        nomeDrive2.setBounds (640, 600, 50,40);

        labelRest1.setVisible(false);
        nomeRest1.setVisible(false);
        labelRest2.setVisible(false);
        nomeRest2.setVisible(false);
        labelRest3.setVisible(false);
        nomeRest3.setVisible(false);
        labelDrive1.setVisible(false);
        nomeDrive1.setVisible(false);
        labelDrive2.setVisible(false);
        nomeDrive2.setVisible(false);

        panel.add(labelRest1);
        panel.add(nomeRest1);
        panel.add(labelRest2);
        panel.add(nomeRest2);
        panel.add(labelRest3);
        panel.add(nomeRest3);
        panel.add(labelDrive1);
        panel.add(nomeDrive1);
        panel.add(labelDrive2);
        panel.add(nomeDrive2);

        //componentes local

        labelLocal1 = new JLabel("Mesas esplanada");
        labelLocal1.setBounds(100, 600, 210,40);
        labelLocal1.setFont(fonte1);

        nomeLocal1 = new JTextField();
        nomeLocal1.setBounds (330, 600, 50,40);

        labelLocal2 = new JLabel("Licensa esplanada");
        labelLocal2.setBounds(400, 600, 210,40);
        labelLocal2.setFont(fonte1);

        nomeLocal2 = new JTextField();
        nomeLocal2.setBounds (640, 600, 50,40);

        labelLocal1.setVisible(false);
        nomeLocal1.setVisible(false);
        labelLocal2.setVisible(false);
        nomeLocal2.setVisible(false);

        panel.add(labelLocal1);
        panel.add(nomeLocal1);
        panel.add(labelLocal2);
        panel.add(nomeLocal2);

        // componentes Mercearia
        labelMerc1 = new JLabel("Custo Limpeza");
        labelMerc1.setBounds(100, 300, 210,40);
        labelMerc1.setFont(fonte1);

        nomeMerc1 = new JTextField();
        nomeMerc1.setBounds (330, 300, 50,40);

        labelMerc2 = new JLabel("Tipo");
        labelMerc2.setBounds(400, 300, 210,40);
        labelMerc2.setFont(fonte1);

        nomeMerc2 = new JTextField();
        nomeMerc2.setBounds (640, 300, 50,40);

        labelMerc3 = new JLabel("Area");
        labelMerc3.setBounds(100, 400, 210,40);
        labelMerc3.setFont(fonte1);

        nomeMerc3 = new JTextField();
        nomeMerc3.setBounds (330, 400, 50,40);

        labelMerc4 = new JLabel("Faturaco Area");
        labelMerc4.setBounds(400, 400, 210,40);
        labelMerc4.setFont(fonte1);

        nomeMerc4 = new JTextField();
        nomeMerc4.setBounds (640, 400, 50,40);



        labelMerc1.setVisible(false);
        nomeMerc1.setVisible(false);
        labelMerc2.setVisible(false);
        nomeMerc2.setVisible(false);
        labelMerc3.setVisible(false);
        nomeMerc3.setVisible(false);
        labelMerc4.setVisible(false);
        nomeMerc4.setVisible(false);


        panel.add(labelMerc1);
        panel.add(nomeMerc1);
        panel.add(labelMerc2);
        panel.add(nomeMerc2);
        panel.add(labelMerc3);
        panel.add(nomeMerc3);
        panel.add(labelMerc4);
        panel.add(nomeMerc4);


        return panel;
    }

    class RadioButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JRadioButton button = (JRadioButton) event.getSource();

            if (button == rb1) {
                type = "cafe";
                // componentes cafe/pastelaria
                labelCafe1.setVisible(true);
                nomeCafe1.setVisible(true);
                labelCafe2.setVisible(true);
                nomeCafe2.setVisible(true);
                labelCafe3.setVisible(true);
                nomeCafe3.setVisible(true);
                labelCafe4.setVisible(true);
                nomeCafe4.setVisible(true);
                // componentes restaurante
                labelRest1.setVisible(false);
                nomeRest1.setVisible(false);
                labelRest2.setVisible(false);
                nomeRest2.setVisible(false);
                labelRest3.setVisible(false);
                nomeRest3.setVisible(false);
                // componentes fast-food
                labelDrive1.setVisible(false);
                nomeDrive1.setVisible(false);
                labelDrive2.setVisible(false);
                nomeDrive2.setVisible(false);
                // componentes local
                labelLocal1.setVisible(false);
                nomeLocal1.setVisible(false);
                labelLocal2.setVisible(false);
                nomeLocal2.setVisible(false);
                //componentes mercedado
                labelMerc1.setVisible(false);
                nomeMerc1.setVisible(false);
                labelMerc2.setVisible(false);
                nomeMerc2.setVisible(false);
                labelMerc3.setVisible(false);
                nomeMerc3.setVisible(false);
                labelMerc4.setVisible(false);
                nomeMerc4.setVisible(false);

                frame.repaint();



            }
            else if (button == rb2) {
                type = "pastelaria";
                // componentes pastelaria/cafe
                labelCafe1.setVisible(true);
                nomeCafe1.setVisible(true);
                labelCafe2.setVisible(true);
                nomeCafe2.setVisible(true);
                labelCafe3.setVisible(true);
                nomeCafe3.setVisible(true);
                labelCafe4.setVisible(true);
                nomeCafe4.setVisible(true);
                // componentes restaurante
                labelRest1.setVisible(false);
                nomeRest1.setVisible(false);
                labelRest2.setVisible(false);
                nomeRest2.setVisible(false);
                labelRest3.setVisible(false);
                nomeRest3.setVisible(false);
                // componentes fast-food
                labelDrive1.setVisible(false);
                nomeDrive1.setVisible(false);
                labelDrive2.setVisible(false);
                nomeDrive2.setVisible(false);
                // componentes local
                labelLocal1.setVisible(false);
                nomeLocal1.setVisible(false);
                labelLocal2.setVisible(false);
                nomeLocal2.setVisible(false);
                //componentes mercedado
                labelMerc1.setVisible(false);
                nomeMerc1.setVisible(false);
                labelMerc2.setVisible(false);
                nomeMerc2.setVisible(false);
                labelMerc3.setVisible(false);
                nomeMerc3.setVisible(false);
                labelMerc4.setVisible(false);
                nomeMerc4.setVisible(false);

                frame.repaint();

            }
            else if (button == rb3) {
                // componentes cafe/pastelaria
                labelCafe4.setVisible(false);
                nomeCafe4.setVisible(false);
                // componentes comum
                labelCafe1.setVisible(true);
                nomeCafe1.setVisible(true);
                labelCafe2.setVisible(true);
                nomeCafe2.setVisible(true);
                labelCafe3.setVisible(true);
                nomeCafe3.setVisible(true);
                // componentes restaurante
                labelRest1.setVisible(true);
                nomeRest1.setVisible(true);
                labelRest2.setVisible(true);
                nomeRest2.setVisible(true);
                labelRest3.setVisible(true);
                nomeRest3.setVisible(true);
                // componentes fast-food
                labelDrive1.setVisible(false);
                nomeDrive1.setVisible(false);
                labelDrive2.setVisible(false);
                nomeDrive2.setVisible(false);
                // componentes local
                labelLocal1.setVisible(true);
                nomeLocal1.setVisible(true);
                labelLocal2.setVisible(true);
                nomeLocal2.setVisible(true);
                //componentes mercedado
                labelMerc1.setVisible(false);
                nomeMerc1.setVisible(false);
                labelMerc2.setVisible(false);
                nomeMerc2.setVisible(false);
                labelMerc3.setVisible(false);
                nomeMerc3.setVisible(false);
                labelMerc4.setVisible(false);
                nomeMerc4.setVisible(false);

                frame.repaint();

            }
            else if (button == rb4) {
                // componentes cafe/pastelaria
                labelCafe4.setVisible(false);
                nomeCafe4.setVisible(false);
                // componentes comum
                labelCafe1.setVisible(true);
                nomeCafe1.setVisible(true);
                labelCafe2.setVisible(true);
                nomeCafe2.setVisible(true);
                labelCafe3.setVisible(true);
                nomeCafe3.setVisible(true);
                // componentes restaurante
                labelRest1.setVisible(true);
                nomeRest1.setVisible(true);
                labelRest2.setVisible(true);
                nomeRest2.setVisible(true);
                labelRest3.setVisible(true);
                nomeRest3.setVisible(true);
                // componentes fast-food
                labelDrive1.setVisible(true);
                nomeDrive1.setVisible(true);
                labelDrive2.setVisible(true);
                nomeDrive2.setVisible(true);
                // componentes local
                labelLocal1.setVisible(false);
                nomeLocal1.setVisible(false);
                labelLocal2.setVisible(false);
                nomeLocal2.setVisible(false);
                //componentes mercedado
                labelMerc1.setVisible(false);
                nomeMerc1.setVisible(false);
                labelMerc2.setVisible(false);
                nomeMerc2.setVisible(false);
                labelMerc3.setVisible(false);
                nomeMerc3.setVisible(false);
                labelMerc4.setVisible(false);
                nomeMerc4.setVisible(false);

                frame.repaint();

            }
            else if (button == rb5) {
                // componentes cafe/pastelaria
                labelCafe1.setVisible(false);
                nomeCafe1.setVisible(false);
                labelCafe2.setVisible(false);
                nomeCafe2.setVisible(false);
                labelCafe3.setVisible(false);
                nomeCafe3.setVisible(false);
                labelCafe4.setVisible(false);
                nomeCafe4.setVisible(false);
                // componentes restaurante
                labelRest1.setVisible(false);
                nomeRest1.setVisible(false);
                labelRest2.setVisible(false);
                nomeRest2.setVisible(false);
                labelRest3.setVisible(false);
                nomeRest3.setVisible(false);
                // componentes fast-food
                labelDrive1.setVisible(false);
                nomeDrive1.setVisible(false);
                labelDrive2.setVisible(false);
                nomeDrive2.setVisible(false);
                // componentes local
                labelLocal1.setVisible(false);
                nomeLocal1.setVisible(false);
                labelLocal2.setVisible(false);
                nomeLocal2.setVisible(false);
                //componentes mercedado
                labelMerc1.setVisible(true);
                nomeMerc1.setVisible(true);
                labelMerc2.setVisible(false);
                nomeMerc2.setVisible(false);
                labelMerc3.setVisible(false);
                nomeMerc3.setVisible(false);
                labelMerc4.setVisible(false);
                nomeMerc4.setVisible(false);

                frame.repaint();

            }
            else if (button == rb6) {
                // componentes cafe/pastalaria
                labelCafe1.setVisible(false);
                nomeCafe1.setVisible(false);
                labelCafe2.setVisible(false);
                nomeCafe2.setVisible(false);
                labelCafe3.setVisible(false);
                nomeCafe3.setVisible(false);
                labelCafe4.setVisible(false);
                nomeCafe4.setVisible(false);
                // componentes restaurante
                labelRest1.setVisible(false);
                nomeRest1.setVisible(false);
                labelRest2.setVisible(false);
                nomeRest2.setVisible(false);
                labelRest3.setVisible(false);
                nomeRest3.setVisible(false);
                // componentes fast-food
                labelDrive1.setVisible(false);
                nomeDrive1.setVisible(false);
                labelDrive2.setVisible(false);
                nomeDrive2.setVisible(false);
                // componentes local
                labelLocal1.setVisible(false);
                nomeLocal1.setVisible(false);
                labelLocal2.setVisible(false);
                nomeLocal2.setVisible(false);
                //componentes mercedado
                labelMerc1.setVisible(true);
                nomeMerc1.setVisible(true);
                labelMerc2.setVisible(true);
                nomeMerc2.setVisible(true);
                labelMerc3.setVisible(true);
                nomeMerc3.setVisible(true);
                labelMerc4.setVisible(true);
                nomeMerc4.setVisible(true);

                frame.repaint();

            }

        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
            String cmd = ev.getActionCommand();
            switch (cmd) {
                case "Voltar":
                    frame.setVisible(false);
                    frame.dispose();
                    new LoadMain();
                    break;
                case "Submeter":

                    if (type.equals("cafe")) {

                        try {
                            if (nome.getText() != null && lat.getText() != null && lon.getText() != null && dist.getText() != null && nomeCafe1.getText() != null && nomeCafe2.getText() != null && nomeCafe3.getText() != null && nomeCafe4.getText() != null) {
                                try {
                                    empresas.add(new Cafe(nome.getText(), Double.parseDouble(lat.getText()), Double.parseDouble(lon.getText()), dist.getText(), Integer.parseInt(nomeCafe1.getText()), Double.parseDouble(nomeCafe2.getText()), Double.parseDouble(nomeCafe3.getText()), Double.parseDouble(nomeCafe4.getText()), Double.parseDouble(nomeCafe4.getText())));
                                    JOptionPane.showMessageDialog(null, "Empresa adicionada");
                                    frame.setVisible(false);
                                    frame.dispose();
                                    new LoadMain();
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "Error: Atributos invalidos");
                                }

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Error: Atributos vazios");
                        }
                    }



                    break;
            }
        }
    }

}