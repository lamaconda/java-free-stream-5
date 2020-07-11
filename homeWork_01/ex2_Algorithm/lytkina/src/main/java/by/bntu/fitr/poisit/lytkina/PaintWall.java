package by.bntu.fitr.poisit.lytkina;

public class PaintWall {
    public void run(){
        choosePaint();
        wearUniform();
        takeBrash();
        paint();
    }
    public void choosePaint(){
        System.out.println("choose paint");
    }
    public void wearUniform(){
        System.out.println("wear the uniform");
    }
    public void takeBrash(){
        System.out.println("take a brush");
    }
    public void paint(){
        System.out.println("start painting a wall");
    }
}
