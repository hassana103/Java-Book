// this is the simple form of a class
// the variables defined inside a class are called instance variables
class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo{
     public static void main(String[] args){
         // to create an object of class Box use statement like this
         Box myBox = new Box();

         // each objects of a class have a copy of instance variables
         // to access the instance variables use dot(.) operator
         // here we set the variables first
         myBox.width = 10 ;
         myBox.height = 20;
         myBox.depth = 15;

         // here we use the variables
         double vol = myBox.width * myBox.height * myBox.depth;

         System.out.println("volume of myBox is: "+vol);
     }

}



