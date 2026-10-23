package lk.ac.iit.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // TODO (a): empty no-arg constructor for Jackson
// TODO (b): full constructor.
// First line must be super(id, name, price);
// then assign this.weightKg and this.dimensions
// TODO (c): getWeightKg() and getDimensions()

    public PhysicalProduct(){}

    public PhysicalProduct(long id, String name,double price ,double weightKg, String dimensions){
        super(id,name,price);
        this.dimensions=dimensions;
        this.weightKg=weightKg;
    }
    public String getDimensions (){
        return dimensions;
    }
    public double getWeightKg (){
        return weightKg;
    }




}
