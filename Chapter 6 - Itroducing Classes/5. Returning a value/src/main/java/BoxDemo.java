// general form of a method is like this
//      return-type name (comma separated parameter list){
//          //method body
//      }
// return-type is the type of data that this method returns (void if it returns nothing)

//now we make volume to return a value
class Box{
    double width;
    double height;
    double depth;

    double volume(){
        // the type of returning value should be compatible with return type of method
        return width*height*depth;
    }
}
class BoxDemo {
    public static void main(String[] args) {
        // here we create an object
        Box b1 = new Box();

        b1.width=10;
        b1.height=20;
        b1.depth=15;

        // now we call volume method and store the return value to vol
        // the type of vol should be compatible with the return type of method
        double vol = b1.volume();
        System.out.println("volume =" + vol);
    }
}