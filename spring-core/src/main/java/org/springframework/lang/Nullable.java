/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.lang;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierNickname;
import javax.annotation.meta.When;
import java.lang.annotation.*;

/**
 * A common Spring annotation to declare that annotated elements can be {@code null} under
 * some circumstance.
 *
 * <p>Leverages JSR-305 meta-annotations to indicate nullability in Java to common
 * tools with JSR-305 support and used by Kotlin to infer nullability of Spring API.
 *
 * <p>Should be used at parameter, return value, and field level. Methods override should
 * repeat parent {@code @Nullable} annotations unless they behave differently.
 *
 * <p>Can be used in association with {@code @NonNullApi} or {@code @NonNullFields} to
 * override the default non-nullable semantic to nullable.
 *
 * <hr>
 * <p>
 * 一个常见的 Spring 注释，用于声明带注释的元素在某些情况下可以为null 。
 * <p>
 * 利用 JSR-305 元注释向支持 JSR-305 的常用工具指示 Java 中的可空性，并被 Kotlin 用于推断 Spring API 的可空性。
 * <p>
 * 应该在参数、返回值和字段级别使用。方法覆盖应该重复父@Nullable注释，除非它们的行为不同。
 * <p>
 * 可以与@NonNullApi或@NonNullFields结合使用，以将默认的不可空语义覆盖为可空。
 *
 * @author Sebastien Deleuze
 * @author Juergen Hoeller
 * @see NonNullApi
 * @see NonNullFields
 * @see NonNull
 * @since 5.0
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Nonnull(when = When.MAYBE)
@TypeQualifierNickname
public @interface Nullable {
}
