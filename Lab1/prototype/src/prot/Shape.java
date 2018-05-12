package prot;

//abstract class to implement cloneable interface
//cloneable interface is implemented to indicate to the object clone
//that it is ok to for that method to make copies of instance of the shape class
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() { //acts like a copy constructor(??)
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {    //this is thrown if the object is not a instance of the shape class(cloneable)
            e.printStackTrace();                    //print the location where the exception occurs
        }

        return clone;       //returning a clone of th object
    }
}