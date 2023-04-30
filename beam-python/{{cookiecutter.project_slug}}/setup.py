# Copyright {{cookiecutter.year}} Google LLC
#
# Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
# https://www.apache.org/licenses/LICENSE-2.0> or the MIT license
# <LICENSE-MIT or https://opensource.org/licenses/MIT>, at your
# option. This file may not be copied, modified, or distributed
# except according to those terms.

from setuptools import setup, find_packages

with open("requirements.txt") as f:
    requirements = f.readlines()

setup(
    name="{{cookiecutter.project_name}}",
    version="{{cookiecutter.version}}",
    description="{{cookiecutter.project_short_description}}",
    author="{{cookiecutter.full_name}}",
    author_email="{{cookiecutter.email}}",
    packages=find_packages(),
    install_requires=requirements,
)
