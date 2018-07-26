
public class FizzBuzz {

    public String sendAndReturn(int number) {
        String result;
        if (หาร3และ5ลงตัว(number)) {
            result = "FizzBuzz";
        } else if (หาร3ลงตัว(number)) {
            result = "Fizz";
        } else if (หาร5ลงตัว(number)) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }

    private boolean หาร3และ5ลงตัว(int number) {
        return หาร3ลงตัว(number) && หาร5ลงตัว(number);
    }

    private boolean หาร3ลงตัว(int number) {
        return number % 3 == 0;
    }

    private boolean หาร5ลงตัว(int number) {
        return number % 5 == 0;
    }

}
