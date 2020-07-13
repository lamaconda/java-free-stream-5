package by.jrr.mazinskiy;

public class Watch {
    private String name;
    private String company;
    private String paramet;

    Watch(String name,String company, String paramet)
    {
        this.name = name;
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
}
