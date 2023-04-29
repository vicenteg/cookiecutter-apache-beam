// Copyright {{cookiecutter.year}} Google LLC
//
// Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
// https://www.apache.org/licenses/LICENSE-2.0> or the MIT license
// <LICENSE-MIT or https://opensource.org/licenses/MIT>, at your
// option. This file may not be copied, modified, or distributed
// except according to those terms.

package {{cookiecutter.java_package}};

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.testing.PAssert;
import org.apache.beam.sdk.testing.TestPipeline;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class {{cookiecutter.main_class}}Test {
	@Rule
	public final transient TestPipeline pipeline = TestPipeline.create();

	@Test
	public void appRuns() {
		var elements = {{cookiecutter.main_class}}.buildPipeline(pipeline, "Test");

		// Note that the order of the elements doesn't matter.
		PAssert.that(elements).containsInAnyOrder("Test", "Greetings!");
		pipeline.run().waitUntilFinish();
	}
}
