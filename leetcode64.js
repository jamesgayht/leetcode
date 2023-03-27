/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function (grid) {
  const rows = grid.length;
  const columns = grid[0].length;

  // calculate cost of all in column 0
  for (let i = 1; i < rows; i++) {
    grid[i][0] += grid[i - 1][0];
    // console.info(`grid[i][0] >>> ${grid[i][0]}`);
  }

  // calculate cost of all in row  0
  for (let j = 1; j < columns; j++) {
    grid[0][j] += grid[0][j - 1];
    // console.info(`grid[0][j] >>> ${grid[0][j]}`);
  }

  //   calculate cost of all midddle paths
  for (let i = 1; i < rows; i++) {
    for (let j = 1; j < columns; j++) {
    //   console.info(`grid[i - 1][j] >>> ${grid[i - 1][j]}`);
    //   console.info(`grid[i][j - 1] >>> ${grid[i][j - 1]}`);
    //   console.info(`grid[i][j] >>> ${grid[i][j]}`);

      grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
    }
  }

  //   return bottom right square of grid upon total sum
  return grid[rows - 1][columns - 1];
};

grid = [
  [1, 3, 1],
  [1, 5, 1],
  [4, 2, 1],
];

console.info(minPathSum(grid));
