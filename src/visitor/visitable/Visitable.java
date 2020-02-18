package visitor.visitable;

import visitor.visitor.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
