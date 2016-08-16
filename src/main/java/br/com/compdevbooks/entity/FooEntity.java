package br.com.compdevbooks.entity;

public class FooEntity implements IEntity {

    private Long id;
    private String fooString;
    private double fooNumber;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFooString() {
        return fooString;
    }

    public void setFooString(String fooString) {
        this.fooString = fooString;
    }

    public double getFooNumber() {
        return fooNumber;
    }

    public void setFooNumber(double fooNumber) {
        this.fooNumber = fooNumber;
    }

    @Override
    public boolean equals(Object entity) {
        if (this == entity) return true;
        if (entity == null || getClass() != entity.getClass()) return false;

        FooEntity that = (FooEntity) entity;

        return id.equals(that.id);
    }

}
