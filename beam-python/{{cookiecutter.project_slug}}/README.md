# {{cookiecutter.project_name}}: Apache Beam Python

## Before you begin

Make sure you have a [Python 3](https://www.python.org/) development environment ready.
If you don't, you can download and install it from the
[Python downloads page](https://www.python.org/downloads/).

We recommend using a virtual environment to isolate your project's dependencies.

```sh
# Create a new Python virtual environment.
python -m venv env

# Activate the virtual environment.
source env/bin/activate
```

While activated, your `python` and `pip` commands will point to the virtual environment,
so any changes or install dependencies are self-contained.

As a one time setup, let's install the project's dependencies from the [`requirements.txt`](requirements.txt) file.

```py
# It's always a good idea to update pip before installing dependencies.
pip install -U pip

# Install the project as a local package, this installs all the dependencies as well.
pip install -e .
```

> ℹ️ Once you are done, you can run the `deactivate` command to go back to your global Python installation.

### Running the pipeline

Running your pipeline in Python is as easy as running the script file directly.

```sh
# You can run the script file directly.
python main.py

# To run passing command line arguments.
python main.py --input-text="🎉"

# To run the tests.
python -m unittest -v
```

## Cloud Build for testing

This project already comes with automated testing via [Cloud Build](https://cloud.google.com/build).

If you have not already, [set up Cloud Build](https://cloud.google.com/build/docs/set-up).

```sh
gcloud builds submit
```

The project should build successfully, and show you some output. You can modify the project from here.

To configure the build, look at the [`cloudbuild.yaml`]() file.

## Using other runners

For a comparison of what each runner currently supports, look at the [Beam Capability Matrix](https://beam.apache.org/documentation/runners/capability-matrix/).

To add a new runner, visit the runner's page for instructions on how to include it.
