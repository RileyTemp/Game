package Practice;

import javax.swing.*;
import java.awt.Image;
import java.awt.Rectangle;

public class Enemy2 {

    private Image img;
    int k;
    int x, y, dx, dy;
    static int X, Y, I, BX, BY, nHit;
    int nWidth, nLength, EH, EW, nEXP, nSpawn;
    private final int nSpeed = 5;
    ImageIcon e1 = new ImageIcon("Enemy2.png");
    ImageIcon e2 = new ImageIcon("Enemy2.png");
    int imgWidth = e1.getIconHeight();
    int imgHeight = e2.getIconWidth();
    Image arnEnemy[] = new Image[3];
    int arnHit[] = new int[50];
    Rectangle r;

    public Rectangle getRect() {
        r.setBounds(x, y, imgWidth, imgHeight);
        return r;

    }

    public Enemy2() {
        r = new Rectangle();
        dx = 0;
        dy = 0;
        x = 350;
        y = 350;
        nEXP = 5;
        arnEnemy[0] = e1.getImage();
        arnEnemy[1] = e2.getImage();
    }
    /*
     public void move() {
     //EH = imgHeight + y - 30;
     //EW = imgWidth + x - 30;
     x += dx;
     y += dy;
     if (k == 1 || k == 2) {
     if (X > x) {
     dx = nSpeed;
     } else if (X < x) {
     dx = -nSpeed;
     } else {
     dx = 0;
     }
     if (Y > y) {
     dy = nSpeed;
     } else if (Y < y) {
     dy = -nSpeed;
     } else {
     dy = 0;
     }
            
     }
     }*/

    public int getX() {
        return x - 30;
    }

    public int getY() {
        return y - 30;
    }

    public Image getImage() {
        img = arnEnemy[k];
        return img;
        /*
         if (nHit == nEXP) {
         k = 0;
         x = 3000;
         y = 3000;
         nSpawn++;
         if (nSpawn >= 20) {
         nSpawn = 0;
         x = 100;
         y = 100;
         nEXP += 5;
         }
         return img;
         }
         if (X >= x) {
         k = 1;
         return img;
         }
         if (X <= x) {
         k = 2;
         return img;
         }
         return img;
         */
    }
}
