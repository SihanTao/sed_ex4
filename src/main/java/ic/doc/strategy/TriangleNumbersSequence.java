package ic.doc.strategy;

import ic.doc.templatemethod.Sequence;

public class TriangleNumbersSequence extends Sequence {

  @Override
  protected int calculateTerm(int i) {
    return (i + 1) * (i + 2) / 2;
  }
}
