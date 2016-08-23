package br.com.compdevbooks.entity;


public abstract class AEntity implements IEntity {

    protected Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AEntity)) return false;

        AEntity aEntity = (AEntity) o;

        return getId().equals(aEntity.getId());

    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

}
