package com.somaditya.katas.ds;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.HashMap;

public class CharFreqTest extends TestCase {
    public void testCharFreq()
    {
        CharFreq cf = new CharFreq();
        HashMap<Character, Integer> hm = cf.count("somaditya basak");
        
        assertEquals( Integer.valueOf(4), hm.get(Character.valueOf('a')) );
        assertEquals( Integer.valueOf(2), hm.get(Character.valueOf('s')) );
        assertEquals( Integer.valueOf(1), hm.get(Character.valueOf('d')) );
        assertEquals( Integer.valueOf(1), hm.get(Character.valueOf(' ')) );
    }
}
