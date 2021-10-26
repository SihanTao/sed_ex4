package ic.doc.templatemethod;

import java.util.Iterator;

public class TriangleNumbersSequence extends Sequence implements Iterable<Integer> {

  @Override
  protected int calculateTerm(int i) {
    return (i + 1) * (i + 2) / 2;
  }
}
