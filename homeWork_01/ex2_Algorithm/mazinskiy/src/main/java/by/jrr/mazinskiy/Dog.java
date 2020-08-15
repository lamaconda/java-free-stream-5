package by.jrr.mazinskiy;

public class Dog {
    private String name;
    private String breed;
    private String paramet;

    Dog(String name,String breed, String paramet)
    {
        this.name = name;
        this.breed = breed;
        this.paramet = paramet;
    }

    public void setName(String name){
         this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setParamet(String paramet){
        this.paramet = paramet;
    }
    public String getParamet(){
        return this.paramet;
    }


}
