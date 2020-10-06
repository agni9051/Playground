import java.util.*;
class Main
{
    public static void main(String args[])
    {
        char ch;
        int encipher;
        int key;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        key=sc.nextInt();
        if(Character.isLowerCase(ch))
        {
       	    encipher=(((int)ch-97)+key)%26;
            System.out.print((char)(encipher+97));
        }
  	    else
        {
       	    encipher=(((int)ch-65)+key)%26;
       	    System.out.print((char)(encipher+65));
        }
    }
}