package by.bntu.fitr.poisit.lytkina;

public class WashDishes {
    public void run(){
        pickDirtyDishes();
        takeCleanser();
        turnOnWater();
        wash();
    }
    public void pickDirtyDishes(){
        System.out.println("pick dirty dishes");
    }
    public void takeCleanser(){
        System.out.println("take a cleanser");
    }
    public void turnOnWater(){
        System.out.println("turn on the tap water");
    }
    public void wash(){
        System.out.println("washing");
    }
}
