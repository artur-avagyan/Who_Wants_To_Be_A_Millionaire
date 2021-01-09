import java.util.Random;

class question_4{
    //class like question_1
    public question_4(){}
    public static Question[] question_4_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Քանի երկնիշ թիվ կա",
                "99", "90","91","100", "b");
        questions[1] =new  Question("Քանի վանդակ ունի շախմատի տախտակը",
                "64", "8","169","32", "a");
        questions[2] =new  Question("Գյուղ կանգնի ․․․․․․․․ կկոտրի",
                "գաղտնաբառ", "ապակի","մեքենա","գերան", "d");
        questions[3] =new  Question("Քանի աստիճան է եռանկյան անկյունների գումարը",
                "180", "90", "200","360", "a");
        questions[4] =new  Question("Ինչ անվամբ է կոչվել Հայաստանը Տիգրան Մեծի օրոք",
                "Դարպասից դարպաս", "Լճից լիճ ", "Ծովից ծով","Բերդից բերդ", "c");
        questions[5] =new  Question("Որ մարզում է գտնվում Շաքեի ջրվեժը",
                "Գեղարքունիք", "Սյունիք", "Վայոց ձոր","Տավուշ", "b");
        questions[6] =new  Question("Քանի նահանգից է բաղկացած եղել Մեծ Հայքը",
                "18", "16", "15","10", "c");
        questions[7] =new  Question("Լավ է ուշ քան ․․․․․․․․",
                "հիմա", "երեկ", "վաղը","երբեք", "d");
        questions[8] =new  Question("<<Ոսկե ցլիկը>> ինչպես էր անվանում իր ցլիկին",
                "Ցլիկ", "Միլիոն", "Արևս","Գանձս", "b");
        questions[9] =new  Question("Քանի առաքյալ ուներ Հիսուսը",
                "1", "10", "11","12", "d");
        return questions;
    }
    public static Question random_question_4(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Չորրորդ հարց, 4000 դրամ\n");
        return question_4_array()[index];
    }
}