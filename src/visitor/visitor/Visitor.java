package visitor.visitor;

import visitor.visitable.Book;
import visitor.visitable.Clothing;
import visitor.visitable.Toy;

public interface Visitor {
    double visit(Toy toy);
    double visit(Clothing clothing);
    double visit(Book book);
}