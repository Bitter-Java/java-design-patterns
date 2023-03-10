package com.paynewu.creation.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/payne-wu">payne-wu</a>
 * @date 16:24 2022/12/20
 * @project java-design-patterns
 * @description
 */
public class DoubleCheck {

  private static final AtomicLong ID = new AtomicLong();
  private static volatile DoubleCheck INSTANCE = new DoubleCheck();

  private DoubleCheck() {

  }

  public static DoubleCheck getInstance() {
    if (INSTANCE == null) {
      synchronized (DoubleCheck.class) {
        if (INSTANCE == null) {
          INSTANCE = new DoubleCheck();
        }
      }
    }
    return INSTANCE;
  }

  public static long getId() {
    return ID.incrementAndGet();
  }
}
