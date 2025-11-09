package element;

import visitor.IPlayerVisitor;

public interface IPlayerElement {
    public void accept(IPlayerVisitor visitor);
    
}
