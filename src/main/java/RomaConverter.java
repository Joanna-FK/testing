public class RomaConverter {

    public int value (String v) {
        switch (v) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return 0;
    }

    public int converter(String roma) {
        String[] stringTable = roma.split("");
        int result = 0;

        for (int i = 0; i < stringTable.length; i++) {
            boolean isAtEnd = i == stringTable.length - 1;
            if (!isAtEnd && value(stringTable[i]) < value(stringTable[i+1])) {
                result += value(stringTable[i]+1) - value(stringTable[i]);
            } else {
                result += value(stringTable[i]);
            }
        } return result;
    }
}
