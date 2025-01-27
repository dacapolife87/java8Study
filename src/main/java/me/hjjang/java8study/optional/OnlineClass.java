package me.hjjang.java8study.optional;

import java.util.Optional;

public class OnlineClass {

    private Integer id;

    private String title;

    private boolean closed;

    public Progress progress;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Optional<Progress> getProgress() {
        // 과거의 예외처리옵션중 하나
//        if(this.progress == null) {
//            throw new IllegalStateException();
//        }
        return Optional.ofNullable(progress);
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
}
