package model;

import java.util.List;
import java.util.ArrayList;

public class Calculate {
    private final String delimiter="\\.|:";
    public int calculateNum(String read) {
        return addNum(getNums(read));
    }
    private int addNum(List<Integer> nums) {
        int ret = 0;
        for(Integer num : nums) {
            ret+=num;
        }
        return ret;
    }
    private List<Integer> getNums(String input){
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split(delimiter);
        for (String part : parts) {
            System.out.println(part);
            numbers.add(Integer.parseInt(part.trim()));
        }
        return numbers;
    }
}
