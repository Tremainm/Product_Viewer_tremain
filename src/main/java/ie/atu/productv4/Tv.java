package ie.atu.productv4;

public class Tv extends Product{

    private String manufacture;
    private int size;

    public Tv() {
        super();
        manufacture = "";
        size = 0;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Made by " + manufacture + "\n" + "Size: " + size;
    }
}
