/*
 * Copyright 2011 the original author or authors.
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

grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
	
	inherits("global"){}

	log "warn"

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile ('org.codehaus:gldapo:0.8.5'){transitive = false}
		compile ('com.ldaley:injecto:0.7'){transitive = false}
		compile ('com.sun:ldapbp:1.0'){transitive = false}
		compile ('org.springframework.ldap:spring-ldap:1.3.1.RELEASE'){transitive = false}

		test ('org.apache.directory.server:apacheds-all:1.5.4'){export = false}
		test ('org.apache.directory.shared:shared-asn1:0.9.12'){export = false}
		test ('org.apache.directory.shared:shared-ldap:0.9.12'){export = false}
		test ('org.apache.directory.shared:shared-ldap-constants:0.9.12'){export = false}
	}

	plugins {
		
	}
}
