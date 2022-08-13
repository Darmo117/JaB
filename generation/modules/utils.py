import pathlib
import string

ASSETS_DIR = pathlib.Path('..', 'src', 'main', 'resources', 'assets', 'jab')


def format_str(template: str, /, **kwargs):
    return string.Template(template).substitute(kwargs)
