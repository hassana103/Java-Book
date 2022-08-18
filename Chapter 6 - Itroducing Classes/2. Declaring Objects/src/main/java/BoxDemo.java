// 2 steps of obtaining an object of a class
class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo{
    public static void main(String[] args){
        // step 1: declare a reference to object
        Box myBox;

        // step 2: allocate an object on memory
        myBox = new Box();
        //The new operator dynamically allocates (that is, allocates at run time)
        // memory for an object and returns a reference to it
        // see fig 6-1

        // we can add to steps together
        Box myBox2 = new Box();

    }

}



