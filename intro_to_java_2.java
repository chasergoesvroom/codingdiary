import java.util.Scanner; // this is important library to add scanner for taking input

public class intro_to_java_2 {
    public static void main(String[] args) {

        // syntax for variables

        // 1- declaration
        //<data_type> name_of_the_variable;

        // 2- initialization
        //<data_type> name_of_the_variable = value;


        //initialization
        int a = 10; 
        int b = 20;
        System.out.println(a+b);

        //declaration
        int c;
        c = 60;
        System.out.println(c);



        int d = 30;
        int e = 40;
        System.out.println(d-e);

        //if we initialized a value of variable already can we change it again , yes you can
        int x = 45;
        System.out.println(x);
        x = 26;
        System.out.println(x);

        //how to name variable . lets see
        /* 
        1. any characters from a to z or A to Z can be used
        2. numbers from 0 to 9 can be used
        3. special characters can be only dollar ('$') and underscore ('_')
        4. can not start with 0 to 9
        5. can start with underscore ('_') and ('$') (dollar thing is not confirmed its varies)
        6. can not have space between name
        7. can not name already defined names for eg; static, void, println etc

        _age --> valid
        age --> valid
        8age --> invalid
        room number --> invalid
        calculator_ --> valid
        calculator$ --> valid
        age# --> invalid
        319 --> invalid
        age5 --> valid
        static --> invalid */

        // int static = 4;

        int $$ = 59;

        System.out.println($$);


        //Integer types

        //1. int --> only stores from -2,147,483,648 to +2,147,483,647 
        //2. long --> stores from -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        //3. short -->  stores from -32,768 to +32,767
        //4. byte --> stores -129 to +127

        int q = 2147483646; //integer is too large so error will happen if you run it
        long w = 2147483648l; //have to have 'L' after the number if long is used
        short y = 32767; // only use if you don't wanna store huge numbers or if there's a use case like that
        byte o = 125;


        //Float types

        float radius = 6.526924276f; //use 'f' after the number other wise it will give error
        System.out.println(radius); //float only take 7 number after pont other will not be shown when printed

        double radius2 = 6.526924276; //use double to show more number after point co it can show up to 15 unlike float
        System.out.println(radius2);


        //Boolean

        //boolean can only store 'true' or 'false' nothing else, basically online status or yes or no
        boolean happy = true;
        boolean sad = false;
        System.out.println(happy);
        System.out.println(sad);



        //Taking input from user

        

        Scanner sc = new Scanner(System.in);  //sc is the variable name it can even be tomato or anything
        int age2 = sc.nextInt();
        System.out.println(age2);


        //Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(2*k);

        // Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        System.out.println(u + 10);

        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n-m);

        // Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int h = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(g+h+j);

        // Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int p = sc.nextInt();
        int s = sc.nextInt();
        int avg = r+p+s;
        System.out.println(avg/3);

        //now lets do float as in makes every number whole in output

        // Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        System.out.println(f1+f2);

        // Scanner sc = new Scanner(System.in);
        float f3 = sc.nextFloat();
        float f4 = sc.nextFloat();
        System.out.println(f3*f4);


        

        // how to declare multiple variables in one line

        int rollnumber, classnumber, phonenumber;

        // how to multiple initialize variables in one line

        int ward=13, district=10;
        float corner=6.753f, circle=7.54f;

        System.out.println("ward = " + ward);
        System.out.println("district = " + district);
        System.out.println("corner = " + corner);
        System.out.println("circle = " + circle);

        //same goes for float and everything






















        







        

        









        


    }
    
}
