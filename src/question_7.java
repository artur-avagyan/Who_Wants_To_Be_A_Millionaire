import java.util.Random;

class question_7{
    //class like question_1
    public question_7(){}
    public static Question[] question_7_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Լյուդվիգ Ֆոյերբախ․ <<Ով միշտ անում է այն ինչ ուզում է, հազմադեպ է անում այն ինչ ․․․>>",
                "Պահանջվում է", "Պարտավոր է","Չի ուզում","Օգտակար է", "b");
        questions[1] =new  Question("Որ երկիրն է առաջինը ընդունել քրիստոնեությունը որպես պետական կրոն  ",
                "Հայաստան", "Հունաստան","Իսրայել","Իտալիա", "a");
        questions[2] =new  Question("Որ քաղաքի սիմվոլն է համարվում գայլը",
                "Փարիզ", "Մադրիդ","Մարսել","Հռոմ", "d");
        questions[3] =new  Question("Նշվածներից ով խորհրդային շրջանում չի եղել Կենտրոնակն կոմիտեի առաջին քարտուղար",
                "Ալեքսանդր Մյասնիկյան", "Կարեն Դեմիրճյան", "Արամ Սարգսյան","Վլադիմիր Մովսիսյա", "a");
        questions[4] =new  Question("Ինչ է խորհրդանշում ՀՀ դրոշի կարմիր գույնը",
                "Հայոց հոգին", "Հայոց ուժը", "Հայոց թափած արյունը","Աշխատասիրությունը", "c");
        questions[5] =new  Question("Քանի մարշալ է տվել Հայաստանը Հայրենական մեծ պատերազմում",
                "6", "4", "5","7", "b");
        questions[6] =new  Question("Թոմաս Էդիսոն․ <<Հանճարը դա 1 տոկոս տաղանդն է, և 99 տոկոս ․․․․․․>>",
                "Հաջողություն", "Տրամաբանություն", "Աշխատասիրություն","Հանդուրժողականություն", "c");
        questions[7] =new  Question("Որն է ամենափոքր մայրցամաքը",
                "Ասիա", "Եվրոպա", "Հարավային Ամերիա","Ավստալիա", "d");
        questions[8] =new  Question("Ով է եղել Երևան քաղաքի նախագծի հեղինակը",
                ")Արմեն Զարյան", "Ալեքսանդր Թամանյան", "Կարեն Բալյան","Արգիշտ Մանուկյան", "b");
        questions[9] =new  Question("Ինչով են բաժանվում Հյուսիսային և Հարավային Ամերիկաները",
                "Ուրալյան լեռներով", "Հիմալայներով", "Բոսֆորի նեղուցով","Պանամայի նեղուցով", "d");
        return questions;
    }
    public static Question random_question_7(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Յոթերորդ հարց, 32000 դրամ\n");
        return question_7_array()[index];
    }
}