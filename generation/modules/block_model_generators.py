from . import io, types, utils


def generate_slab(block_name: str, base_block_top: str, base_block_side: str, base_block_bottom: str):
    def filler(text: str) -> str:
        return utils.format_str(
            text,
            base_block_top=base_block_top,
            base_block_side=base_block_side,
            base_block_bottom=base_block_bottom,
        )

    io.fill_template(types.BlockType.SLAB, 'model_bottom', block_name, filler)
    io.fill_template(types.BlockType.SLAB, 'model_top', block_name + '_top', filler)
