package com.paynewu.creation.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/payne-wu">payne-wu</a>
 * @date 16:15 2022/12/20
 * @project java-design-patterns
 * @description A hunger mode id generator
 */
public class Hunger {

  private static final Hunger instance = new Hunger();
  private static final AtomicLong id = new AtomicLong();

  private Hunger() {

  }

  public static Hunger getInstance() {
    return instance;
  }

  public static long getId() {
    return id.incrementAndGet();
  }
}
