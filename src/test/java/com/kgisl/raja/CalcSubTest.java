package com.kgisl.raja;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.kgisl.raja.model.Calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalcSubTest {
    private int num1;
    private int num2;
    private int num3;

    public CalcSubTest(int num1,int num2,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {4, 2, 2},
                {8, 2, 6},
        });
    }
    
    @Test
    public void testSample(){
        assertEquals(Calculator.sub(num1, num2), num3);
    }
}