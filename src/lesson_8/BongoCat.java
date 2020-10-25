package lesson_8;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BongoCat extends JFrame {

    private static BongoCat bongoCat;
    private static Image left_bongo;
    private static Image right_bongo;
    private static Image default_bongo;

    public static void main(String[] args) throws IOException {

        default_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_default.jpg"));
        left_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_left.jpg"));
        right_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_right.jpg"));

        bongoCat = new BongoCat();
        bongoCat.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // При закрытии окна программа завершается
        bongoCat.setLocation(200, 100); // Точка появления окна. Левый угол = 0.0 / Координаты в пикселях
        bongoCat.setSize(625,520); // Размер окна
        bongoCat.setResizable(false); // Размер нельзя менять
        bongoCat.setTitle("It's BONGO time!");
        bongoCat.setVisible(true);



        GridLayout layout = new GridLayout(1,2);
        JPanel buttonsPanel = new JPanel(layout);
        IMGPanel imgPanel = new IMGPanel();

        JButton[] jbs = new JButton [2]; // Список кнопок

        // Создём кнопки
        jbs[0] = new JButton("Bongo left!"); // Создали кнопку
        buttonsPanel.add(jbs[0]); // добавление кнопки на форму
        jbs[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    default_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_left.jpg"));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });


        jbs[1] = new JButton("Bongo right!"); // Создали кнопку
        buttonsPanel.add(jbs[1]); // добавление кнопки на форму
        jbs[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    default_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_right.jpg"));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });

        bongoCat.add(imgPanel);
        bongoCat.add(buttonsPanel, BorderLayout.SOUTH);

    }

    private static void onRepaint (Graphics g){

        g.drawImage(default_bongo,0,0, null);
    }

    private static class IMGPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Отрисует панель
            onRepaint(g);
            repaint();
        }
    }

}
