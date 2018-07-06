import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Tests {

    OfflineExercises oe;

    @Before
    public void setup(){
         oe = new OfflineExercises();
    }

    @Test
    public void doubleChar(){
        OfflineExercises oe = new OfflineExercises();
        //String string = "string";
        //oe.doubleChar("string");
        assertEquals("ssttrriinngg", oe.doubleChar("string"));
    }


    @Test
    public void sandwich(){
        String input = "breadjambread";
        String result = "";
        int firstbread = input.indexOf("bread");
        int secondbread = input.lastIndexOf("bread");
        result = input.substring(firstbread+5, secondbread);
        oe.getSandwich(input);
        assertEquals("jam", oe.getSandwich("breadjambread"));
    }

    @Test
    public void evenSpaced(){
        int a = 1;
        int b = 2;
        int c = 3;
        assertEquals(true, oe.evenlySpaced(a, b, c));
    }


    @Test
    public void nTwice(){
        String string =  "string";
        int n = 2;
        String result = "";

        assertEquals("stng", oe.nTwice(string, n));
    }



    @Test
    public void endsLY(){
        String string = "string";
        String string2 = "stringly";
        assertEquals(false, oe.endsly(string));
        assertEquals(true, oe.endsly(string2));
    }

    @Test
    public void cleanTest(){
        String string = "striing";
        String hello = "helllo";
        assertEquals("string", oe.stringClean(string));
        assertEquals("helo", oe.stringClean(hello));
    }
}
