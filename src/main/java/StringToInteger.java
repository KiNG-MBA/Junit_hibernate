

public class StringToInteger {


    public static Integer stringToInt(String text) {
        int digit = Integer.parseInt(text);

        if (text.matches("-?[1-9]\\d*|0"))
            throw new IllegalArgumentException("wow");
        else if (!(digit > -32768 && digit < 32767))
            throw new IndexOutOfBoundsException("Out of range!");
        return Integer.parseInt(text);

    }
}
