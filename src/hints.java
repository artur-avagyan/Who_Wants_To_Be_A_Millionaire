import java.util.Random;
import java.util.Scanner;

class hints {
    //class for hints, that user can use
    private int half_half=1; // 50/50
    private int auditorium=1; // hint from auditorium
    private int friend_call=1; // hint for user to call friend
    private int money=1; //hint for user to take money
    private int change_question=1; //hint for user to change question

    public hints(){} // empty constructor for this class

    // get methods for all variables of this class (this show 1 or 0 (can user use that hint or not))
    public int getAuditorium() {return this.auditorium;}
    public int getChange_question() {return this.change_question;}
    public int getFriend_call() {return this.friend_call;}
    public int getHalf_half() {return this.half_half;}
    public int getMoney() {return this.money;}

    //if user use these hint, then that hint will be remove
    public void remove_Auditorium() {this.auditorium=0;}
    public void remove_Change_question() {this.change_question=0;}
    public void remove_Friend_call() {this.friend_call=0;}
    public void remove_Half_half() {this.half_half=0;}

    //boolean method for checking if user want to use hint or not
    public boolean print_hints() throws InterruptedException{
        //print all available hints
        System.out.println("\nԴուք ունեք հետևյալ օգնության հնարավորությունները\n");
        if (this.getHalf_half() != 0) {
            System.out.print("a)50/50     ");
        }
        if (this.getAuditorium() != 0) {
            System.out.print("b)Դահլիճի օգնություն     \n");
        }
        if (this.getFriend_call() != 0) {
            System.out.print("c)Զանգ ընկերոջը     ");
        }
        if (this.getChange_question() != 0) {
            System.out.print("d)Փոխել հարցը     \n");
        }
        System.out.print("e)Վերցնել գումարը\n");

        System.out.println("Ցանկանում եք օգտվել որևէ օգնությունից --> y/n\n");
        Scanner in = new Scanner(System.in);
        String yes_no = in.next(); //input "y"(yes) or "n"(no)
        if(yes_no.toLowerCase().equals("y")) {
            System.out.println("Ընտրեք ձեր ցանկացած օգնության ինդեքսը\n");
            Thread.sleep(2000);
            return true;
        }
        else{//if "n", so input your answer of question
            System.out.println("Այս դեպքում ընտրեք ձեր պատասխանների տարբերակը\n");
            return false;
        }
    }

    //do 50/50
    public Question do_half_half(Question quest,Question [] arr,int Money) throws InterruptedException {
        if(quest.get_true_answer().equals("a")){
            //if correct answer is "a", so print "a", and one of others
            String [] half_a=new String[3];
            half_a[0]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "b)"+quest.getB()+"\n";
            half_a[1]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "c)"+quest.getC()+"\n";
            half_a[2]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "d)"+quest.getD()+"\n";
            Random rand = new Random();
            int index = rand.nextInt(3);
            System.out.println(half_a[index]);
        }
        else if(quest.get_true_answer().equals("b")){
            //if correct answer is "b", so print "b", and one of others
            String [] half_b=new String[3];
            half_b[0]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "b)"+quest.getB()+"\n";
            half_b[1]=quest.getquestion()+"\n" +
                    "b)"+quest.getB()+"\n"+
                    "c)"+quest.getC()+"\n";
            half_b[2]=quest.getquestion()+"\n" +
                    "b)"+quest.getB()+"\n"+
                    "d)"+quest.getD()+"\n";
            Random rand = new Random();
            int index = rand.nextInt(3);
            System.out.println(half_b[index]);
        }
        else if(quest.get_true_answer().equals("c")){
            //if correct answer is "c", so print "c", and one of others
            String [] half_c=new String[3];
            half_c[0]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "c)"+quest.getC()+"\n";
            half_c[1]=quest.getquestion()+"\n" +
                    "b)"+quest.getB()+"\n"+
                    "c)"+quest.getC()+"\n";
            half_c[2]=quest.getquestion()+"\n" +
                    "c)"+quest.getC()+"\n"+
                    "d)"+quest.getD()+"\n";
            Random rand = new Random();
            int index = rand.nextInt(3);
            System.out.println(half_c[index]);
        }
        else if(quest.get_true_answer().equals("d")){
            //if correct answer is "d", so print "d", and one of others
            String [] half_d=new String[3];
            half_d[0]=quest.getquestion()+"\n" +
                    "a)"+quest.getA()+"\n"+
                    "d)"+quest.getD()+"\n";
            half_d[1]=quest.getquestion()+"\n" +
                    "b)"+quest.getB()+"\n"+
                    "d)"+quest.getD()+"\n";
            half_d[2]=quest.getquestion()+"\n" +
                    "c)"+quest.getC()+"\n"+
                    "d)"+quest.getD()+"\n";
            Random rand = new Random();
            int index = rand.nextInt(3);
            System.out.println(half_d[index]);
        }
        System.out.println("Նշեք ճիշտ պատասխանը");
        remove_Half_half();//because this hint is already used, so remove it
        if(getHalf_half()!=0 || getAuditorium()!=0 || getFriend_call()!=0 || getChange_question()!=0){
            if(print_hints()){ quest=choose_hint(quest,question_1.question_1_array(),0);}
        }
        return quest;
    }

    // do hint of auditorium
    public Question do_auditorium(Question quest,Question [] arr,int Money) throws InterruptedException{
        // give random 4 numbers, sum of which is equal to 100
        Random rand = new Random();
        int p_true=100-rand.nextInt(55);
        if(quest.get_true_answer().equals("a")){
            int p_a = p_true;
            int p_b = rand.nextInt(100-p_a);
            int p_c = rand.nextInt(100-p_a-p_b);
            int p_d = 100-(p_a+p_b+p_c);
            System.out.println("a --> "+p_a+"%\n"+
                    "b --> "+p_b+"%\n"+
                    "c --> "+p_c+"%\n"+
                    "d --> "+p_d+"%\n");
        }
        else if(quest.get_true_answer().equals("b")){
            int p_b = p_true;
            int p_a = rand.nextInt(100-p_b);
            int p_c = rand.nextInt(100-p_a-p_b);
            int p_d = 100-(p_a+p_b+p_c);
            System.out.println("a --> "+p_a+"%\n"+
                    "b --> "+p_b+"%\n"+
                    "c --> "+p_c+"%\n"+
                    "d --> "+p_d+"%\n");
        }
        else if(quest.get_true_answer().equals("c")){
            int p_c = p_true;
            int p_a = rand.nextInt(100-p_c);
            int p_b = rand.nextInt(100-p_a-p_c);
            int p_d = 100-(p_a+p_b+p_c);
            System.out.println("a --> "+p_a+"%\n"+
                    "b --> "+p_b+"%\n"+
                    "c --> "+p_c+"%\n"+
                    "d --> "+p_d+"%\n");
        }
        else if(quest.get_true_answer().equals("d")){
            int p_d = p_true;
            int p_a = rand.nextInt(100-p_d);
            int p_c = rand.nextInt(100-p_a-p_d);
            int p_b = 100-(p_a+p_d+p_c);
            System.out.println("a --> "+p_a+"%\n"+
                    "b --> "+p_b+"%\n"+
                    "c --> "+p_c+"%\n"+
                    "d --> "+p_d+"%\n");
        }
        System.out.println("Նշեք ճիշտ պատասխանը");
        remove_Auditorium();//because this hint is already used, so remove it
        if(getHalf_half()!=0 || getAuditorium()!=0 || getFriend_call()!=0 || getChange_question()!=0){
            if(print_hints()){ quest=choose_hint(quest,question_1.question_1_array(),0);}
        }
        return quest;
    }

    // do hint: call friend
    public Question do_friend_call(Question quest,Question [] arr, int Money) throws InterruptedException{
        //number of answers from friends
        String [] friend_answer=new String[11];
        friend_answer[0]="Գայանե Գևորգյան։ Էս հաստատ գիտեմ։ Ճիշտ պատասխանն է ->> ";
        friend_answer[1]="Ռուբեն Գևորգյան։ Էս հաստատ գիտեմ։ Ճիշտ պատասխանն է ->> ";
        friend_answer[2]="Հովակիմյան Գուրգեն։ Հեսա կասեմ ճիշտ պատասխանը, բայց հանկարծ,չհարցնեք որտեղից գիտեմ։\n"+
                         "Ճիշտ պատասխանն է ->> ";
        friend_answer[3]="Յենոք Հակոբյան։ Եթե չեմ սխալվում ճիշտ պատասխանն է ->> ";
        friend_answer[4]="Գևորգ Ղալաչյան։ Սպասի հեսա գուգլեմ, ասեմ։ Երևի ճիշտը կլինի ->> ";
        friend_answer[5]="Լիլիթ Յոլյան։ Միգուցե սխալվեմ, բայց իմ կարծիքով ճիշտ պատասխանն է ->> ";
        friend_answer[6]="Լուսինե Զիլֆիմյան։ Սա իսկը իմ ոլորտն է, միանշանակ ճիշտ պատասխանն է պատասխանն է ->> ";
        friend_answer[7]="Սուսաննա Գաբրիելյան։ Էս ինչ խառը ժամանակ զանգեցիք։ Հեսա մտածեմ ասեմ։\nՀմմմմմմմ, Ճիշտ պատասխանն է ->> ";
        friend_answer[8]="Արթուր Ավագյան։ Ինչ էլ գիտես ում պիտի զանգես)))։ Ասեմ գրի, ճիշտ պատասխանն է ->> ";
        friend_answer[9]="Հարավ կորեացի։ 나는 이것을 확실히 알고있다. 정답은 다음과 같습니다 ->> ";
        friend_answer[10]="Հրաչ Մուրադյան։ Թե՞ 19)))։ Լավ, հումոր էր, ասեմ գրի, ճիշտ պատասխանն է ->> ";
        Random rand = new Random();
        int index = rand.nextInt(11);
        //if current answer is "a", so di this
        if(quest.get_true_answer().equals("a")){
            if(index==4 || index==5 || index==6 || index==7 || index==1 || index==9 || index==0 || index==10)
            {System.out.println(friend_answer[index]+"a)");}
            else if(index==2){System.out.println(friend_answer[index]+"b)");}
            else if(index==3){System.out.println(friend_answer[index]+"c)");}
            else {System.out.println(friend_answer[index]+"d)");}
        }
        //if current answer is "b", so di this
        else if(quest.get_true_answer().equals("b")){
            if(index==3 || index==2 || index==6 || index==7 || index==1 || index==8 || index==0 || index==4)
            {System.out.println(friend_answer[index]+"b)");}
            else if(index==5){System.out.println(friend_answer[index]+"a)");}
            else if(index==10){System.out.println(friend_answer[index]+"c)");}
            else {System.out.println(friend_answer[index]+"d)");}
        }
        //if current answer is "c", so di this
        if(quest.get_true_answer().equals("c")){
            if(index==4 || index==5 || index==8 || index==3 || index==1 || index==10 || index==2 || index==0)
            {System.out.println(friend_answer[index]+"a)");}
            else if(index==9){System.out.println(friend_answer[index]+"b)");}
            else if(index==7){System.out.println(friend_answer[index]+"c)");}
            else {System.out.println(friend_answer[index]+"d)");}
        }
        //if current answer is "d", so di this
        if(quest.get_true_answer().equals("d")){
            if(index==4 || index==5 || index==3 || index==2 || index==1 || index==9 || index==0 || index==7)
            {System.out.println(friend_answer[index]+"a)");}
            else if(index==8){System.out.println(friend_answer[index]+"b)");}
            else if(index==6){System.out.println(friend_answer[index]+"c)");}
            else {System.out.println(friend_answer[index]+"d)");}
        }
        System.out.println("Նշեք ճիշտ պատասխանը");
        remove_Friend_call();//because this hint is already used, so remove it
        if(getHalf_half()!=0 || getAuditorium()!=0 || getFriend_call()!=0 || getChange_question()!=0){
            if(print_hints()){ quest=choose_hint(quest,question_1.question_1_array(),0);}
        }
        return quest;
    }

    //change question to another question
    public Question do_change_question(Question quest,Question [] arr,int Money) throws InterruptedException{
        //random take one index from 0 to 9, and print this question (if it is not the same question)
        Random rand = new Random();
        int index = rand.nextInt(10);
        while(arr[index].getquestion().equals(quest.getquestion())){//check if the question is not the same question
            rand = new Random();
            index = rand.nextInt(10);
        }
        System.out.println("Փոխված հարցն է\n"+arr[index]); //print changed question
        System.out.println("\nՆշեք ճիշտ պատասխանը");
        remove_Change_question();//because this hint is already used, so remove it
        if(getHalf_half()!=0 || getAuditorium()!=0 || getFriend_call()!=0 || getChange_question()!=0){
            if(print_hints()){ quest=choose_hint(quest,arr,Money);}
        }
        return arr[index];
    }

    //do hint of getting money
    public Question do_get_money(Question quest, int Money) throws InterruptedException{
        System.out.println("Դուք վաստակել եք "+Money+" դրամ");
        System.out.println("Շնորհակալությյուն խաղին մասնակցելու համար\n");
        System.exit(0);//if user want to get money, then game is end and exit program
        return quest;
    }

    //method for choosing hint
    public Question choose_hint(Question quest,Question [] arr,int Money) throws InterruptedException{
        //input one of the option of hints
        Scanner in = new Scanner(System.in);
        String choose = in.next();
        //check user's choose and do
        if (choose.equals("a") && this.getHalf_half() != 0) {
            return do_half_half(quest, arr, Money);
        } else if (choose.equals("b") && this.getAuditorium() != 0) {
            return do_auditorium(quest, arr, Money);
        } else if (choose.equals("c") && this.getFriend_call() != 0) {
            return do_friend_call(quest, arr, Money);
        } else if (choose.equals("d") && this.getChange_question() != 0) {
            return do_change_question(quest, arr, Money);
        } else if (choose.equals("e") && this.getMoney() != 0){
            return do_get_money(quest, Money);
        }
        else{
            System.out.println("Մուտքագրեք օգնության ճիշտ ինդեքս\n");
            choose_hint(quest,arr,Money);//if input is uncorrect, then do this again
            return quest;
        }
    }
}