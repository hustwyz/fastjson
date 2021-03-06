package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class TestASM_byte extends TestCase {

    public void test_asm() throws Exception {
        V0 v = new V0();
        String text = JSON.toJSONString(v);
        V0 v1 = JSON.parseObject(text, V0.class);
        
        Assert.assertEquals(v.getI(), v1.getI());
    }

    public static class V0 {

        private byte i = 12;

        public byte getI() {
            return i;
        }

        public void setI(byte i) {
            this.i = i;
        }

    }
}
