from . import io, types, utils


def generate_slab(block_name: str, base_block_name: str):
    def filler(text: str) -> str:
        return utils.format_str(text, block=block_name, base_block=base_block_name, )

    io.fill_template(types.BlockType.SLAB, 'blockstate', block_name, filler)
