package ie.atu.productv4;

public class Tv extends Product{

    private String manufacture;
    private String size;

    public Tv() {
        super();
        manufacture = "";
        size = "";
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return super.toString() + "Made by " + manufacture + "\n" + "Size: " + size;
    }
}
