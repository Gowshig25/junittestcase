package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ContinuousValueTest{

    @Test
    public void Test(){
        Map<Integer,Integer> lhs=new LinkedHashMap<>();
        lhs.put(4,4);
        var m=new ContinuousValue();
        assertEquals((Object) lhs.get(100), m.Testing(2, 2));
        // assertEquals(Optional.of(lhs.get(4)), Optional.of(m.Testing(2, 2)));
    }

}