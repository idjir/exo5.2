
public class Main
{
    
   
    public Main()
    {
       Fraction f= new Fraction(1,3);
       Fraction f2= new Fraction(1,2);
       Fraction f3= new Fraction();
       
       //afficher num et denum
       System.out.println(f.getNum());
       System.out.println(f.getDenum());
       
       //afficher la fraction en double
       System.out.println(f.FractionFloat());
       
       //afficher l'addition
       f3=f.Addition(f2);
       System.out.println("le resultat de l'addition donne:"+ f3);
       
       boolean t= f.Test(f2);
       System.out.println("le test affiche"+ t);
       System.out.println(f.toString());
       
       System.out.println(Fraction.compare(f,f2));
       
    }

    
    
}
