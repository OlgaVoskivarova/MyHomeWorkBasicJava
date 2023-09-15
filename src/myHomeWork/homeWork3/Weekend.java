package myHomeWork.homeWork3;

public class Weekend {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = true;

        boolean canWalk = weather(isWeekend, isRain);
        System.out.println(canWalk);
    }
    public static boolean weather(boolean weekend, boolean rain){
    //return weekend && !rain;
        return ((weekend == true) && (rain == false));

    }
}
