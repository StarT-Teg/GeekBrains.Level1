/*
package lesson_8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

// public class BongoCat extends JFrame {

    private static Image left_bongo;
    private static Image right_bongo;
    private static Image default_bongo;

    private static long last_frame_time;

    JButton[] jbs = new JButton [2]; // Список кнопок
    GridLayout layout = new GridLayout(1, jbs.length);  // выбор компоновщика элементов
    // JPanel ButtonsPanel = new JPanel(); // Добавили панель, на которую будут лепиться кнопки из метода
    IMGpanel IMGpanel = new IMGpanel(); // Добавили панель, на которую будут лепиться изображения


    public BongoCat() throws IOException {

        setTitle("It's BONGO TIME!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // При закрытии окна программа завершается
        setLocation(200, 100); // Точка появления окна. Левый угол = 0.0 / Координаты в пикселях
        setSize(625,509); // Размер окна
        setResizable(false); // Размер нельзя менять

        add(IMGpanel);

        // Создём кнопки
        // addButtons(jbs[0], "Bongo left!");
        // addButtons(jbs[1], "Bongo right!");

        // add(ButtonsPanel, BorderLayout.SOUTH);

        default_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_default.jpg"));
        left_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_left.jpg"));
        right_bongo = ImageIO.read(BongoCat.class.getResourceAsStream("bongo_cat_right.jpg"));

        last_frame_time = System.nanoTime(); // Возвращает текущее время в наносекундах

    }


    public static void main(String[] args) throws IOException {

        BongoCat game_window = new BongoCat();


    }


*/
/*    private void addButtons(JButton addButton, String text){

        addButton = new JButton(text); // Создали кнопку

        ButtonsPanel.add(addButton); // добавление кнопки на форму

        setVisible(true);

        ButtonsPanel.add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Сюда написать смену фона
            }
        });

    }*//*


    private static void onRepaint (Graphics g){

        g.drawImage(default_bongo, 0,0,null);


*/
/*        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;

        drop_top = drop_top + drop_v * delta_time;

        g.drawImage(background, 0,0,null);
        g.drawImage(drop,(int) drop_left,(int) drop_top,null);

        if (drop_top > game_window.getHeight())
            g.drawImage(game_over, 280,120,null);*//*

    }

    private static class IMGpanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Отрисует панель
            onRepaint(g);
        }
    }

}
*/
