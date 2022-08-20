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

    //adding a method that take parameters
    void setDim(double w , double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo {
    public static void main(String[] args) {
        // here we create an object
        Box b1 = new Box();

        //we dont need to set the dimensions this way now
        //b1.width=10;
        //b1.height=20;
        //b1.depth=15;

        // now we can call setDim and pass it values
        b1.setDim(10 , 20,15);

        // now we call volume method and store the return value to vol
        // the type of vol should be compatible with the return type of method
        double vol = b1.volume();
        System.out.println("volume =" + vol);


        // mind the difference between Parameter and Argument
        // Parameter is the variable, for example in setDim definition w,h and d are parameters
        // but Argument is the value that we pass to method when we call it
        // for example when we called setDim in line 36, we passed arguments 10,20 and 15 to it
    }
}