
# {{cookiecutter.project_slug}} | Apache Beam Java

## Quickstart

### Cloud Build

Your new project, `{{cookiecutter.project_slug}}` is ready! Check that it builds on Cloud Build. If you have not already, [set up Cloud Build](https://cloud.google.com/build/docs/set-up).

```sh
gcloud builds submit
```

The project should build successfully, and show you some output. You can modify the project from here.

### Local Build

You can also build it locally, using Gradle. Gradle is a build tool focused on flexibility and performance. Gradle is widely used by many projects, including Apache Beam itself, and is generally considered more modern and user-friendly than Maven. We use the Groovy DSL in this project.

Make sure you have a [Java](https://en.wikipedia.org/wiki/Java_%28programming_language%29) development environment ready. If you don't, an easy way to install one is with [`sdkman`](https://sdkman.io).

```sh
# Install sdkman.
curl -s "https://get.sdkman.io" | bash

# Make sure you have Java 17 installed.
sdk install java 17.0.5-tem
```

Install Gradle using sdkman:

```sh
sdk install gradle 7.6
```

Run the build:

```sh
gradle build test run
```



# Using other runners

For a comparison of what each runner currently supports, look at the [Beam Capability Matrix](https://beam.apache.org/documentation/runners/capability-matrix/).

To add a new runner, visit the runner's page for instructions on how to include it.
