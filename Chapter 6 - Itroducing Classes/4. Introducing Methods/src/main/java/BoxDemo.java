// general form of a method is like this
//      return-type name (comma separated parameter list){
//          //method body
//      }
// return-type is the type of data that this method returns (void if it returns nothing)

//now we add method volume to Box class
class Box{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("volume = "+width*height*depth);
    }
}
class BoxDemo {
    public static void main(String[] args) {
        // here we create an object
        Box b1 = new Box();

        b1.width=10;
        b1.height=20;
        b1.depth=15;

        // now we call volume method
        b1.volume();
    }
}