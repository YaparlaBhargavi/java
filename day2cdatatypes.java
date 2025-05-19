class day2cdatatypes {
    public static void main(String[] args) {
        byte b=126;
        short s=32767;
        int i=786543;
        long l=65478953;
        float f=0.9876544f;
        double d=698.87655324678d;
        char h ='H';
        boolean a=true;
        boolean aa=false;


        System.out.println("byte: "+ b);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("char: "+ h);
        System.out.println("boolean:" + a);
        System.out.println("boolean:" + aa);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }
    
}
