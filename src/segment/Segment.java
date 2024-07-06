package segment;

public class Segment {
    private int extr1,extr2;

    public Segment(int extr1,int extr2){
        this.extr1=extr1;
        this.extr2=extr2;
        ordonne();
    }
    private void ordonne(){
        if(this.extr1 > this.extr2){
            int box=extr1;
            this.extr1=this.extr2;
            this.extr2= box;
        }
    }

    public int getExtr1(){
        return extr1;
    }
    public void setExtr1(int extr1){
        this.extr1=extr1;
        ordonne();
    }

    public void setExtr2(int extr2) {
        this.extr2 = extr2;
        ordonne();
    }

    public int getExtr2() {
        return extr2;
    }

    public int longueur(){
        return extr2-extr1;
    }
    public boolean appartient(int x){
        return x>=extr1 && x<=extr2;
    }

    public String toString(){
        return "Longueur du segment [" + extr1 + "," +extr2+"]: "+ this.longueur();
    }
}
