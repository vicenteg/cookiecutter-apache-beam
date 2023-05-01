# Cookiecutter for Apache Beam Java 

This is an opinionated [cookiecutter](https://cookiecutter.readthedocs.io/en/stable/README.html) repository for Apache Beam Java.

This project uses Gradle as the build tool, and Cloud Build for basic CI.

## Before you begin

You should have a working Python 3 install. We recommend Python 3.9. As of this writing (April 2023), Python 3.9 is shipped with macOS Ventura (13.3.1).

Make sure you have a [Java](https://en.wikipedia.org/wiki/Java_%28programming_language%29) development environment ready. If you don't, an easy way to install one is with [`sdkman`](https://sdkman.io).

```sh
# Install sdkman.
curl -s "https://get.sdkman.io" | bash

# Make sure you have Java 17 installed.
sdk install java 17.0.5-tem
```

This template also assumes you will use [Gradle](https://gradle.org). Gradle is a build tool focused on flexibility and performance. Gradle is widely used by many projects, including Apache Beam itself, and is generally considered more modern and user-friendly than Maven. We use the Groovy DSL in this project.

Install Gradle using sdkman:

```sh
sdk install gradle 7.6
```

# Usage

## Install cookiecutter

```sh
pip install --user cookiecutter
```

## Quickstart

To get a generic project quickly and test that it builds:

```sh
cookiecutter --no-input https://github.com/vicenteg/cookiecutter-apache-beam --directory=beam-java
cd my-beam-starter-project
gradle build test run
```

You can also check that it works on Cloud Build:

```sh
gcloud builds submit
```

## Generate your customized project

We recommend you follow the prompts to customize the project. Eliminating the `--no-input` option will cause cookiecutter to prompt you interactively.

```sh
cookiecutter https://github.com/vicenteg/cookiecutter-beam-java
```

# Build and test the project

```sh
cd `{{your-project-name}}`
gradle build test run
```

The project should build successfully, and show you some output. Now you can get to work!

# About the Cookiecutter template

## Project Structure

This cookiecutter will yield a Beam Java project using Gradle 7.6 as the build tool. It also 
comes with a minimal Cloud Build configuration.

## Source file structure

This is a very basic Apache Beam project to help you get started.

There are only two source files:

* [`src/main/java/com/example/App.java`](src/main/java/com/example/App.java): the application source file, containing the [`main` method](src/main/java/com/example/App.java). The _main class_ is `com.example.App`.
* [`src/test/java/com/example/AppTest.java`](src/test/java/com/example/AppTest.java): tests for the `App.java` file.

> ℹ️ Most build tools expect all the Java source files to be under `src/main/java/` and tests to be under `src/test/java/` by default.

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


## Using other runners

To keep this template small, it only includes the [Direct Runner](https://beam.apache.org/documentation/runners/direct/).

For a comparison of what each runner currently supports, look at the [Beam Capability Matrix](https://beam.apache.org/documentation/runners/capability-matrix/).

To add a new runner, visit the runner's page for instructions on how to include it.
