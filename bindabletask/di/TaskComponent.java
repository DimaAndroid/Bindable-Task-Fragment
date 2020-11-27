package seven.of.hearts.bindabletask.di;

import seven.of.hearts.bindabletask.task.TaskFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;


@Subcomponent(modules = TaskModule.class)
public interface TaskComponent extends AndroidInjector<TaskFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TaskFragment> {}
}
