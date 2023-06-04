class CheakVowel
{
   public static void main (String[]args)
   {  
       switch(args[0])
       { 
           case "A": case "E": case "I": case "O": case "U":
            case "a": case "e": case "i": case "o": case "u":
            System.out.println("IT IS VOWEL ");
            break;

           default:
           System.out.println("IT IS NOT VOWEL ");
        }
    }
}