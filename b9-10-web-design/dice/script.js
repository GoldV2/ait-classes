const DIE_SIZE = 300;
const DOT_SIZE = 69 / 2;

const CENTER = { top: DIE_SIZE / 2 - DOT_SIZE, left: DIE_SIZE / 2 - DOT_SIZE };
const BOTTOM_LEFT = { top: DIE_SIZE - 3 * DOT_SIZE, left: DOT_SIZE };
const TOP_RIGHT = { top: DOT_SIZE, left: DIE_SIZE - 3 * DOT_SIZE };
const TOP_LEFT = { top: DOT_SIZE, left: DOT_SIZE };
const BOTTOM_RIGHT = {
  top: DIE_SIZE - 3 * DOT_SIZE,
  left: DIE_SIZE - 3 * DOT_SIZE,
};

const CONFIGS = {
  1: {
    1: CENTER,
  },
  2: {
    1: { top: DIE_SIZE / 2 - -0.5 * DOT_SIZE, left: DIE_SIZE / 2 - DOT_SIZE },
    2: { top: DIE_SIZE / 2 - 2 * DOT_SIZE, left: DIE_SIZE / 2 - DOT_SIZE },
  },
  3: {
    1: BOTTOM_LEFT,
    2: CENTER,
    3: TOP_RIGHT,
  },
  4: {
    1: TOP_LEFT,
    2: TOP_RIGHT,
    3: BOTTOM_LEFT,
    4: BOTTOM_RIGHT,
  },
  5: {
    1: TOP_LEFT,
    2: TOP_RIGHT,
    3: CENTER,
    4: BOTTOM_RIGHT,
    5: BOTTOM_LEFT,
  },
  6: {
    1: TOP_LEFT,
    2: TOP_RIGHT,
    3: { top: DIE_SIZE / 2 - DOT_SIZE, left: DOT_SIZE },
    4: { top: DIE_SIZE / 2 - DOT_SIZE, left: DIE_SIZE - 3 * DOT_SIZE },
    5: BOTTOM_LEFT,
    6: BOTTOM_RIGHT,
  },
};

function reroll(e) {
  const config = Math.round(Math.random() * (6 - 1) + 1);
  console.log(config);
  for (var i = 1; i <= 6; i++) {
    var dot = e.children[i - 1];
    if (dot.style.opacity == 0) {
      dot.style.opacity = 100;
    }
    if (i > config) {
      dot.style.top = CONFIGS[config][1]["top"] + "px";
      dot.style.left = CONFIGS[config][1]["left"] + "px";
    } else {
      dot.style.top = CONFIGS[config][i]["top"] + "px";
      dot.style.left = CONFIGS[config][i]["left"] + "px";
    }
  }
}

document.addEventListener("keyup", (event) => {
  if (event.code === "Space") {
    const dice = document.getElementsByClassName("die");
    for (let die of dice) {
      reroll(die);
    }
  }
});
