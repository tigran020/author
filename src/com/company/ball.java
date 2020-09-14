package com.company;

public class ball {
    private Double x;
    private Double y;
    ball(Double x, Double y)
    {
        this.x=x;
        this.y=y;
    }
    public Double getX(){return x;}
    public void setX(Double x1){x=x1;}
    public Double getY(){return y;}
    public void setY(Double y){this.y=y;}
    public void setXY(Double x, Double y){this.y=y; this.x=x;}
    public void move(Double xDisp,Double yDisp)
    {
        x=xDisp;
        y=yDisp;
    }
    public String toString()
    {
        return("Ball "+x+y);
    }



}
