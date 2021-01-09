import java.util.Random;

class question_1{
    //class for first question
    public question_1(){}//empty constructor
    public static Question[] question_1_array() {
        Question[] questions=new Question[10];//array for questions, that contains 10 questions(for first question in game)
        //add 10 questions 
        questions[0] =new  Question("Որն է Հայաստանի մայրաքաղաքը",
                "Երևան", "Վանաձոր", "Մարտունի","Մեղրի", "a");
        questions[1] =new  Question("Ով է հայոց գրերի հեղինակը",
                "Մովսես Խորենացի", "Խոսրով II", "Տիգրան Մեծ","Մեսրոպ Մաշտոց", "d");
        questions[2] =new  Question("Որն է Ռուսաստանի մայրաքաղաքը",
                "Սանկ Պետերբուրգ ", "Մոսկվա", "Կիև","Փարիզ", "b");
        questions[3] =new  Question("Տրվածներից որը ՀՀ մարզկենտրոններից չէ",
                "Ագարակ", "Վանաձոր", "Իջևան","Գավառ", "a");
        questions[4] =new  Question("Տրվածներից որը ռացիոնալ թիվ չէ",
                "sqrt(2) ", "6", "4/20","10.5", "a");
        questions[5] =new  Question("Լոռվա որ Գյուղում է ծնվել մեծանուն գրող Հովհաննես Թումանյանը",
                "Քարաձոր", "Դսեղ", "Փամբակ ","Հաղպատ", "b");
        questions[6] =new  Question("Որն է ՀՀ 3-րդ հանրապետության անկախության օրը",
                "Մայիսի 9 ", "Հունվարի 28", "Սեպտեմբերի 21","Հուլիսի 5", "c");
        questions[7] =new  Question("Ինչի է հավասար 169մ քառակուսի մակերեսով քառակուսու կողմի երկարությունը",
                "14", "17", "15","13", "d");
        questions[8] =new  Question("Որը Իսպանական ակումբներից չէ",
                "Լևանտե", "Մալագա", "Նորվիչ","Մալյորկա", "c");
        questions[9] =new  Question("Ինչ անվանում ունի y=ax+b ֆունցիան",
                "Քառակուսային", "Ուղղանկյուն", "Հիպերբոլ","Գծային", "d");
        return questions;
    }
    //method for random choosing question from array
    public static Question random_question_1(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Առաջին հարց, 500 դրամ\n");
        return question_1_array()[index];
    }
}