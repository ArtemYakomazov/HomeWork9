//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int[] cost = new int[5];
        cost[0] = 34678;
        cost[1] = 35263;
        cost[2] = 45372;
        cost[3] = 27463;
        cost[4] = 34876;
        int sumCost = 0;
        for (int i : cost) {
            sumCost = sumCost + i;
        }
        int maxSumCost = -1;
        if (sumCost > maxSumCost) {
            maxSumCost = sumCost;
        }
        System.out.println("Сумма трат за месяц составила " + maxSumCost + " рублей");

        //Task 2
        System.out.println("Task 2");

        int[] weekCost = {5000, 12000, 4000, 14500, 7000};
        int maxWeekCost = -1;
        int minWeekCost = 100000;
        for (int i : weekCost) {
            if (i > maxWeekCost) {
                maxWeekCost = i;
            }
            if (i < minWeekCost) {
                minWeekCost = i;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxWeekCost + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minWeekCost + " рублей");

        //Task 3
        System.out.println("Task 3");

        maxSumCost = maxSumCost / 5;
        System.out.println("Средняя сумма трат за месяц составила " + maxSumCost + " рублей");

        //Task 4
        System.out.println("Task 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}