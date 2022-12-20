package com.paynewu.creation.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/payne-wu">payne-wu</a>
 * @date 16:33 2022/12/20
 * @project java-design-patterns
 * @description
 */
public enum Enumerate {
  /**
   * enum
   */
  INSTANCE;
  private final AtomicLong id = new AtomicLong(0);

  public long getId() {
    return id.incrementAndGet();
  }
}
