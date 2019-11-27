package visitor.visitable;

import designPatterns.visitor.visitor.Visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
