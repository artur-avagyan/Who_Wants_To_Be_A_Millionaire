import java.util.Random;

class question_15{
    //class like question_1
    public question_15(){}
    public static Question[] question_15_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Քիմիական տարրերից որն  իր անվանումը չի ստացել հունական դիցարանի կերպարի անունից",
                "Պրոմեթիում", "Տանտալ","Վանադիում","Նիոբիում", "c");
        questions[1] =new  Question("Ֆաշիստական Գերմանիայում զինվորական բարձր կոչում, որն ունեցել է միայն մեկ մարդ՝ Գյորինգը",
                "Ռեյխսֆյուրեր", "Ռեյխսմարշալ","Ֆեյդմարշալ","Օբերհաուլայտեր", "b");
        questions[2] =new  Question("Նշվածներից ով է գեղանկարչության տարատեսակի ներկայացուցիչ",
                "Նիլաշիստ", "Սալաշիստ","Տաշիստ","Ռաշիստ", "c");
        questions[3] =new  Question("Մարդու գեղձերից մեկում լակտացիայի ընթացքում առաջանում է  ․․․․․",
                "Թուք", "Կաթ", "Քրտինք","Հույզ", "b");
        questions[4] =new  Question("Այդ պարը ծագել է Ավսրիայում <<տեղացիների, գյուղացիների>> համար",
                "Լենդլեր", "Կադրիլ", "Բուրրե","Վալս", "a");
        questions[5] =new  Question("Economist ամսագիրը երկրները ըստ ժողովրդավարական վիճակի դասակարգել է 4 խմբի։ Մեկն այս խմբում չկա",
                "Փխրուն ժողովրդականություն", "Ավտորիտար ռեժիմ", "Մաժորիտար ռեժիմ","Հիբրիդային ռեժի", "c");
        questions[6] =new  Question("Անգլիայի այս ակումբերից որը քաղաքի անվանում չի կրում",
                "Վեստ Բրոմվիչ", "Աստոն Վիլլա", "Սուոնսի","Նյուքասլ", "b");
        questions[7] =new  Question("Շառլ Լեմեր <<Այլոց համար մենք ստեղծում ենք կանոններ, մեզ համար՝ ․․․․․․>>",
                "խաղի կանոններ", "բացառություններ", "պրոբլեմներ","հարմարավետություն", "b");
        questions[8] =new  Question("Բելշինա ֆուտբոլային թիմը որ քաղաքն է ներկայացնում",
                "Կարմին", "Յարոսլավլ", "Բրեստ","Բրյուսել", "a");
        questions[9] =new  Question("Հնում շարժական բազմահարկ աշտարակ, որը կիրառվում էր ամրոցների գրավման ժամանակ",
                "Հելեպոլիս", "Տելեպոլիս", "Արեոպոլիս","Պոլիպոլիս", "a");
        return questions;
    }
    public static Question random_question_15(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Տասնհինգերորդ հարց, 5000000 դրամ\n");
        return question_15_array()[index];
    }
}
