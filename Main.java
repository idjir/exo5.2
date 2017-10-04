
public class Main
{
    
   
    public Main()
    {
       Fraction f= new Fraction(1,3);
       Fraction f2= new Fraction(1,2);
       Fraction f3= new Fraction();
       f.getNum();
       System.out.println();
       f.getDenum();
       System.out.println();
       f.FractionFloat();
       f3=f.Addition(f2);
       
       boolean t= f.Test(f2);
       System.out.println(f.toString());
       
       Fraction.compare(f,f2);
    }

    
    
}
