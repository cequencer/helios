/*
 * Copyright (c) 2014 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.helios.servicescommon.coordination;

import org.apache.zookeeper.data.Stat;

public class Node {

  private final String path;
  private final byte[] bytes;
  private final Stat stat;

  public Node(final String path, final byte[] bytes, final Stat stat) {
    this.path = path;
    this.bytes = bytes;
    this.stat = stat;
  }

  public String getPath() {
    return path;
  }

  public byte[] getBytes() {
    return bytes;
  }

  public Stat getStat() {
    return stat;
  }
}
