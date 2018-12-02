package myTestNG;


public class Calculator {
    
    int x = 0;
    int y = 0;
    int z = 0;
    String m = null;
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getZ() {
        return z;
    }
    
    public void setZ(int z) {
        this.z = z;
    }
    public int add(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        return x + y;
    }
    public int sub(int x, int y)
    {
        this.x = x;
        this.y = y;
        return x - y;
    }
    
        public int mult(int x, int y)
    {
            this.x = x;
            this.y = y;
        return x*y;
    }
    public int div(int x, int y)
    {
        this.x = x;
        this.y = y;
        
        if(y > x)
        {
            throw new IllegalArgumentException(x + " is less than " + y) ;
        }
        
        return x / y;
        
    }
    public String msg(String m)
    {
        this.m = m;
        return m;
    }
    
 }
