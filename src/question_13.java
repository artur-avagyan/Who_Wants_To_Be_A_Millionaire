import java.util.Random;

class question_13{
    //class like question_1
    public question_13(){}
    public static Question[] question_13_array() {
        Question[] questions=new Question[10];
        questions[0] =new  Question("Տերևազրկում կամ ․․․․․․",
                "Դեֆոլիացիա", "Դեֆիբրիլյացիա","Դեֆլացիա","Դեֆլորացիա", "a");
        questions[1] =new  Question("Մարի Ֆրանսուա Արուե։ Այս հայտնի մարդու ազգանվան մեջ առկա է նշված տարբերակներից մեկը",
                "Ամպեր", "Օհմ","Վոլտ","Վատտ", "c");
        questions[2] =new  Question("Վոլտեր։ <<Տարիների ընթացքում բոլոր կրքերը մահանում են, բայց միայն ․․․․․ (ինչը) չի մահանում >>",
                "Գեղեցկությունը", "Եսասիրությունը","Ինքնահաստատումը","Կամակորությունը", "b");
        questions[3] =new  Question("Չեխիայի Պրժեզովա քաղքի զինանշանի վրա պատկերված է այդ ծառի տերևը",
                "Ընկուզենի", "Սալորենի", "Կեչի","Հաճարենի", "c");
        questions[4] =new  Question("Ֆուտբոլային աշխարհում Յոհան II անվանում են Նեեսկենտին։ Իսկ ով է Յոհան  I-ը", "Ռոբբենը", "Կրուիֆֆը",
                "Զեելերը","Շվայնշտայգերը", "b");
        questions[5] =new  Question("Որ պետության մայրաքաղաքի անվանման  մեջ չկա <<նավահանգիստ>> նշանակող մասնիկը",
                "Մավրիկի", " Նոր Գվինեա", "Հայիթի","Գվատեմալա", "d");
        questions[6] =new  Question("Անվանումներից որն է բառացի թարգմանվում <<Միհրի լեռնաստորոտ>>",
                "Տյան Շյան", "Կարակորում", "Պամիր","Գինդուկուշ", "c");
        questions[7] =new  Question("Դյումայի հերոսների ով ուներ բարոնի տիտղոս",
                "Աթոսը", "Պորտոսը", "Արամիսը ","Մյունհաուզենը", "b");
        questions[8] =new  Question("Պատմական մարզ Իսպանիայում",
                "Աստուրիա", "Էտրուրիա", "Էրիթրեա","Լոմբարդիա", "a");
        questions[9] =new  Question("Տորո <<Բոլորից հարուստ է նա, ում ․․․․․․  պահանջում են ամենից քիչ գումար>>",
                "Զավակները", "Ուրախությունները", "Հաղթանակները","Ընկերուհիները", "b");
        return questions;
    }
    public static Question random_question_13(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        System.out.println("Տասներեքերորդ հարց, 2000000 դրամ\n");
        return question_13_array()[index];
    }
}
