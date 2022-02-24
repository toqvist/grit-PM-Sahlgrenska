package model;


import java.util.List;

public class Medicine {

    private String name;
    private String description;
    private Integer amount;
   


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmmount(Integer amount) {
        this.amount = amount;
    }

    

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public Integer getAmount() {
        return amount;
    }

}