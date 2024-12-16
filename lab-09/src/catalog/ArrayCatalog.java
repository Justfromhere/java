package catalog;

import media.Media;

import java.util.ArrayList;
import java.util.List;

public class ArrayCatalog extends CatalogAbstract {

    @Override
    public void addMedia(Media media) {
        mediaCollection[size] = media;
        size++;
    }

}
