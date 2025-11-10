public class Switch_Case{
    public static void main(String[]args){
       /*The switch statement in Java is used when you want to 
       excecute one block of code out of multiple options based 
       on the value of a variable 
       
       switch (expression){
            case value1:
                //code if expression == value1
                break;

            case value2:
                //code if expression ==value2
                break;
            
            case valie2:
                //code if expression ==value2
                break;
            
            default:
                //code if no case matches       
       }

       EXAMPLE
       */

       int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        
            default:
                System.out.println("Invalid Day");
                break;
        }

        /*
         Use break; to stop dall-through to the next case.
         default: is optional but useful.
         You can use strings, enums, or int/char types in a switch
         */

    }
}