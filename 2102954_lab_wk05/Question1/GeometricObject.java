import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private Boolean filled = false;
    private Date dateCreated = new Date();

    public GeometricObject(){}
    public GeometricObject(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "created on "+dateCreated.toString()+"\ncolor: "+this.color+" and filled: "+filled.toString();
    }

}
