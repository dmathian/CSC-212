/*
* program to check out (view and possibly listen to) the eight melodic
* sequences classified as "Basic" sequences in the Modular Melody World
 */


package mmw;

import composer.SComposer;

public class BasicsListener {

    public static void main(String [] args ) {
        SComposer c = new SComposer();
        c.text();
       System.out.println("c.mms1 ..."); c.mms1(); space(c);
       System.out.println("c.mms2 ..."); c.mms1(); space(c);
       System.out.println("c.mms3 ..."); c.mms1(); space(c);
       System.out.println("c.mms4 ..."); c.mms1(); space(c);
       System.out.println("c.mms5 ..."); c.mms1(); space(c);
       System.out.println("c.mms6 ..."); c.mms1(); space(c);
       System.out.println("c.mms7 ..."); c.mms1(); space(c);
       System.out.println("c.mms8 ..."); c.mms1(); space(c);
       c.untext();
    }

    private static void space(SComposer c) {

        c.untext(); c.rest(2); c.text();
    }
}
