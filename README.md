# Cookiecutter for Apache Beam on Cloud Dataflow

This repository contains opinionated [cookiecutter](https://cookiecutter.readthedocs.io/en/stable/README.html) templates for Apache Beam pipelines that are intended to run on Google Cloud Dataflow.

This project uses Gradle as the build tool for Java pipelines, and Cloud Build for basic CI.

Refer to the README in the cookiecutter directories for more instructions on usage.

* [beam-java](./beam-java)
* [beam-python](./beam-python)

# GitHub Actions automated testing

This project comes with automated testing via [GitHub Actions](https://github.com/features/actions). The action in this repository will check out this repository, generate a project, then compile and test it.

To configure the Github Action in your fork, look at the [`.github/workflows/test.yaml`](.github/workflows/test.yaml) file.

## Contributing

Thank you for your interest in contributing!
All contributions are welcome! 🎉🎊

Please refer to the [`CONTRIBUTING.md`](CONTRIBUTING.md) file for more information.

If you want to clone this repository you can do so to modify the template for the starter Beam project.

This is a [cookiecutter](https://cookiecutter.readthedocs.io/en/stable/README.html), so you will need to modify the contents below `{{cookiecutter.project_slug}}`
in order to change the starter project that results from running cookiecutter.


# License

This software is distributed under the terms of both the MIT license and the
Apache License (Version 2.0).

See [LICENSE](LICENSE) for details.