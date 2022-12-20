package com.paynewu.creation.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/payne-wu">payne-wu</a>
 * @date 16:16 2022/12/20
 * @project java-design-patterns
 * @description a lazy mode id generator
 */
public class Lazy {

  private static final AtomicLong ID = new AtomicLong();
  private static Lazy instance = new Lazy();

  private Lazy() {

  }

  public static synchronized Lazy getInstance() {
    if (instance == null) {
      instance = new Lazy();
    }
    return instance;
  }

  public static long getId() {
    return ID.incrementAndGet();
  }

}
