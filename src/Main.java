import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        byte a = 2;
        short b = 290;
        int c = 3456;
        long d = 213445L;
        float e = 3.45456f;
        double f = 56.312094;
        System.out.println("Значение переменной (a) с типом byte равно " + a);
        System.out.println("Значение переменной (b) с типом short равно " + b);
        System.out.println("Значение переменной (c) с типом int равно " + c);
        System.out.println("Значение переменной (d) с типом long равно " + d);
        System.out.println("Значение переменной (e) с типом float равно " + e);
        System.out.println("Значение переменной (f) с типом double равно " + f);
        float one = 27.12f;
        long two = 987678965549L;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short students = (short) (teacher1 + teacher2 + teacher3);
        short paper = 480;
        short result = (short) (paper / students);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
        byte oneMinute = 16 / 2;
        byte time1 = 20;
        short performance1 = (short) (oneMinute * time1);
        System.out.println("За 20 минут машина призвела " + performance1 + " штук бутылок");
        short time2 = 24 * 60;
        short performance2 = (short) (time2 * oneMinute);
        System.out.println("За сутки машина призвела " + performance2 + " штук бутылок");
        short time3 = 24 * 60 * 3;
        int performance3 = (time3 * oneMinute);
        System.out.println("За 3 дня машина призвела " + performance3 + " штук бутылок");
        int time4 = 30 * time2;
        int performance4 = time4 * oneMinute;
        System.out.println("За 1 месяц машина призвела " + performance4 + " штук бутылок");
        byte allPaint = 120;
        byte amountOfWhitePaintPerClass = 2;
        byte amountOfBrownPaintPerClass = 4;
        byte amountOfPaintPerClass = (byte) (amountOfBrownPaintPerClass + amountOfWhitePaintPerClass);
        byte numberOfClasses = (byte) (allPaint / amountOfPaintPerClass);
        byte totalWhitePaint = (byte) (numberOfClasses * amountOfWhitePaintPerClass);
        byte totalBrownPaint = (byte) (numberOfClasses * amountOfBrownPaintPerClass);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        byte banana1 = 80;
        short bananas = (short) (5 * banana1);
        short milk100 = 105;
        short milk200 = (short) (milk100 * 2);
        byte icecram1 = 100;
        short icecream2 = (short) (icecram1 * 2);
        byte oneEgg = 70;
        short eggs = (short) (oneEgg * 4);
        short productWeight = (short) (bananas + milk200 + icecream2 + eggs);
        float productWeightKg = productWeight / 1000f;
        System.out.println("Общий вес спортзавтрака равен " + productWeight + " грамм");
        System.out.println("Общий вес спортзавтрака равен " + productWeightKg + " килограмм");
        short minWeightLoss = 250;
        short maxWeightLoss = 500;
        short weightLoss = (short) (7 * 1000);
        short avgWeightLoss = (short) ((maxWeightLoss + minWeightLoss) / 2);
        short period1 = (short) (weightLoss / minWeightLoss);
        short period2 = (short) (weightLoss / maxWeightLoss);
        short period3 = (short) (weightLoss / avgWeightLoss);
        System.out.println("За " + period1 + " дней спортсмен достигнет цели, при минимальном значении похудения в день");
        System.out.println("За " + period2 + " дней спортсмен достигнет цели, при максимальном значении похудения в день");
        System.out.println("За " + period3 + " дней спортсмен достигнет цели, при среднем значении похудения в день");
        int paydayM = 67760;
        int paydayD = 83690;
        int paydayK = 76230;
        int paydayMPlus = paydayM + ((paydayM / 100) * 10);
        int paydayDPlus = paydayD + ((paydayD / 100) * 10);
        int paydayKPlus = paydayK + ((paydayK / 100) * 10);
        int annualYieldM1 = paydayM * 12;
        int annualYieldM2 = paydayMPlus * 12;
        int annualYieldD1 = paydayD * 12;
        int annualYieldD2 = paydayDPlus * 12;
        int annualYieldK1 = paydayK * 12;
        int annualYieldK2 = paydayKPlus * 12;
        int differenceM = annualYieldM2 - annualYieldM1;
        int differenceD = annualYieldD2 - annualYieldD1;
        int differenceK = annualYieldK2 - annualYieldK1;
        System.out.println("Маша теперь получает " + paydayMPlus + " рублей. Годовой доход вырос на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + paydayDPlus + " рублей. Годовой доход вырос на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + paydayKPlus + " рублей. Годовой доход вырос на " + differenceK + " рублей");


        byte age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний.");
        }

        byte age2 = 12;
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ",то он не достиг совершеннолетия, нужно немного подождать.");
        }
        byte temp1 = 10;
        if (temp1 >= 5) {
            System.out.println("На улице " + temp1 + " градусов." + " Сегодня тепло, можно идти без шапки.");
        }
        byte temp2 = -13;
        if (temp2 < 5) {
            System.out.println("На улице " + temp2 + " градусов." + " На улице холодно, нужно надеть шапку.");
        }
        float speed1 = 60.1f;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + ", то придётся заплатить штраф");
        }
        byte speed2 = 49;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + ", то можно ехать спокойно");
        }
        byte people1 = 4;
        byte people2 = 13;
        byte people3 = 22;
        byte people4 = 25;
        if (people1 > 2 && people1 < 6) {
            System.out.println("Если возраст человека равен " + people1 + " лет, то ему нужно ходить в детский сад.");
        }
        if (people2 > 7 && people2 < 17) {
            System.out.println("Если возраст человека равен " + people2 + " лет, то ему нужно ходить в школу.");
        }
        if (people3 >= 18 && people3 < 24) {
            System.out.println("Если возраст человека равен " + people3 + " лет, то его место в университете.");
        }
        if (people4 > 24) {
            System.out.println("Если возраст человека равен " + people4 + " лет, то ему пора ходить на работу.");
        }

        byte child1 = 4;
        byte child2 = 8;
        byte child3 = 16;
        if (child1 < 5) {
            System.out.println("Если возраст ребенка равен " + child1 + " годам, то ему нельзя кататься на аттракционе.");
        }
        if (child2 > 5 && child2 < 14) {
            System.out.println("Если возраст ребенка равен " + child2 + " годам, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (child3 > 14) {
            System.out.println("Если возраст ребенка равен " + child3 + " годам, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        byte passengers1 = 101;
        byte passengers2 = 67;
        byte passengers3 = 34;
        if (passengers1 < 102) {
            System.out.println("Место в вагоне есть.");
        } else {
            System.out.println("Вагон полностью заполнен.");
        }
        if (passengers2 < 60) {
            System.out.println("Остались сидячие места.");
        } else {
            System.out.println("Остались только стоячие места.");
        }
        if (passengers3 > 60) {
            System.out.println("Остались стоячие места.");
        } else {
            System.out.println("Ещё остались сидячие места.");
        }

        int one1 = 1;
        int two2 = 2;
        int three3 = 3;
        boolean oneBiggerThanTwo = one1 > two2 ;
        boolean threeBiggerThanTwo = three3 > two2;
        if (oneBiggerThanTwo) {
            System.out.println("Логика дала сбой");
        }
        if (threeBiggerThanTwo){
            System.out.println("Наибольшим числом оказалось " + three3 + ".");
        } else {
            System.out.println("Ты запутался, парень.");
        }


    }
}
