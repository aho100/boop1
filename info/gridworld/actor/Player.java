package info.gridworld.actor;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class Player extends Bug
{
  private Location loc;

  public Player()
  {
    setColor(Color.RED);
    setDirection(180);
  }

  public Player(Location l)
  {
    setColor(Color.RED);
    setDirection(180);
    loc = l;
  }

  public void act()
  {
    if (getLocation().equals(loc))
    {
      YouWin x = new YouWin(Color.WHITE);
      Location loc = new Location((getGrid().getNumRows() / 2), (getGrid().getNumCols() / 2));
      x.putSelfInGrid(getGrid(), loc);
      removeSelfFromGrid();
    }
  }



}
