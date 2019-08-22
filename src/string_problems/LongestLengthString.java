package string_problems;

public class LongestLengthString {
    public static void main(String[] args) {
        String input = "I am a developer";
        String inputArray[] = input.split(" ");
        int counter=0;
        int maxLength=0;
        String ch=null;
        for (int i = 0; i <inputArray.length ; i++) {
            counter=inputArray[i].length();
            if (counter>maxLength){
                maxLength=counter;
                ch=inputArray[i];
            }
            }
        System.out.println(maxLength);
        System.out.println(ch);

        }

    }
