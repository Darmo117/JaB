import pathlib
import typing as typ

from . import types, utils


def fill_template(block_type: typ.Optional[types.BlockType], template_fname: str, out_fname: str,
                  filler: typ.Callable[[str], str]):
    template_path = pathlib.Path('assets_templates')
    if block_type is not None:
        template_path /= block_type.value
    template_path /= template_fname + '.json'
    with template_path.open(mode='r', encoding='utf8') as f:
        output_text = filler(''.join(f.readlines()))

    output_path = utils.ASSETS_DIR
    if template_fname == 'blockstate':
        output_path /= 'blockstates'
    elif template_fname == 'model_item':
        output_path = output_path / 'models' / 'item'
    elif template_fname.startswith('model_'):
        if block_type is None:
            raise ValueError('block type is None')
        output_path = output_path / 'models' / 'block' / str(block_type.value)
    else:
        raise ValueError(f'invalid template type {template_fname}')
    output_path /= out_fname + '.json'
    with output_path.open(mode='w', encoding='utf8') as f:
        f.write(output_text)
