// adding a Parameterized Constructors

class Box{
    double width;
    double height;
    double depth;

    // just like methods, constructors can have parameters
    Box(double w, double h, double d){
        // we can use the parameters to initialize the instance variables
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        // the type of returning value should be compatible with return type of method
        return width*height*depth;
    }

}
class BoxDemo {
    public static void main(String[] args) {
        // here we create an object but this time we pass the arguments to the constructor
        Box b1 = new Box(10 , 20, 15);

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


        // this line of code wont work any more
        // Box b2 = new Box();
        // because the Box class does not have a matching constructor any more
        // but at first we did not have any constructor at all
        // and still this line worked and created objects for us
        // why!!!!!!!?
        // answer: if we dont define a constructor, java makes a default constructor with no parameter for us
        // but remember, as soon as you create your first constructor for your class,
        // you cant use the default one any more
        // that is why we cant use this line of code any more...


    }
}