public class controlFlows {
    public static void main(String[] args) {

        //Вежба 1:
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Вежба 2:
        String weekDay = "Wednesday";
        switch (weekDay) {
            case "Monday":
                System.out.println("The day is Monday");
                break;
            case "Tuesday":
                System.out.println("The day is Tuesday");
                break;
            case "Wednesday":
                System.out.println("The day is Wednesday");
                break;
            case "Thursday":
                System.out.println("The day is Thursday");
                break;
            case "Friday":
                System.out.println("The day is Friday");
                break;
            case "Saturday":
                System.out.println("The day is Saturday");
                break;
            case "Sunday":
                System.out.println("The day is Sunday");
                break;
        }

        //Вежба 3:
        int a = 1;
        int b = 0;
        while (a <= 10) {
            b = b + a;
            a++;
        }
        System.out.println(b);

        //Вежба 4:
        int num = 10;
        int n;
        for (n = 2; n <= num / 2; ++n) {
            if (num % n == 0) {
                System.out.println(num + " е сложен број.");
            } else {
                System.out.println(num + " е прост број.");
            }
            break;
        }
    }
}
