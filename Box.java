public class Box {
    int width;
    int height;
    int depth;

    public Box(){
        System.out.println ();
    }
    public Box(int width){
        this.width = width;
        System.out.println(width);
    }

    public Box(int width,int heigth){
        this.width = width;
        this.height = heigth;
        System.out.println(width);
        System.out.println(heigth);
    }
    public Box(int width,int heigth,int depth){
        this.width = width;
        this.height = heigth;
        this.depth = depth;
        System.out.println(width);
        System.out.println(heigth);
        System.out.println(depth);
    }


}
