package com.paynewu.creation.single;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author <a href="https://paynewu.com">PayneWu</a>
 * @github <a href="https://github.com/payne-wu">payne-wu</a>
 * @date 16:23 2022/12/20
 * @project java-design-patterns
 * @description
 */
public class Interior {

  private final AtomicLong id = new AtomicLong();

  private Interior() {
  }

  public static Interior getInstance() {
    return SingletonHolder.INSTANCE;
  }

  public long getId() {
    return id.incrementAndGet();
  }

  private static class SingletonHolder {

    private static final Interior INSTANCE = new Interior();
  }

}
