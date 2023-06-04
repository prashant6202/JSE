class Calculater
{
     public static void main(String[]args)
     {
         int a,b;
         a=Integer.parseInt(args[0]);
         b=Integer.parseInt(args[2]);
         switch(args[1])
         { 
             case "+":
             System.out.println("sum is "+(a+b));
             break;
             
             case "-":
             System.out.println("Diffrence is "+(a-b));
             break;
         
             case "*":
             System.out.println("Multiplication is "+(a*b));       // * is specal type of comand on CMD whic is print all file which is pointing
             break;
          
             case "/":
             System.out.println("Divison is "+((double)a/b));
             break;
           
             case "%":
             System.out.println("Moduls is "+(a%b));
             break;
       
             default:
             System.out.println("WRONG OPERATOR.....!!!!!");
           }
     }
}