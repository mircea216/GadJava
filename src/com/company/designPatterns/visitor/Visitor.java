package com.company.designPatterns.visitor;

public interface Visitor {
    public void visit(Book book);

    public void visit(Video video);

    public void visit(Audio audio);
}
