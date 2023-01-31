public class Variables {
    public static void main (String [] args){
        int myInt = 158923454;
        short myShort = 1234;  // ot -32000 do 32000...16 bit integers
        long myLong = 942338903;  // 64 bit information

        // Выше целочисленные типы данных


        // Ниже вещественные типы данных (неполные числа)

        double myDouble = 2345.46;  // 64 bit info...  for noninteger numbers (нецелые числа)
        float myFloat = 453.76f;  // 32 bit info... for noninteger numbers  (нецелые числа)

        char myChar = 'L';  // only 1 letter
        boolean myB = true; // logical var
        byte myByte = 127; // ot -128 do 127


        System.out.println(myInt - myShort - myLong + myFloat);
    }

}
