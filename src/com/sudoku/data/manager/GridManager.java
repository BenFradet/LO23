package com.sudoku.data.manager;

import com.sudoku.data.model.Grid;
import com.sudoku.data.model.PlayedGrid;
import com.sudoku.data.model.User;

import java.util.ArrayList;
import java.util.List;

public final class GridManager {
  private static volatile GridManager instance = null;
  private List<Grid> availableGrids;
  private List<PlayedGrid> playedGrids;

  private GridManager() {
    this.availableGrids = new ArrayList<Grid>();
    this.playedGrids = new ArrayList<PlayedGrid>();
  }

  public final static GridManager getInstance() {
    if (instance == null) {
      synchronized (GridManager.class) {
        if (instance == null) {
          instance = new GridManager();
        }
      }
    }
    return instance;
  }

  public boolean addGrid(Grid grid) {
    return availableGrids.add(grid);
  }

  public boolean addPlayedGrid(Grid grid, User player) {
    return playedGrids.add(new PlayedGrid(grid, player));
  }

  public boolean addPlayedGrid(PlayedGrid pgrid) {
    return playedGrids.add(pgrid);
  }

  public boolean removeGrid(Grid grid) {
    return availableGrids.remove(grid);
  }

  public List<Grid> searchGrid(List<String> keywords) {
    //J'imagine qu'on recherche dans la description et pas dans les tags
    List<Grid> result = new ArrayList<Grid>();
    for (String str : keywords) {
      for (Grid grid : availableGrids) {
        if (grid.getDescription().contains(str))
          result.add(grid);
      }
    }
    return result;
  }


  public boolean updateGridList(List<String> keywords) {
    // BESOIN D'EXPLICATIONS POUR CETTE FONCTION. Je n'ai pas trouv
    // son existence dans le diag de squence
    return false;
  }

  public Grid getLatestPlayedGrid() {
    Grid g = availableGrids.get(0);
    for (Grid grid : availableGrids) {
      if (grid.getUpdateDate().after(g.getUpdateDate())) {
        g = grid;
      }
    }
    return g;
  }

  public List<PlayedGrid> getFinishedGrid() {
    List<PlayedGrid> result = new ArrayList<PlayedGrid>();
    for (PlayedGrid grid : playedGrids) {
      if (grid.isComplete())
        result.add(grid);
    }
    return result;
  }

  public List<PlayedGrid> getIncompleteGrid() {
    List<PlayedGrid> result = new ArrayList<PlayedGrid>();
    for (PlayedGrid grid : playedGrids) {
      if (!grid.isComplete())
        result.add(grid);
    }
    return result;
  }

  public List<Grid> getAvailableGrids() {
    return availableGrids;
  }

}
