package ie.atu.productv4;

import ie.atu.productv2.Software;

public class ProductDB {

    //  public static Book or Software getProduct(String productCode) {
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?
    //}

    public static Product getProduct (String productCode)
    {
        Product p = null;
        Music myMusic = null;
        Tv myTv = null;

        if (productCode.equalsIgnoreCase("PINK"))
        {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here ");
            myMusic.setPrice(57.50);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Columbia group");
            p = myMusic;
        }
        else if (productCode.equalsIgnoreCase("kdl43"))
        {
            myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Sony Bravia Smart TV KDL43WF663");
            myTv.setPrice(57.50);
            myTv.setManufacture("by Sony");
            myTv.setSize("55 Inch");
            p = myTv;
        }
        return p;
    }



}

