package Lab_01_Class;

public class Nested_TO_Challenge
{
    public static void main(String[] args) {
        int Excellent= 90_100;
        int Goodresult=80_89;
        int Betterresult=70-79;
        int Suffiencientresult=60-69;
        int Poorresult=50_59;
        //result = condition1 ? expression1 : expression2;
        //expression - (condition2 ? expression2 : expression3)

        String result = Excellent>90 ? "A" :"B";
        String Fail = (Poorresult<67 ? "B" : "F");;

        System.out.println(result);
        System.out.println(Fail);
    }
}
