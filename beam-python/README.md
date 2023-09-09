# Cookiecutter for Apache Beam Python 

This is an opinionated [cookiecutter](https://cookiecutter.readthedocs.io/en/stable/README.html) repository for Apache Beam Python.

This project uses Cloud Build for basic CI.

## Before you begin

You should have a working Python 3 install. We recommend Python 3.9. As of this writing (April 2023), Python 3.9 is shipped with macOS Ventura (13.3.1).

# Usage

## Install cookiecutter

```sh
pip install --user cookiecutter
```

## Quickstart

To get a generic project quickly and test that it builds:

```sh
cookiecutter --no-input https://github.com/vicenteg/cookiecutter-apache-beam --directory=beam-python
cd my-beam-starter-project
python3 -m venv venv
source venv/bin/activate
python3 -m unittest -v
```

You can also check that it works on Cloud Build:

```sh
gcloud builds submit
```

## Generate your customized project

We recommend you follow the prompts to customize the project. Eliminating the `--no-input` option will cause cookiecutter to prompt you interactively.

```sh
cookiecutter https://github.com/vicenteg/cookiecutter-apache-beam --directory=beam-python
```

# Run unittests

```sh
cd `{{your-project-name}}`
python3 -m venv venv
source venv/bin/activate
python3 -m unittest -v
```

The project should build successfully, and show you some output. Now you can get to work!

## Using other runners

For a comparison of what each runner currently supports, look at the [Beam Capability Matrix](https://beam.apache.org/documentation/runners/capability-matrix/).

To add a new runner, visit the runner's page for instructions on how to include it.
