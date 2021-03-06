package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionDayOne {




    public String partOne(){
        int number = 0;
        List<String> numbersToAnalyse = new ArrayList<>(Arrays.asList(DATA.split("\n")));

        for(String s : numbersToAnalyse){
            int currentNumber = Integer.parseInt(s);
            if(currentNumber > 0){
                number += currentNumber;
            }else{
                number -= -currentNumber;
            }
        }

        return "The answer is: " + number;
    }

    public String partTwo(){
        int number = 0;
        List<Integer> frequency = new ArrayList<>();
        frequency.add(0);
        int dublicateNumber;
        List<String> numbersToAnalyse = new ArrayList<>(Arrays.asList(DATA.split("\n")));

        outerloop:
        while(true) {

            for (String s : numbersToAnalyse) {
                int currentNumber = Integer.parseInt(s);
                if (currentNumber > 0) {
                    number += currentNumber;
                } else {
                    number -= -currentNumber;
                }


                if (frequency.contains(number)) {
                    dublicateNumber = number;
                    break outerloop;
                } else {
                    frequency.add(number);
                }
            }

        }

        return "The first dublicate is: " + dublicateNumber;
    }


    private static final String DATA = "+7\n" +
            "-5\n" +
            "-9\n" +
            "-1\n" +
            "-3\n" +
            "+7\n" +
            "-8\n" +
            "-17\n" +
            "-4\n" +
            "-18\n" +
            "-15\n" +
            "+18\n" +
            "-11\n" +
            "-3\n" +
            "-15\n" +
            "+6\n" +
            "+17\n" +
            "-3\n" +
            "+19\n" +
            "+6\n" +
            "+4\n" +
            "-15\n" +
            "+18\n" +
            "-14\n" +
            "+8\n" +
            "-11\n" +
            "-7\n" +
            "-15\n" +
            "+19\n" +
            "-1\n" +
            "+10\n" +
            "+18\n" +
            "-1\n" +
            "+5\n" +
            "-12\n" +
            "+11\n" +
            "-5\n" +
            "+17\n" +
            "+9\n" +
            "-12\n" +
            "+7\n" +
            "+19\n" +
            "-9\n" +
            "+17\n" +
            "+12\n" +
            "-15\n" +
            "-12\n" +
            "+11\n" +
            "+14\n" +
            "-16\n" +
            "-13\n" +
            "+7\n" +
            "+5\n" +
            "-6\n" +
            "+20\n" +
            "-1\n" +
            "+8\n" +
            "-13\n" +
            "-6\n" +
            "-9\n" +
            "+4\n" +
            "+23\n" +
            "-5\n" +
            "-5\n" +
            "-19\n" +
            "+20\n" +
            "-6\n" +
            "+21\n" +
            "-4\n" +
            "+12\n" +
            "+10\n" +
            "-1\n" +
            "+16\n" +
            "+15\n" +
            "-12\n" +
            "-17\n" +
            "-3\n" +
            "+9\n" +
            "-19\n" +
            "-3\n" +
            "+7\n" +
            "-5\n" +
            "-7\n" +
            "-8\n" +
            "+2\n" +
            "+7\n" +
            "+16\n" +
            "-2\n" +
            "+13\n" +
            "+13\n" +
            "+20\n" +
            "-15\n" +
            "-10\n" +
            "-5\n" +
            "-1\n" +
            "+7\n" +
            "-15\n" +
            "+18\n" +
            "+3\n" +
            "-1\n" +
            "+16\n" +
            "-13\n" +
            "-1\n" +
            "-10\n" +
            "+15\n" +
            "-17\n" +
            "-18\n" +
            "-11\n" +
            "+1\n" +
            "+2\n" +
            "+7\n" +
            "+12\n" +
            "-14\n" +
            "+22\n" +
            "+14\n" +
            "+5\n" +
            "-13\n" +
            "-16\n" +
            "+25\n" +
            "+20\n" +
            "+2\n" +
            "+10\n" +
            "+16\n" +
            "-19\n" +
            "-1\n" +
            "-7\n" +
            "+3\n" +
            "+3\n" +
            "+10\n" +
            "+4\n" +
            "+16\n" +
            "+12\n" +
            "+8\n" +
            "+7\n" +
            "-12\n" +
            "-1\n" +
            "-7\n" +
            "+19\n" +
            "-4\n" +
            "+11\n" +
            "+18\n" +
            "-15\n" +
            "+12\n" +
            "+11\n" +
            "-10\n" +
            "-7\n" +
            "+12\n" +
            "-16\n" +
            "+2\n" +
            "-5\n" +
            "-5\n" +
            "+14\n" +
            "+9\n" +
            "+14\n" +
            "+19\n" +
            "+11\n" +
            "+6\n" +
            "+13\n" +
            "+14\n" +
            "+14\n" +
            "-6\n" +
            "-9\n" +
            "-9\n" +
            "-11\n" +
            "-5\n" +
            "-5\n" +
            "+15\n" +
            "-7\n" +
            "+1\n" +
            "-17\n" +
            "+7\n" +
            "-15\n" +
            "-7\n" +
            "+12\n" +
            "-6\n" +
            "-13\n" +
            "-19\n" +
            "+10\n" +
            "+5\n" +
            "-1\n" +
            "+6\n" +
            "+20\n" +
            "-12\n" +
            "-7\n" +
            "+18\n" +
            "-17\n" +
            "-15\n" +
            "-11\n" +
            "+16\n" +
            "+12\n" +
            "+13\n" +
            "-21\n" +
            "+9\n" +
            "+9\n" +
            "+11\n" +
            "-2\n" +
            "-13\n" +
            "-1\n" +
            "-6\n" +
            "+4\n" +
            "-16\n" +
            "+2\n" +
            "-5\n" +
            "+23\n" +
            "-13\n" +
            "-12\n" +
            "-19\n" +
            "+2\n" +
            "+2\n" +
            "-12\n" +
            "-6\n" +
            "+1\n" +
            "-21\n" +
            "-16\n" +
            "-18\n" +
            "+5\n" +
            "+18\n" +
            "+4\n" +
            "-11\n" +
            "+17\n" +
            "+3\n" +
            "+6\n" +
            "-1\n" +
            "-4\n" +
            "-18\n" +
            "+2\n" +
            "-4\n" +
            "-3\n" +
            "-15\n" +
            "-6\n" +
            "-1\n" +
            "-13\n" +
            "+10\n" +
            "+15\n" +
            "+6\n" +
            "+20\n" +
            "+18\n" +
            "-9\n" +
            "+11\n" +
            "-3\n" +
            "-18\n" +
            "-16\n" +
            "-1\n" +
            "+20\n" +
            "-7\n" +
            "+19\n" +
            "-24\n" +
            "+20\n" +
            "+12\n" +
            "+22\n" +
            "-15\n" +
            "+24\n" +
            "-21\n" +
            "+3\n" +
            "+13\n" +
            "-15\n" +
            "+23\n" +
            "+37\n" +
            "+9\n" +
            "+18\n" +
            "+3\n" +
            "-11\n" +
            "+20\n" +
            "+4\n" +
            "+15\n" +
            "+14\n" +
            "-5\n" +
            "+7\n" +
            "-6\n" +
            "+9\n" +
            "-2\n" +
            "-9\n" +
            "+12\n" +
            "+11\n" +
            "-18\n" +
            "+8\n" +
            "-15\n" +
            "+16\n" +
            "-7\n" +
            "+11\n" +
            "+11\n" +
            "+1\n" +
            "-8\n" +
            "+6\n" +
            "-8\n" +
            "+18\n" +
            "-21\n" +
            "+9\n" +
            "-7\n" +
            "+12\n" +
            "+4\n" +
            "+13\n" +
            "+15\n" +
            "+5\n" +
            "-10\n" +
            "-4\n" +
            "+10\n" +
            "-3\n" +
            "+24\n" +
            "-14\n" +
            "+10\n" +
            "+7\n" +
            "-11\n" +
            "-20\n" +
            "+19\n" +
            "+6\n" +
            "+7\n" +
            "+12\n" +
            "+1\n" +
            "+1\n" +
            "-7\n" +
            "+1\n" +
            "+20\n" +
            "+25\n" +
            "-14\n" +
            "-20\n" +
            "-15\n" +
            "-19\n" +
            "-23\n" +
            "-14\n" +
            "+9\n" +
            "-30\n" +
            "-13\n" +
            "-13\n" +
            "-20\n" +
            "+11\n" +
            "+15\n" +
            "-3\n" +
            "-9\n" +
            "+13\n" +
            "-12\n" +
            "-10\n" +
            "-9\n" +
            "+2\n" +
            "+19\n" +
            "-8\n" +
            "+3\n" +
            "-6\n" +
            "+18\n" +
            "-5\n" +
            "+15\n" +
            "-16\n" +
            "-10\n" +
            "-15\n" +
            "-6\n" +
            "-5\n" +
            "-10\n" +
            "+18\n" +
            "-16\n" +
            "+25\n" +
            "-15\n" +
            "-18\n" +
            "+12\n" +
            "+19\n" +
            "-12\n" +
            "+4\n" +
            "+6\n" +
            "+9\n" +
            "-27\n" +
            "-60\n" +
            "-48\n" +
            "-4\n" +
            "+2\n" +
            "-17\n" +
            "-12\n" +
            "+11\n" +
            "-18\n" +
            "-9\n" +
            "+5\n" +
            "-6\n" +
            "-28\n" +
            "+3\n" +
            "-13\n" +
            "+35\n" +
            "+5\n" +
            "+25\n" +
            "-22\n" +
            "-35\n" +
            "-15\n" +
            "-27\n" +
            "-10\n" +
            "-9\n" +
            "-64\n" +
            "-9\n" +
            "+10\n" +
            "-3\n" +
            "-25\n" +
            "+9\n" +
            "-14\n" +
            "-83\n" +
            "+11\n" +
            "+61\n" +
            "-8\n" +
            "-8\n" +
            "+12\n" +
            "+50\n" +
            "-20\n" +
            "-165\n" +
            "+7\n" +
            "-65\n" +
            "-3\n" +
            "-5\n" +
            "+281\n" +
            "+56\n" +
            "+121\n" +
            "-55464\n" +
            "+8\n" +
            "-9\n" +
            "-15\n" +
            "-3\n" +
            "-16\n" +
            "+10\n" +
            "-11\n" +
            "+9\n" +
            "+5\n" +
            "+4\n" +
            "+7\n" +
            "-20\n" +
            "-15\n" +
            "-1\n" +
            "-10\n" +
            "-11\n" +
            "+12\n" +
            "-11\n" +
            "+16\n" +
            "+21\n" +
            "-3\n" +
            "+4\n" +
            "+1\n" +
            "-9\n" +
            "-2\n" +
            "-6\n" +
            "-7\n" +
            "+9\n" +
            "-11\n" +
            "-1\n" +
            "-4\n" +
            "+15\n" +
            "-4\n" +
            "-13\n" +
            "-1\n" +
            "-1\n" +
            "+10\n" +
            "-17\n" +
            "-15\n" +
            "-17\n" +
            "+11\n" +
            "+9\n" +
            "+3\n" +
            "-9\n" +
            "+13\n" +
            "+2\n" +
            "-3\n" +
            "-17\n" +
            "+19\n" +
            "-16\n" +
            "-4\n" +
            "+8\n" +
            "-3\n" +
            "+5\n" +
            "-12\n" +
            "+16\n" +
            "+8\n" +
            "-15\n" +
            "-19\n" +
            "-8\n" +
            "-3\n" +
            "-13\n" +
            "-5\n" +
            "-16\n" +
            "+3\n" +
            "+2\n" +
            "+10\n" +
            "-5\n" +
            "+2\n" +
            "+14\n" +
            "+10\n" +
            "+8\n" +
            "-11\n" +
            "+2\n" +
            "-6\n" +
            "+9\n" +
            "+8\n" +
            "+7\n" +
            "+6\n" +
            "-3\n" +
            "-6\n" +
            "-11\n" +
            "+12\n" +
            "-23\n" +
            "-11\n" +
            "+13\n" +
            "+22\n" +
            "+18\n" +
            "+21\n" +
            "+18\n" +
            "+19\n" +
            "+6\n" +
            "-3\n" +
            "+5\n" +
            "+17\n" +
            "+7\n" +
            "-4\n" +
            "+13\n" +
            "-5\n" +
            "+13\n" +
            "+18\n" +
            "+10\n" +
            "-7\n" +
            "+12\n" +
            "+11\n" +
            "-10\n" +
            "-7\n" +
            "+14\n" +
            "+6\n" +
            "-16\n" +
            "+20\n" +
            "+16\n" +
            "-1\n" +
            "+6\n" +
            "-14\n" +
            "+15\n" +
            "-2\n" +
            "-25\n" +
            "+13\n" +
            "+39\n" +
            "-11\n" +
            "-9\n" +
            "+34\n" +
            "-60\n" +
            "-14\n" +
            "-22\n" +
            "-27\n" +
            "-12\n" +
            "-10\n" +
            "+3\n" +
            "+20\n" +
            "+3\n" +
            "+8\n" +
            "+7\n" +
            "-10\n" +
            "-14\n" +
            "+12\n" +
            "+9\n" +
            "-6\n" +
            "+8\n" +
            "-19\n" +
            "-10\n" +
            "-16\n" +
            "-14\n" +
            "+16\n" +
            "-4\n" +
            "-20\n" +
            "+10\n" +
            "-17\n" +
            "-9\n" +
            "-15\n" +
            "+16\n" +
            "+11\n" +
            "-20\n" +
            "-11\n" +
            "-14\n" +
            "-28\n" +
            "-16\n" +
            "-2\n" +
            "+21\n" +
            "-18\n" +
            "+17\n" +
            "+5\n" +
            "-6\n" +
            "-18\n" +
            "-15\n" +
            "-14\n" +
            "+15\n" +
            "+11\n" +
            "-16\n" +
            "-5\n" +
            "+19\n" +
            "-12\n" +
            "-15\n" +
            "-1\n" +
            "+11\n" +
            "-16\n" +
            "+11\n" +
            "+15\n" +
            "-19\n" +
            "+3\n" +
            "-9\n" +
            "-2\n" +
            "-9\n" +
            "+1\n" +
            "-5\n" +
            "+7\n" +
            "+11\n" +
            "+24\n" +
            "+14\n" +
            "+4\n" +
            "+17\n" +
            "-46\n" +
            "-5\n" +
            "-17\n" +
            "-8\n" +
            "-10\n" +
            "-12\n" +
            "-5\n" +
            "+10\n" +
            "+3\n" +
            "+9\n" +
            "+14\n" +
            "+7\n" +
            "-6\n" +
            "-16\n" +
            "+17\n" +
            "-18\n" +
            "+14\n" +
            "-10\n" +
            "+18\n" +
            "-17\n" +
            "-11\n" +
            "-17\n" +
            "-12\n" +
            "-15\n" +
            "-2\n" +
            "-4\n" +
            "-9\n" +
            "-13\n" +
            "+10\n" +
            "+4\n" +
            "-3\n" +
            "-9\n" +
            "-5\n" +
            "+7\n" +
            "+11\n" +
            "-17\n" +
            "-21\n" +
            "+9\n" +
            "+17\n" +
            "+17\n" +
            "+13\n" +
            "+12\n" +
            "-3\n" +
            "-3\n" +
            "+18\n" +
            "-5\n" +
            "+12\n" +
            "+10\n" +
            "+3\n" +
            "+10\n" +
            "+24\n" +
            "+21\n" +
            "+13\n" +
            "+22\n" +
            "+19\n" +
            "+72\n" +
            "+7\n" +
            "+11\n" +
            "-15\n" +
            "-5\n" +
            "+6\n" +
            "+83\n" +
            "+8\n" +
            "-153\n" +
            "+24\n" +
            "+8\n" +
            "+39\n" +
            "+43\n" +
            "-265\n" +
            "-17\n" +
            "+18\n" +
            "-4\n" +
            "-12\n" +
            "+7\n" +
            "-4\n" +
            "-2\n" +
            "+18\n" +
            "+12\n" +
            "+11\n" +
            "-7\n" +
            "-9\n" +
            "-4\n" +
            "+10\n" +
            "+15\n" +
            "+25\n" +
            "-20\n" +
            "-16\n" +
            "-22\n" +
            "-21\n" +
            "-11\n" +
            "+2\n" +
            "+13\n" +
            "+20\n" +
            "+10\n" +
            "+12\n" +
            "-6\n" +
            "-23\n" +
            "+3\n" +
            "-17\n" +
            "-7\n" +
            "+15\n" +
            "-19\n" +
            "-10\n" +
            "-8\n" +
            "-2\n" +
            "-8\n" +
            "-2\n" +
            "-6\n" +
            "+5\n" +
            "+7\n" +
            "-5\n" +
            "-3\n" +
            "-3\n" +
            "-15\n" +
            "+4\n" +
            "+5\n" +
            "+15\n" +
            "-12\n" +
            "-16\n" +
            "-13\n" +
            "+15\n" +
            "-4\n" +
            "-9\n" +
            "+12\n" +
            "-8\n" +
            "+2\n" +
            "+19\n" +
            "-4\n" +
            "+1\n" +
            "-23\n" +
            "-9\n" +
            "-10\n" +
            "-2\n" +
            "+5\n" +
            "-10\n" +
            "+2\n" +
            "-3\n" +
            "-10\n" +
            "-15\n" +
            "+19\n" +
            "-7\n" +
            "-9\n" +
            "-17\n" +
            "+10\n" +
            "-18\n" +
            "+16\n" +
            "-14\n" +
            "+7\n" +
            "-10\n" +
            "+12\n" +
            "+3\n" +
            "-7\n" +
            "+12\n" +
            "+21\n" +
            "-5\n" +
            "-11\n" +
            "-7\n" +
            "+3\n" +
            "+11\n" +
            "-16\n" +
            "+15\n" +
            "+14\n" +
            "+17\n" +
            "+8\n" +
            "-2\n" +
            "-1\n" +
            "+19\n" +
            "+10\n" +
            "+11\n" +
            "+22\n" +
            "-1\n" +
            "+18\n" +
            "+12\n" +
            "-19\n" +
            "-5\n" +
            "+17\n" +
            "-4\n" +
            "-4\n" +
            "+19\n" +
            "-46\n" +
            "-22\n" +
            "-11\n" +
            "+19\n" +
            "-12\n" +
            "-19\n" +
            "-11\n" +
            "-17\n" +
            "-15\n" +
            "-42\n" +
            "-11\n" +
            "-4\n" +
            "+20\n" +
            "+6\n" +
            "-38\n" +
            "+8\n" +
            "-58\n" +
            "+5\n" +
            "-11\n" +
            "-60\n" +
            "-7\n" +
            "-61\n" +
            "-5\n" +
            "+36\n" +
            "-82\n" +
            "-3\n" +
            "-35\n" +
            "-11\n" +
            "+33\n" +
            "-51\n" +
            "-17\n" +
            "+9\n" +
            "-277\n" +
            "+251\n" +
            "-55001\n" +
            "+3\n" +
            "-11\n" +
            "+1\n" +
            "+13\n" +
            "+3\n" +
            "-15\n" +
            "+1\n" +
            "+2\n" +
            "+7\n" +
            "-16\n" +
            "+13\n" +
            "+9\n" +
            "+18\n" +
            "-1\n" +
            "-10\n" +
            "+5\n" +
            "+17\n" +
            "-9\n" +
            "+2\n" +
            "+10\n" +
            "+18\n" +
            "+19\n" +
            "+3\n" +
            "-9\n" +
            "-18\n" +
            "-4\n" +
            "+6\n" +
            "-13\n" +
            "+6\n" +
            "+19\n" +
            "+15\n" +
            "+14\n" +
            "-13\n" +
            "+17\n" +
            "+14\n" +
            "-3\n" +
            "-7\n" +
            "-16\n" +
            "-9\n" +
            "+16\n" +
            "-5\n" +
            "-12\n" +
            "+19\n" +
            "+16\n" +
            "-15\n" +
            "+12\n" +
            "-5\n" +
            "+7\n" +
            "-20\n" +
            "-6\n" +
            "-1\n" +
            "+6\n" +
            "-7\n" +
            "+17\n" +
            "+22\n" +
            "+7\n" +
            "-13\n" +
            "+8\n" +
            "+16\n" +
            "+14\n" +
            "-18\n" +
            "+12\n" +
            "-4\n" +
            "-1\n" +
            "+10\n" +
            "-15\n" +
            "+14\n" +
            "+11\n" +
            "+9\n" +
            "-14\n" +
            "-3\n" +
            "+10\n" +
            "-8\n" +
            "-8\n" +
            "-16\n" +
            "+18\n" +
            "-4\n" +
            "+17\n" +
            "-3\n" +
            "-22\n" +
            "-18\n" +
            "-20\n" +
            "+19\n" +
            "-6\n" +
            "+14\n" +
            "-1\n" +
            "+4\n" +
            "+15\n" +
            "-4\n" +
            "+24\n" +
            "-31\n" +
            "-10\n" +
            "+7\n" +
            "-24\n" +
            "-1\n" +
            "+8\n" +
            "+4\n" +
            "-21\n" +
            "+8\n" +
            "-4\n" +
            "-16\n" +
            "+2\n" +
            "+4\n" +
            "-18\n" +
            "+6\n" +
            "-5\n" +
            "-19\n" +
            "-6\n" +
            "-5\n" +
            "-13\n" +
            "+17\n" +
            "+15\n" +
            "-5\n" +
            "+4\n" +
            "+2\n" +
            "-19\n" +
            "+12\n" +
            "-16\n" +
            "-8\n" +
            "-11\n" +
            "+3\n" +
            "+14\n" +
            "-5\n" +
            "+8\n" +
            "+17\n" +
            "-5\n" +
            "-11\n" +
            "+23\n" +
            "+2\n" +
            "-18\n" +
            "-30\n" +
            "-11\n" +
            "+5\n" +
            "+15\n" +
            "-14\n" +
            "-17\n" +
            "+13\n" +
            "+19\n" +
            "+2\n" +
            "-15\n" +
            "-7\n" +
            "-18\n" +
            "-14\n" +
            "-3\n" +
            "-2\n" +
            "-6\n" +
            "-12\n" +
            "+1\n" +
            "+20\n" +
            "+5\n" +
            "+2\n" +
            "-3\n" +
            "-20\n" +
            "-3\n" +
            "+9\n" +
            "-15\n" +
            "-4\n" +
            "-6\n" +
            "+2\n" +
            "+3\n" +
            "+19\n" +
            "+17\n" +
            "-3\n" +
            "-18\n" +
            "-17\n" +
            "-20\n" +
            "+14\n" +
            "+2\n" +
            "-18\n" +
            "+13\n" +
            "+13\n" +
            "-21\n" +
            "-13\n" +
            "-4\n" +
            "-18\n" +
            "+11\n" +
            "+1\n" +
            "+3\n" +
            "+10\n" +
            "-15\n" +
            "-4\n" +
            "-7\n" +
            "-2\n" +
            "-16\n" +
            "-11\n" +
            "-10\n" +
            "-5\n" +
            "+6\n" +
            "+1\n" +
            "-12\n" +
            "-8\n" +
            "-5\n" +
            "-10\n" +
            "+1\n" +
            "+5\n" +
            "+15\n" +
            "-14\n" +
            "-5\n" +
            "-3\n" +
            "-14\n" +
            "+19\n" +
            "+111653";
}
