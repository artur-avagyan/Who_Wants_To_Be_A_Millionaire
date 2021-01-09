import java.util.Scanner;

class user{
    //class for user(player)
    private String your_name; //String veriable for user's name
    public user () throws InterruptedException  { //create constructor for user object
        System.out.println("Բարի գալուստ <<Ով է ուզում դառնալ միլիոնատեր>> \nՆշեք ձեր անունը՝");
        Scanner in = new Scanner(System.in);
        String name = in.next(); //input user's name
        Thread.sleep(500);
        //discription of the game
        System.out.println("Հաճելի խաղ ձեզ "+name+"\nԴուք ունեք 15 հարց, ունեք 4 օգնության հնարավորություն՝ \n50/50,զանգ ընկերոջը, դահլիճի օգնությունը և հարցը փոխելու հնարավորւթյուն։\n");
        Thread.sleep(500);
        System.out.println("15 --> 5000000");
        Thread.sleep(500);
        System.out.println("14 --> 3000000");
        Thread.sleep(500);
        System.out.println("13 --> 2000000");
        Thread.sleep(500);
        System.out.println("12 --> 1000000");
        Thread.sleep(500);
        System.out.println("11 --> 500000");
        Thread.sleep(500);
        System.out.println("10 --> 250000(անձեռնամխելի)");
        Thread.sleep(500);
        System.out.println("09 --> 125000");
        Thread.sleep(500);
        System.out.println("08 --> 64000");
        Thread.sleep(500);
        System.out.println("07 --> 32000");
        Thread.sleep(500);
        System.out.println("06 --> 16000");
        Thread.sleep(500);
        System.out.println("05 --> 8000(անձեռնամխելի)");
        Thread.sleep(500);
        System.out.println("04 --> 4000");
        Thread.sleep(500);
        System.out.println("03 --> 2000");
        Thread.sleep(500);
        System.out.println("02 --> 1000");
        Thread.sleep(500);
        System.out.println("01 --> 500");
        Thread.sleep(500);
        this.your_name=name;
    }
    public String get_your_name(){//method for getting user's name
        return this.your_name;
    }
}