import json
import os

from modules import utils

translations = {
    'itemGroup.jab.item_group': 'Jusqu’au Bout',
}

for f in (utils.ASSETS_DIR / 'blockstates').glob('*.json'):
    block_id: str = os.path.splitext(f.name)[0]
    translations['block.jab.' + block_id] = block_id.replace('_', ' ').title()

with (utils.ASSETS_DIR / 'lang' / 'en_us.json').open(mode='w', encoding='utf8') as f:
    json.dump(translations, f, ensure_ascii=False, indent=2)
