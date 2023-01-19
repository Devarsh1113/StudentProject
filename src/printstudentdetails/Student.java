package printstudentdetails;

/**
 * Model Class= Student Data or Raw Data. 
 * @author 12268
 */
public class Student 
{

    /* Encapsulation Principle- Private variables, getters and setters. */
    private String Name;
    private int SID;

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the SID
     */
    public int getSID() {
        return SID;
    }

    /**
     * @param SID the SID to set
     */
    public void setSID(int SID) {
        this.SID = SID;
    }
    

}
