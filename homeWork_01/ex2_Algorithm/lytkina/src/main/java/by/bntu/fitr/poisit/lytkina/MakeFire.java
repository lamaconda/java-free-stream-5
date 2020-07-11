package by.bntu.fitr.poisit.lytkina;

public class MakeFire {
    public void run(){
        choosePlace();
        prepareKindling();
        keepFirewood();
        takeMatch();
    }
    public void choosePlace(){
        System.out.println("choose good place for fire");
    }
    public void prepareKindling(){
        System.out.println("prepare kindling");
    }
    public void keepFirewood(){
        System.out.println("keep firewood and put kindling under firewood");
    }
    public void takeMatch(){
        System.out.println("light a match");
    }
}
