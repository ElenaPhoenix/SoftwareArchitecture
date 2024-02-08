package Homework.InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import Homework.ModelElement.Camera;
import Homework.ModelElement.Flash;
import Homework.ModelElement.PoligonalModel;
import Homework.ModelElement.Scene;

public class ModelStore implements IModelChanger {
    private List<IModelChangedObserver> observers = new ArrayList<>();
    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver o) {
        observers.remove(0);
    }
}
