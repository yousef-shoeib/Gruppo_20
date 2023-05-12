package commongoal;

import java.util.HashSet;
import java.util.Set;

import model.Bookshelf;
import model.ItemTile;

public class CommonGoalCard6 extends CommonGoalCard {
	Bookshelf bookshelf;
	public CommonGoalCard6(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}
	@Override
	boolean CheckTarget() {
		int unique_rows=0;
		for(int row1=0; row1 < this.bookshelf.getRows(); row1++) {
			for(int row2=row1+1; row2<this.bookshelf.getRows(); row2++) {
				boolean only_uniques = true;
				Set<ItemTile> TilesRow1 = new HashSet<ItemTile>();
				Set<ItemTile> TilesRow2 = new HashSet<ItemTile>();
				for(int column=0; column<this.bookshelf.getColumns(); column++) {
					ItemTile tiles1 = this.bookshelf.getTile(row1, column);
					ItemTile tiles2 = this.bookshelf.getTile(row2, column);
					if(TilesRow1.contains(tiles1) || TilesRow2.contains(tiles2)) {
						only_uniques = false;
						break;
					}
					TilesRow1.add(tiles1);
	                TilesRow2.add(tiles2);
				}
				if (only_uniques) {
	                unique_rows++;
	                if (unique_rows == 1) {
	                    return true;
	                }
			    }
		    }
	    }
	 return false;
  }
}