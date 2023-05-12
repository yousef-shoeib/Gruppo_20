package commongoal;

import model.Bookshelf;

public class CommonGoalCard11 extends CommonGoalCard {
	Bookshelf bookshelf;
	public CommonGoalCard11(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
	}
	@Override
	boolean CheckTarget(Bookshelf bookshelf) {
		for(int i=0; i<bookshelf.getRows(); i++) {
			for(int j=0; j<bookshelf.getColumns();j++) {
				int count=1;
				
				for(int k=1; k<5 && i+k < bookshelf.getColumns() && j+k <bookshelf.getRows(); k++) {
					if(bookshelf.getSlot(i+k, j+k).isEmpty() == false && bookshelf.getSlot(i, j).isEmpty()==false) {
							if(bookshelf.getTile(i+k, j+k) == bookshelf.getTile(i, j)){
								count++;
									if(count==5) return true;
									else break;
						}
					}
				}
			}
		}
	return false;
	}
}