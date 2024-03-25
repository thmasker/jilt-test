package org.test;

import org.test.annotations.Builder;

@Builder
public class A {

  private final boolean aBoolean;
  private final int anInt;
  private final Object object;

  public A(final boolean aBoolean, final int anInt, final Object object) {
    this.aBoolean = aBoolean;
    this.anInt = anInt;
    this.object = object;
  }

  public static ABuilders.ABoolean builder() {
    return ABuilder.builder();
  }

}
