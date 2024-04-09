package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest  {
    @Test

    public void sumequal(){
        Main m=new Main();
        assertEquals(4,m.testing(2,2));
    }


}