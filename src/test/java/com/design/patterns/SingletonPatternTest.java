package com.design.patterns;

import com.design.patterns.singleton.SingletonExample;
import org.junit.Assert;
import org.junit.Test;

public class SingletonPatternTest {

    @Test
    public void shouldCreateSingletonInstance() {
        // then
        Assert.assertNotNull(SingletonExample.getInstance());
    }
}
