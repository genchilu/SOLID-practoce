package busines;

import services.Service1;
import services.Service2;
import services.Service3;
import services.Service4;

import javax.inject.Inject;

public class Business1 {
    @Inject
    public Service1 service1;
    @Inject
    public Service2 service2;
    @Inject
    public Service3 service3;
    @Inject
    public Service4 service4;
}
