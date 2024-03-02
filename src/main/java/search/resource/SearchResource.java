package search.resource;

import lombok.Data;

import java.util.List;

@Data
public class SearchResource<T> {
    private List<T> items;

    // more attributes
}
