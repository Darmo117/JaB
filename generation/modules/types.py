import enum


class BlockType(enum.Enum):
    BUTTON = 'button'
    PRESSURE_PLATE = 'pressure_plate'
    GATE = 'gate'
    FENCE = 'fence'
    WALL = 'wall'
    SLAB = 'slab'
    STAIRS = 'stairs'
    SIGN = 'sign'
