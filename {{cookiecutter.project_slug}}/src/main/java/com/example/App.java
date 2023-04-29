// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
// https://www.apache.org/licenses/LICENSE-2.0> or the MIT license
// <LICENSE-MIT or https://opensource.org/licenses/MIT>, at your
// option. This file may not be copied, modified, or distributed
// except according to those terms.

package com.example;

import java.util.Arrays;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.gcp.pubsublite.PubsubLiteIO;
import org.apache.beam.sdk.io.gcp.pubsublite.SubscriberOptions;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.options.StreamingOptions;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TypeDescriptors;

import com.google.cloud.pubsublite.ProjectId;
import com.google.cloud.pubsublite.SubscriptionPath;

public class App {
	public interface Options extends StreamingOptions {
		@Description("Input text to print.")
		@Default.String("My input text")
		String getInputText();

		void setInputText(String value);
	}

	public static PCollection<String> buildPipeline(Pipeline pipeline, String inputText) {
		return pipeline
				.apply(PubsubLiteIO.read(
						SubscriberOptions
								.newBuilder()
								.setSubscriptionPath(SubscriptionPath.newBuilder()
										.setProject(ProjectId.of("zr-dev-vincegonzalez"))
										.setName(SubscriptionName.of(""))
										.build())
								.build()))
				// .apply("Create elements", Create.of(Arrays.asList("Hello", "World!", inputText)))
				.apply(null)
				.apply("Print elements",
						MapElements.into(TypeDescriptors.strings()).via(x -> {
							System.out.println(x);
							return x;
						}));
	}

	public static void main(String[] args) {
		var options = PipelineOptionsFactory.fromArgs(args).withValidation().as(Options.class);
		var pipeline = Pipeline.create(options);
		App.buildPipeline(pipeline, options.getInputText());
		pipeline.run().waitUntilFinish();
	}
}