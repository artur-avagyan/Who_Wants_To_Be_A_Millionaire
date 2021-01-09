import java.util.Scanner;

class Question {
    //class for question
    // variables are questions, 4 options and true answer
    private String question,a,b,c,d,true_answer;

    //constructor for question. it contains questions, 4 options and true answer
    public Question(String question,String a,String b,
                    String c,String d, String true_answer) {
        this.question=question;
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.true_answer=true_answer;
    }
    //methods for getting questions, 4 options and true answer
    public String getquestion() {return this.question;}
    public String getA(){return  this.a;}
    public String getB(){return  this.b;}
    public String getC(){return  this.c;}
    public String getD(){return  this.d;}
    public String get_true_answer(){return  this.true_answer;}

    //method for printing question
    public String toString(){
        return this.question + '\n' +
                "a)" + this.a + '\n' +
                "b)" + this.b + '\n' +
                "c)" + this.c + '\n' +
                "d)" + this.d + '\n';
    }

    //method for user to input her/his option, and check if it is correct or not
    public boolean set_your_answer() throws InterruptedException{
        Scanner in = new Scanner(System.in);
        String your_answer = in.next();
        Thread.sleep(2000);
        if(your_answer.toLowerCase().equals(this.get_true_answer())){
            System.out.println("Պատասխանը ճիշտ է\n");
            Thread.sleep(2000);
            return true;}
        System.out.println("Պատասխանը սխալ է, շնորհակալությյուն խաղին մասնակցելու համար\n");
        return false;
    }

    //method for printing correct answer 
    public void print_true_answer(){
        if(this.get_true_answer().equals("a")){System.out.println("Ճիշտ պատասխանն է -->> a)"+this.getA());}
        else if(this.get_true_answer().equals("b")){System.out.println("Ճիշտ պատասխանն է -->> b)"+this.getB());}
        else if(this.get_true_answer().equals("c")){System.out.println("Ճիշտ պատասխանն է -->> c)"+this.getC());}
        else {System.out.println("Ճիշտ պատասխանն է -->> d)"+this.getD());}
    }
}