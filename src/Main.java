//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    byte myByte = 122;
    short myShort = 30000;
    int myInt = 423412;
    long myLong = 35982569L;
    float myFloat = 3.1234f;
    double myDouble = 132.435236432d;
    boolean myBool = true;
    char myChar = 't';

    System.out.println(myByte);
    System.out.println(myShort);
    System.out.println(myInt);
    System.out.println(myLong);
    System.out.println(myFloat);
    System.out.println(myDouble);
    System.out.println(myBool);
    System.out.println(myChar);

    System.out.println("\n");

    float f = (float) myDouble;
    System.out.println(f);
    long l = (long) f;
    System.out.println(l);
    int i = (int) l;
    System.out.println(l);
    char c = (char) i;
    System.out.println(c);
    short s = (short) c;
    System.out.println(s);
    byte b = (byte) s;
    System.out.println(b);


    }
