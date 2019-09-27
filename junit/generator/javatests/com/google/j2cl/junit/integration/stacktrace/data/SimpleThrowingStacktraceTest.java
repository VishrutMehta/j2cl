/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.j2cl.junit.integration.stacktrace.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Simple throwing test case */
@RunWith(JUnit4.class)
public class SimpleThrowingStacktraceTest extends StacktraceTestBase {
  @Test
  public void test() {
    method1();
  }

  public void method1() {
    method2();
  }

  public void method2() {
    method3();
  }

  public void method3() {
    if (true) {
      throw new RuntimeException("__the_message__!");
    }
  }
}
