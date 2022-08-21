// instance variable hiding
// now you have to use this

class Box{
    double width;
    double height;
    double depth;

    // when a local variable has the same name of the instance varible
    // we can say the local variable hided the instance variable
    // for example the following constructor has three parameters with the same name as instance variable
    // so in the scope of this constructor if we refer to, for example : width
    // we can have the parameter one
    // but what if we want to access the instance variable with the name width
    // here we can use this keyword like this to refer to instance variables.
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
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