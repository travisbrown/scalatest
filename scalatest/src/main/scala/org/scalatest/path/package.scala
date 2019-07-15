/*
 * Copyright 2001-2013 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.scalatest

/**
 * ScalaTest's old path package that contains deprecated alias for path style traits.
 */
package object path {

  @deprecated("Please use org.scalatest.freespec.PathAnyFreeSpecLike instead.")
  type FreeSpecLike = org.scalatest.freespec.PathAnyFreeSpecLike

  @deprecated("Please use org.scalatest.funspec.PathAnyFunSpecLike instead.")
  type FunSpecLike = org.scalatest.funspec.PathAnyFunSpecLike

  @deprecated("Please use org.scalatest.freespec.PathAnyFreeSpec instead.")
  type FreeSpec = org.scalatest.freespec.PathAnyFreeSpec

  @deprecated("Please use org.scalatest.funspec.PathAnyFunSpec instead.")
  type FunSpec = org.scalatest.funspec.PathAnyFunSpec
}
