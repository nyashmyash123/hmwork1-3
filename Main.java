import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // task 1
        int countApples = 5;
        System.out.println("Значение переменной countApples с тиипом int равно" + countApples);
        byte countTyres = 3;
        System.out.println("Значение переменной countApples с тиипом byte равно" + countTyres);
        short countCats = 10;
        System.out.println("Значение переменной countApples с тиипом short равно" + countCats);
        long  twoBillions = 2_000_000_000;
        System.out.println("Значение переменной TwoBillions тиипом long равно" + twoBillions);
        float e = 2.1828f;
        System.out.println("Значение переменной e с тиипом float равно" + e);
        double pi = 2.1415;
        System.out.println("Значение переменной piс тиипом double равно" + pi);

        // task 2
        float flotatNumber = 27.12f;
        long  longNumber = 987687965549l;
        double doubleNumber = 2.786;
        short shortNumber = 569;
        char charNumber = 159;
        int intNumber = 27897;
        byte byteNumber = 67;

        // task 3
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int totalPaperCount = 480;

        int totalPupils = pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass;
        int papersPerPupil = totalPaperCount / totalPupils;
        System.out.println("На каждого ученика расчитано "+ papersPerPupil + "листов бумаги ");

        // task 4
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        int bottlesPerHour = bottlesPer20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 30;
        int bottlesPerMonth = bottlesPer3Days  * 10;
        System.out.println("За 20 минут машина произвела" + bottlesPer20Minutes + "штук бутылок");
        System.out.println("За сутки машина произвела" + bottlesPerDay + "штук бутылок");
        System.out.println("За 3 дня машина произвела" + bottlesPer3Days+ "штук бутылок");
        System.out.println("За месяц машина произвела" + bottlesPerMonth + "штук бутылок");

        // task 5;
        System.out.println("задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = whiteCansPerClass + totalClasses;
        int totalBrownCans = brownCansPerClass + totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // task 6
        System.out.println("Задача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int eggsCount = 4;
        int weightBananasUnit = 80;
        int weightMilksUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggUnit = 70;
        int totalWeightInGrams = bananasCount * weightBananasUnit + milkCount * weightMilksUnit + iceCreamCount * weightIceCreamUnit + eggsCount * weightEggUnit;
        double totalWeightInKg = totalWeightInGrams / 1_0000;
        System.out.println("Общий вес в граммах" + totalWeightInGrams + ", в кг " + totalWeightInKg);

        // task 7
        System.out.println("задача 7");
        int weightForLossInGrams = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDaysCount = (double) weightForLossInGrams / lossWeightPerDayMin;
        double minDaysCount = (double) weightForLossInGrams / lossWeightPerDayMax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDayMax) / 2D;
        double averageDayCount = weightForLossInGrams / lossWeightPerDayAverage;
        System.out.println("минимальное кол-во дней для похудения" + minDaysCount);
        System.out.println("максимальное кол-во дней для похудения" + maxDaysCount);
        System.out.println("среднее  кол-во дней для похудения " + averageDayCount);

        // task 8
        System.out.println("задача 8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        double indexPercent = 1.1;

        double newMashaSalary = mashaSalary * indexPercent;
        double newDenisSalary = denisSalary * indexPercent;
        double newKristinaSalary = kristinaSalary * indexPercent;

        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;

        double annualDenisSalary = 12 * denisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;

        double annualKristinaSalary = 12 * kristinaSalary;
        double newAnnualKristinaSalary = 12 * newKristinaSalary;
        System.out.println("маша теперь получвет " + newAnnualMashaSalary + " рублей. годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + "рублей");
        System.out.println("денис теперь получвет " + newAnnualDenisSalary + " рублей. годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + "рублей");
        System.out.println("маша теперь получвет " + newAnnualKristinaSalary + " рублей. годовой доход вырос на " + (newAnnualKristinaSalary - annualKristinaSalary) + "рублей");


















        
    }
}