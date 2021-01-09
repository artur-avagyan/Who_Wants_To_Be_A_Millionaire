import java.util.Random;

class question_3{
    //class like question_1
    public question_3(){}
    public static Question[] question_3_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Նշվածներից ֆուտբոլիստներից ով երբեք չի խաղացել Ա Սերիայում",
                "Սուարես", "Դիբալա","Հարի Քեյն","Ուեյն Ռունի", "b");
        questions[1] =new  Question("Որը չի ներառված Ռուսաստանի դաշնության դրոշի գույներում",
                "Կանաչ", "Կարմիր","Կապույտ","Սպիտակ", "a");
        questions[2] =new  Question("Էշն ինչ գիտի նուշն ․․․․․․․․",
                "որտեղա", "ինչա անում","ում հետա","ինչա", "d");
        questions[3] =new  Question("Նշվածներից որը զույգ թիվ չէ",
                "13", "18", "192","444", "a");
        questions[4] =new  Question("Որը Եվրասիա մայրցամաքի երկիր չէ ",
                "Հայաստան", "Տաջիկստան","Կոնգո","Չինաստան", "c");
        questions[5] =new  Question("Նշվածներից որը չի նշվում գարնանը",
                "Եղեռնի զոհերի հիշատակի օր", "ՀՀ անկախության օր",
                "Մայրության և գեղեցկության տոն","Աշխատավորի օրը", "b");
        questions[6] =new  Question("Որ ժամային գոտում է գտնվում Հայաստանը",
                "+07", "+08", "+04","+05", "c");
        questions[7] =new  Question("Քանի եղբայր խոզուկներ էին հայտնի հեքիաթում",
                "5", "2", "4","3", "d");
        questions[8] =new  Question("Ես իմ անուշ Հայաստանի ․․․․․․ բառն եմ սիրում",
                "արնանման", "արևահամ", "հեզաճկուն","ողբանվագ ", "b");
        questions[9] =new  Question("Ով էր հայտնի <<Որոգայթ>> ֆիլմում գլխավոր կերպարում",
                "Հասո", "Համո", "Հայկո","Հովո", "d");
        return questions;
    }
    public static Question random_question_3(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Երրորդ հարց, 2000 դրամ\n");
        return question_3_array()[index];
    }
}
