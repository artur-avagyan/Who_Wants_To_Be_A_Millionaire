import java.util.Random;

class question_5{
    //class like question_1
    public question_5(){}
    public static Question[] question_5_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("1-ից 100 թվերը գումարը հավասար է ",
                "5051", "5050","5000","5500", "b");
        questions[1] =new  Question("Որն է  Ֆրանսիայի մայրաքաղաքը",
                "Փարիզ", "Ամստերդամ","Հռոմ","Մարսել", "a");
        questions[2] =new  Question("Պտուղը ․․․․․․ հեռու չի ընկնում",
                "բաղից", "տերևից","հողից","ծառից", "d");
        questions[3] =new  Question("Քանի օր ունի 1 շաբաթը",
                "7", "8", "5","4", "a");
        questions[4] =new  Question("Շենքը բաղկացած է 5 մուտքից, ամեն մուտքը բաղկացած է 5 հարկից, իսկ մուտքի ամեն հարկը 2 բնակարանից։ Քանի բնակարան կա շենքում",
                "40", "25", "50","45", "c");
        questions[5] =new  Question("Որքան է Արարատ լեռան բարձրությունը",
                "5365", "5165", "5425","5225", "b");
        questions[6] =new  Question("Նշվածներից ինչ տեսակի անկյուն գոյություն չունի",
                "ուղիղ", "բութ", "ծռված","սուր", "c");
        questions[7] =new  Question("Ինչ գույնի գլխարկ էր կրում հայտնի հեքիաթի հերոսուհին",
                "կանաչ", "կապույտ", "սպիտակ","կարմիր", "d");
        questions[8] =new  Question("Քանի րոպե է ֆուտբոլային խաղի հիմնական խաղի ժամանակը",
                "45", "90", "120","115", "b");
        questions[9] =new  Question("Քանի խաղացող է լինում ֆուտբլային թիմի մեկնարկային կազմում",
                "8", "12", "15","11", "d");
        return questions;
    }
    public static Question random_question_5(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Հինգերորդ հարց, 8000 դրամ, առաջին անձեռնամխելի գումարը\n");
        return question_5_array()[index];
    }
}