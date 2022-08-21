// this keyword
// when we need a method to refer to the object that invoked it we use this keyword
// we can use this keyword inside constructor too

class Box{
    double width;
    double height;
    double depth;

    // using this keyword
    // its redundant but helps to understand that this always refer to current object inside the class
    // this code works just like the one before it
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume(){

        return width*height*depth;
    }

}
class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10 , 20, 15);

        double vol = b1.volume();
        System.out.println("volume =" + vol);

    }
}