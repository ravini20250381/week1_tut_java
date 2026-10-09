package lk.ac.iit.products_api;

public class person {
    private String name;
    private String email;

    public person(){

    }
    public person(String name,String email){
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
}
