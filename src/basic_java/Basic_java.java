/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic_java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author emreduman
 */
public class Basic_java {

    /**
     * @param args the command line arguments
     */
    
    
    static final int a =1;
    static int b=2;
    static private double cev;
    static private double dev;

    public static void main(String[] args)
    {
        // TODO code application logic here
        
        //<editor-fold defaultstate="collapsed" desc="run">

        //showMESSAGEdialog();
        //SCANNER();
        //showINPUTdialog();
        //INCREMENT_DECREMENT();
        //MATH();
        //TYPES_CONVERSIONofVARIABLES();
        //VARIABLES();
        //IF();
        //SWITCH();
        //WHILE();
        //FOR();
        //ARRAY();
        //break_continue();
        //Stringg();
        //FOR_EACH();
        //SHORTCUT();        
        //ARRAYLIST();
        
        // </editor-fold>
 
        //<editor-fold defaultstate="collapsed" desc="array ||reverse method">
        /*
        int[] list = {1, 2, 3, 4, 5};//reverse method in methods
        reverse(list);//ben yazdım listeyi ters çevirsin
        for (int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");

        
        
        
        int number = 0;   //m method in methods
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number
        + " and numbers[0] is " + numbers[0]);
        
        
         
        
        
        
        
        int myArray[ ] = new int [3]; //manually
        myArray[0] = 10; myArray[1] = 20; myArray[2] = 30;
        System.out.println("Printing integer array before passing to a function");
        for (int i = 0; i < myArray.length; i++)
        System.out.println(" Index " + i + " of the array have value = " + myArray[i]);

        modified(myArray); ///calling a method

        System.out.println("Printing integer array after passing to the function");
        for (int i = 0; i < myArray.length; i++)
        System.out.println(" Index " + i + " of the array have value = " + myArray[i]); */

        
        //add_up();// this method is in the method region

        // </editor-fold>
                
        //<editor-fold defaultstate="collapsed" desc=" DECIMALFORMAT">
        /*
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 12.78);
        customFormat("$###,###.###", 12345.67);  
        System.out.println (new DecimalFormat("###,###.##").format (123456.742));//40
        System.out.println (DecimalFormat.getInstance().format (011223.12294));//95
        */
        
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Methods ">

        
        
        // TODO code application logic here
        
        int a=9;//ıf ı didnot identify a in main method static a was going to be used
        //int a=8;//ı cant assign a new value to a variable
        a=8; // a's new value is 8

        System.out.println("A:"+a);//second a in main method
        System.out.println("B:"+b);//static b out of main method

        method1();
        //System.out.println(method1());//error because there should be a parameter
        method2(5);
        method2(1,2,3,4,5,6);
        String bbb="Mr.DUMAN";
        method3("Mr.Clay and ",bbb);
        //method3(b);//ıt has to have 2 parameter
        method3(6, " string");//there are 2 method named method3 but their parameter's type different so they both execute

        method3(4,4);//println:8
        int ddd= method3(4,4);//8
        ddd=ddd*ddd;//64
        System.out.println(ddd);//println:8 return 64
        System.out.println(method3(3,3));//println:6 return:6

        System.out.println(method3());//turkey turkey
        method3();//turkey
        
        
       
        
        method2(1,2,3,4,5,6);

        
        // </editor-fold>   
              
    }
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc=" METHODS ">

    //VOID WITHOUT PARAMETER
    public static void method1()//void=not returning the value
    {
        int a=4;
        a=3*a;//a is 4
        int b=0000;
        System.out.println("A+B:"+a+b);//adding up as a string
        System.out.println("A+B:"+(a+b));//addng up as a number
    }
      
    
    //VOID WITH PARAMETER
    
    public static void method2(Basic_java c)//c.a ( a variable that is out of main)
    {
       
        int a=5 ;//classın içinde global bir a var ,bumethod class adıyla parametre cağrıyor
       //so ı cant creat e new integer named a
        System.out.println((c.a) *a*b);  //static
    }
    
    //OVERLOADING
    public static void method2(int... parametres)//array gibi
    {
        int sum=0;
        for(int i:parametres)
        {
            sum+=i;
        }
        System.out.println(parametres[0]);
        System.out.println(Arrays.toString(parametres));
    }
    public static void method3(String name,String surname)//str b == str name parameter
    {
        int a=3;
        name="aaaaa";//this one is used 
        System.out.println(name);
        System.out.println("merhaba "+a+name+" "+surname);
    }

    public static void method3(int integer,String str) 
    {
        System.out.println("aaaa "+integer+ str);       
    }
    public static void method3(String integer,int str) 
    {
        System.out.println("aaaa "+integer+ str);       
    } 
      public static void method3(int f,int integer,String str) 
    {
        System.out.println("aaaa "+integer+ str);       
    }
    
    
    
    //INT WITH PARAMETER
    public static int method3(int a,int b)
    {
        int c=a+b;//8
        System.out.println(c);// void 8
        return a+b;///8
        //return c;// comes out of method3 8
        //System.out.println(c);// after return nothing can be printed  
    }
    //public static double method3(int a,int b) { } //override etmez
    

    
    //STRING WITHOUT PARAMETER
    public static String method3()
    {
        System.out.println("turkey");
        return "turkey";
        //String a="TURKEY";       
        //return a;
    }
    
    
    
    
    public static void reverse(int[] list)//array-main
    {
    int[] newList = new int[list.length];
    for (int i = 0; i < list.length; i++)
    newList[i] = list[list.length - 1 - i];
    }
    
    public static void m(int x, int[] y) //array-main
    {
        x = 3;
        y[0] = 3;
    }
    
    
    public static double max()//in showinput
    {
        if (a > b)
            return a;
        else
            return b;
    }

       static void modified(int jun[ ])//array
    {
        for(int i =0; i < jun.length; i++)
            jun[i] = 100;
    }

    public static void add_up()//array
    {
        
        Scanner object=new Scanner(System.in);
        int[] circleArray = new int[4];
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.printf("Enter %d. Element:",i+1,"\n");
            circleArray[i]=object.nextInt();
        }
        for (int i = 0; i < circleArray.length; i++)
            System.out.println(circleArray[i]);
        
        //method ile array'i çağırdım,methodun iççinde liste elemanlarını topla dedim
        
        int total=0;
        for( int i=0;i<circleArray.length;i++)
        {
            total+=circleArray[i];
        }
        System.out.println("sum of elements of array:"+total);
        System.out.println("average:"+(double)total/circleArray.length);    
    }

    
    static void modifie(int jun[ ])//array
    {
        for(int i =0; i < jun.length; i++)
            jun[i] = 100;
    }

      //OVERRIDING methodları sadece inheritance yapmis classlarda olur
    
   
      
      
    // </editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc=" BASIC INFOs">
    
    /*
    
    
    cd thr address of the file
    javadoc -d foldernamethat ı created  file.java  -version -param -author -return - since
    
    
    
    
    
    NUMERICAL DATA TYPES/Primitive Types

    NAME                           DOMAIN                          STORAGE-SIZE  
    byte         –128 to 127                                         8 bits
    short        –32768 to 32767                                     16 bits
    int          –2147483648 to 2147483647                           32 bits
    long         –922337203684547758808 to 922337203684547758807     64 bits
    char          0 to 65535                                        2(16 bits)

    float        –3.4E38 to 3.4E38                                   32 bits
    double       –1.7E308 to 1.7E308                                 64 bits

        
        
    Primitive Data Types
    1-Integral
    -short
    -char
    -long
    -int
    -byte
    
    2-floating-point
    -float
    -double
    
    3-Boolean operand
    -true
    -false
    
    
    
    Identifier:
    A Java identifier consists of letters, digits, the underscore character (_),and the dollar sign ($),
    and must begin with a letter, underscore, or the dollar sign.
    Identifiers can be made of only letters, digits, the underscore character (_), and the dollar sign ($);
    no other symbols are permitted to form an identifier
    
    Identifier Description
    Examples of Illegal Identifiers
    employee Salary  ->>> There can be no space between employeeand Salary.
    Hello!           ->>> The exclamation mark cannot be used in an identifier.
    one+two          ->>> The symbol +cannot be used in an identifier.
    2nd              ->>> An identifier cannot begin with a digit.
    
      
    
    The smallest individual unit of a program written in any programming language is called a "TOKEN". 
    Java’s tokens are divided into special symbols, word symbols, and identifier.
    
    
    
    Word Symbols:
    A second category of tokens is word symbols.Some word symbols include the following:
    int, float, double, char, void, public, static, throws, return.Word symbols are also called reserved words, or keywords.
    The letters in a reserved wordare always lowercase. Like the special symbols, each word symbol is considered a single sym-bol.
    Furthermore, word symbols cannot be redefined within any program; that is, they can-not be used for anything other than their intended use.

    
    Special Symbols:
    +  -  *  /    Mathematical operators
    .  ;  ?  ,    question mark , comma
    <= != == >=   Comparison operators
    
    
    Logical operators 
    NOT (!), AND (& or &&), OR (| or ||), Exclusive (^)
    
    Concatenation operator 
    (+)Concatenation operator (+) art arda baglama
    Increment operator (++)
    Decrement operator(--)
    
    
    Increment and Decrement Operators
    •x = 1;
    •y = 1 + x++;
    •y = 1 + ++x;
    
    •y = 1 + x--;
    •y = 1 + --x;
    
    

    
    Shortcut operators
    +=    i+=8      i = i+8 
    -=    f-=8.0    f = f-8.0
    *=    i*=8      i = i*8
    /=    i/=8      i = i/8
    %=    i%=8      i = i%8
    
    
    
    
    

    Operator Precedence
    Casting                  Highest order
    ++, -- 
    *, / , % 
    +, -
    <,  <=, >, =>
    ==, !=;
    && 
    ||
    =,  +=, -=, *=, /=, %=  Lowest order


    ERRORS
    //ShowRuntimeError   
        System.out.println(1 / 0);
    
    //ShowSyntaxError
        //System.out.pprint(b);
        
    //ShowLogicError
        System.out.println("Celsius 35 is Fahrenheit degree ");
        System.out.println((9.0 / 5) * 35 + 32);
    
    
    
  
    FORMAT SPECIFIER    OUTPUT                      
    %b                  boolean
    %c                  char
    %d                  a decimal integer
    %f                  a floating-point number
    %e                  a number in standard scientific notation(sembolle gösterim) 4.556000e+01
    %s                  string
    
    
    
    
    
    
    
    
    */
    
    
    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" TYPES/CONVERSIONSofVARIABLES ">
    public static void TYPES_CONVERSIONofVARIABLES()
    {
        
        short s=9;
        
        byte b=3;
                         
        int i = 4&6, ii=10&2,iii=10%2, iiii=6%-13; System.out.println(i+"      "+ii+" "+iii+" "+iiii);
        //System.out.println(-34%5 , -34%-5 ,  34%-5); error
        //System.out.println("edaedaed","eafeaf");       error
             
        long l = 129;        System.out.println("byte:"+(byte)(l)); //long 0==byte0/ long 127==byte127/ long128==byte-128/ long129==byte-127/ long255 ==byte-1/ long256==byte0 long257==byte1

        
        float f = 100.2f;  f = 100.2F; System.out.println("float+integer+short+double:"+f+5+s+b);//100.2593 
        //f=100.2; error
        System.out.println("float+integer+short+double:"+(f+5+s+b));//117.2   
        System.out.println((int)f); //100
                System.out.println((double)f); //100.199...
                byte xx=(byte)(f);
                        System.out.println((byte)(f)); //100



        
        
        double d = 10000000.2d;     d=1000.2;//****
        d = 100.2D; d=1000.20; System.out.println("double:"+d);//1000.2
                System.out.println((byte)(d)); //100
                


        

        boolean lightsOn = true;
        lightsOn = false;
        int iİ =2;
        int jJ =3;
        System.out.println('A' > 'a');
        System.out.println(5!=10);
        System.out.println(iİ*jJ > iİ);
        System.out.println("Hello" !="HelloStudents");
        System.out.println("HEllo" == "HelloStudents");
        System.out.println("HelloStudents" .equals( "HelloStudents"));
        System.out.println();

        //Logical operators
        System.out.println(!(5==7));
        System.out.println(!(5!=jJ));
        System.out.println((iİ>jJ)&&(iİ==0));
        
        
        
        
        
        
        
        
        
        char charr='7'+'9'; System.out.println(charr);//p
        char e='A';         System.out.println((int)'0' +"\b"+ (int)('1')+"%n"+(int)('a')+"\t"+(int)'b'+"\f "+(int)'A');// \f up arrow \b delete 1 digit
      //\n == %n
        char char1, char2;
        char1 = 65; 		// char1 = 'A'
        char2 = '6';// 6

        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        //System.out.println("char1 + 1 = " + (char)(char1 + 1) );
        System.out.println("++char1 = "  +  ++char1);
        System.out.println("++char2 = "  +  ++char2);


        
        
        
        
        
        
        String name="duman";
        System.out.println(name);
        System.out.println("Mr."+" ZEK");//after pressing enter button  plus sign is pu automatically
        System.out.println("my name:\n \t '\\emre duman\'");
        System.out.println("My Name:\n\t \\\\ \'Satyendra Narayan\'" );

        System.out.print("komando  \n");//next line!!!!!!!!!
        System.out.println("tegmen\t "+a);// duman tab gap 
        
        
        
        
        
        
        
        
        
        
        
        //CONVERSION
        
        System.out.println((int)(7.9f)); //7
                System.out.println((float)(8+2)); //10.0
                        System.out.println((short)(3.3d)); //3
                                System.out.println((double)(-3/2)); //-1.0d
                                        System.out.println(110.0 ==(float)((int)(7.9+(double)(100+2.2f))));//true


                                        
                                        
        byte bb = 100;	//declaring and assigning value to a variable
        //Implicit conversion
//	double d = b;	//assigning byte type data to double type variable
        double dd  = (double) bb;  //explicit casting
        System.out.println("Value of d = " + dd);
        System.out.println("Value of b = " + bb);
        
        
        
        
        double  D= 128.5;	//declaring and assigning value to a variable
        //Explicit conversion
        byte B = (byte)D;	//assigning double type data to byte type variable
        System.out.println("Value of b = " + D);
        System.out.println("Value of d = " + B);
        
        
        
        
        double ddd = (double)200;	//declaring and assigning value to a variable
        double ee=200;
        byte bbb = (byte) ddd;	//implicit conversion is not allowed
        System.out.println("Value of d = " + ddd);
        System.out.println("Value of b = " + bbb);
        System.out.println("Value of ee = " + ee);
        
        

        char de = 'a';	//declaring and assigning value to a variable
        byte be = (byte) de;	//implicit conversion is not allowed    99 
        System.out.println("Value of de = " + de);
        System.out.println("Value of be = " + be);

        byte bbe = 66;
        char dde = (char)bbe;//B
        char ddee=66;//B
        System.out.println("Value of dde = " + dde);
        System.out.println("Value of bbe = " + bbe);
        System.out.println("Value of ddee = " + ddee);

        char mychar = (char) 97;
        System.out.println("mychar = " + mychar);



        
        
        
    }
 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Reassignment Value/Public Variables ">
    
        static public void VARIABLES()
        {
            
            int f=99; float g=f; System.out.println(g);//99.0
            int j=00; System.out.println(j);//0
            //int jj=09; System.out.println(jj);//0 error
            int c=6;   // at c#  ıt is possibly to write int c=6 + d=4
            //int c=7; //ı cant assign c new value to a variable
            c=5;
            b=3;// private static int b  
            int b=4;//ıt is not private static int b
            b=1;
            System.out.println(c+b-b*c);  System.out.println(-c/b);//b=1; will be compiled
            System.out.println("java"+1+2+4+c);
           
            String t="java";
            int tt=1;
            System.out.println(t+tt);
            
            //int qq=09; SYNTAX ERROR
            final int ww=2; //CANT BE CHANGED
            
            //int rr+=i; runtime error

            
            int yy=5; float ff=3.0f; System.out.println(yy+ff);//6.0
            System.out.println(yy%ff);
            
            
            
            //PRINTF
            
            System.out.printf("The result of %f times %f is %f.", .25, 1.1, (.25 * 1.1));
            System.out.printf("%d", 25);//%d is used for integer values
            System.out.printf("DECIMAL:%d\n",2555);//we have put %d to print all values together
            //System.out.printf("%d",0.2);error
            //System.out.printf("%f",888); error
            System.out.printf("%s","wfew");
            int count=5; double amounnt=45.56; System.out.printf("count is %d and amount is %f  \n",count,amounnt);
            //count is 5 and amount is 45.560000 
            
            
            
            
            double amountt=12618.98, interestRate=0.0013,  interest=amountt*interestRate;
            System.out.printf("Interest is $%.4f\n",interest);
        
            System.out.printf("FLOAT:%f\n",12345678910111213.123456000);//FLOAT:2.345000
            System.out.printf("FLOAT:%10.5f\n",2.345);//10 digits later FLOAT:2.3
            System.out.printf("FLOAT:%f\n",2.345f);//FLOAT:2.345000
            System.out.printf("%-5.2f\n", 7.244);
            System.out.printf("%-5.2f\n", 7.277);
            
            
            //   The System.out.format() method works exactly the same as
            //   System.out.printf()! 
            System.out.format("%10d\n",2);//ıt is printed in 10th digit
            System.out.format("%12.2f\n\n\n",123.456789);
            System.out.format("%8d%8s%8.3f\n",1234567,"jajava",123456.123456);//the last digit will be 8th digit
            System.out.format("%-8d%-8s%-8.1f\n",1234,"java",5.63);
            
            long n = 461012;
            System.out.format("%d%n", n);//%n == \n
            System.out.format("%08d%n", n); 
            System.out.format("%+8d%n", n); 
            System.out.format("%,8d%n", n);
            System.out.format("%+,8d%n%n", n);
            
            double pi = Math.PI;                System.out.format("%f%n", pi);       System.out.format("%.3f%n", pi);   
                                                System.out.format("%10.3f%n", pi);   System.out.format("%-10.3f merhaba%n", pi); 
            
            
            //ERRORS
            //System.out.printf("%5d %d", 1, 2, 3);there must not be 3 parameter
            //System.out.printf("%5d %f", 1);//there must be 2 parameter
            //System.out.printf("%5d %f", 1, 2);//I must 2.  2.0  2f   2F
            
            System.out.printf("Hello%2d and %8s", 10, "Hi!!!%n\n");//8 ve altı yazarssan boşluk işlemez
            System.out.printf("Hi,%s%4d%n", "Hello", 88);
            System.out.printf("Hi, %d %4.2f%n", 8, 5.556);
            System.out.printf("Hi,%-4s&%6.2f%n", "Hi", 5.5);
            System.out.printf("Hi, Hi, %.4f%n", 5.56);

            //String acc=System.out.print("accc");   ERROR
            
            String format = String.format("|%30s|", "Hello World");               System.out.println(format); // |                   Hello World|
           
            String format1 = String.format("|%-30s|", "Hello World");             System.out.println(format1);  // |Hello World                   |

            String format2 = String.format("|%.8s|", "Hello World");//|Hello Wo|              System.out.println(format2);// |Hello|

            String format3 = String.format("|%30.5s|", "Hello World");            System.out.println(format3);//|                         Hello|
 

            
            
        }
                
                
        // </editor-fold>   
    
    //<editor-fold defaultstate="collapsed" desc="INCREMENT-DECREMENT Operators ">
    public static void INCREMENT_DECREMENT()
    {
        int counter = 1;
        int increment = 2;
        System.out.print(counter + " ");
        counter += increment;
        System.out.print(counter + " ");
        counter *= increment;
        System.out.print(counter + " ");
        increment /= 2;
        counter -= increment;
        System.out.println(counter);
        System.out.println("increment: " + increment);




        int x=25,y=10,z,w,p,result;
        x++;//26 later increment
        ++x;//27 increment first
        System.out.println(x++);//after will print 27 ,x's value will be 28
        z=x++;//z:28 x:29
        w=--y;//w:9 y:9
        p=-y;
        System.out.println("X:"+x+"   Z:"+z+"  W:"+w+"  P:"+p);



        int i=1;
        System.out.print(i-- +" ");//1 yazıp eksiltiyor
        System.out.print(i +" ");//0
        System.out.println(--i);//-1 eksiltip yazıyor
        System.out.println(--i + --i);//(-2) + (-3)=-5

        System.out.println(!(x!=y));//false
        
        /*
        boolean q=true;     q++;        System.out.println(q);
        
        int r=5;    int re= --(r++);     System.out.print(re);
       
        int qwe = 11++;     System.out.println(qwe);
         */
        
    }
                // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SHORTCUT Operators ">
        public static void SHORTCUT()
        {

            int x=25,y=10,z,w,p,result;
            z=x*y;
            w=x/7;
            p=z%7;
            System.out.println("Z:"+z+"\tW:"+w+"\tP:"+p);
            z*=2;//z=z*2;
            w/=2;
            p%=3;
            System.out.println("Z:"+z+"\tW:"+w+"\tP:"+p);
            
            
            
        }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" DECIMALFORMAT">

    static public void customFormat(String pattern, double value ) 
    {
        //DecimalFormat CLASSı
        DecimalFormat myFormatterrrr = new DecimalFormat(pattern);//class object
        String output = myFormatterrrr.format(value);
        System.out.println(value + "  " + pattern + "  " + output);
        

    DecimalFormat myFormatter = new DecimalFormat("###,###.###");
        String outputt = myFormatter.format(444456.789);
        System.out.println (outputt);
    
        
String outpt = new DecimalFormat(pattern).format(value);//class object

               System.out.println (outpt);

        
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" IF ">
        
        static public void IF()
        {
            boolean transaction=true;
            int c=7;
            if(c!=b && transaction)
            {
                System.out.println("soldier");
            }
            if(c>b)
                System.out.println("soldier");
                System.out.println("soldier");

             // INFOOOO CTRL+SPACE OPENS  METHODS BOX   



            System.out.print("PLEASE TYPE 0 OR 1:");
            Scanner scan= new Scanner(System.in);//TO ENTER A VALUE FROM CONSOLE
            //scanner is a class-scan is a object that we created by using scanner class
            int option=scan.nextInt();
            System.out.print("please write sth:");
            String qqqq=scan.next();
            if(option==0)
            {
                System.out.print(qqqq);
                System.out.println(c+b);
            }
            if(option==1)
            {
                System.out.println("substraction:");
                System.out.println(c-b);
            }



            System.out.print("please write multiplication or division:");
            Scanner scan2= new Scanner (System.in);
            String optionn=scan2.next();

            if(optionn.equals("multiplication"))
            {
                System.out.print("multiplication:");
                System.out.println(c*b);
            }

            String t="division";
            if(optionn.equals(t)) //equals is a methods so contains ()
                //if(optionn==t) we cant write like this
            {
                System.out.print("division:");
                System.out.println(c/b);
            }

            if(optionn.equalsIgnoreCase("EMRE"))//ıgnore upper lower case which is written ın console 
            {
                System.out.println("okey");
            }
            
            
            String name="emre";
            boolean aa=optionn.equals(name);// THIS CODE MEANS "TRUE"
            //if optionn == emre yani optionn.equals(name)yani girdiğim code sring name ile aynıysa        
            if(aa)//inside of parantesis is true
            {
                System.out.println("addsad");
            }     
        
            
            double value = 2;
            if (value != 0)
            {
                    if (value > 0)
                    {
                            System.out.println("The result =  " +  (1 / value));
                    }
                 
                    else
                    {
                            System.out.println("The result =  " +  (-1 / value));
                    }
            }
            
            
            //start of nested if statement
            Scanner scan3= new Scanner (System.in);
            System.out.print("write a day:");
            String dayy=scan3.next();
            
            //if (day == "Monday")//ıt does not work
            if ("monday".equals(dayy))
                System.out.println("It \'s Monday.");// It 's Monday.
            else if ("Tuesday".equals(dayy))
            {
                System.out.println("It \'s Tuesday.");
            }
            else if ("Wednesday".equals(dayy))
                System.out.println("It \'s Wednesday.");
            else
                System.out.println("I am seating in else block"); //end of nested if statement
    } 
     
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc=" BREAK-CONTINUE ">
        public static void break_continue()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number:");
            for (int i= 0;i<100;i++)
            {
                int s=scan.nextInt();
                String ss=Integer.toString(s);//conversion int to string
                System.out.println("Welcome to java!"  + s);
                
                String df="4";
                if (ss.equals("3")||ss.equals(df))break;
                if (i==4) break;
               
           
            } 
            String q=Integer.toString(12);
            String qq=Integer.toString(12);
            System.out.println(q.equals(qq));
            
            
            int i=0, sum=0;
            
            while(i<10)
            {
                i++;
                sum+=i;
                if (i == 4 || i==7) //or
                {
                  continue;
                }
                System.out.println(i);//if i==4 codes in the for loop will not execute
            }
            System.out.println(sum);
            
            
            
            

            double arra[ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int su = 0;

            for (int t = 0; t < arra.length; t++)
            {
                su += arra[t];	//sum = sum + array[i];
                if (su > 12)
                {
                    break;
                }
                System.out.println("Looping ......");
            }

            System.out.println("The sum exceeded the maximum value.");




            for (int r = 5; r> -5; r--)
            {
                if (r == 0)
                {
                        continue;
                }
                System.out.println("The reciprocal of " + r + " = " + (1. / i));
            }




        }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" SWITCH ">
      
        static public void SWITCH()
        {
            int day = 7;
            switch(day)//start of the switch statement
            {
                case 0:
                        System.out.println("It is Sunday.");
                        break;
                case 1:
                        System.out.println("It is Monday.");
                        break;
                case 2: System.out.println("It is Tuesday.");break;
                case 3: System.out.println("It is Wednesday.");break;
                case 4: System.out.println("It is Thursday.");break;
                case 5: System.out.println("It is Friday.");break;
               //optional
                default:System.out.println("It is Saturday.");
            }//end of switch Statement
            
            
            
            int temperature = 68;
            while(temperature<77)
            {
                switch(temperature)
                {
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                            method1();break;
                    case 65:
                    case 66:
                    case 67:
                    case 68://It is cool.
                    case 69://It is cool.
                            System.out.println("It is cool.");
                            break;
                    case 70://It is warm.
                    case 71://It is warm.
                    case 72://It is warm.
                    case 73://It is warm.
                    case 74://It is warm.
                    case 75://It is warm.
                            System.out.println("It is warm.");
                            break;
                    default:
                            System.out.println("It is probably too hot.");

                }
                temperature +=1;
            }
            
            
            
            String input1 = JOptionPane.showInputDialog("Please enter a number");
            int year  = Integer.parseInt(input1);

            double interestRate;
            switch (year)
            {
              case 5://For  year 5, Interest Rate is 7.25
              case 7:
                            interestRate = 7.25;
                            System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                     break;
              case 15:
                            interestRate = 8.50;
                             System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                       break;
              case 30:
                            interestRate = 9.0;
                            System.out.println("For  year " + year + ", "  + "Interest Rate is " + interestRate);
                       break;
              default:
                    System.out.println("Wrong Year, enter 7, 15, or 30");
            }

            
        }
        // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="FOR">
    public static void FOR()
    {
        for(;;)//infinity loop
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter a number:");
            int a=scan.nextInt();
            System.out.println(a);
            if(a==0)
                break;

        }
        
        /*
        
        double sum=0;
        for(double d=0;d<10;)
        {
            d+=0.5;
            sum+=sum+d; //sum=0+0+0.5;    0.5 2.0 5.5
            System.out.println("sum:"+sum);
        }
        
        int total=0;
        for(int i=0;i<5;++i)//for loop'ta ++i or i++ affect value after 1 squence finished
        {
            total+=i;//0 1 3 6 10
            System.out.println("total:"+total);         
        }
        total=0;//made total 0 from 10
         for(int i=0;i<5;i++)
        {
            total+=i;//0 1 3 6 
            System.out.println("total:"+total);         
        }
         
        total=0;//made total 0 from 10
        for(int i=0;i<10;++i)
            total+=i;//0-9  0 1 3 6 10 10 15 21 28 36 45
        System.out.println("total:"+total);       
        
        total=0;//made total 0 from 10
        for(int i=0;i<10;i++)
        //for(int i=0;i<10;++i) //it is same with up one
        {
        //System.out.println("i:"+i); //0 1 3 7
        //i+=i;
        i=i+i;
        }
        //System.out.println("i:"+i);//Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>  
        //because of i belongs to for loop , we must print it out in for loop
        //for(; ;); // true loop
        
        for(int i=0;i<10;i++)
            for(int j=0;j<10;j++)  
                System.out.println(i+"-"+j);//100 times
        
        
        

         
            
          */      
                        
         
        
        
        
         // QUESTION-3
        
        Scanner object1=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES:");
        int line=object1.nextInt(),q=1;       
        for(int a=1;a<=line;a++)
        {
            for(int i=line-a;i>=1;i--)
            {
                System.out.print("  ");
            }
            for(int i=1;i<=2*a-1;i++)
            {
                if (i<=a)
                {
                    q*=a+1-i;
                    System.out.print(q+" ");
                }
                else
                {
                    q+=-a+i;
                    System.out.print(q+" ");
                }              
                q=1;                  
            }
            System.out.println(" ");
        }
        
        
        // QUESTION 4
        Scanner object2=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF LINES=");
        int y=object2.nextInt(),k=1;
   

        for(int x=1;x<=y;x++)
        {
            for(int t=(y-x);t>0;t--)
            {
                System.out.print("  ");
            }
            for(int z=1;z<=(2*x-1);z++)
            {
                if (z<=x)
                    k=(int)Math.pow(2,(z-1));
                else
                    k/=2;   
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
       
        
        
        
        
        
        double grades[ ] = {88, 99, 73, 56, 87, 64};
		double sum, average;
		sum = 0;
		int index;
		for ( index = 0; index <grades.length; ++index)	//try using ++index in the header
		{
			sum += grades[index];	//sum = sum + grades[index];
                        System.out.println(index);

                }
			System.out.println(index);
			average = sum / grades.length;
			System.out.println(average+" "+sum+"Average grade =  " + DecimalFormat.getInstance().format( average) );
    
    
    for (int indexx = 0, doubled = 0; indexx <= 5; indexx++, doubled = 2*indexx)
    {
            System.out.println("Loop index " + indexx + " doubled equals " + doubled);
    }
    
    
    int arrey[ ] = {1, 2, 3, 4, 5};
    int  summ = 0;
    for (int indeex = 0; indeex < arrey.length; summ += arrey[indeex++])
        System.out.println("The sum =  " + summ);
    
    
    
    int value = 5, factorial = 1, temp;
    temp = value;

    for ( ; temp > 0; )
    {
            factorial *= temp-- ;
    }

    System.out.println(value + "! = " + factorial);

    
    double arreyy[ ] [ ] = {{1, 2, 3}, {3, 2, 1},  {1, 2, 3}};
    System.out.println(Arrays.deepToString(arreyy));
    int summm = 0, total = 0;

    for (int i = 0; i < arreyy.length; i++)
    {
        for(int j = 0; j < arreyy[i].length; j++)
        {
                System.out.print(arreyy[i][j]);

                summm += arreyy[j][i];
                total++;
        }
        System.out.println();
    }

        System.out.println("Average array value = " + (summm / total));
    
        
        
        
        
    }


     //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FOR_EACH">
    public static void FOR_EACH()
    {  
        int[] array1={1,2,3};
        int d=0;
        for(int i: array1)
        {
            System.out.printf("%d.element: %s %n",d,i);
            d++;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" WHILE - do while ">

    public static void WHILE()
    {
        /*
        System.out.print("PLEASE ENTER A NUMBER:");
        Scanner scan=new Scanner(System.in);
        int ac= scan.nextInt();
        while(ac<=10)
        {
            System.out.println(ac+" zeko");
            ac+=1;               
        }
        */
        int i =0;
        while (i<10)//top checking  while loop (non counted loop)
        {
            System.out.println("Loop No. =  " + i);//01234
            i =i+1;	// i++

            if (i==5)
            {
                break;
            }
        }//end of the loop

        int count=0;
        while (count<10)
        {
            System.out.println(count+"java");//0-9
            count++;
        }

        int coun=0;
        while (coun++<10)//0-9 buraya en son 9 ile geldi geçti ve diğer satırda 10 oldu
        {
            System.out.println(coun+"c#");//1-10
        }


        int cou=0;
        do   
        { System.out.println(cou+"hello");//0 hello
        cou++; }   
        while (cou<-1);//condition is not true 


        int con=0;
        do   
        { System.out.println(con+"welcome");//0 welcome
        con++;       }
        while (con<10);//1-9


        int co=0;
        do   
        { System.out.println(co+"emre");}                 
        while (co++<10);//gelirken 0-9 yazarken 1-10

        int c=0;
        do   
        { System.out.println(c+"duman");}                 
        while (++c<10);//entry value 0-8 increased values:1-9 printed values:1-9 


        int cc=0;
        do   
        { System.out.println(cc+"tegmen");}  //0               
        while (cc++<9);//entry value 0-8 increased values:1-9 printed values:1-9 

        int balance=10;
        while(true) 
        {
            if (balance<9)
            {
                break; 
            }
            balance-=9;
            System.out.println(balance);//runs 1 after breaks
        }

       int s=0,item=0;
       do{ item++; s+=item; System.out.println(s);/*1 3 6*/ if(s>4) break; System.out.println(s);/*1 3 */} while(item<5);
       
       
       
       //do can not be used without paranthesis
       int itemm=0,ss=0;
       do
        { 
          itemm++;   ss+=item; 
          System.out.println(itemm +" "+ss);

          if(ss>=4) 
          {
              continue; 
          }
        }
       while(itemm<5);
       
       System.out.println(ss);//15
       
       
       int sum=0;
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter A Number:");
       int number=scan.nextInt();//12345 sayısı girildi
       do{
           sum+=number%10;//to add the last digit of the number
           number=number/10;//to decrease the digits of number
           System.out.printf("SUM:%d - NUMBER:%d n%",sum,number);
         } 
        while(number==0);
         

       

           
    }
    
    
        
    // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="showINPUT ">
    public static void showINPUTdialog()
    {   
        //import javax.swing.*;	//required for our input box
        String input1 = JOptionPane.showInputDialog("Please enter a number");
        int a  = Integer.parseInt(input1); //Converts String number stored into input1 to int variable
        
        int as=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        System.out.println("a = " + a);

        String input2 = JOptionPane.showInputDialog("Please enter another number");
        int b = Integer.parseInt(input2); //Converts String number stored into input2 to int variable

        System.out.println("b = " + b);

        System.out.println("Sum of two numbers = " + (a  + b) );
        
        
        
        
         //getting inputs
        cev = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));
        dev = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));
        double result  = max();	//calling statement for the method max
        System.out.println("Maximum of " + a + " and " + b + " is "  + result);
    }
    
    
// </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" SCANNER ">
    public static void SCANNER()
    { 
        /*
        Scanner object1 = new Scanner(System.in);
        System.out.println("ENTER INVESTMENT AMOUNT:");
        //float investment_amount=object1.nextInt();
        float investment_amount=object1.nextFloat();
        String zx=object1.next();
        String zxx=object1.nextLine();
        System.out.println(object1.nextLine());
        if(investment_amount<0)
        {
            JOptionPane.showMessageDialog (null, " YOU CAN NOT ENTER NEGATIVE AMOUNT, PLEASE ENTER A POZITIVE VALUE:", "NOTICE", JOptionPane.WARNING_MESSAGE);
            String input1=JOptionPane.showInputDialog("PLEASE ENTER A POZITIVE VALUE:");
            float input2=Float.parseFloat(input1);
            investment_amount=(float)(input2);
            while(input2<0)
            {
                String input3=JOptionPane.showInputDialog("PLEASE ENTER A POZITIVE VALUE:");
                float input4=Float.parseFloat(input3);
                investment_amount=(float)(input4);
                    if(input4>0)
                    {
                        System.out.printf("ENTER INVESTMENT AMOUNT:%.2f %n",investment_amount);
                        break;
                    }
            }
        }
        System.out.println("ENTER MONTHLY INTEREST RATE:");
        float interest_rate=object1.nextFloat();
        System.out.println("ENTER FUTURE-INVESTMENT DURATION AS YEAR:");
        float investment_duration=object1.nextFloat();
        float future_investment_amount=(float) (investment_amount* Math.pow((1+interest_rate),investment_duration*12));
        System.out.printf("INVESTMENT AMOUNT: %.2f %nANNUAL INTEREST RATE: %.2f%nNUMBER OF YEARS:%.2f%nACCUMULATED VALUE IS:%.2f",investment_amount,interest_rate,investment_duration, future_investment_amount);
   
    
    */

        Scanner keysIn = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String strInteger = keysIn.nextLine();
        System.out.print("Enter a double: ");
        String strDouble = keysIn.nextLine();   
        System.out.print("Type some text: ");
        String strText = keysIn.nextLine();
        System.out.println(strInteger);
        System.out.println(strDouble);
        System.out.println(strText);
    
    
    }        
// </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MESSAGEBOX ">
    public static void showMESSAGEdialog() 
    {                
          //  JOptionPane.showMessageDialog("Hello World");  ERROR
          //JOptionPane.showMessageDialog("Hello World",JOptionPane.INFORMATION_MESSAGE);  ERROR
        
          JOptionPane.showMessageDialog(null, "Hello World");// İ LETTER WITH CIRCLE  WİLL BE SHOWED - JOptionPane.INFORMATION_MESSAGE title= message
          JOptionPane.showMessageDialog (null, "hellooo", "Title", JOptionPane.INFORMATION_MESSAGE);   
          JOptionPane.showMessageDialog (null, "warning message", "Title", JOptionPane.WARNING_MESSAGE);//warning_message cant be written without title
          JOptionPane.showMessageDialog (null, " error "
                  + "Message", "Title", JOptionPane.ERROR_MESSAGE);//error_message cant be written without title
                    
          String namee = JOptionPane.showInputDialog("Type your nameeeeee please");
          String nameee = JOptionPane.showInputDialog("Type your nameeeeee please","title");
          String nameeee = JOptionPane.showInputDialog(null,"Type your nameeeeeeii please","title");
          
          // ERROR  String namii = JOptionPane.showInputDialog("Type your namiiii please","title",JOptionPane.ERROR_MESSAGE);
          String name = JOptionPane.showInputDialog(null,"Type your name please","title",JOptionPane.ERROR_MESSAGE);
          //int number1=Integer.parseInt(name);
          //int number2=Integer.parseInt(JOptionPane.showInputDialog(null,"Type your name please","title",JOptionPane.OK_OPTION));
          JOptionPane.showMessageDialog(null, "Hello " + name);

          String nameeeee = JOptionPane.showInputDialog("Type your name please","input in the bar");//HEP SORU İŞARETİ CIKAR
          //System.exit(0);//stop the running preceding codes
          //System.exit(1);//DONT STOP
          /*
          The messageType argument specifies the type of the message, and its values is one of the following:

          JOptionPane.INFORMATION_MESSAGE
          JOptionPane.ERROR_MESSAGE
          JOptionPane.WARNING_MESSAGE
          JOptionPane.QUESTION_MESSAGE
          JOptionPane.PLAIN_MESSAGE
          */
          
        //JDialog.setDefaultLookAndFeelDecorated(true);
	
        Object[ ] selectionValues = { "Pandas", "Dogs", "Horses" };
	String initialSelection = "Dogs";
	Object selection = JOptionPane.showInputDialog(null, "What are your favorite animals?",
        "Zoo Quiz", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        System.out.println(selection);

    }
    // </editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="ARRAY">
    public static void ARRAY() 
    {  
        
        
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++){
                targetArray[i] = sourceArray[i];
                System.out.println(targetArray[i]);}

        
        
        
        Scanner object=new Scanner(System.in);
        int[] circleArray = new int[4];
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.printf("Enter %d. Element:",i+1,"\n");
            circleArray[i]=object.nextInt();
        }
        for (int i = 0; i < circleArray.length; i++)
            System.out.println(circleArray[i]);
        
        //method ile array'i çağırdım,methodun iççinde liste elemanlarını topla dedim
       
      
        
        
        
        int matrix[][] = new int[3][3];
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            { 
                System.out.printf("Enter %d.%d Element:",i,j,"%n");
                 matrix[i][j]=object.nextInt();
            }
        }
        
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3;j++)
            { 
                 System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
      
     
        
        
        
        Scanner object4=new Scanner(System.in);
        System.out.printf("TYPE A NUMBER:");
        int size=object4.nextInt();
        System.out.printf("TYPE DOUBLE VALUES %d TIMES:%n",size);
        double[] rounfall = new double[size];
        for (int i = 0; i < rounfall.length; i++)
        {
            rounfall[i]=object.nextDouble();
        }
  
        
        double max=rounfall[0];
        for(int t=1;t<size;t++)
        {
            if(rounfall[t]>max)
            {
                max=rounfall[t];
            }
        }
      
        double min=rounfall[0];
        for(int a=1;a<rounfall.length;a++)
        {
            if(rounfall[a]<min)
            {
                min=rounfall[a];
            }
        }
      
        double number = 0;
        for (int i = 0; i < rounfall.length; i++)
        {         
            number= number+rounfall[i];               
        }
         
        System.out.println("the average of all elements="+ (number/rounfall.length));
        System.out.println("the biggest double="+max);
        System.out.println("the smallest double="+min);
 

        //String array [4]={"a","b","c","d"};//ERROR
        String array []={"a","b","c","d"};
        String arrayy[];
        
        //arrayy = new String []{"a","a","a","a","a"}; 
        //arrayy = new String [5]{"a","a","a","a","a"}; //ERROR

 
             
        int[] myIntArray = new int[3];//THIS LINE IS TRUE
        //myIntArray = {1, 2, 3};//THIS LINE IS WRONG

        
        int[] myIntArrayY = new int[]{1, 2, 3};//correct
        

        
        String[] StringArray = new String[3];//TRUE
        String[] sStringArray = {"a", "b", "c"};//true
        String[] S = new String[]{"a"};//TRUE

        

        
        String[] arrAAyv;
        arrAAyv=new String [] {"10"};
        String [] aaarrAAy = new String []{"a","a","a","a","a"}; //CORRECT
        
        /*
        String[] myStringArray = new String[3];
        String[] arrayy =new String []{"a","a","a","a","a"};
        String[] myStringArrayy= {"a", "b", "c"};

        int[] myIntArray = new int[]{1, 2, 3};
        int[] arrayyy= {1, 2, 3};

     


        int x = 30;
        int[] numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);//60
        System.out.println("The size of numbers is " + numbers.length);//30
        
        */
        
        int a[]= {1,2,3,4,3,2,1}; //source array  
        int b[]= {5,6,7,8,7,6,5}; //destination array  
        int src[],srcPos,  dest[],destPos,length;  
        src=a;  
        srcPos=1;  
        dest=b;  
        destPos=2;  
        length=4;  
        System.out.print("Source array:");  
        for(int i=0;i<src.length;i++) {System.out.print(src[i]);}  
        System.out.println();  
        System.out.print("Destination array:");  
        for(int i=0;i<src.length;i++) {System.out.print(dest[i]);}  
        System.out.println();  
        System.out.println("Source Position:"+srcPos);  
        System.out.println("Destination Position:"+destPos);  
        System.out.println("Length:"+length);  
        System.arraycopy(src, srcPos, dest, destPos, length); //use of arraycopy() method  
        System.out.println("Destination array after use of arraycopy()");  
        for(int i=0;i<b.length;i++)  
        {  
            System.out.print(b[i]);  
        }  
        System.out.println();
        
        
        
        String[] names = {"Alex", "Brian", "Charles", "David"};

        //Using System.arraycopy() method - Equally efficient but less readable
        String[] copyOfNames = new String[names.length];
        System.arraycopy(names, 0, copyOfNames, 0, copyOfNames.length);
        for(int i=0;i<copyOfNames.length;i++)
        {
            System.out.println(copyOfNames[i]);
        }
        System.out.println(copyOfNames);//[Ljava.lang.String;@15db9742
        System.out.println(Arrays.toString(names));         //[Alex, Brian, Charles, David]
        System.out.println(Arrays.toString(copyOfNames));   //[Alex, Brian, Charles, David]

        
        
        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source,0, t,0,2);//3 4 0
        System.out.println(Arrays.toString(t));//t array coverted from int to string
        System.arraycopy(source,0, t,0,t.length);//3 4 5 
        System.out.println(Arrays.toString(t));


        int[] myList;
        myList = new int[10];
        System.out.println(myList.length);
        // Some time later you want to assign a new array to myList
        myList = new int[20];    
        System.out.println(myList.length);

        
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));

        
        int[] list = {2, 4, 7, 10};
        java.util.Arrays.fill(list, 7);
        System.out.println(java.util.Arrays.toString(list));// [7, 7, 7, 7]
        java.util.Arrays.fill(list, 1, 3, 8);
        System.out.println(java.util.Arrays.toString(list));// [7, 7, 7, 7]
        System.out.print(java.util.Arrays.equals(list, list));
        
        
        
        

    int[ ] ourceArray = {2, 3, 1, 5, 10};//creating, and loading array

    int[ ] argetArray = new int[ourceArray.length];	//Creating 5 elements long array

    System.arraycopy(sourceArray, 0, argetArray, 0,ourceArray.length);

    for (int i = 0; i < ourceArray.length; i++)
       System.out.println(ourceArray[i] + "\t\t" + argetArray[i]);

    Arrays.sort(ourceArray);
    Arrays.sort(argetArray);
    for (int i = 0; i < ourceArray.length; i++)
        System.out.println(ourceArray[i] + "\t\t" + argetArray[i]);

    
     

    int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
    
    
    
    
    
    int[ ] sourcArray = {2, 3, 1, 5, 10};//creating, and loading array

    int[ ] targeArray = new int[sourcArray.length];	//Creating 5 elements long array

    System.arraycopy(sourcArray, 0, targeArray, 0,sourcArray.length);

    Arrays.sort(sourcArray);
    Arrays.sort(targeArray);

    int j = Arrays.binarySearch (sourcArray, 13);
    System.out.println ("j = " + j);

    System.out.println("sourceArray" + "\t" + "targetArray");

    for (int i = 0; i < sourcArray.length; i++)
       System.out.println(sourcArray[i] + "\t\t" + targeArray[i]);

                
                
                
                
                
                
                
                
        byte byteArr[] = {10,20,15,22,35}; 
        char charArr[] = {'g','p','q','c','i'}; 
        int intArr[] = {10,20,15,22,35}; 
        double doubleArr[] = {10.2,15.1,2.2,3.5}; 
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f}; 
        short shortArr[] = {10,20,15,22,35}; 
  
        Arrays.sort(byteArr); 
        Arrays.sort(charArr); 
        Arrays.sort(intArr); 
        Arrays.sort(doubleArr); 
        Arrays.sort(floatArr); 
        Arrays.sort(shortArr); 
  
        byte byteKey = 35; 
        char charKey = 'g'; 
        int intKey = 22; 
        double doubleKey = 1.5; 
        float floatKey = 35; 
        short shortKey = 5; 
  
        System.out.println(byteKey + " found at index = "
                           +Arrays.binarySearch(byteArr,byteKey)); 
        System.out.println(charKey + " found at index = "
                           +Arrays.binarySearch(charArr,charKey)); 
        System.out.println(intKey + " found at index = "
                           +Arrays.binarySearch(intArr,intKey)); 
        System.out.println(doubleKey + " found at index = "
                           +Arrays.binarySearch(doubleArr,doubleKey)); 
        System.out.println(floatKey + " found at index = "
                           +Arrays.binarySearch(floatArr,floatKey)); 
        System.out.println(shortKey + " found at index = "
                           +Arrays.binarySearch(shortArr,shortKey)); 
    
    



    double myListt [ ] = new double [2];

    //Loading array with user input
    for(int i= 0; i < myListt.length; i++)
    {
            double d = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for rainfall"));
            myListt[i] = d;
    }

    double sum  = 0;
    //Processing array to calculate average rainfall
    for(int i= 0; i < myListt.length; i++)
            sum = sum + myListt[i];
    double average = sum/myListt.length;

    //Displaying result
    System.out.println("Average Rainfall = " + average);



    int matrixx[][] = new int[10][10];

    //loading 2d array
     for (int i=0; i<matrixx.length; i++)
     {
       for (int jl=0; jl<matrixx[i].length;jl++)
       {
           matrixx[i][jl]=(int)(Math.random()*1000);
       }
     }

//Print 2d array
    for (int i=0; i<matrixx.length; i++)
    {
        for (int jl=0; jl<matrixx[i].length;jl++)
        {
            System.out.print (matrix[i][jl] + "\t");
        }
        System.out.println();
      }




    int [ ] [ ] matrxx = { {1,2}, {4,5,}, {4,6}, {4,5,6,7,8,9} };

//Print 2d array
    for (int i=0; i<matrxx.length; i++)
    {
        for (int ji=0; ji<matrxx[ji].length;ji++)
        {
            System.out.print (matrxx[i][ji] + "\t");
        }
            System.out.println();
    }

    System.out.println ("matrix.length = " + matrxx.length );
    System.out.println ("matrix[2].length = " + matrxx[3].length );




                  
                  
                  
                      	
   
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ARRAYLIST">
    public static void ARRAYLIST()
    {
       ArrayList<Integer> integers =new ArrayList<Integer>(1);//1 olsada artırabilirim
        integers.add(0);//0
        integers.add(1);//1
        integers.add(2,10);//the code below make 10 be third position
        integers.add(2,20);//put 20 into second position
      
        //sonsuza kadar data girebilirsin.
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<integers.size();i++)
        {
            int a=scan.nextInt();
            integers.add(a);
            if(i==3){ break;}
        }
        for(int i=0;i<integers.size();i++)
        {
            System.out.printf("%d.element: %s %n",i+1,integers.get(i));
        }
        for (Integer i : integers)
            System.out.println("Number = " + i);


        
        ArrayList<String> groups =new ArrayList<String>();//suan degersiz bir list
        //unchangeable
        groups.add("metallica");//0
        groups.add("manga");//1
        groups.add("PUBG");//2
        //groups.add(0)="emre"; error
       
        System.out.printf("%d. index:%s %n ",groups.indexOf("metallica"),groups.get(0));
        System.out.println("1. index: "+ groups.get(1));
        System.out.println("2. index: "+ groups.get(2));
        System.out.println("arraylist size:"+groups.size());
        for(int i=0;i<groups.size();i++)
        {
            System.out.printf("%d.element: %s %n",i+1,groups.get(i));
        }
        int d=0;
        for(String i: groups)
        {
            System.out.printf("%d.index: %s %n",d,i);
            d++;

        }

        groups.remove("metallica");//true
        groups.remove(groups.get(0));//true
        groups.remove(0);//true
        
        int dd=0;
        for(String i: groups)
        {
            System.out.printf("%d.element: %s %n",dd,i);
            dd++;

        }

        
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" MATH-random ">
    public static void MATH()
    {
       //  java.lang. Math;
       //  import java.text.*;
        
       int radius = (int)  ( 1 + Math.random() *5 );   //returns a number between 1 and 6
       double area = Math.PI*radius*radius;
       //System.out.println("The area is " +  area + " for radius " + radius);
       System.out.println("The area is " +  DecimalFormat.getInstance().format(area) + " for radius " + radius);
       
       
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n",a, Math.abs(a));//The absolute value of -191.635 is 191.635

        System.out.printf("The ceiling of " + "%.2f is %.0f%n",b, Math.ceil(b));//The ceiling of 43.74 is 44

        System.out.printf("The floor of " + "%.2f is %.0f%n",b, Math.floor(b));//The floor of 43.74 is 43

        System.out.printf("The rint of %.2f " + "is %.0f%n",b, Math.rint(b));//The rint of 43.74 is 44

        System.out.printf("The max of %d and " + "%d is %d%n",c, d, Math.max(c, d));//The max of 16 and 45 is 45

        System.out.printf("The min of of %d " + "and %d is %d%n",c, d, Math.min(c, d));//The min of of 16 and 45 is 16
        
        
        
        
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",Math.E);
                          
        System.out.printf("exp(%.3f) " + "is %.3f%n",  x, Math.exp(x));//eulor number exponantial 2   2.71*2.71
                       
        System.out.printf("log(%.3f) is " + "%.3f%n",x, Math.log(x));
                        
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",x, y, Math.pow(x,y));//x pow y

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",x, Math.sqrt(x));

        
        
        double random = Math.random() * 49 + 1;
        int randomm = (int )(Math.random() * 50 + 1);

        //   RANDOM
        // Generate random number 
        double rand = Math.random(); 
        // Output is different everytime this code is executed 
        System.out.println("Random Number:" + rand); 


        Random randa = new Random(); 
        int value = randa.nextInt(50); 
        //This will give value from 0 to 49.
        //import java.util.Random;


    }
    
  
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="String">
        public static void Stringg()
        {
            Scanner abc=new Scanner(System.in);
            String a=abc.nextLine();
            String s1="duman";
            String s2=new String("emre");
            System.out.println("String2:"+s2+"  String2 lenght:"+s2.length()+" "+s1.length());//4 5
            System.out.println("0.index of s2:"+s2.charAt(0));//stringin 0. indexi
            System.out.println("last index of s1:"+s1.charAt(s1.length()-1));//last letter



            System.out.println(s2.startsWith("emr"));//TRUE
            System.out.println(s2.startsWith("e"));//TRUE
            System.out.println(s1.startsWith("D"));//FALSE
            System.out.println(s2.endsWith("re"));//TRUE
            System.out.println(s1.endsWith("man"));//TRUE

            if("emre".equals("emre")) System.out.println("equal1");
            if("emre"=="emre") System.out.println("equal2");
            if("duman".equals(s1)) System.out.println("equal3");//s1="duman";
            if("duman"==s1) System.out.println("equal4");
            if("emre".equals(a))System.out.println("equal5");
            if(a.equals("emre")){ System.out.println("equal6");}//!!!!!!

            //even if both string are same,because of their existance area are different    
            //we need to use egual method

            //Convert using Integer.toString(int)
            Scanner scan=new Scanner(System.in);
            int s=scan.nextInt();
            String ss=Integer.toString(s);
            System.out.println(s);//int s
            
            //Convert using Integer(int).toString()
            String sss=new Integer(s).toString();             System.out.println(sss);//int s
            String aa=new Integer(123).toString();            System.out.println(aa);//123

            
            
            //String class'ı
            
            String s_1=new String("bebek");//String s_1="bebek";
            String s_2=new String("bebek");
            String s_3="bebek";
            String s_4="bebek";
            
            if(s_1==s_2)//burada referanslarını sorguluyorum
                //oyuzden not equal yazar
            {
                System.out.println("equal");         
            }
            else{System.out.println("not equal s_1 s_2");}
            
            if(s_1.equals(s_2))//burada içindeki değerleri sorguluyorum
            {System.out.println("equal s_1 s_2");}
            else{System.out.println("not equal");}
            
            
            
            
            if(s_3==s_4)//burada referanslarını sorguluyorum
                //ve equal yazar
            { System.out.println("equal s_3 and s_4");         }
            else{System.out.println("not equal");}
            
            if(s_3.equals(s_4))//burada içindeki değerleri sorguluyorum
            { System.out.println("equal");          }
            else{System.out.println("not equal");}
                
            
            
            if(s_1==s_3)//burada referanslarını sorguluyorum
                //oyuzden not equal yazar
            { System.out.println("equal");          }
            else{System.out.println("not equal");}
            
            if(s_1.equals(s_3))//burada içindeki değerleri sorguluyorum
            {   System.out.println("equal");         }
            else{System.out.println("not equal");}
                
                
            String em="emre";
            System.out.println(em);//emre   
            String av = em.concat("duman");  System.out.println(av);//emreduman
            em=em.concat("duman");
            System.out.println(em);//emreduman

            
            System.out.println("my name is ".concat("emre"));
            

            String y = "GeeksforGeeks"; 
            char[] gfg = y.toCharArray(); 
            for (int i = 0; i < gfg.length; i++) { 
            System.out.println(gfg[i]); }

            System.out.println(y.charAt (4 )  );//s
            System.out.println(y.length()  );//13

          

            String so="SachinTendulkar";  
            System.out.println(so.substring(6));//7. indexten baslar Tendulkar  
            System.out.println(so.substring(0,6)+ "  html");//Sachin  0dahil 6 ya kadar
        
        
            char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.'};
            String helloString = new String(helloArray);  
            System.out.println( helloString );
            
            
            String hh; //String hh=printf yapamam error
            System.out.printf("The value of the float variable is " +
                  "%f, while the value of the integer " +
                  "variable is %d, and the string " +
                  "is %s  %n", 4.4, 4, 4);

            String fs;
            fs = String.format("The value of the float variable is " +
                   "%f, while the value of the integer " +
                   "variable is %d, and the string " +
                   "is %s", 5.5, 6, "köse");
            System.out.println(fs);
    
        
        
            
            String w1 = "Welcome to Javaaaa";
            String w2 = w1.substring(0, 11)+ "HTML";//12 dahil deavmını yazaer
 w2 = w1.substring(10)+ "HTML";//11 dahil devamını yazar
            System.out.println(w1);
            System.out.println(w2);
        
        
        StringBuffer  sd = new StringBuffer("Hello");

		System.out.println(sd.reverse() );
        
        
        String  str1 = "Free the bound periodicals.";
      String  str2 = str1;

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        
        
         str2 = new String(str1);

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same value? " + str1.equals(str2));
        
        Random r1, r2;

        r1 = new Random();
        System.out.println("Random value 1: " + r1.nextDouble());

        r2 = new Random(1);
        System.out.println("Random value 2: " + r2.nextDouble());
        
        
		String sk  = String.valueOf(54);
		System.out.println(sk + 123);
                
                
                
      double d = 102939939.939;
      boolean b = true;
      long l = 1232874;
      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

      System.out.println("Return Value : " + String.valueOf(d) );
      System.out.println("Return Value : " + String.valueOf(b) );
      System.out.println("Return Value : " + String.valueOf(l) );
      System.out.println("Return Value : " + String.valueOf(arr) );
      
      
        }
        

    //</editor-fold>
    
    
    
    
    
}


