package ic.doc.templatemethod;

public class TriangleNumbersSequence extends Sequence {

  @Override
  protected int calculateTerm(int i) {
    return (i + 1) * (i + 2) / 2;
  }
}
