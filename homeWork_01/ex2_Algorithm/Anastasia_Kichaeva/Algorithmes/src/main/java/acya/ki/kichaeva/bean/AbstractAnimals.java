package acya.ki.kichaeva.bean;

import java.util.Objects;

public abstract class AbstractAnimals implements Animals{
    protected String kindOfAnimal;

    public AbstractAnimals(String kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractAnimals)) return false;
        AbstractAnimals that = (AbstractAnimals) o;
        return Objects.equals(kindOfAnimal, that.kindOfAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kindOfAnimal);
    }

    @Override
    public String toString() {
        return "AbstractAnimals{" +
                "kindOfAnimal='" + kindOfAnimal + '\'' +
                '}';
    }

    @Override
    public String getKindOfAnimal() {
        return kindOfAnimal;
    }
}