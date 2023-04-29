# Cookiecutter for Apache Beam Java 

If you want to clone this repository you can do so to modify the template for the starter Beam project.

This is a [cookiecutter](https://cookiecutter.readthedocs.io/en/stable/README.html), so you will need to modify the contents below `{{cookiecutter.project_slug}}`
in order to change the starter project that results from running cookiecutter.

## Before you begin

You should have a working Python 3 install. We recommend Python 3.9. As of this writing (April 2023), Python 3.9 is shipped with macOS Ventura (13.3.1).

Make sure you have a [Java](https://en.wikipedia.org/wiki/Java_%28programming_language%29) development environment ready.

If you don't, an easy way to install it is with [`sdkman`](https://sdkman.io).

```sh
# Install sdkman.
curl -s "https://get.sdkman.io" | bash

# Make sure you have Java 17 installed.
sdk install java 17.0.5-tem
```

## Project Structure

This cookiecutter will yield a Beam Java project using Gradle 7.6 as the build tool. It also 
comes with a minimal Cloud Build configuration.

## Source file structure

This is a very basic Apache Beam project to help you get started.

There are only two source files:

* [`src/main/java/com/example/App.java`](src/main/java/com/example/App.java): the application source file, containing the [`main` method](src/main/java/com/example/App.java). The _main class_ is `com.example.App`.
* [`src/test/java/com/example/AppTest.java`](src/test/java/com/example/AppTest.java): tests for the `App.java` file.

> ℹ️ Most build tools expect all the Java source files to be under `src/main/java/` and tests to be under `src/test/java/` by default.

### Build Tool: Gradle

[Gradle](https://gradle.org) is a build tool focused on flexibility and performance.

This is a build tool widely used by many projects, including Apache Beam itself.

```sh
sdk install gradle
```

A basic Gradle setup consists of a [`build.gradle`](build.gradle) file written in [Groovy](https://groovy-lang.org) or [Kotlin](https://kotlinlang.org).

```sh
# To do a simple run.
gradle run

# To run passing command line arguments.
gradle run --args=--inputText="🎉"

# To run the tests.
gradle test --info
```

To build a self-contained jar file, we need to configure the [`jar`](https://docs.gradle.org/current/dsl/org.gradle.api.tasks.bundling.Jar.html) task in the [`build.gradle`](build.gradle) file.

```sh
# Build a self-contained jar.
gradle jar

# Run the jar application.
java -jar build/pipeline.jar --inputText="🎉"
```

## GitHub Actions automated testing

This project already comes with automated testing via [GitHub Actions](https://github.com/features/actions).

To configure it, look at the [`.github/workflows/test.yaml`](.github/workflows/test.yaml) file.

## Using other runners

To keep this template small, it only includes the [Direct Runner](https://beam.apache.org/documentation/runners/direct/).

For a comparison of what each runner currently supports, look at the [Beam Capability Matrix](https://beam.apache.org/documentation/runners/capability-matrix/).

To add a new runner, visit the runner's page for instructions on how to include it.

## Contributing

Thank you for your interest in contributing!
All contributions are welcome! 🎉🎊

Please refer to the [`CONTRIBUTING.md`](CONTRIBUTING.md) file for more information.

# License

This software is distributed under the terms of both the MIT license and the
Apache License (Version 2.0).

See [LICENSE](LICENSE) for details.
