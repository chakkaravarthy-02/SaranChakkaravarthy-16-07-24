public class ConvertNumbers {
    public static void main(String[] args) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten"};
        String[] tens = {"ten","twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety","hundred"};
        String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int value = 28888;
        StringBuilder ans = new StringBuilder();
        if(value>10 && value<20){
            int temp=value%10;
            System.out.println(teens[temp-1]);
            System.exit(0);
        }
        if (value >= 10000) {
            int num=value/1000;
            if(num>10 && num<20) {
                ans.append(teens[(num % 10) - 1]).append(" Thousand ");
                value %= 1000;
            }else if(num%10==0){
                ans.append(tens[(value/10000) - 1]).append(" thousand ");
                value %= 1000;
            }else {
                ans.append(tens[(value / 10000) - 1]).append(" ");
                value %= 10000;
            }
        }
        if (value >= 1000) {
            ans.append(ones[(value / 1000)-1]).append(" Thousand ");
            value %= 1000;
        }
        if (value > 100) {
            int temp=value/100;
            ans.append(ones[temp-1]).append(" hundred ");
            value %= 100;
        }if (value > 10) {
                ans.append(tens[(value / 10)-1]).append(" ");
                value %= 10;
        }
        if (value > 0 && value<=10) {
            ans.append(ones[value-1]);
        }
            System.out.println(ans);
        }
    }

