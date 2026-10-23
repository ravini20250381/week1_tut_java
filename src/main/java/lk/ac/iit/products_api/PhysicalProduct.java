package lk.ac.iit.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;


    public PhysicalProduct(){}

    public PhysicalProduct(long id, String name,double weightKg, String dimensions,double price){
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
