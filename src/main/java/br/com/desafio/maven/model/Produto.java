package br.com.desafio.maven.model;

public class Produto {
    private int id;
    private String name;
    private double value;
    private int amount;
    public Produto(int id, String name, double value, int amount) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "id=" + id + " - - - name = " + name + " - - - value = $" + value + " - - - amount = " + amount ;
    }

    

    

}

