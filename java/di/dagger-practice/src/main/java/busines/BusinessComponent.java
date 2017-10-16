package busines;

import dagger.Component;
import dao.DaoModule;

@Component(modules = {DaoModule.class})
public interface BusinessComponent {
    void inject(Business1 business);
}
