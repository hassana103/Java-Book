// assigning object references to each other
class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo{
    public static void main(String[] args){
        // here we create an object
        Box b1 = new Box();

        // here we assign the reference b1 to another reference b2
        Box b2 = b1;

        // this does not create another copy of object or allocate any new memory
        // this simply just makes new reference (b2) to refer to the same object
        // see fig 6-2

        // any change to b2 now affects b1 and the other way


    }

}



