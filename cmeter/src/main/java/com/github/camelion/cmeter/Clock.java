/*
 * Copyright 2017 JTS-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.camelion.cmeter;

/**
 * @author Camelion
 * @since 08.08.17
 */
public final class Clock {
    public static Clock SYSTEM = new Clock();

    public long wallTime() {
        return System.currentTimeMillis();
    }

    public long monotonicTime() {
        return System.nanoTime();
    }
}