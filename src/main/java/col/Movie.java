package col;

import lombok.Data;

import java.util.Objects;

@Data
public class Movie {
    private String name;
    private int like;

    public Movie(String name, int like) {
        this.name = name;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public int getLike() {
        return like;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return like == movie.like && name.equals(movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, like);
    }
}
