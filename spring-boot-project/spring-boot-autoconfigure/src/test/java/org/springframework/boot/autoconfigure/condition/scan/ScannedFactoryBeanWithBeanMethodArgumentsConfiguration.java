/*
 * Copyright 2012-present the original author or authors.
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

package org.springframework.boot.autoconfigure.condition.scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for a factory bean produced by a bean method with arguments on a
 * configuration class found through component scanning.
 *
 * @author Andy Wilkinson
 */
@Configuration(proxyBeanMethods = false)
public class ScannedFactoryBeanWithBeanMethodArgumentsConfiguration {

	@Bean
	public Foo foo() {
		return new Foo();
	}

	@Bean
	public ScanFactoryBean exampleBeanFactoryBean(Foo foo) {
		return new ScanFactoryBean("foo");
	}

	static class Foo {

	}

}
