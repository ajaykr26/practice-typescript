package practice;

import com.google.gson.Gson;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class PracticeProgram {

    public static void main(String[] args) {
        int[] num = {2, 4,  6,8, 9};
        printMultipleMissingNum(num);
    }

    // find the multiple missing elements
    private static void printMultipleMissingNum(int[] num) {
        Arrays.sort(num);
        int d = num[0];
        int n = num.length;

        for (int i = 0; i < n; i++) {
            if (num[i] - i != d) {
                while (d < num[i] - i) {
                    System.out.print((i + d) + " ");
                    d++;
                }
            }
        }
    }

    //find the single missing element
    private static void printSingleMissingNum(int[] num) {
        Arrays.sort(num);
        int a = num[0];
        int n = num.length;
        int b = num[n - 1];
        int total = (a + b) * (n + 1) / 2;
        int sum = Arrays.stream(num).sum();
        System.out.println(total - sum);
    }

    //Java program to get all the permutation of a string
    public static Set<String> getPermutation(String string) {
        Set<String> permutations = new HashSet<String>();
        if (string == null) {
            return null;
        } else if (string.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = string.charAt(0);
        String sub = string.substring(1);
        Set<String> words = getPermutation(sub);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                permutations.add(word.substring(0, i) + first + word.substring(i));
            }
        }
        return permutations;
    }

    //Check if a List of integers contains only odd numbers?
    public static void isListContainsOdd(List<Integer> list) {
        boolean odd = true;
        for (int i : list) {
            if (i % 2 == 0) {
                odd = false;
                break;
            }
        }
        if (odd) System.out.println("Y");
        else System.out.println("N");
    }

    //Write a Java Program to find the count of words in a string using StringTokenizer
    public static void printWordCountUsingStringTokenizer(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        System.out.println(stringTokenizer.countTokens());
    }

    //Write a Java Program to find the count of words in a string using String Split
    public static void printWordCountUsingSplit(String string) {
        String[] strings = string.split(" ");
        System.out.println(strings.length);
    }

    //Java program to check if two strings are anagrams
    public static void isAnagrams(String stringOne, String stringTwo) {
        if (stringOne.length() == stringTwo.length()) {
            char[] charArrayOne = stringOne.toCharArray();
            char[] charArrayTwo = stringTwo.toCharArray();

            Arrays.sort(charArrayOne);
            Arrays.sort(charArrayTwo);
            boolean result = Arrays.equals(charArrayOne, charArrayTwo);
            if (result) {
                System.out.println(stringOne + " and " + stringTwo + " are anagram.");
            } else {
                System.out.println(stringOne + " and " + stringTwo + " are not anagram.");
            }
        } else {
            System.out.println(stringOne + " and " + stringTwo + " are not anagram.");
        }
    }

    //Find Count Of Repeating Character
    public static void printCountOfRepeatingCharacter(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : chars) {
            if (!map.containsKey(character)) map.put(character, 1);
            else map.put(character, map.get(character) + 1);
        }
        System.out.println(map);

        Character key = null;
        int val = 0;
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (me.getValue() > val) {
                key = me.getKey();
                val = me.getValue();
            }
        }
        System.out.println(key + ":" + val);
    }

    //Find Count Of Repeating Number
    public static void printCountOfRepeatingNumber(int[] ints) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : ints) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }
        System.out.println(map);
        int key = 0, val = 0;
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getValue() > val) {
                key = me.getKey();
                val = me.getValue();
            }
        }
        System.out.println(key + ":" + val);
    }

    //Find Count Of Repeating word
    public static void printCountOfRepeatingWord(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) map.put(string, 1);
            else map.put(string, map.get(string) + 1);
        }
        System.out.println(map);

        String key = null;
        int val = 0;
        for (Map.Entry<String, Integer> me : map.entrySet()) {
            if (me.getValue() > val) {
                key = me.getKey();
                val = me.getValue();
            }
        }
        System.out.println(key + ":" + val);
    }

    //Write a Java Program to swap two numbers using the third variable.
    public static void printSwappedValueUsingThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("%s %s%n", a, b);
    }

    //Write a Java Program to swap two numbers without using the third variable.
    public static void printSwappedValueWithoutUsingThirdVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("%s %s%n", a, b);
    }

    //Write a Java Program to find whether a string or number is palindrome or not.
    public static boolean isStringPalindrome(String string) {
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        return stringBuilder.toString().equals(string);
    }

    public static boolean isNumberPalindrome(int num) {
        int number = num;
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return number == reverse;
    }

    //How to remove leading and trailing whitespaces from a string?
    public static String removeLeadingTrailingWhiteSpace(String string) {
        return string.trim();
    }

    //string reverse
    public static String reverseStringUsingCharArray(String string) {
        char[] input = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length - 1; i >= 0; i--) {
            stringBuilder.append(input[i]);
        }
        return stringBuilder.toString();
    }

    public static String reverseStringUsingStringBuilder(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseStringUsingStringBuffer(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseStringUsingStringBytes(String string) {
        byte[] input = string.getBytes();
        byte[] out = new byte[string.length()];
        for (int i = 0; i <= string.length() - 1; i++) {
            out[i] = input[string.length() - i - 1];
        }
        return new String(out);
    }

    public static String reverseStringUsingStringSplit(String string) {
        String[] strings = string.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();
    }

    public static String reverseStringUsingSwapping(String string) {
        char[] input = string.toCharArray();
        char[] out = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            int j = string.length() - 1 - i;
            char temp = input[i];
            out[i] = input[j];
            input[j] = temp;
        }
        return new String(out);
    }

    //Write a Java Program to remove all white spaces from a string using replace().
    public static String removeWhiteSpaceUsingReplaceAll(String string) {
        return string.replaceAll("\\s", "");
    }

    //Write a Java Program to remove all white spaces from a string without using replace().
    public static String removeWhiteSpaceUsingChars(String string) {
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : chars) {
            if (!Character.isWhitespace(character)) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }

    //Write a Java Program to print fibonacci series
    public static String fibonacciSeries(int count) {
        int a, b = 1, c = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            a = b;
            b = c;
            c = a + b;
            if (i == count) stringBuilder.append(a);
            else stringBuilder.append(a).append(", ");
        }
        return stringBuilder.toString();
    }

    //Write a Java Program to find whether a number is prime or not.
    public static boolean isPrimeNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Java Program to check if a vowel is present in the string?
    public static boolean isStringContainsVowel(String string) {
        return string.toLowerCase().matches(".*[aeiou].*");
    }

    //Write a Java Program to print factorial
    public static int factorialUsingRecursion(int num) {
        if (num == 0) return 1;
        else return num * factorialUsingRecursion(num - 1);
    }

    //Write a Java Program to print factorial
    public static int factorialUsingWhileLoop(int num) {
        int factorial = 1;
        if (num != 0) {
            int i = num;
            while (num / i != num) {
                factorial = factorial * i;
                i--;
            }
        }
        return factorial;
    }

    public static void getExcelDataAsMap(String filepath, String worksheet) {
        Map<String, LinkedHashMap<String, Object>> dataMap = new LinkedHashMap<>();
        LinkedHashMap<String, Object> mapTemp = null;
        String dataset = null;
        Row headerRow = null;
        Object key = null;
        Object value = null;
        try (FileInputStream file = new FileInputStream(filepath);
             XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheet(worksheet);
            FormulaEvaluator formulaEvaluator = workbook.getCreationHelper().createFormulaEvaluator();
            int lastRow = sheet.getLastRowNum();
            int currentRowNum = 0;
            while (currentRowNum < lastRow) {
                headerRow = sheet.getRow(currentRowNum);

                dataset = getCellData(sheet.getRow(headerRow.getRowNum()).getCell(0), formulaEvaluator).toString();
                mapTemp = new LinkedHashMap<>();
                for (int cellCounter = 1; cellCounter < sheet.getRow(currentRowNum).getLastCellNum(); cellCounter++) {
                    key = getCellData(sheet.getRow(headerRow.getRowNum()).getCell(cellCounter), formulaEvaluator);
                    value = getCellData(sheet.getRow(currentRowNum + 1).getCell(cellCounter), formulaEvaluator);
                    if (value != null && key != null) {
                        mapTemp.put(key.toString(), value);
                    }
                }
                currentRowNum += 2;
                dataMap.put(dataset, mapTemp);
            }
        } catch (Exception exception) {
            System.out.print(exception);
        }
        System.out.println(dataMap);
    }

    private static Object getCellData(Cell cell, FormulaEvaluator formulaEvaluator) {
        Object obj = null;
        if (cell == null) return null;
        switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    obj = (new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue()));
                } else {
                    obj = (long) cell.getNumericCellValue();
                }
                break;
            case BLANK:
                obj = null;
                break;
            case STRING:
            default:
                obj = (cell.getStringCellValue());
        }
        return obj;
    }

    public static void loadPropsDataAsMap(String propsFilePath) throws ConfigurationException {
        File propsFile = new File(propsFilePath);
        PropertiesConfiguration props = new PropertiesConfiguration();
        props.load(propsFile);
        Iterator<String> iterator = props.getKeys();
        Map<String, String> map = new HashMap<>();
        while (iterator.hasNext()) {
            String key = iterator.next();
            map.put(key, props.getString(key));
        }
        System.out.println(map);
    }

    public static void loadJSONDataAsMap(String filepath) {
        Gson gson = new Gson();
        Map map = new HashMap<>();
        try {
            FileReader reader = new FileReader(filepath);
            map = gson.fromJson(reader, Map.class);
        } catch (FileNotFoundException ignored) {

        }
        System.out.println(map);

    }

    public static void loadJSONDataAsListOfMap(String filepath) {
        Gson gson = new Gson();
        List mapList = new ArrayList<>();
        try {
            FileReader reader = new FileReader(filepath);
            mapList = gson.fromJson(reader, List.class);
        } catch (FileNotFoundException ignored) {

        }
        System.out.println(mapList);

    }

}
