package col;

import lombok.Data;

@Data
public class Movie {
    private String name;
    private int like;

    public Movie(String name, int like) {
        this.name = name;
        this.like = like;
    }




}
