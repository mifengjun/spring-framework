/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * <p>This interface is typically used to encapsulate a generic factory which
 * returns a new instance (prototype) of some target object on each invocation.
 *
 * <p>This interface is similar to {@link FactoryBean}, but implementations
 * of the latter are normally meant to be defined as SPI instances in a
 * {@link BeanFactory}, while implementations of this class are normally meant
 * to be fed as an API to other beans (through injection). As such, the
 * {@code getObject()} method has different exception handling behavior.
 *
 * <hr>
 * 定义一个工厂，它可以在调用时返回一个 Object 实例（可能是共享的或独立的）。
 * <p>
 * 此接口通常用于封装通用工厂，该工厂在每次调用时返回某个目标对象的新实例（原型）。
 * <p>
 * 这个接口类似于FactoryBean ，但后者的实现通常意味着定义为BeanFactory中的 SPI 实例，而此类的实现通常意味着作为 API 提供给其他 bean（通过注入）。因此， getObject()方法具有不同的异常处理行为。
 *
 * @param <T> the object type
 * @author Colin Sampaleanu
 * @see FactoryBean
 * @since 1.0.2
 */
@FunctionalInterface
public interface ObjectFactory<T> {

	/**
	 * Return an instance (possibly shared or independent)
	 * of the object managed by this factory.
	 *
	 * <hr>
	 * 返回此工厂管理的对象的实例（可能是共享的或独立的）。
	 *
	 * @return the resulting instance
	 * @throws BeansException in case of creation errors
	 */
	T getObject() throws BeansException;

}
