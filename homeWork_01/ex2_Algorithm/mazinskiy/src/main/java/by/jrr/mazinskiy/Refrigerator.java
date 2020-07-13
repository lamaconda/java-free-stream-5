package by.jrr.mazinskiy;

public class Refrigerator {
    private String name;
    private String company;
    private int shelfLife;
    private String paramet;

    Refrigerator(String name,String company, int shelfLife, String paramet)
    {
        this.name = name;
        this.company = company;
        this.shelfLife = shelfLife;
        this.paramet = paramet;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    public void setParamet(String paramet){
        this.paramet = paramet;
    }
    public String getParamet(){
        return this.paramet;
    }
    public void setShelfLife(int shelfLife){
        this.shelfLife = shelfLife;
    }
    public int getShelfLife(int shelfLife){
        return this.shelfLife;
    }
}
