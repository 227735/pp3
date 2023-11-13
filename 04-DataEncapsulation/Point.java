public class Point {
    private int x ;
    private int y ;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isX(){
        return x == 0;
    }

    public boolean isY(){
        return y == 0;
    }

    public String toString(){
        return String.format("P(%d,%d)", x,y);
    }
    
}
