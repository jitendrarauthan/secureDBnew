/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.hku.sdb.plan;

import edu.hku.sdb.parse.ParseError;

import java.util.ArrayList;

/**
 * Created by Eric Haibin Lin on 23/3/15.
 */
public class NoResultFoundException extends Exception {

  private static final long serialVersionUID = 11323L;
  String error;

  public NoResultFoundException(String error) {
    super();
    this.error = error;
  }

  @Override
  public String getMessage() {
    return error;
  }

}
