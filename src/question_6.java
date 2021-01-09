import java.util.Random;

class question_6{
    //class like question_1
    public question_6(){}
    public static Question[] question_6_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Որ ակումբն է  հաղթել 2019-2020 թվականների Չեմպիոնների լիգան",
                "Մադրիդի Ռեալ","Մյունխենի Բավարիա", "Բարսելոնա","ՊՍԺ", "b");
        questions[1] =new  Question("Քանի կող ունի խորանարդը",
                "12", "6","3","4", "a");
        questions[2] =new  Question("Որ քաղաքը չի գտնվում  Տավուշի մարզում",
                "Դիլիջան", "Բերդ","Իջևան","Մեղրի", "d");
        questions[3] =new  Question("5 մարդու մեջ քանի ձեռքսեղմում կարող է լինել",
                "10", "5", "15","25", "a");
        questions[4] =new  Question("Քանի արբանյակ ունի Մարսը",
                "5", "4", "2","0", "c");
        questions[5] =new  Question("Ցարական Ռուսաստանում երբ տեղի ունեցավ Հեկտեմբերյան հեղափոխությունը",
                "1916", "1917", "1918","1919", "b");
        questions[6] =new  Question("Ով սպանեց Հուլիոս Կեսարին",
                "Ցիցերոն", "Պոմպեսո", "Բրուտոս","Կլեոպատրա", "c");
        questions[7] =new  Question("Որ թվականներին է կառավարել Տիգրան Մեծը",
                "55-95", "Ք․ա․ 55-38", "Ք․ա․ 100-55","Ք․ա 95-55", "d");
        questions[8] =new  Question("Ով է եղել Հայաստանի 3-րդ հանրապետության առաջին նախագահը",
                "Վազգեն Մանուկյան", "Լ․ Տեր Պետրոսյան", "Արշակ Սադոյան","Ռոբերտ Քոչարյան", "b");
        questions[9] =new  Question("Որն է աշխարհի ամենամեծ անապատը",
                "Կարակում", "Թհար", "Նամիբիա","Սահարա", "d");
        return questions;
    }
    public static Question random_question_6(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Վեցերորդ հարց, 16000 դրամ\n");
        return question_6_array()[index];
    }
}