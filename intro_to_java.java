public class intro_to_java {
    public static void main(String[] args) {
        System.out.print("Hello. world!");
        System.out.print("Hello john");
        System.out.print("100");
        System.out.print(100+400-10/10); 

        System.out.print("100" + " abc" + " hello "); //need '+' to attach to string together

        System.out.print(100 + " hello"); //can use '+' to attach int and string together
        System.out.print(100 + 65 + " hellow "); // another use case of '+'
        //System.out.print( 100 "hellow"); //this will give error as its not using '+' to attach to things
        System.out.print(100 + "hellow" + 65); //adding will not happen here as strings between those two int so just attaching happens
        System.out.print("hellow " + 65 + 5); //in this theres no adding so just attach which means 655 not 70 , due to thers a string in first
        System.out.print(2 + 100 / 4 + 6); //BODMAS applies here first 100/4 then +2 then +6  = 33
        System.out.print("abc" + 400 / 4);
        System.out.print("abc" + 400 + 4); // no BODMAS applies here so attaching happens
        System.out.print(100 + "abc " + 400 + 4); // 100 and abc attaches and 4004 coms as there was string before it so it attaches instead of adding
        System.out.print(100 + "abc" + (400 + 4)); //BODMAS applies here as theres brackets so 404 adds and 100 and abc attaches
        
        System.out.println("$$$"); //println is used to send the cursor to next row so other below printer below
        System.out.print("$$\n"); //you can also use '\n' in the string itself to create a new line for next code to print
        System.out.println("$"); 

        //both 'println' and '\n' are used for the same purpose

        /*
        *****  
        ****  
        ***  
        **  
        *
        */
       //print the star as its shown

        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");



        System.out.println(6+3);
        System.out.println(6-3);
        System.out.println(6*3);
        System.out.println(6/3);

        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");

        System.out.println("1 3 5 7 9");

        System.out.println("Hello");
        System.out.println("World !");

        System.out.println("Hello 40");
        System.out.println("50 World !");








    }
    
}
