package com.tianxing.gradle;

import java.util.concurrent.atomic.*;

/**
 * Created by tianxing on 17/3/2.
 *
 */
public class AtomicTest {
    private AtomicBoolean aBoolean = new AtomicBoolean();
    private AtomicInteger integer = new AtomicInteger();
    private AtomicLong aLong = new AtomicLong();

    private AtomicReference<String> atomicReference = new AtomicReference<>();
}
