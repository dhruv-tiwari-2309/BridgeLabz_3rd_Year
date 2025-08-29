class complex {
    int real;
    int imag;
    
// constructor.....
    complex(int r,int i){
        real=r;
        imag=i;
    }
// Add method...
    complex add(complex c){
        return new complex(this.real+c.real,this.imag+c.imag);
    }
// Sub method...
    complex sub(complex c){
        return new complex(this.real-c.real,this.imag-c.imag);
    }
// Mul method...
    complex mul(complex c){
        int r = (this.real * c.real) - (this.imag * c.imag);
        int i = (this.real * c.imag) + (this.imag * c.real);
        return new complex(r, i);
    }
// Display method...
    void display(){
        if(imag>=0){
            System.out.println(real+" + "+imag+"i");
        }else{
            System.out.println(real+" - "+(-imag)+"i");
        }
    }  
}
public class Complex{
    public static void main(String args[]){
        complex c1=new complex(2,3);
        complex c2=new complex(1,9);

        System.out.println("c1 = ");
        c1.display();
        System.out.println("c2 = ");
        c2.display();
        
        // Add
        complex sum=c1.add(c2);
        System.out.println("Sum = ");
        sum.display();

        // Sub
        complex sub=c1.sub(c2);
        System.out.println("Sub = ");
        sub.display();

        // Mul
        complex mul=c1.mul(c2);
        System.out.println("Mul = ");
        mul.display();
    }
} 
