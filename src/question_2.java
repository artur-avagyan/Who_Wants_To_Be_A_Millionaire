import java.util.Random;

class question_2{
    //class like question_1
    public question_2(){}
    public static Question[] question_2_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Նշվածներից ֆուտբոլիստներից ով երբեք չի խաղացել Լա Լիգայում",
                "Լեո Մեսսի", "Դյուբա","Ալբա ","Ֆիգուլի", "b");
        questions[1] =new  Question("Որ մարզին սահմանակից չէ Երևանը",
                "Տավուշ", "Կոտայնք","Արագածոտն","Արմավիր", "a");
        questions[2] =new  Question("Որը մաթեմատիկական գործողություն չէ",
                "Գումարում", "Բազմապատկում","Բաժանում","Ցատկոտում", "d");
        questions[3] =new  Question("Որ թվականին է գրվել հայոց այբուբենը",
                "405", "410", "401","501", "a");
        questions[4] =new  Question("5-րդ դարը կոչվում է", "Բրոնզեդար ", "Արծաթեդար",
                "Ոսկեդար","Մարմարեդար", "c");
        questions[5] =new  Question("Երբ է նշվում երեխաների պաշտպանության միջազգային օրը",
                "Հուլիսի 1", "Հունիսի 1", "Սեպտեմբերի 1","Ապրիլի 1", "b");
        questions[6] =new  Question("Ինչպիսի հապավմամբ համալսարան չկա ՀՀ-ում",
                "ԵՊՀ", "ԵՊՏՀ", "ԵՊԼՀ","ԵՊԲՀ", "c");
        questions[7] =new  Question("Ինչպիսի խոսքի մաս չկա հայերենում",
                "Գոյական", "Դերանուն", "Ածական","Գրական", "d");
        questions[8] =new  Question("Նշված ակումբներից որում հանդես չի եկել Կրիստիանո Ռոնալդուն",
                "Ռեալ Մադրիդ", "Գալաթասարայ", "Յուվենտուս","Ման Յունայթեդ", "b");
        questions[9] =new  Question("Որ գույնը չկա ՀՀ դրոշում",
                "Կարմին", "Ծիրանագույն", "Կապույտ","Մանուշակագույն", "d");
        return questions;
    }
    public static Question random_question_2(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Երկրորդ հարց, 1000 դրամ\n");
        return question_2_array()[index];
    }
}