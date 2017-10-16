package dao;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class DaoModule {

    @Provides
    @Named("1")
    Dao getDao1Impl(){
        return new Dao1Impl();
    }

    @Provides
    @Named("2")
    Dao getDao2Impl(){
        return new Dao2Impl();
    }
}
