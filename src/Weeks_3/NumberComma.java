package Weeks_3;

public class NumberComma {
    
   public static String stringPaserCommafy(String inputNum) {
       // ການເລີ່ມວາງຕົວແປ
        String commafiedNum = "";
        Character firstChar = inputNum.charAt(0);

        // ຝັງເຊີນການຈັດການສັນຍານບວກ/ລົບ
        if (firstChar == '+' || firstChar == '-') {
            commafiedNum = commafiedNum + Character.toString(firstChar);
            inputNum = inputNum.replaceAll("[-\\+]", "");
        }
           
        // ການແຍກສ່ວນຈຳນວນທົດສະນິຍົມ
        String[] splittedNum = inputNum.split("\\.");
        String decimalNum = "";
        if (splittedNum.length == 2) {
            inputNum = splittedNum[0];
            decimalNum = "." + splittedNum[1];
        }

        // ການເພີ່ມເຄື່ອງໝາຍເລກຈຸດ
        int numLength = inputNum.length();
        for (int i = 0; i < numLength; i++) {
            if ((numLength - i) % 3 == 0 && i != 0) {
                commafiedNum += ",";
            }
            commafiedNum += inputNum.charAt(i);
        }

        // ການລວມຈຳນວນເຕັມ ແລະຈຳນວນທົດສະນິຍົມ
        return commafiedNum + decimalNum;
    }
}