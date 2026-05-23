package models.helpers;

public class Pair {
    private int x;
    private char y;

    public Pair(int x,char y) {
        this.x = x;
        this.y = y;
    }

    public char getY() {
        return y;
    }

    public void setY(char y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
