/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemontrainercard;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Random;

/**
 *
 * @author 920415
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        Icon gifIcon = new ImageIcon("pika.gif");
        JLabel label = new JLabel(gifIcon);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCriar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        clickableLabel = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtNome = new javax.swing.JTextField();
        boxCardCollor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        classeTreinador = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        poke1 = new javax.swing.JComboBox<>();
        poke2 = new javax.swing.JComboBox<>();
        poke3 = new javax.swing.JComboBox<>();
        poke4 = new javax.swing.JComboBox<>();
        poke5 = new javax.swing.JComboBox<>();
        poke6 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 640));
        getContentPane().setLayout(null);

        btnCriar.setBackground(new java.awt.Color(255, 51, 51));
        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PokeballIcon/premierball.png"))); // NOI18N
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriar);
        btnCriar.setBounds(700, 350, 200, 140);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Nome do Treinador:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 209, 29);

        clickableLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clickableLabel.setText("Voltar");
        clickableLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickableLabelMouseClicked(evt);
            }
        });
        getContentPane().add(clickableLabel);
        clickableLabel.setBounds(10, 10, 80, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(280, 120, 180, 30);

        txtNome.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(280, 80, 180, 30);

        boxCardCollor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        boxCardCollor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vermelho", "Azul", "Verde", "Preto" }));
        boxCardCollor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCardCollorActionPerformed(evt);
            }
        });
        getContentPane().add(boxCardCollor);
        boxCardCollor.setBounds(700, 120, 180, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Cor do seu Cartão:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 120, 220, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 70, 29);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Classe do Treinador:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 80, 220, 30);

        classeTreinador.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        classeTreinador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lucas", "Dawn", "Barry", "Nate", "Hilda", "Bianca", "Cheren", "Sun", "Moon", "Kiawe", "Giovanni", "May", "Silver" }));
        classeTreinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classeTreinadorActionPerformed(evt);
            }
        });
        getContentPane().add(classeTreinador);
        classeTreinador.setBounds(700, 80, 180, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pika.gif"))); // NOI18N
        jLabel4.setText("Escolha seus Pokémon:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 780, 210);

        poke1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke1);
        poke1.setBounds(110, 350, 120, 40);

        poke2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke2);
        poke2.setBounds(310, 350, 120, 40);

        poke3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke3);
        poke3.setBounds(510, 350, 120, 40);

        poke4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke4);
        poke4.setBounds(110, 450, 120, 40);

        poke5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke5);
        poke5.setBounds(310, 450, 120, 40);

        poke6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------x------", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Espeon", "Umbreon", "Leafeon", "Glaceon", "Sylveon", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect" }));
        getContentPane().add(poke6);
        poke6.setBounds(510, 450, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cpbs.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 640);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(640, 180, 56, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(700, 190, 56, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(700, 230, 56, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void classeTreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classeTreinadorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_classeTreinadorActionPerformed

    private void clickableLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickableLabelMouseClicked
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_clickableLabelMouseClicked

    private void boxCardCollorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCardCollorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCardCollorActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        // TODO O CODIGO DO BOTÃO CRIAR:
        
         String trainername = txtNome.getText();
    String password = new String(txtSenha.getPassword());

    try {
Connection conn = DriverManager.getConnection("jdbc:sqlite:trainercards.db");
        Statement stmt = conn.createStatement();

        // Check if the username already exists
        String checkQuery = "SELECT * FROM trainers WHERE trainerName  = '" + trainername + "'";
        ResultSet checkResult = stmt.executeQuery(checkQuery);
        if (checkResult.next()) {
            JOptionPane.showMessageDialog(this, "Nome de treinador ja utilizado!");
            stmt.close();
            conn.close();
            return;
        }
        //Creating a random tid that is unique
                Random random = new Random();
                int min = 100000000; // Minimum value with 9 digits
                int max = 999999999; // Maximum value with 9 digits
                int tid = random.nextInt(max - min + 1) + min;
        
        //reading the chosen pokemon
        
        String[] poketeam = new String[6];
        int[] poke = new int[6];
        int pokemon1 ;
        int pokemon2 ;
        int pokemon3 ;
        int pokemon4 ;
        int pokemon5 ;
        int pokemon6 ;
        // Atribuindo valores aos elementos do array
        poketeam[0] = poke1.getSelectedItem().toString();
        poketeam[1] = poke2.getSelectedItem().toString();
        poketeam[2] = poke3.getSelectedItem().toString();
        poketeam[3] = poke4.getSelectedItem().toString();
        poketeam[4] = poke5.getSelectedItem().toString();
        poketeam[5] = poke6.getSelectedItem().toString();
        for(int i = 0;i <= 5;i++){
        switch(poketeam[i]){
case "Eevee": poke[i] = 133; break;
case "Vaporeon": poke[i] = 134; break;
case "Jolteon": poke[i] = 135; break;
case "Flareon": poke[i] = 136; break;
case "Espeon": poke[i] = 196; break;
case "Umbreon": poke[i] = 197; break;
case "Leafeon": poke[i] = 470; break;
case "Glaceon": poke[i] = 471; break;
case "Sylveon": poke[i] = 700; break;
case "Snivy": poke[i] = 495; break;
case "Servine": poke[i] = 496; break;
case "Serperior": poke[i] = 497; break;
case "Tepig": poke[i] = 498; break;
case "Pignite": poke[i] = 499; break;
case "Emboar": poke[i] = 500; break;
case "Oshawott": poke[i] = 501; break;
case "Dewott": poke[i] = 502; break;
case "Samurott": poke[i] = 503; break;
case "Patrat": poke[i] = 504; break;
case "Watchog": poke[i] = 505; break;
case "Lillipup": poke[i] = 506; break;
case "Herdier": poke[i] = 507; break;
case "Stoutland": poke[i] = 508; break;
case "Purrloin": poke[i] = 509; break;
case "Liepard": poke[i] = 510; break;
case "Pansage": poke[i] = 511; break;
case "Simisage": poke[i] = 512; break;
case "Pansear": poke[i] = 513; break;
case "Simisear": poke[i] = 514; break;
case "Panpour": poke[i] = 515; break;
case "Simipour": poke[i] = 516; break;
case "Munna": poke[i] = 517; break;
case "Musharna": poke[i] = 518; break;
case "Pidove": poke[i] = 519; break;
case "Tranquill": poke[i] = 520; break;
case "Unfezant": poke[i] = 521; break;
case "Blitzle": poke[i] = 522; break;
case "Zebstrika": poke[i] = 523; break;
case "Roggenrola": poke[i] = 524; break;
case "Boldore": poke[i] = 525; break;
case "Gigalith": poke[i] = 526; break;
case "Woobat": poke[i] = 527; break;
case "Swoobat": poke[i] = 528; break;
case "Drilbur": poke[i] = 529; break;
case "Excadrill": poke[i] = 530; break;
case "Audino": poke[i] = 531; break;
case "Timburr": poke[i] = 532; break;
case "Gurdurr": poke[i] = 533; break;
case "Conkeldurr": poke[i] = 534; break;
case "Tympole": poke[i] = 535; break;
case "Palpitoad": poke[i] = 536; break;
case "Seismitoad": poke[i] = 537; break;
case "Throh": poke[i] = 538; break;
case "Sawk": poke[i] = 539; break;
case "Sewaddle": poke[i] = 540; break;
case "Swadloon": poke[i] = 541; break;
case "Leavanny": poke[i] = 542; break;
case "Venipede": poke[i] = 543; break;
case "Whirlipede": poke[i] = 544; break;
case "Scolipede": poke[i] = 545; break;
case "Cottonee": poke[i] = 546; break;
case "Whimsicott": poke[i] = 547; break;
case "Petilil": poke[i] = 548; break;
case "Lilligant": poke[i] = 549; break;
case "Basculin": poke[i] = 550; break;
case "Sandile": poke[i] = 551; break;
case "Krokorok": poke[i] = 552; break;
case "Krookodile": poke[i] = 553; break;
case "Darumaka": poke[i] = 554; break;
case "Darmanitan": poke[i] = 555; break;
case "Maractus": poke[i] = 556; break;
case "Dwebble": poke[i] = 557; break;
case "Crustle": poke[i] = 558; break;
case "Scraggy": poke[i] = 559; break;
case "Scrafty": poke[i] = 560; break;
case "Sigilyph": poke[i] = 561; break;
case "Yamask": poke[i] = 562; break;
case "Cofagrigus": poke[i] = 563; break;
case "Tirtouga": poke[i] = 564; break;
case "Carracosta": poke[i] = 565; break;
case "Archen": poke[i] = 566; break;
case "Archeops": poke[i] = 567; break;
case "Trubbish": poke[i] = 568; break;
case "Garbodor": poke[i] = 569; break;
case "Zorua": poke[i] = 570; break;
case "Zoroark": poke[i] = 571; break;
case "Minccino": poke[i] = 572; break;
case "Cinccino": poke[i] = 573; break;
case "Gothita": poke[i] = 574; break;
case "Gothorita": poke[i] = 575; break;
case "Gothitelle": poke[i] = 576; break;
case "Solosis": poke[i] = 577; break;
case "Duosion": poke[i] = 578; break;
case "Reuniclus": poke[i] = 579; break;
case "Ducklett": poke[i] = 580; break;
case "Swanna": poke[i] = 581; break;
case "Vanillite": poke[i] = 582; break;
case "Vanillish": poke[i] = 583; break;
case "Vanilluxe": poke[i] = 584; break;
case "Deerling": poke[i] = 585; break;
case "Sawsbuck": poke[i] = 586; break;
case "Emolga": poke[i] = 587; break;
case "Karrablast": poke[i] = 588; break;
case "Escavalier": poke[i] = 589; break;
case "Foongus": poke[i] = 590; break;
case "Amoonguss": poke[i] = 591; break;
case "Frillish": poke[i] = 592; break;
case "Jellicent": poke[i] = 593; break;
case "Alomomola": poke[i] = 594; break;
case "Joltik": poke[i] = 595; break;
case "Galvantula": poke[i] = 596; break;
case "Ferroseed": poke[i] = 597; break;
case "Ferrothorn": poke[i] = 598; break;
case "Klink": poke[i] = 599; break;
case "Klang": poke[i] = 600; break;
case "Klinklang": poke[i] = 601; break;
case "Tynamo": poke[i] = 602; break;
case "Eelektrik": poke[i] = 603; break;
case "Eelektross": poke[i] = 604; break;
case "Elgyem": poke[i] = 605; break;
case "Beheeyem": poke[i] = 606; break;
case "Litwick": poke[i] = 607; break;
case "Lampent": poke[i] = 608; break;
case "Chandelure": poke[i] = 609; break;
case "Axew": poke[i] = 610; break;
case "Fraxure": poke[i] = 611; break;
case "Haxorus": poke[i] = 612; break;
case "Cubchoo": poke[i] = 613; break;
case "Beartic": poke[i] = 614; break;
case "Cryogonal": poke[i] = 615; break;
case "Shelmet": poke[i] = 616; break;
case "Accelgor": poke[i] = 617; break;
case "Stunfisk": poke[i] = 618; break;
case "Mienfoo": poke[i] = 619; break;
case "Mienshao": poke[i] = 620; break;
case "Druddigon": poke[i] = 621; break;
case "Golett": poke[i] = 622; break;
case "Golurk": poke[i] = 623; break;
case "Pawniard": poke[i] = 624; break;
case "Bisharp": poke[i] = 625; break;
case "Bouffalant": poke[i] = 626; break;
case "Rufflet": poke[i] = 627; break;
case "Braviary": poke[i] = 628; break;
case "Vullaby": poke[i] = 629; break;
case "Mandibuzz": poke[i] = 630; break;
case "Heatmor": poke[i] = 631; break;
case "Durant": poke[i] = 632; break;
case "Deino": poke[i] = 633; break;
case "Zweilous": poke[i] = 634; break;
case "Hydreigon": poke[i] = 635; break;
case "Larvesta": poke[i] = 636; break;
case "Volcarona": poke[i] = 637; break;
case "Cobalion": poke[i] = 638; break;
case "Terrakion": poke[i] = 639; break;
case "Virizion": poke[i] = 640; break;
case "Tornadus": poke[i] = 641; break;
case "Thundurus": poke[i] = 642; break;
case "Reshiram": poke[i] = 643; break;
case "Zekrom": poke[i] = 644; break;
case "Landorus": poke[i] = 645; break;
case "Kyurem": poke[i] = 646; break;
case "Keldeo": poke[i] = 647; break;
case "Meloetta": poke[i] = 648; break;
case "Genesect": poke[i] = 649; break;
            
        }    
        }
        
        //Guardar o valor da Classe Treinador
        String trainertipe = classeTreinador.getSelectedItem().toString();
        int trainerSprite = 0;
        switch(trainertipe){
            case "Lucas": trainerSprite = 1;break;
            case "Dawn": trainerSprite = 2;break;
            case "Barry": trainerSprite = 3;break;
            case "Nate": trainerSprite = 4;break;
            case "Hilda": trainerSprite = 5;break;
            case "Bianca": trainerSprite = 6;break;
            case "Cheren": trainerSprite = 7;break;
            case "Sun": trainerSprite = 8;break;
            case "Moon": trainerSprite = 9;break;
            case "Kiawe": trainerSprite = 10;break;
            case "Giovanni": trainerSprite = 11;break;
            case "May": trainerSprite = 12;break;
            case "Silver": trainerSprite = 13;break;
        }    
        String corDoCard = boxCardCollor.getSelectedItem().toString();
        int cor = 0;
        switch(corDoCard){
            case "Vermelho": cor = 1;break;
            case "Azul": cor = 2;break;
            case "Verde": cor = 3;break;
            case "Preto": cor = 4;break;
        }    
        
        
        // Register the new user
        String insertQuery = "INSERT INTO trainers (tid, trainerName, trainerPass, trainerClass, cardColor, pokemon1, pokemon2, pokemon3, pokemon4, pokemon5, pokemon6) VALUES ('" +tid+ "','" +trainername+ "', '" +password+ "','" +trainerSprite+ "','" +cor+ "', '" + poke[0]+ "', '" + poke[1]+ "', '" + poke[2]+ "', '" + poke[3]+ "', '" + poke[4]+ "', '" + poke[5]+ "')";
        int rowsAffected = stmt.executeUpdate(insertQuery);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Registro completo!");
            JOptionPane.showMessageDialog(null, "Seu Id de Treinador é: "+tid+".");
            // Perform further actions or open a new window
        } else {
            JOptionPane.showMessageDialog(this, "Registro falhou!");
        }

        stmt.close();
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro conectando com o banco de dados: " + e.getMessage());
    }

        
        
        
        
        
    }//GEN-LAST:event_btnCriarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCardCollor;
    private javax.swing.JButton btnCriar;
    private javax.swing.JComboBox<String> classeTreinador;
    private javax.swing.JLabel clickableLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> poke1;
    private javax.swing.JComboBox<String> poke2;
    private javax.swing.JComboBox<String> poke3;
    private javax.swing.JComboBox<String> poke4;
    private javax.swing.JComboBox<String> poke5;
    private javax.swing.JComboBox<String> poke6;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
