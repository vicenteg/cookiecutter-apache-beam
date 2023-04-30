# Copyright {{cookiecutter.year}} Google LLC
#
# Licensed under the Apache License, Version 2.0 <LICENSE-APACHE or
# https://www.apache.org/licenses/LICENSE-2.0> or the MIT license
# <LICENSE-MIT or https://opensource.org/licenses/MIT>, at your
# option. This file may not be copied, modified, or distributed
# except according to those terms.

from apache_beam.options.pipeline_options import PipelineOptions

from {{cookiecutter.pipeline_module}} import {{cookiecutter.pipeline_main_class}}


if __name__ == "__main__":
    import argparse
    import logging

    logging.getLogger().setLevel(logging.INFO)

    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--input-text",
        default="Default input text",
        help="Input text to print.",
    )
    args, beam_args = parser.parse_known_args()

    beam_options = PipelineOptions(save_main_session=True, setup_file="./setup.py")
    {{cookiecutter.pipeline_main_class}}.run(
        input_text=args.input_text,
        beam_options=beam_options,
    )
