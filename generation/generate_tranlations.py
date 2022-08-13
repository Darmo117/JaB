import json
import os
import time

from modules import utils

print('Generating translations…')
start = time.time()

translations = {
    'itemGroup.jab.item_group': 'Jusqu’au Bout',
}

for f in (utils.ASSETS_DIR / 'blockstates').glob('*.json'):
    block_id: str = os.path.splitext(f.name)[0]
    translations['block.jab.' + block_id] = block_id.replace('_', ' ').title()

# TODO sort keys
with (utils.ASSETS_DIR / 'lang' / 'en_us.json').open(mode='w', encoding='utf8') as f:
    json.dump(translations, f, ensure_ascii=False, indent=2)
print(f'Done in {(time.time() - start) * 1000} ms')
