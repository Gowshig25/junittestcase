package org.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StringHelperTest  {
@Test
    public void RemoveAInFirstTwoPosition(){
    Map<String,String> testCases=new HashMap<>();
    testCases.put("BB","AABB");
    testCases.put("B","AAB");
    testCases.put("BBAA","BBAA");
    testCases.put("","A");
    var m=new StringHelper();
    for(String key:testCases.keySet()){
        try{
            assertEquals(key,m.removeFirstTwoA(testCases.get(key)));
        }catch(AssertionError e){
            System.out.println("Test has failed");
        }
        System.out.println("Test case passed");
    }
}
}
/*
Inline is usedto replace the variable with the actual values


In exception we throwing :
@Test(exception=NullPointerException.class)
{
Where this must thrown an exception otherwise itwas false
}


//where the timeout:
@Test(timeout=1000)
public void check(){
where it need to complete within this time period
}
 */