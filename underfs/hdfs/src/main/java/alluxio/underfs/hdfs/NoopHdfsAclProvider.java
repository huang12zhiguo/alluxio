/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.underfs.hdfs;

import alluxio.security.authorization.AccessControlList;

import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

/**
 * The noop HDFS ACL provider.
 */
public class NoopHdfsAclProvider implements HdfsAclProvider {
  @Override
  public AccessControlList getAcl(FileSystem hdfs, String path) throws IOException {
    return null;
  }

  @Override
  public void setAcl(FileSystem hdfs, String path, AccessControlList acl) throws IOException {
    // Noop for setAcl
  }

}
