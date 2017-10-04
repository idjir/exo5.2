
public class Fraction
{
    // instance variables - replace the example below with your own
    private int num;
    private int denum;
    
    public static Fraction ZERO = new Fraction();
    public static Fraction UN = new Fraction(1,1);

   
    public Fraction(int num,int denum)
    {
        
        this.num=num;
        this.denum=denum;
        if (denum==0)  {throw new ArithmeticException();}
        
    }

    
    public Fraction(int numerateur)
    {
       this(numerateur,1);
    }
    
    public Fraction()
    {this(0,1);}
    
    public int getNum()
    {return num;}
    
    public int getDenum()
    {return denum;}
    
    public double FractionFloat()
    {
        double res,n,d;
        n=this.num;
        d=this.denum;
        res=n/d;
        
        return res;
    }
    
    
    public Fraction Addition( Fraction b)
    {
        
        Fraction res= new Fraction(num, denum);
        
         if(b.denum!=this.denum)
        {
            this.num= this.num*b.denum;
            b.num=b.num*this.denum;
            
            res.num=this.num+b.num;
            res.denum=this.denum*b.denum;
            
         }
         else
         {
             res.num=this.num+b.num;
             res.denum=this.denum;
          }
        
        return res;
        
       
    }
    
    public boolean Test(Fraction b)
    {
        double fl1=this.FractionFloat();
        double fl2=b.FractionFloat();
        
        double res;
        res= fl1-fl2;
        
        if(res==0)
        {return true;}
        else return false;
    
    
    }
    
    public String toString()
    {
        return ( this.num + "/" + this.denum ) ;
    }
    
    public static String compare(Fraction a, Fraction b)
    {
        if (a.num*b.denum == b.num*a.denum)
           { return (a.toString() + " = " + b.toString());}
           
        if (a.num*b.denum < b.num*a.denum)
            {return (a.toString() + " < " + b.toString() );}
        
        else
            {return (a.toString() + " > " + b.toString() );}
    }
}
