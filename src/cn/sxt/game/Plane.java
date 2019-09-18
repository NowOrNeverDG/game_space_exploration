package cn.sxt.game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
    boolean left,right,up,down;

    public static final double speed = 3;//adjusted origin speed
    public static final double speedRate  = 0.3; //adjusted speedRate

    public void drawSelf(Graphics g) {
        g.drawImage(img,(int)x,(int)y,null);

        if(left) x -= speed + speedRate;
        if(up) y -= speed + speedRate;
        if(right) x += speed + speedRate;
        if(down) y += speed + speedRate;
    }

    public Plane(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    //Button execution of operation
    public void addDirection(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_LEFT: left = true; break;
            case KeyEvent.VK_UP: up = true; break;
            case KeyEvent.VK_RIGHT: right = true; break;
            case KeyEvent.VK_DOWN: down = true; break;
            default: break;
        }
    }

    //Button cancelation of operaiton
    public void minusDirection(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_LEFT: left = false; break;
            case KeyEvent.VK_UP: up = false; break;
            case KeyEvent.VK_RIGHT: right = false; break;
            case KeyEvent.VK_DOWN: down = false; break;
            default: break;
        }
    }

}
