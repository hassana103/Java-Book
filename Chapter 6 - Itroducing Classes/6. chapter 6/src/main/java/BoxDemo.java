// adding a simple constructor

class Box{
    double width;
    double height;
    double depth;

    // constructors are similar to methods syntactically
    // the name is exactly the class name
    // it does not need a return type because it returns class type
    Box(){
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        // the type of returning value should be compatible with return type of method
        return width*height*depth;
    }

}
class BoxDemo {
    public static void main(String[] args) {
        // here we create an object
        // the 'Box()' actually calls our new constructor
        Box b1 = new Box();

        //we dont need to set the dimensions this way now
        //b1.width=10;
        //b1.height=20;
        //b1.depth=15;

        // we dont need the setDim method anymore
        // because we took care of initializing the variables in the constructor
        //b1.setDim(10 , 20,15);

        // now we call volume method and store the return value to vol
        double vol = b1.volume();
        System.out.println("volume =" + vol);

    }
}