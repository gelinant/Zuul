
/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int aPoids;
    private String aName;
    private String aDescription;

    /**
     * default constructor for objects of class Item
     */
    public Item(final int pPoids, final String pName, final String pDescription)
    {
        // initialise instance variables
        this.aPoids = pPoids;
        this.aName = pName;
        this.aDescription = pDescription;
    } 

    /**
     * accesseur du poids
     * @return     poids de l'objet 
     */
    public int getPoids()
    {
        return this.aPoids;
    } // sampleMethod(.)

    /**
     * accesseur du nom
     * @return nom
     */
    public String getName()
    {
        return this.aName;
    } // sampleMethod(.)
    
    /**
     * accesseur e la description
     * @return description
     */
    public String getDescription()
    {
        return this.aDescription;
    } // sampleMethod(.)
} // Item