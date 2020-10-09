
public class STE01
{
    //initialize static varible
    //Root1,Root2 is sharing among whole class.
    private static double Root1, Root2;

    //main function
    public static void main( String[] argv )
    {
        //initialize three varible
        int     X, Y, Z;
        //initialize boolean varible
        boolean ok;
        //condition
        if (argv.length == 3)
        {
            //catch exception start from here
            try
            {
                //assign first element to X
                X = Integer.parseInt (argv[0]);
                //assgin second element to Y
                Y = Integer.parseInt (argv[1]);
                //assign third element to Z
                Z = Integer.parseInt (argv[2]);
            }
            catch (NumberFormatException e)
            {
                //when exception occurs then it will be handled here
                System.out.println("Input not integers, using 8, 10, -33.");
                X = 8;
                Y = 10;
                Z = -33;
            }
        }
        //if not meet the condition then go here
        else
        {
            X = 8;
            Y = 10;
            Z = -33;
        }

        //call the Root function here
        //value X,Y,Z which is 8,10,-33 pass to Root function
        //get the Root function's boolean result
        ok = Root (X, Y, Z);
        if (ok) 
            System.out.println("Quadratic Root 1 = " + Root1 + ", Root 2 = " + Root2);
        else
            System.out.println("No Solution.");
    }

    // TFinds quadratic root, A must be non-zero
    private static boolean Root (int A, int B, int C)
    {
        //initialize varibles
        double D;
        boolean Result;
        //use specific syntax assign D
        D = (double) (B*B) -  (double) (4.0*A*C );

        //condition 
        if (D < 0.0)
        {
            Result = false;
            return (Result);
        }
        //assgin value to Root1 and Root2 which are the static varible
        Root1 = (double) ((-B + Math.sqrt(D))/(2.0*A));
        Root2 = (double) ((-B - Math.sqrt(D))/(2.0*A));
        Result = true;

        //return the value
        //pass the result to main function
        return (Result);
    } // End method Root49 
} // End class Quadratic
        