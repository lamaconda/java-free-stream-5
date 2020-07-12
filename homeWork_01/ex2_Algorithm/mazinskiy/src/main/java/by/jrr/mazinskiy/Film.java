package by.jrr.mazinskiy;

public class Film {
    private String name;
    private String producer;
    private String company;
    private String paramet;

    Film(String name, String producer, String company, String paramet)
    {
        this.name = name;
        this.producer = producer;
        this.company = company;
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
    public void setProducer(String producer){
        this.producer = producer;
    }
    public String getProducer(){
        return this.producer;
    }
}
