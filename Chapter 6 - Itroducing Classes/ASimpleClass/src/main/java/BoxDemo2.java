// each object has its own copy of instance variables
// seperate from other objects of same class

public class BoxDemo2 {

    public static void main(String[] args) {
        // creating 2 seperate objects
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        // set values for myBox1
        myBox1.width = 10 ;
        myBox1.height = 20;
        myBox1.depth = 15;

        // set values for myBox2
        myBox2.width = 7 ;
        myBox2.height = 5;
        myBox2.depth = 11;

        // volume of each box
        double vol1= myBox1.width * myBox1.height * myBox1.depth;

        double vol2= myBox2.width * myBox2.height * myBox2.depth;

        // as we can see in the output, instance variables of each object are separated
        System.out.println("Volume of myBox1: "+vol1);
        System.out.println("Volume of myBox2: "+vol2);

    }
}
