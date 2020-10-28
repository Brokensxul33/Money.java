/* Title: Money
 * Date: 10/27/2020
 * Author: Luis Flores Cardoza
 */

package lab13;

public class Money {
	private int dollars;
    private int cents;
   

    public Money()
    {
    	dollars = 0;
    	cents = 0;
    }

    public Money(int dollars, int cents)
    {
        this.dollars = dollars;
        this.cents = cents;
    }

//    public Money(int dollars)
//    {
//        this.dollars = dollars;
//    }



    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public Money add(Money m)
    {
    	Money b = new Money();
    	
    	b.setDollars(this.dollars + m.getDollars());
    	if(this.cents + m.getCents() >= 100) {
    		b.setDollars(b.getDollars() + 1);
    		b.setCents(this.cents + m.getCents() - 100);
    		
    	}else {
    		b.setCents(this.cents + m.getCents());
    	}
    	return b;
    	
    	
    	
    	
    	
//        int dollars1 = m1.getDollars();
//       
//        int cents1 = m1.getCents();
//        
//
//        int sumDollars = dollars1 + getDollars();
//        int sumCents = cents1 + cents;
//
//        if(sumCents > 100)
//        {
//            sumDollars = sumDollars + 1;
//            sumCents = sumCents - 100;
//        }
//        Money output = new Money(sumDollars, sumCents);
//        return output;


    }

    public Money subtract(Money m)
    {
    	if(m.getDollars() > dollars) {
    		return null;
    	}else if(m.getDollars() == dollars && m.getCents() > cents){
    		return null;
    	}
    	
    	
    	Money c = new Money();
    	c.setDollars(this.dollars - m.getDollars());
    	if(this.cents - m.getCents() < 0) {
    		c.setDollars(c.getDollars() - 1);
    		c.setCents(-(this.cents - m.getCents()));
    	}else {
    		c.setCents(this.cents - m.getCents());
    	}
    	return c;
    	
//        int dollars1 = m1.getDollars();
//      
//        int cents1 = m1.getCents();
//        
//
//        int sumDollars = dollars1 - dollars;
//        int sumCents = cents1 - cents;
//
//        if(sumCents > 100)
//        {
//            sumDollars = sumDollars +1;
//            sumCents = sumCents - 100;
//        }
//        Money output = new Money(sumDollars, sumCents);
//        return output;


    }
//    public boolean equals(double YourMoney)
//    {
//        boolean result;
//        if (YourMoney > 0)
//        {
//            dollars += cents;
//            result = true;
//        }
//        else
//        {
//            result = false;
//        }
//        return result;
//    }

    public String toString()
    {
    	return String.format("$%1$d.%2$d",dollars,cents);
   
    }
//    public static void main(String[] args) {
//    	Money m1 = new Money(5,45);
//    	Money m2 = new Money(10,95);
//    	Money result = m2.add(m1);
//    	//System.out.println(m1.getDollars() + m1.getCents() + ” + “ + m2.getDollars() + m2.getCents() + “ = “ + result.getDollars + result.getCents());
//    	System.out.printf("%4d.%2d + %2d.%2d = %2d.%2d", m1.getDollars(),m1.getCents(),m2.getDollars(), m2.getCents(), result.getDollars(), result.getCents());
//        m1 = new Money(10,45);
//        m2 = new Money(5,95); // Result showed be $16.40
//        Money answer = m2.subtract(m1);
//
//        System.out.printf("%4d.%2d + %2d.%2d = %2d.%2d", m1.getDollars(),m1.getCents(),m2.getDollars(), m2.getCents(), answer.getDollars(), answer.getCents());
//
//    	
//    }
}
    	   



		
