class day2dtypeconversions {
    public static void main(String[] args) {

        //automatically converts no data loss(implict conversion)
      /*  int myint=9;
        double mydouble=myint;
        System.out.println(myint);
        System.out.println(mydouble);
        */

        //manually data lossed (explict conversion)
        double mydouble=9.78d;
        int myint=(int)mydouble;
        System.out.println(mydouble);
        System.out.println(myint);

    }
    
}
