package contracts.database;

import contracts.models.Modelable;
import exeptions.DuplicateModelException;
import exeptions.NonExistantModelException;

public interface Repository<T extends Modelable> {
    void add(T item) throws DuplicateModelException;

    T getItem(String model) throws NonExistantModelException;
}
