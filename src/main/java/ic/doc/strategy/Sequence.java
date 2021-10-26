package ic.doc.strategy;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {

  private SequenceHandler sequenceHandler;

  public SequenceHandler getSequenceHandler() {
    return sequenceHandler;
  }

  public Sequence(SequenceHandler sequenceHandler) {
    this.sequenceHandler = sequenceHandler;
  }

  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public Integer next() {
      return sequenceHandler.term(index++);
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("remove is not implemented");
    }
  }
}
