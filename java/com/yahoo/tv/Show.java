package com.yahoo.tv ;

public class Show {
    private int ID ;
    private String Name ;

    public Show( int ID )
    {
        this.ID = ID ; 
    }

    public Show( int ID , String Name )
    {
        this.ID = ID ; 
        this.Name = Name;
    }

    public int getID()
    {
        return ID; 
    }

    public String getName()
    {
        return Name; 
    }
}
