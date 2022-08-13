import sys

from modules import io, blockstate_generators, block_model_generators, types, utils


def generate_blockstate():
    if block_type == types.BlockType.SLAB:
        blockstate_generators.generate_slab(block_name, base_block_name)


def generate_block_models():
    if block_type == types.BlockType.SLAB:
        block_model_generators.generate_slab(block_name, *textures)


def generate_item_model():
    def filler(text: str) -> str:
        return utils.format_str(text, block_type=block_type.value, block=block_name)

    io.fill_template(None, 'model_item', block_name, filler)


block_type = types.BlockType(sys.argv[1])
material_name = sys.argv[2]
block_name = f'{material_name}_{block_type.value}'
base_block_name = sys.argv[3] if len(sys.argv) >= 4 else material_name
textures = sys.argv[4:]
if not textures:
    if block_type == types.BlockType.SLAB:
        textures = [base_block_name] * 3

generate_blockstate()
generate_block_models()
generate_item_model()
