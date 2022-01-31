package format.format.model;

import java.util.Objects;

public class ForChange {
    private String string;

    public ForChange(String string) {
        this.string = string;
    }

    public ForChange() {
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForChange forChange = (ForChange) o;
        return string.equals(forChange.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }
}
