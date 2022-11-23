package level0;

public class 영어가_싫어요 {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long answer = 0;
        numbers = numbers.replaceAll("zero", "0");
        numbers = numbers.replaceAll("one", "1");
        numbers = numbers.replaceAll("two", "2");
        numbers = numbers.replaceAll("three", "3");
        numbers = numbers.replaceAll("four", "4");
        numbers = numbers.replaceAll("five", "5");
        numbers = numbers.replaceAll("six", "6");
        numbers = numbers.replaceAll("seven", "7");
        numbers = numbers.replaceAll("eight", "8");
        numbers = numbers.replaceAll("nine", "9");
        answer = Long.parseLong(numbers);
        System.out.println(answer);
    }
}
