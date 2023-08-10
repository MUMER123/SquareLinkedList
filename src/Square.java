import java.util.Date;

public class Square {
    private int lengthOfSide;
    private Date dateTime;

    public Square(){
        this.lengthOfSide = 0;
        this.dateTime = new Date();
    }
    public Square(int lengthofSide){
        this.lengthOfSide = lengthofSide;
        this.dateTime = new Date();
    }
    public int getLengthofSide(){
        return this.lengthOfSide;
    }
    public void setLengthOfSide(int lengthofSide){
        this.lengthOfSide = lengthofSide;
    }
    public Date getDateTime(){
        return this.dateTime;
    }
    public void setDateTime(Date dateTime){
        this.dateTime = dateTime;
    }
    public int getArea(){
        return this.lengthOfSide*this.lengthOfSide;
    }
    @Override
    public String toString(){
        return "Length of the side of square: "+
                this.lengthOfSide+ "\nArea of the Square: "+getArea()+
                "\nDate and Time of creation: "+this.dateTime+"\n\n";
    }


}
