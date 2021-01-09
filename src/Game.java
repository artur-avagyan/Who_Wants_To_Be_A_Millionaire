import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        boolean new_game=true; //boolean variable, for starting new game
        while(new_game) {

            user user_1 = new user(); //create user
            hints hint=new hints(); // create hints for users

            Question q1 = question_1.random_question_1(); //variable for first question, that have Question class
            System.out.println(q1); // print question and 4 options
            Thread.sleep(2000);
            //check if user want to use hint, and if user want to use hints, then choose one of hints
            if(hint.print_hints()){ q1=hint.choose_hint(q1,question_1.question_1_array(),0);}
            boolean ok_1 = q1.set_your_answer(); // input your answer and check if answer is correct or not
            if (!ok_1) { // if answer is not correct then do these
                q1.print_true_answer(); //print correct answer of this question
                System.out.println("Դուք վաստակեցիք 0 դրամ"); // print how much money we made.
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n"); //check if user want to start new game
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){ // if user input y, it's mean that user want to start new game
                    new_game=true; // set new_game boolean variable true, and it's mean that user want to start new game
                    Thread.sleep(2000);
                    continue; // go to while loop
                }
                else {
                    System.exit(0); // if user don't want to start new game, then exit program
                }

            }

            //do these steps for next questions

            Question q2 = question_2.random_question_2();
            System.out.println(q2);
            Thread.sleep(2000);
            if(hint.print_hints()){q2=hint.choose_hint(q2,question_2.question_2_array(),500);}
            boolean ok_2 = q2.set_your_answer();
            if (!ok_2) {
                q2.print_true_answer();
                System.out.println("Դուք վաստակեցիք 0 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q3 = question_3.random_question_3();
            System.out.println(q3);
            Thread.sleep(2000);
            if(hint.print_hints()){q3=hint.choose_hint(q3,question_3.question_3_array(),1000);}
            boolean ok_3 = q3.set_your_answer();
            if (!ok_3) {
                q3.print_true_answer();
                System.out.println("Դուք վաստակեցիք 0 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q4 = question_4.random_question_4();
            System.out.println(q4);
            Thread.sleep(2000);
            if(hint.print_hints()){q4=hint.choose_hint(q4,question_4.question_4_array(),2000);}
            boolean ok_4 = q4.set_your_answer();
            if (!ok_4) {
                q4.print_true_answer();
                System.out.println("Դուք վաստակեցիք 0 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q5 = question_5.random_question_5();
            System.out.println(q5);
            Thread.sleep(2000);
            if(hint.print_hints()){q5=hint.choose_hint(q5,question_5.question_5_array(),4000);}
            boolean ok_5 = q5.set_your_answer();
            if (!ok_5) {
                q5.print_true_answer();
                System.out.println("Դուք վաստակեցիք 0 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q6 = question_6.random_question_6();
            System.out.println(q6);
            Thread.sleep(2000);
            if(hint.print_hints()){q6=hint.choose_hint(q6,question_6.question_6_array(),8000);}
            boolean ok_6 = q6.set_your_answer();
            if (!ok_6) {
                q6.print_true_answer();
                System.out.println("Դուք վաստակեցիք 8000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q7 = question_7.random_question_7();
            System.out.println(q7);
            Thread.sleep(2000);
            if(hint.print_hints()){q7=hint.choose_hint(q7,question_7.question_7_array(),16000);}
            boolean ok_7 = q7.set_your_answer();
            if (!ok_7) {
                q7.print_true_answer();
                System.out.println("Դուք վաստակեցիք 8000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q8 = question_8.random_question_8();
            System.out.println(q8);
            Thread.sleep(2000);
            if(hint.print_hints()){q8=hint.choose_hint(q8,question_8.question_8_array(),32000);}
            boolean ok_8 = q8.set_your_answer();
            if (!ok_8) {
                q8.print_true_answer();
                System.out.println("Դուք վաստակեցիք 8000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q9 = question_9.random_question_9();
            System.out.println(q9);
            Thread.sleep(2000);
            if(hint.print_hints()){q9=hint.choose_hint(q9,question_9.question_9_array(),64000);}
            boolean ok_9 = q9.set_your_answer();
            if (!ok_9) {
                q9.print_true_answer();
                System.out.println("Դուք վաստակեցիք 8000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q10 = question_10.random_question_10();
            System.out.println(q10);
            Thread.sleep(2000);
            if(hint.print_hints()){q10=hint.choose_hint(q10,question_10.question_10_array(),125000);}
            boolean ok_10 = q10.set_your_answer();
            if (!ok_10) {
                q10.print_true_answer();
                System.out.println("Դուք վաստակեցիք 8000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q11 = question_11.random_question_11();
            System.out.println(q11);
            Thread.sleep(2000);
            if(hint.print_hints()){q11=hint.choose_hint(q11,question_11.question_11_array(),250000);}
            boolean ok_11 = q11.set_your_answer();
            if (!ok_11) {
                q11.print_true_answer();
                System.out.println("Դուք վաստակեցիք 250000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q12 = question_12.random_question_12();
            System.out.println(q12);
            Thread.sleep(2000);
            if(hint.print_hints()){q12=hint.choose_hint(q12,question_12.question_12_array(),500000);}
            boolean ok_12 = q12.set_your_answer();
            if (!ok_12) {
                q12.print_true_answer();
                System.out.println("Դուք վաստակեցիք 250000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q13 = question_13.random_question_13();
            System.out.println(q13);
            Thread.sleep(2000);
            if(hint.print_hints()){q13=hint.choose_hint(q13,question_13.question_13_array(),1000000);}
            boolean ok_13 = q13.set_your_answer();
            if (!ok_13) {
                q13.print_true_answer();
                System.out.println("Դուք վաստակեցիք 250000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q14 = question_14.random_question_14();
            System.out.println(q14);
            Thread.sleep(2000);
            if(hint.print_hints()){q14=hint.choose_hint(q14,question_14.question_14_array(),2000000);}
            boolean ok_14 = q14.set_your_answer();
            if (!ok_14) {
                q13.print_true_answer();
                System.out.println("Դուք վաստակեցիք 250000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    Thread.sleep(2000);
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            Question q15 = question_15.random_question_15();
            System.out.println(q15);
            Thread.sleep(2000);
            if(hint.print_hints()){q15=hint.choose_hint(q15,question_15.question_15_array(),3000000);}
            boolean ok_15 = q15.set_your_answer();
            if (!ok_15) {
                q15.print_true_answer();
                System.out.println("Դուք վաստակեցիք 250000 դրամ");
                Thread.sleep(2000);
                System.out.println("Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
                Scanner in = new Scanner(System.in);
                String yes_no = in.next();
                Thread.sleep(2000);
                if(yes_no.toLowerCase().equals("y")){
                    new_game=true;
                    continue;
                }
                else {
                    System.exit(0);
                }
            }

            //if you got here, then you won the game
            //check if user want to start new game
            System.out.println("Շնորհավորում ենք դուք հաղթել եք այս խաղը,\nվաստակել եք 5 միլիոն դրամ\n"+
                    "Ցանկանում եք սկսել նոր խաղ?\ny/n\n");
            Scanner in = new Scanner(System.in);
            String yes_no = in.next();
            if(yes_no.toLowerCase().equals("y")){
                new_game=true;
                continue;
            }
            else {
                System.exit(0);
            }
        }


    }
}
