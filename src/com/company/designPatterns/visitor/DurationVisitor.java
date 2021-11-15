package com.company.designPatterns.visitor;

public class DurationVisitor implements Visitor {
    private Integer totalDuration;

    @Override
    public void visit(Book book) {
        if (book.getNumberOfPages() != null)
            totalDuration += book.getNumberOfPages() * 4;
    }

    @Override
    public void visit(Video video) {
        if (video.getDuration() != null)
            totalDuration += video.getDuration();
    }

    @Override
    public void visit(Audio audio) {
        if (audio.getTime() != null)
            totalDuration += audio.getTime();
    }

    @Override
    public String toString() {
        return "DurationVisitor{" +
                "totalDuration=" + totalDuration +
                '}';
    }
}
