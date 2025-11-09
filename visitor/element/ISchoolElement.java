package element;

import visitor.ISchoolVisitor;

public interface ISchoolElement {
    public void accept(ISchoolVisitor visitor);
}
