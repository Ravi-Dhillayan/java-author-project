package sankegame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gamepanel extends JPanel implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;
    private int[] snakeexlength = new int[750];
    private int[] snakeeylength = new int[750];
    private int lengthOfSnake = 3;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private int moves = 0;

    private ImageIcon snaketitle = new ImageIcon(getClass().getResource("snaketitle.jpg"));
    private ImageIcon leftmouth = new ImageIcon(getClass().getResource("leftmouth.png"));
    private ImageIcon rightmouth = new ImageIcon(getClass().getResource("rightmouth.png"));
    private ImageIcon upmouth = new ImageIcon(getClass().getResource("upmouth.png"));
    private ImageIcon downmouth = new ImageIcon(getClass().getResource("downmouth.png"));
    private ImageIcon snakeimage = new ImageIcon(getClass().getResource("snakeimage.png"));

    private Timer timer;
    private int delay = 100;

    Gamepanel() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawRect(24, 10, 300, 58);
        g.drawRect(24, 44, 451, 376);
        snaketitle.paintIcon(this, g, 15, 11);
        g.setColor(Color.BLACK);
        g.fillRect(24, 75, 850, 575);

        if (moves == 0) {
            snakeexlength[0] = 100;
            snakeexlength[1] = 75;
            snakeexlength[2] = 50;

            snakeeylength[0] = 100;
            snakeeylength[1] = 100;
            snakeeylength[2] = 100;
            moves++;
        }

        if (left) {
            leftmouth.paintIcon(this, g, snakeexlength[0], snakeeylength[0]);
        } else if (right) {
            rightmouth.paintIcon(this, g, snakeexlength[0], snakeeylength[0]);
        } else if (up) {
            upmouth.paintIcon(this, g, snakeexlength[0], snakeeylength[0]);
        } else if (down) {
            downmouth.paintIcon(this, g, snakeexlength[0], snakeeylength[0]);
        }

        for (int i = 1; i < lengthOfSnake; i++) {
            snakeimage.paintIcon(this, g, snakeexlength[i], snakeeylength[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = lengthOfSnake - 1; i > 0; i--) {
            snakeexlength[i] = snakeexlength[i - 1];
            snakeeylength[i] = snakeeylength[i - 1];
        }

        if (left) {
            snakeexlength[0] -= 25;
        } else if (right) {
            snakeexlength[0] += 25;
        } else if (up) {
            snakeeylength[0] -= 25;
        } else if (down) {
            snakeeylength[0] += 25;
        }

        if (snakeexlength[0] > 850) {
            snakeexlength[0] = 25;
        } else if (snakeexlength[0] < 25) {
            snakeexlength[0] = 850;
        }

        if (snakeeylength[0] > 625) {
            snakeeylength[0] = 75;
        } else if (snakeeylength[0] < 75) {
            snakeeylength[0] = 625;
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && !right) {
            left = true;
            right = false;
            up = false;
            down = false;
        } else if (key == KeyEvent.VK_RIGHT && !left) {
            left = false;
            right = true;
            up = false;
            down = false;
        } else if (key == KeyEvent.VK_UP && !down) {
            left = false;
            right = false;
            up = true;
            down = false;
        } else if (key == KeyEvent.VK_DOWN && !up) {
            left = false;
            right = false;
            up = false;
            down = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}